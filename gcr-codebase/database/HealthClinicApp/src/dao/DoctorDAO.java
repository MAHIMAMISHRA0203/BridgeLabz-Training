package dao;


import model.Doctor;
import util.DBConnection;

import java.sql.*;

public class DoctorDAO{

    public boolean addDoctor(Doctor doctor){

        String query="INSERT INTO doctors(name,specialty_id,contact,consultation_fee) VALUES(?,?,?,?)";

        try(Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(query)){

            ps.setString(1,doctor.getName());
            ps.setInt(2,doctor.getSpecialtyId());
            ps.setString(3,doctor.getContact());
            ps.setDouble(4,doctor.getConsultationFee());

            return ps.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
