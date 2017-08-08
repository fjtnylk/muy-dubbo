package com.muy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static volatile boolean running = true;

    public static void main(String[] args) {
        try {
            log.info("dubbo-user-provider starting");
            System.out.println("dubbo-user-provider starting");
            new ClassPathXmlApplicationContext("classpath*:spring-export-user.xml").start();
            log.info("dubbo-user-provider started");
            System.out.println("dubbo-user-provider started");
        } catch (Exception ex) {
            log.error("dubbo-user-provider context start error![%s]", ex.getMessage());
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
