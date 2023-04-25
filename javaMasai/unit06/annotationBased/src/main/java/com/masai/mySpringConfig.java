package com.masai;


import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("a1.properties")
@ComponentScan(basePackages = {"com.masai"})
public class mySpringConfig {


    @Bean(value = "cities")
    public List<String> getCities(){
        List<String> cities = Arrays.asList("delhi","mumbai","kolkata");
        return cities;
    }


    @Bean
    @Primary
    public B getBObject(){
        B b1 = new B();
        return b1;
    }

}
