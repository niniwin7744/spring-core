package com.demo;

import com.demo.beans.SpringBean4;
import com.demo.beans.SpringBean5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration//@Lazy
@ComponentScan (lazyInit=true)
public class AppConfig {
@Bean
public SpringBean4 springBean4(){
    return new SpringBean4();
}

@Bean @Lazy//value=false
public SpringBean5 springBean5(){
    return new SpringBean5();
}
}
