package com.masaischool.dto;

public class CarDTOImpl implements CarDTO{
    private String car_id;
    private String model_name;
    private  int price;
    private int total_seats;
    private String company_id;

    @Override
    public String getCar_id() {
        return car_id;
    }

    @Override
    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    @Override
    public String getModel_name() {
        return model_name;
    }

    @Override
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getTotal_seats() {
        return total_seats;
    }

    @Override
    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    @Override
    public String getCompany_id() {
        return company_id;
    }

    @Override
    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public CarDTOImpl(String car_id, String model_name, int price, int total_seats, String company_id) {
        this.car_id = car_id;
        this.model_name = model_name;
        this.price = price;
        this.total_seats = total_seats;
        this.company_id = company_id;
    }

    @Override
    public String toString() {
        return "CarDTOImpl{" +
                "car_id='" + car_id + '\'' +
                ", model_name='" + model_name + '\'' +
                ", price=" + price +
                ", total_seats=" + total_seats +
                ", company_id='" + company_id + '\'' +
                '}';
    }
}
