package dao;

import model.Appointment;
import util.DBConnection;

import java.sql.*;

public class AppointmentDAO{

    public boolean bookAppointment(Appointment appointment){

        String checkQuery="SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=? AND appointment_time=? AND status='SCHEDULED'";
        String insertQuery="INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?,?)";

        try(Connection con=DBConnection.getConnection()){

            con.setAutoCommit(false);

            PreparedStatement checkStmt=con.prepareStatement(checkQuery);
            checkStmt.setInt(1,appointment.getDoctorId());
            checkStmt.setDate(2,Date.valueOf(appointment.getDate()));
            checkStmt.setTime(3,Time.valueOf(appointment.getTime()));

            ResultSet rs=checkStmt.executeQuery();

            if(rs.next()&&rs.getInt(1)>0){
                con.rollback();
                return false;
            }

            PreparedStatement insertStmt=con.prepareStatement(insertQuery);
            insertStmt.setInt(1,appointment.getPatientId());
            insertStmt.setInt(2,appointment.getDoctorId());
            insertStmt.setDate(3,Date.valueOf(appointment.getDate()));
            insertStmt.setTime(4,Time.valueOf(appointment.getTime()));
            insertStmt.setString(5,"SCHEDULED");

            insertStmt.executeUpdate();

            con.commit();
            return true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
