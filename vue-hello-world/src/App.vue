<template>
  <div id="app">
    <Menu></Menu>
    <!--<HelloWorld></HelloWorld>-->
    <router-view></router-view>
  </div>
</template>

<script>
import Menu from "./components/Menu.vue";
import HelloWorld from "./components/HelloWorld";
export default {
  name: 'App',
  components: {
    Menu,HelloWorld
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
#table {
  margin-top: 60px;

}
</style>
