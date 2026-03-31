package model;


import java.time.LocalDate;

public class Visit{

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String diagnosis;
    private String notes;
    private LocalDate visitDate;

    public Visit(int appointmentId,int patientId,int doctorId,String diagnosis,String notes,LocalDate visitDate){
        this.appointmentId=appointmentId;
        this.patientId=patientId;
        this.doctorId=doctorId;
        this.diagnosis=diagnosis;
        this.notes=notes;
        this.visitDate=visitDate;
    }

    public int getAppointmentId(){return appointmentId;}
    public int getPatientId(){return patientId;}
    public int getDoctorId(){return doctorId;}
    public String getDiagnosis(){return diagnosis;}
    public String getNotes(){return notes;}
    public LocalDate getVisitDate(){return visitDate;}
}

