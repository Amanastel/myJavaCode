package com.masaischool.dao;

import com.masaischool.dto.CarDTO;
import com.masaischool.excetion.NoRecordFoundException;
import com.masaischool.excetion.SomethingWentWrongException;

import java.util.List;

public interface CarDao {
    public void addCar(CarDTO catDTO) throws SomethingWentWrongException;
    public void deleteCar(String carId)throws SomethingWentWrongException;

    public List<CarDTO > getCar() throws SomethingWentWrongException, NoRecordFoundException;
    public void updateCar(CarDTO car) throws SomethingWentWrongException;
}
