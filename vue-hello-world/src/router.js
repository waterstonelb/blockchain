import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Detail from '@/components/Detail.vue'
import HelloWorld from '@/components/HelloWorld.vue'
import Menu from '@/components/Menu.vue'
import App from '@/App'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/Menu',
      name: 'Menu',
      component: Menu
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: '/Detail',
      name: 'route',
      component: Detail
    },
    {
      path: '/',
      name: '',
      component: HelloWorld
    }
  ]
})
