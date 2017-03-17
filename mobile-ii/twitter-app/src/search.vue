<template lang="pug">
f7-page#searchPage(data-page='searchPage')
  f7-navbar(back-link='left', sliding='', title='Search results')
  f7-searchbar(cancel-link='nah',
               placeholder='One more time 🎶',
               :clear-button='true',
               v-on:change='onChange')
  f7-list.search-results(media-list='')
    f7-list-item(
        v-on:click='onClick(tweet)',
        link='/tweet/',
        v-for='tweet in searchResults',
        :media='tweet | imgFilter',
        :title='tweet | userFilter',
        :subtitle='tweet | screenNameFilter',
        :text='tweet.text'
    )
</template>

<script>
import filters from './filters'
import twitter from './twitter'
import store from './store'

const self = this

export default {
  data () {
    return { searchResults: store.searchResults }
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

              console.log('here be tweets', rate_limit_status, result)

              store.searchResults.splice(0, store.searchResults.length)
              store.searchResults.push(...result)
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
  },

  name: 'searchResults'
}
</script>

<style lang="sass?indentedSyntax">
</style>
