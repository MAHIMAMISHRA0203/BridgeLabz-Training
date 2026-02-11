package dao;


import model.Patient;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientDAO{

    public boolean registerPatient(Patient patient){

        String checkQuery="SELECT COUNT(*) FROM patients WHERE phone=? OR email=?";
        String insertQuery="INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";

        try(Connection connection=DBConnection.getConnection();
            PreparedStatement checkStmt=connection.prepareStatement(checkQuery);
            PreparedStatement insertStmt=connection.prepareStatement(insertQuery)){

            checkStmt.setString(1,patient.getPhone());
            checkStmt.setString(2,patient.getEmail());

            ResultSet rs=checkStmt.executeQuery();

            if(rs.next()&&rs.getInt(1)>0){
                System.out.println("Patient already exists.");
                return false;
            }

            insertStmt.setString(1,patient.getName());
            insertStmt.setDate(2,java.sql.Date.valueOf(patient.getDob()));
            insertStmt.setString(3,patient.getPhone());
            insertStmt.setString(4,patient.getEmail());
            insertStmt.setString(5,patient.getAddress());
            insertStmt.setString(6,patient.getBloodGroup());

            int rows=insertStmt.executeUpdate();

            return rows>0;

        }catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }
}
