package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("yoyeyo")
public class SingYoYeYoQuest implements Quest {

    public String goQuest(){
        return  "Knight sings 'YoYeYo'";
    }
}
