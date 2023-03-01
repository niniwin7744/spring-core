package com.demo;

import com.demo.beans.Knight;
import com.demo.beans.MyClass;
import com.demo.beans.Person;
import com.demo.beans.ResuingDimselQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
    AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
    context.registerShutdownHook();
            Knight knight =context.getBean(Knight.class);
        System.out.println(knight.goQuest());
        MyClass myClass=new MyClass();
        }
}
