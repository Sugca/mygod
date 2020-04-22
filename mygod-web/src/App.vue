<template>
  <div id="app">
<!--    &lt;!&ndash;构建整个页面框架&ndash;&gt;-->
<!--    <el-container style="height: 500px; border: 1px solid #eee">-->
<!--      &lt;!&ndash; 构建左侧菜单 &ndash;&gt;-->
<!--      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">-->
<!--        &lt;!&ndash; 左侧菜单内容，:default-openeds默认展开的菜单，:default-active默认选中的菜单，通过菜单index值来关联&ndash;&gt;-->
<!--&lt;!&ndash;        <el-menu :default-openeds="['1', '3']">&ndash;&gt;-->
<!--&lt;!&ndash;          &lt;!&ndash; 可展开的菜单，index菜单的下标，文本类型，不能是数值类型 &ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;          <el-submenu index="1">&ndash;&gt;-->
<!--&lt;!&ndash;            &lt;!&ndash; 对应el-submenu的菜单名 i设置菜单图标，通过class设置&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;            <template slot="title"><i class="el-icon-message"></i>导航一</template>&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            <el-menu-item-group>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;              <template slot="title">分组一</template>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;              &lt;!&ndash; 菜单的子节点，不可再展开，index菜单的下标，文本类型，不能是数值类型&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;              <el-menu-item index="1-1">选项1</el-menu-item>&ndash;&gt;-->
<!--&lt;!&ndash;              <el-menu-item index="1-2">选项2</el-menu-item>&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            </el-menu-item-group>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            <el-menu-item-group title="分组2">&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;              <el-menu-item index="1-3">选项3</el-menu-item>&ndash;&gt;-->
<!--&lt;!&ndash;&lt;!&ndash;            </el-menu-item-group>&ndash;&gt;&ndash;&gt;-->
<!--&lt;!&ndash;            <el-submenu index="1-4">&ndash;&gt;-->
<!--&lt;!&ndash;              <template slot="title">选项4</template>&ndash;&gt;-->
<!--&lt;!&ndash;              <el-menu-item index="1-4-1">选项4-1</el-menu-item>&ndash;&gt;-->
<!--&lt;!&ndash;            </el-submenu>&ndash;&gt;-->
<!--&lt;!&ndash;          </el-submenu>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-menu>&ndash;&gt;-->
<!--        <el-menu router>-->
<!--          <el-submenu v-for="(item,index) in $router.options.routes" :index="index+''">-->
<!--            <template slot="title"><i class="el-icon-menu"></i>{{index}}-{{item.name}}</template>-->

<!--            <el-menu-item v-for="(item2,index2) in item.children" :index="item2.path">{{item2.name}}</el-menu-item>-->

<!--          </el-submenu>-->
<!--        </el-menu>-->

<!--      </el-aside>-->

<!--      <el-container>-->

<!--&lt;!&ndash;        <el-header style="text-align: right; font-size: 12px">&ndash;&gt;-->
<!--&lt;!&ndash;          <el-dropdown>&ndash;&gt;-->
<!--&lt;!&ndash;            <i class="el-icon-setting" style="margin-right: 15px"></i>&ndash;&gt;-->
<!--&lt;!&ndash;            <el-dropdown-menu slot="dropdown">&ndash;&gt;-->
<!--&lt;!&ndash;              <el-dropdown-item>查看</el-dropdown-item>&ndash;&gt;-->
<!--&lt;!&ndash;              <el-dropdown-item>新增</el-dropdown-item>&ndash;&gt;-->
<!--&lt;!&ndash;              <el-dropdown-item>删除</el-dropdown-item>&ndash;&gt;-->
<!--&lt;!&ndash;            </el-dropdown-menu>&ndash;&gt;-->
<!--&lt;!&ndash;          </el-dropdown>&ndash;&gt;-->
<!--&lt;!&ndash;          <span>王小虎</span>&ndash;&gt;-->
<!--&lt;!&ndash;        </el-header>&ndash;&gt;-->

<!--        <el-main>-->
<!--          <router-view/>-->
<!--        </el-main>-->

<!--      </el-container>-->
<!--    </el-container>-->

<!--    <img src="./assets/logo.png">-->
<!--    <router-view/>-->

    <router-view/>
  </div>
</template>

<script>
  export default {
    name: "App",
    data() {
      const item = {
        date: '2016-05-02',
        name: '王小虎',
        address: '上海市普陀区金沙江路 1518 弄'
      };
      return {
        tableData: Array(20).fill(item)
      }
    }
  }
</script>

<style>
  .el-header {
       background-color: #B3C0D1;
       color: #333;
       line-height: 60px;
     }

  .el-aside {
    color: #333;
  }
</style>
