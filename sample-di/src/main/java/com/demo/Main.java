package com.demo;

import com.demo.beans.Knight;
import com.demo.beans.Person;
import com.demo.beans.ResuingDimselQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

            Knight knight =new Knight();
            knight.setQuest(new ResuingDimselQuest());
            System.out.println(knight.goQuest());
        }
}
