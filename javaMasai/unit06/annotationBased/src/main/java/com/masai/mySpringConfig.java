package com.masai;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.masai"})
public class mySpringConfig {


    @Bean(value = "cities")
    public List<String> getCities(){
        List<String> cities = Arrays.asList("delhi","mumbai","kolkata");
        return cities;
    }
}
