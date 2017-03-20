import Vue from 'vue'
import Home from './home.vue'
import Routes from './routes.js'
import Framework7 from 'Framework7'
import Framework7Vue from 'Framework7Vue'

document.addEventListener('deviceready', () => {

      Vue.use(Framework7Vue)

      new Vue({
        el: '#app',
        render: h => h(Home),
        // Framework7 Parameters
        framework7: {
        // Should be same as app el
          root: '#app',
          animateNavBackIcon: true,
          material: true,
          routes: Routes
        }
      })
    }
)
