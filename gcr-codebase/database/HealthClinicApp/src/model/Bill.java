package model;


public class Bill{

    private int visitId;
    private double totalAmount;

    public Bill(int visitId,double totalAmount){
        this.visitId=visitId;
        this.totalAmount=totalAmount;
    }

    public int getVisitId(){return visitId;}
    public double getTotalAmount(){return totalAmount;}
}
