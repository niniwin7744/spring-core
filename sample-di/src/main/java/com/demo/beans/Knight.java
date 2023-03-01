package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component @Qualifier("dragon")
public class Knight {

    private Quest dimel ;

    private MyClass myClass;

    public Knight(Quest dimel, @Autowired(required = false) MyClass myClass) {//@nullable,Optional<MyClass> myClass
        this.dimel = dimel;
        this.myClass = myClass;
    }

    public void setQuest(Quest quest) {
        this.dimel = quest;
    }

    public String goQuest(){
        return dimel.goQuest();
    }
    @Autowired
    public void setSpringBean(List<MyInterface> list){

        for(MyInterface obj:list)
        System.out.println(obj);
    }
}
