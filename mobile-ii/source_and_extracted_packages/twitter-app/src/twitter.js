/* global Codebird, localStorage, location, cordova, param */
import QueryString from './querystring'
import store from './store'

const twitter = {}
const cb = new Codebird()

twitter.cb = cb
cb.setConsumerKey('6XexRwOCl2jFXjkZrQOzHZj7z',
  'm2dkWa8dxePSlZLuSztfBP9CMCBblE4si4M2r0z1cLJ5JSbVHe')

// localStorage.clear() // clear login

function saveTokens (oauth_token, oauth_token_secret) {
  localStorage.setItem('oauth_token', oauth_token)
  localStorage.setItem('oauth_token_secret', oauth_token_secret)
}

function authorize (oauth_token, oauth_verifier) {
  cb.setToken(localStorage.getItem('oauth_token'),
      localStorage.getItem('oauth_token_secret'))
  cb.__call(
      'oauth_accessToken', { oauth_verifier }, (reply, rate, err) => {
        if (err) {
          console.log(`error response or timeout exceeded ${err.error}`)
          store.loggedIn = false
          showLoginScreen()
        } else if (reply) {
          // store the authenticated token, which may be different from
          // the request token (!)
          cb.setToken(reply.oauth_token, reply.oauth_token_secret)
          saveTokens(reply.oauth_token, reply.oauth_token_secret)
          location.reload()
        }
      }
  )
}

function showLoginScreen () {
  if (document.readyState === 'complete' || document.readyState === 'loaded') {
    document.addEventListener('deviceready', () => {
        window.f7.loginScreen()
    })
  } else {
    document.addEventListener('DOMContentLoaded', () => {
        document.addEventListener('deviceready', () => {
            window.f7.loginScreen()
        })
    })
  }
}

if (!localStorage.getItem('oauth_token') || !localStorage.getItem('oauth_token_secret')) {
  store.loggedIn = false
  showLoginScreen()
} else {
  cb.setToken(localStorage.getItem('oauth_token'),
      localStorage.getItem('oauth_token_secret'))
  cb.__call(
      'statuses_homeTimeline', {}, (reply, rate, err) => {
        if ((err && err.errors.length > 0) || (reply && reply.errors && reply.errors.length > 0)) {
          store.loggedIn = false
          showLoginScreen()
        } else {
          console.log(reply)
          store.loggedIn = true
          store.tweets.length = 0
          store.tweets.push(...reply)
        }
      }
  )
}

twitter.login = function () {
  // gets a request token
  cb.__call(
      'oauth_requestToken',
      {oauth_callback: 'http://localhost'},
      function (reply, rate, err) {
        if (err) {
          console.log(`error response or timeout exceeded ${err.error}`)
        }
        if (reply) {
          // stores it
          cb.setToken(reply.oauth_token, reply.oauth_token_secret)
          saveTokens(reply.oauth_token, reply.oauth_token_secret)

          // gets the authorize screen URL
          cb.__call(
              'oauth_authorize',
              {},
              function (auth_url) {
                // location.href = auth_url
                let ref = cordova.InAppBrowser.open(auth_url, '_blank', 'location=yes')
                ref.addEventListener('loadstart', param => {
                    if (param.url.indexOf('http://localhost') === 0) {
                      let pos = param.url.indexOf('http://localhost')
                      let searchString = param.url.substring(pos)
                      let qs = QueryString(searchString)
                      let oauth_token = qs.oauth_token
                      let oauth_verifier = qs.oauth_verifier

                      ref.close()
                      authorize(oauth_token, oauth_verifier)
                    }
                })
              }
          )
        }
      }
  )
}

export default twitter
