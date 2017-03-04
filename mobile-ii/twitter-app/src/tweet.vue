<template lang="pug">
  f7-page(hide-bars-on-scroll='')
    f7-navbar(back-link='that way', sliding='')
    .card.facebook-card
      .card-header.no-border
        .facebook-avatar
          img(:src='tweet.user.profile_image_url', width='64', height='64')
        .facebook-name {{tweet.user.name}}
        .facebook-date {{time1, time2, time3, time4, time5}}
      .card-content
        p {{tweet.text}}
        img(src='', width='100%')
      .card-footer.no-border
        a.link(href='#') Reply
        a.link(href='#') Heart
        a.link(href='#') Retweet

</template>

<script>
import store from './store.js'

export default {
  name: 'tweet',
  data () {
    return {
      tweet: store.selectedTweet
    }}}
</script>

<style lang="sass?indentedSyntax">
p
  text-align: center

.facebook-avatar
  img
    border-radius: 20%
</style>
