<template lang="pug">
div#app
  f7-login-screen#loginScreen
    f7-view
      f7-pages
        f7-page.loginPage(login-screen="")
          f7-login-screen-title mb2 twitter
          img.tlogo(src="assets/twitter.png")
          f7-list
            f7-list-button(title="Sign In", v-on:click="onSignIn")
            f7-list-label
              p Welcome!

  f7-views(navbar-through='')
    f7-view#mainView(main='', url='/', :dynamic-navbar='true')
      f7-navbar
        f7-nav-left
        f7-nav-center(sliding='') mb2 twitter
        f7-nav-right
          f7-link.f7-icons.open-picker(data-picker='.picker-new-tweet') compose
      f7-pages#pages
        f7-page.navbar-fixed
          f7-searchbar(
              cancel-link='Cancel',
              placeholder='Search Twitter',
              :clear-button='true',
              v-on:change='onChange')
          f7-list.tweetList(media-list='')
            f7-list-item(
                v-on:click='onClick(tweet)',
                link='/tweet/',
                v-for='tweet in tweets',
                :media='tweet | imgFilter',
                :title='tweet | userFilter',
                :subtitle='tweet | screenNameFilter',
                :text='tweet.text')

  f7-picker-modal.picker-new-tweet
    f7-toolbar
      f7-link.close-picker(data-picker='.picker-new-tweet') Cancel
      f7-link(v-on:click='sendTweet') Post
    .new-tweet-content
      f7-list(form='')
        f7-list-item
          f7-input(
              type='textarea',
              placeholder='Tweetlety twoot, twit tweety tweet...',
              v-model='newTweet') {{newTweet}}

</template>

<script>
import twitter from './twitter'
import filters from './filters'
import store from './store'

let self

export default {

  // created () {
  //   self = this
  // },

  data () {
    return {
      newTweet: '',
      searchResults: store.searchResults,
      tweets: store.tweets
    }
  },

  filters,

  methods: {
    onChange (event) {
      const term = event.target.value

      if (!term) {
        self.$data.searchResults.splice(0, self.$data.searchResults.length)
      } else {
        window.f7.showPreloader('hmm..')
        twitter.cb.__call(
            'search_tweets',
            `q= ${term}`,
            (reply, rate_limit_status) => {
              const result = reply.statuses
              const mainView = Dom7('#mainView')[0].f7View

              store.searchResults.splice(0, store.searchResults.length)
              store.searchResults.push(...result)
              mainView.router.load({url: '/search/'})
              window.f7.hidePreloader()
            },
            // This parameter required
            true
        )
      }
    },

    onClick (tweet) {
      store.selectedTweet = tweet
      console.log(tweet)

    },

    onSignIn () {
      window.f7.showPreloader('Hang on to something!')
      twitter.login()
    },

    sendTweet () {
      const tweetText = this.newTweet

      if (tweetText && tweetText.length > 0) {
        window.f7.showPreloader('Chirping through bird network...')
        twitter.cb.__call(
            'statuses_update',
            {'status': tweetText},
            function (reply, rate, err) {
              window.f7.hidePreloader()
              if (err) {
                alert('Couldn\'t send it.')
              } else {
                window.f7.closeModal('.picker-new-tweet')
              }
            }
        )
      } else {
        alert('You forgot to type.')
      }
    }
  },

  name: 'app'
}
</script>

<style lang="sass?indentedSyntax">
.tweetList
  img
    border-radius: 20%

.loginPage
  text-align: center

.tlogo
  width: 132px

</style>
