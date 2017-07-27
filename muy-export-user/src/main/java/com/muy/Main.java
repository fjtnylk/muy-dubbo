package com.muy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class Main {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        try {
            new ClassPathXmlApplicationContext("classpath*:spring-export-user.xml").start();
        } catch (Exception ex) {
            System.out.println("dubbo-user-provider context start error!");
        }

        synchronized (Main.class) {
            while (running) {
                try {
                    Main.class.wait();
                } catch (Throwable e) {
                    System.out.println("synchronized error!");
                }
            }
        }
    }
}
