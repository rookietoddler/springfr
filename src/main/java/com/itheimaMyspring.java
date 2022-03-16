package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//声明该类是一个springboot的引导类
public class itheimaMyspring {
    public static void main(String[] args) {
        //main方法是java程序的入口
        SpringApplication.run(itheimaMyspring.class);
        //run方法表示运行springboot的引导类，run方法的参数就是springboot引导类的字节码对象
    }
}
