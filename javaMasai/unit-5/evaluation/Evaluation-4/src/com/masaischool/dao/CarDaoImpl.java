package com.masaischool.dao;

import com.masaischool.dto.CarDTO;
import com.masaischool.dto.CarDTOImpl;
import com.masaischool.excetion.NoRecordFoundException;
import com.masaischool.excetion.SomethingWentWrongException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    @Override
    public void addCar(CarDTO catDTO) throws SomethingWentWrongException {
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionToDatabase();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Car (car_id, model_name,price,total_seats,company_id) VALUES (?, ?, ?, ?,?)");
            ps.setString(1, catDTO.getCar_id());
            ps.setString(2, catDTO.getModel_name());
            ps.setInt(3, catDTO.getPrice());
            ps.setInt(4, catDTO.getTotal_seats());
            ps.setString(5, catDTO.getCompany_id());

            ps.executeUpdate();
        }catch(ClassNotFoundException | SQLException ex) {
            throw new SomethingWentWrongException("Unable to add category");
        }finally {
            try {
                DBUtils.closeConnection(conn);
            }catch(SQLException ex) {
            }
        }
    }

    @Override
    public void deleteCar(String carId) throws SomethingWentWrongException {
        Connection conn = null;
        try {
//            getConnectionToDatabase
            conn = DBUtils.getConnectionToDatabase();
            String query = "DELETE FROM car WHERE car_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,carId);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SomethingWentWrongException("Unable to update the record now, try again later");
        } finally {
            try {
                DBUtils.closeConnection(conn);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public List<CarDTO> getCar() throws SomethingWentWrongException, NoRecordFoundException {
        Connection conn = null;
        List<CarDTO> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnectionToDatabase();
            String query = "SELECT car_id, model_name, price, total_seats, company_id FROM car";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if(DBUtils.isResultSetEmpty(rs)) {
                throw new NoRecordFoundException("No car found");
            }
            while(rs.next()) {
                list.add(new CarDTOImpl(rs.getString(1), rs.getString(2),
                        rs.getInt(3), rs.getInt(4),rs.getString(5)));
            }

        }catch(ClassNotFoundException | SQLException ex) {
            throw new SomethingWentWrongException("Unable to update the record now, try again later");
        }finally {
            try {
                DBUtils.closeConnection(conn);
            }catch(SQLException ex) {
            }
        }
        return list;
    }

    @Override
    public void updateCar(CarDTO car) throws SomethingWentWrongException {
        Connection conn = null;
        try {
            conn = DBUtils.getConnectionToDatabase();
            String query = "UPDATE Car SET model_name = ?, price = ?, total_seats = ?, company_id=?, WHERE car_id = ?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, car.getModel_name());
            ps.setInt(2, car.getPrice());
            ps.setInt(3, car.getTotal_seats());
            ps.setString(4, car.getCompany_id());
            ps.setString(5, car.getCar_id());
            ps.executeUpdate();
        }catch (ClassNotFoundException | SQLException ex){
            throw new SomethingWentWrongException("Unable to update the record now, try again later");
        }finally {
            try {
                DBUtils.closeConnection(conn);
            }catch (SQLException ex){

            }
        }
    }
}
