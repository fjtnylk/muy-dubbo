package com.muy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class Main {
    private static final boolean running = true;

    public static void main(String[] args) {
        try {
            new ClassPathXmlApplicationContext("classpath*:spring-export-goods.xml").start();
        } catch (Exception ex) {
            System.out.println(String.format("dubbo-goods-provider context start error![%s]", ex.getMessage()));
            System.exit(1);
        }

        synchronized (Main.class) {
            while (running) {
                try {
                    Main.class.wait();
                } catch (Throwable e) {
                    System.out.println(String.format("synchronized error![%s]", e.getMessage()));
                    System.exit(1);
                }
            }
        }
    }
}
