package com.masaischool.ui;

import com.masaischool.dao.CarDao;
import com.masaischool.dao.CarDaoImpl;
import com.masaischool.dto.CarDTO;
import com.masaischool.dto.CarDTOImpl;
import com.masaischool.excetion.NoRecordFoundException;
import com.masaischool.excetion.SomethingWentWrongException;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
public class UImain {
    static void addCarUi(Scanner sc){
        System.out.print("Enter Car ID");
        String cid = sc.next();

        System.out.print("enter model name");
        String mdName = sc.next();

        System.out.println("Enter price");
        int price = sc.nextInt();

        System.out.println("Enter total seats");
        int totalSeat = sc.nextInt();

        System.out.println("enter company id");
        String company_id = sc.next();


        CarDTO car = new CarDTOImpl(cid,mdName,price,totalSeat,company_id);
        CarDao carDao = new CarDaoImpl();

        try {
            carDao.addCar(car);
            System.out.println("Car added successfully");
        }catch (SomethingWentWrongException ex){
            System.out.println(ex);
        }
    }
    static void deleteCar(Scanner sc){
        System.out.print("Enter Car id ");
        String cid = sc.next();
        CarDao carDao = new CarDaoImpl();

        try {
            carDao.deleteCar(cid);
        }catch (SomethingWentWrongException ex){
            System.out.println(ex);
        }
    }

    static void UpdateCar(Scanner sc){
        System.out.print("Enter Car ID");
        String cid = sc.next();

        System.out.print("enter Model Name id ");
        String modelName = sc.next();

        System.out.print("enter price ");
        int price = sc.nextInt();

        System.out.print("enter total seat ");
        int seat = sc.nextInt();

        System.out.println("enter company id");
        String cId = sc.next();

        CarDTO car = new CarDTOImpl(cid,modelName, price,seat,cId);

    }
    static void viewCar(Scanner sc){
        CarDao carDao = new CarDaoImpl();
        try {
            List<CarDTO> carList = carDao.getCar();
            Consumer<CarDTO> con = car -> System.out.println("car Id " + car.getCar_id() + " Model Name: " + car.getModel_name()
                    + " Price " + car.getPrice() + " Total Seats: " + car.getTotal_seats()+ " Company Name: " +car.getCompany_id());
            carList.forEach(con);
        }catch(SomethingWentWrongException | NoRecordFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add Car ");
            System.out.println("2. View Car ");
            System.out.println("3. Update Car ");
            System.out.println("4. Delete Car ");
            System.out.println("0. Exit");
            System.out.print("Enter selection ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addCarUi(sc);
                    break;
                case 2:
                    viewCar(sc);
                    break;
                case 3:
                    UpdateCar(sc);
                    break;
                case 4:
                    deleteCar(sc);
                    break;
                case 0:
                    System.out.println("Thanks for using our services");
                    break;
                default:
                    System.out.println("Invalid Selection, try again later");
            }
        }while (choice !=0);
        sc.close();
    }
}
