package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component@Order(1)
public class SpringBean3 implements MyInterface {
    public SpringBean3() {
      //  System.out.println("SpringBean3");
    }
    public String toString(){
        return "SpringBean3" ;
    }
    }



