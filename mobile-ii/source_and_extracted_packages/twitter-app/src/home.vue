<template lang="pug">
div#app
  f7-login-screen#loginScreen
    f7-view
      f7-pages
        f7-page.loginPage(login-screen='')
          f7-login-screen-title mb2 twitter
          img.tlogo(src="assets/twitter.png")
          f7-list
            f7-list-button(title="Sign In", v-on:click="onSignIn")
            f7-list-label
              p Welcome!
  f7-views(navbar-through='')
    f7-view#mainView(main='', url='/')
      f7-pages#pages
        f7-page.navbar-fixed
          f7-navbar(title='mb2-twitter')
            f7-nav-right
              f7-link.f7-icons.open-picker(data-picker='.picker-new-tweet') compose
          f7-searchbar(
              cancel-link='Cancel',
              placeholder='Search Twitter',
              :clear='true',
              v-on:change='onChange')
          f7-list.tweets(media-list='')
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
import filters from './filters'
import store from './store'
import twitter from './twitter'

let self

export default {

  created () {
    self = this
  },

  data () {
    return {
      newTweet: '',
      tweets: store.tweets
    }
  },

  filters,

  methods: {
    onChange (event) {
      let term = event.target.value

      if (!term) {
        self.$data.searchResults.splice(0, self.$data.searchResults.length)
      } else {
        window.f7.showPreloader('hmm..')
        twitter.cb.__call(
            'search_tweets',
            `q=${term}`,
            (reply, rate_limit_status) => {
              let result = reply.statuses
              let mainView = Dom7('#mainView')[0].f7View

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
      store.clickedTweet = tweet
      console.log(tweet)
    },

    onSignIn () {
      twitter.login()
    },

    sendTweet () {
      let tweetText = this.newTweet

      if (tweetText && tweetText.length > 0) {
        window.f7.showPreloader('Chirping through bird network...')
        twitter.cb.__call(
            'statuses_update',
            {'status': tweetText},
            (reply, rate, err) => {
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
.tweets
  img
    border-radius: 20%

.loginPage
  text-align: center

.tlogo
  width: 132px

</style>
