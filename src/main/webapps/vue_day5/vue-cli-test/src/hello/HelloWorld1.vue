<template>
  <p>
    hello {{content}}
  </p>
</template>

<script>

  export default {
    //使用export将组件导出，需要使用组件的文件就可以使用import导出
    name: 'HelloWorld1',
    data() {
      return {
        content: "niganma"
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  p {
    font-size: 2em;
    text-align: center;
  }
</style>
