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
    f7-view(main='', url='/', :dynamic-navbar='true')
      f7-navbar
        f7-nav-left
        f7-nav-center(sliding='') mb2 twitter
        f7-nav-right
      f7-pages#pages
        f7-page.navbar-fixed
          f7-searchbar(cancel-link='Cancel',
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
                 :text='tweet.text'
            )
</template>

<script>
  import twitter from 'twitter'
  import filters from 'filters'
  import store from 'store'

  let self

  export default {

    created () {
      self = this
    },

    data () {
      return { tweets: store.tweets }
    },

    filters,

    methods: {
      onChange (event) {
        const term = event.target.value

        if (!term) {
          self.$data.tweets.splice(0, self.$data.tweets.length)
        } else {
          window.f7.showPreloader('hmm..')
          cb.__call(
              'search_tweets',
              `q= ${term}`,
              (reply, rate_limit_status) => {
                const result = reply.statuses

                console.log('here be tweets', rate_limit_status, result)

                store.tweets.splice(0, store.tweets.length)
                self.tweets.push(...result)
                window.f7.hidePreloader()
              },
              // This parameter required
              true
          )
        }
      },

      onClick (tweet) {
        store.selectedTweet = tweet
      },

      onSignIn () {
        window.f7.showPreloader('Hang on to something!')
        twitter.login()
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
