<template>
  <div class="hello">
    <h1>hello world</h1>
    <button @click="pay()">微信支付</button>
    <el-button type="primary">主要按钮</el-button>
  </div>
</template>

<script>

    export default{
      name: "HelloWorld",
      created() {
      },

      methods: {
          pay:function() {
            this.axios.get('http://localhost:8081/api')
                .then(function (resp) {
                    alert(resp.data)
                })
          }
      }
    }
</script>


<style scoped>

</style>
