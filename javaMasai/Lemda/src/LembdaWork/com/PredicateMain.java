package LembdaWork.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface myPredicate<T>{
    boolean test(T t);
//    boolean operation(T t);
}
public class PredicateMain {
    public static void main(String[] args) {
        List<PredicateCar> carList = Arrays.asList(
                new PredicateCar("Toyota","White",300000),
                new PredicateCar("BMW","Black",750000),
                new PredicateCar("Mercedes Benz","Red", 600000),
                new PredicateCar("Ferrari","Yellow",7000000)
        );

        System.out.println(carList);

//        Predicate<PredicateCar> p = x -> x.getPrice() > 500000;
        Predicate<PredicateCar> p = x -> x.getName().contains("M");
//        myPredicate<PredicateCar> p = x -> x.getName().contains("M"); // this code my own interface method i use
        for(PredicateCar car : carList){
            if(p.test(car))
                System.out.println(car.getName());
        }


        List<PredicateCar> carList2 = carList.stream().filter(i->i.getPrice()>600000).collect(Collectors.toList());
        System.out.println(carList2);

        System.out.println("------------------");

        carList.stream().filter(i->i.getPrice()>600000).forEach(e-> System.out.println(e));


    }
}
