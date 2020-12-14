<template>
   <v-app>
     <v-card>
       <v-app-bar
       color="#fcb69f"
       clipped-left
       dark
       src="https://hfh.oss-cn-beijing.aliyuncs.com/background/4.png"
       height="500"
       >
       <template v-slot:img="{ props }">
         <v-img v-bind="props" gradient="to top right, rgba(40,44,52,.6),rgba(211,190,223,.4)"></v-img>
       </template>
       <v-toolbar-title class="display-1">{{user.nickname}}的博客</v-toolbar-title>
       <div class="header">
         <nav-bar class="nav"></nav-bar>
       </div>
       <v-spacer></v-spacer>
       </v-app-bar>
     </v-card>
     <v-main>
       <v-container class="main-content">
         <router-view />
       </v-container>
     </v-main>
     <div class="footer-bg">
       <v-row justify="center" align="center">
         <v-col cols="12" md="12">
           本站已运行5年20天13小时14分钟00秒
         </v-col>
         <v-col cols="12" md="12">
           本站总访问量5201314人次 ,访客数666666人
         </v-col>
       </v-row>
     </div>
   </v-app>
</template>

<script>
import {mapState} from 'vuex'
import NavBar from '../components/NavBar'
export default {
 name:'Layout',
 components:{
   NavBar
 },
 computed:{
   ...mapState({
     loginStatus:(state)=>state.loginStatus,
     user:(state)=>state.user
   })
 }
}
</script>

<style lang="scss" scoped>
.header{
  width: 80%;
  display: flex;
  justify-content: center;
  align-items: start;
  .nav{
    position: fixed;
    top: 10;
    z-index: 1000;
  }
}
.main-content{
  box-shadow: 0 15px 35px rgba(50,50,93,0.1), 0 5px 15px rgba(0,0,0,0.07) !important;
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 10px;
  position: relative;
  top: -90px;
  width: 80%;
  margin: 0 auto;
  z-index: 999;
}
.footer-bg{
  height: 140px;
  background-color: #ee6e73;
  background-image: linear-gradient(to right,#bf30ac 0%, #0f9d58 100%);
  opacity: 0.7;
  text-align: center;
  color: #fff;
}
</style>