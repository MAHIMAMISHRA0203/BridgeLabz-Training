package ui;


import dao.PatientDAO;
import model.Patient;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        PatientDAO dao=new PatientDAO();

        System.out.println("Enter name:");
        String name=sc.nextLine();

        System.out.println("Enter DOB(yyyy-mm-dd):");
        LocalDate dob=LocalDate.parse(sc.nextLine());

        System.out.println("Enter phone:");
        String phone=sc.nextLine();

        System.out.println("Enter email:");
        String email=sc.nextLine();

        System.out.println("Enter address:");
        String address=sc.nextLine();

        System.out.println("Enter blood group:");
        String blood=sc.nextLine();

        Patient patient=new Patient(name,dob,phone,email,address,blood);

        boolean result=dao.registerPatient(patient);

        if(result){
            System.out.println("Patient registered successfully.");
        }else{
            System.out.println("Registration failed.");
        }

        sc.close();
    }
}
