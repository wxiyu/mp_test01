import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld1 from '@/hello/HelloWorld1'
import Lizhi from '@/components/Lizhi'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld1',
      component: HelloWorld1
    },
    //配置新的路由规则
    {
      path:'/lizhi',
      name:'Lizhi',
      component:Lizhi
    }
  ]
})
