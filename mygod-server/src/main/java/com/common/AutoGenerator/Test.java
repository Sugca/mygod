package com.common.AutoGenerator;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;

public class Test {

    public static void main(String[] args) {
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.printf(projectPath);
    }
}
