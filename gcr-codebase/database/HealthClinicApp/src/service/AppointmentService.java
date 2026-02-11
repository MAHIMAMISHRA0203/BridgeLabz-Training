package service;


import dao.AppointmentDAO;
import model.Appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentService{

    private AppointmentDAO appointmentDAO=new AppointmentDAO();

    public boolean bookAppointment(int patientId,int doctorId,String date,String time){

        LocalDate appointmentDate=LocalDate.parse(date);
        LocalTime appointmentTime=LocalTime.parse(time);

        Appointment appointment=new Appointment(patientId,doctorId,appointmentDate,appointmentTime);

        return appointmentDAO.bookAppointment(appointment);
    }
}
