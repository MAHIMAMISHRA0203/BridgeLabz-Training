package service;


import dao.BillingDAO;
import model.Bill;

public class BillingService{

    private BillingDAO billingDAO=new BillingDAO();

    public boolean generateBill(int visitId,double totalAmount){

        if(totalAmount<=0){
            System.out.println("Invalid bill amount.");
            return false;
        }

        Bill bill=new Bill(visitId,totalAmount);

        return billingDAO.generateBill(bill);
    }
}

