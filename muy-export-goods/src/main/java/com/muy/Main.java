package com.muy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final boolean running = true;

    public static void main(String[] args) {
        try {
            log.info("dubbo-goods-provider starting");
            System.out.println("dubbo-goods-provider starting");
            new ClassPathXmlApplicationContext("classpath*:spring-export-goods.xml").start();
            log.info("dubbo-goods-provider started");
            System.out.println("dubbo-goods-provider started");
        } catch (Exception ex) {
            log.error("dubbo-goods-provider context start error![%s]", ex.getMessage());
            System.exit(1);
        }

        synchronized (Main.class) {
            while (running) {
                try {
                    Main.class.wait();
                } catch (Throwable e) {
                    log.error("synchronized error![%s]", e.getMessage());
                    System.exit(1);
                }
            }
        }
    }
}
