package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

        SpringBean1 springBean1=new SpringBean1();
//        SpringBean1 springBean2=new SpringBean1();
//        SpringBean1 springBean3=new SpringBean1();

//        boolean test=springBean1 == springBean2;
//        System.out.println("1 and 2 are the same"+test);
        System.out.println(SpringBean1.getCount());



    }
}
