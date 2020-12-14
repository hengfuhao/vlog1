import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    lginStatus:false,
    user:{}
  },
  mutations: {
    login(state,user){
      state.loginStatue = true
      state.user = user
      localStorage.setItem('user',JSON.stringify(user))
    },
    logout(state){
      state.loginStatue = false;
      state.user={}
      localStorage.removeItem('user')
    }
  },
  actions: {},
  modules: {}
})
