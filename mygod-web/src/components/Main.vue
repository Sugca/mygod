<template>
      <!-- 构建整个页面框架-->
      <el-container style="height: 500px; border: 1px solid #eee">
        <!-- 构建左侧菜单 -->
        <el-aside width="200px" style="background-color: rgb(238, 241, 246)">

          <el-menu router>
            <el-submenu v-for="(item,index) in $router.options.routes" :index="index+''">
              <template slot="title"><i class="el-icon-menu"></i>{{index}}-{{item.name}}</template>

              <el-menu-item v-for="(item2,index2) in item.children" :index="item2.path">{{item2.name}}</el-menu-item>

            </el-submenu>
          </el-menu>

        </el-aside>

        <el-main>
          <router-view/>
        </el-main>

      </el-container>

</template>

<script>
    export default {
        name: "Main"
    }
</script>

<style scoped>

</style>
