import util from './util'

const filters = {
  dateFilter (tweet) {
    const now = new Date()
    const createdAt = new Date(tweet.created_at)
    const timeDiff = util.dateDiff(createdAt, now)

    return `${timeDiff} ago`
  },

  imgFilter (tweet) {
    return `<img src="${filters.imgUrlFilter(tweet)}">`
  },

  imgUrlFilter (tweet) {
    const imgurl = tweet.retweeted_status
      ? tweet.retweeted_status.user.profile_image_url
      : tweet.user.profile_image_url

    return imgurl
  },

  screenNameFilter (tweet) {
    if (tweet.retweeted_status) {
      return `@${tweet.retweeted_status.user.screen_name} (RT by
          ${tweet.user.screen_name})`
    }

    return `@${tweet.user.screen_name}`
  },

  userFilter (tweet) {
    return tweet.retweeted_status
      ? tweet.retweeted_status.user.name
      : tweet.user.name
  }
}

export default filters
