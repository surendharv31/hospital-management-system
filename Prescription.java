package HospitalManagementSystem;

public class Prescription {
    private String prescriptionId;
    private Patient patient;
    private Doctor doctor;
    private String medication;

    public Prescription(String prescriptionId, Patient patient, Doctor doctor, String medication) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.doctor = doctor;
        this.medication = medication;
    }

    public String getDetails() {
        return "Prescription ID: " + prescriptionId + ", Patient: " + patient.getDetails() + ", Doctor: " + doctor.getDetails() + ", Medication: " + medication;
    }
}
