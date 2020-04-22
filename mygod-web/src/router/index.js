import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/Login'
import App from '@/App'
import PageOne from '@/components/PageOne'
import PageTwo from '@/components/PageTwo'
import PageThree from '@/components/PageThree'
import Main from '@/components/Main'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '导航一',
      component: Main,
      children:[
        {
          path: '/PageOne',
          name: '页面一',
          component: PageOne
        }
      ]
    },
    {
      path: '/',
      name: '导航二',
      component: Main,
      children:[
        {
          path: '/PageTwo',
          name: '页面二',
          component: PageTwo
        },
        {
          path: '/PageThree',
          name: '页面三',
          component: PageThree
        }

      ]
    },
    // {
    //   path: '/HelloWorld',
    //   name: 'HelloWorld',
    //   component: HelloWorld,
    //   children:[
    //       {
    //         path: '/PageOne',
    //         name: '页面一',
    //         component: PageOne
    //       },
    //       {
    //         path: '/PageThree',
    //         name: '页面三',
    //         component: PageThree
    //       }
    //   ]
    // },
    // {
    //   path: '/Login',
    //   name: '登录',
    //   component: Login,
    //   children:[
    //     {
    //       path: '/PageTwo',
    //       name: '页面二',
    //       component: PageTwo
    //     },
    //     {
    //       path: '/PageThree',
    //       name: '页面三',
    //       component: PageThree
    //     }
    //   ]
    // }
  ]
})
