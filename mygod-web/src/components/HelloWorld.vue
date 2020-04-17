<template>
  <div class="hello">
    <h1>hello world</h1>
    <button @click="pay()">微信支付</button>
  </div>
</template>

<script>

    export default{

      created() {
      },

      methods: {
          pay:function() {
            this.axios.get('http://localhost:8082/api')
                .then(function (resp) {
                    alert(resp)
                })
          }
      }
    }
</script>


<style scoped>

</style>
