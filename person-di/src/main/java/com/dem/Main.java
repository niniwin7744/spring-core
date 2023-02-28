package com.dem;

import com.dem.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Person person =context.getBean(Person.class);
        System.out.println(person.personInfo());
        context.close();
    }

}
