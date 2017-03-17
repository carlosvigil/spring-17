<template lang="pug">
f7-page(hide-bars-on-scroll='')
  f7-navbar(back-link='that way', sliding='')
  .card.facebook-card.tweet
    .card-header.no-border
      .facebook-avatar
        img(:src='tweet | imgUrlFilter', width='64', height='64')
      .facebook-name {{tweet | userFilter}}
      .facebook-date {{tweet | dateFilter}}
    .card-content
      p {{tweet.text}}
      img(v-if='tweet.entities.media',
          :src='tweet.entities.media[0].media_url',
          width='100%')
    .card-footer.no-border
      a.link(href='#') Reply
      a.link(href='#') Heart
      a.link(href='#') Retweet
</template>

<script>
import filters from './filters'
import store from './store'

export default {
  data () {
    return { tweet: store.selectedTweet }
  },
  filters,
  name: 'tweet'
}
</script>

<style lang="sass?indentedSyntax">
.tweet
  .card-content
    padding: 15px

  p
    text-align: center

  .facebook-avatar
    img
      border-radius: 20%
</style>
