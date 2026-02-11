package dao;


import model.Visit;
import util.DBConnection;

import java.sql.*;

public class VisitDAO{

    public boolean recordVisit(Visit visit){

        String insertVisit="INSERT INTO visits(appointment_id,patient_id,doctor_id,diagnosis,notes,visit_date) VALUES(?,?,?,?,?,?)";
        String updateAppointment="UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?";

        try(Connection con=DBConnection.getConnection()){

            con.setAutoCommit(false);

            PreparedStatement ps1=con.prepareStatement(insertVisit);
            ps1.setInt(1,visit.getAppointmentId());
            ps1.setInt(2,visit.getPatientId());
            ps1.setInt(3,visit.getDoctorId());
            ps1.setString(4,visit.getDiagnosis());
            ps1.setString(5,visit.getNotes());
            ps1.setDate(6,Date.valueOf(visit.getVisitDate()));
            ps1.executeUpdate();

            PreparedStatement ps2=con.prepareStatement(updateAppointment);
            ps2.setInt(1,visit.getAppointmentId());
            ps2.executeUpdate();

            con.commit();
            return true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
