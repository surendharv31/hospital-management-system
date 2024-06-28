package HospitalManagementSystem;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public String getDetails() {
        return "Appointment ID: " + appointmentId + ", Patient: " + patient.getDetails() + ", Doctor: " + doctor.getDetails() + ", Date: " + date;
    }
}
