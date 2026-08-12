package com.lordbao.app;


import com.lordbao.app.service.GreetService;
import com.lordbao.app.service.impl.GreetServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Author Lord_Bao
 * @Date 2026/8/12 9:39
 * @Version 1.0
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt = SpringApplication.run(Main.class, args);
        GreetService greetService = cxt.getBean(GreetService.class);
        greetService.greet();
    }
}
