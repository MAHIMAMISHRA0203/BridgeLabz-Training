package dao;


import model.Bill;
import util.DBConnection;

import java.sql.*;

public class BillingDAO{

    public boolean generateBill(Bill bill){

        String query="INSERT INTO bills(visit_id,total_amount,payment_status) VALUES(?,?,?)";

        try(Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(query)){

            ps.setInt(1,bill.getVisitId());
            ps.setDouble(2,bill.getTotalAmount());
            ps.setString(3,"UNPAID");

            return ps.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
