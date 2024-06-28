package HospitalManagementSystem;

public class MedicalRecord {
    private String recordId;
    private Patient patient;
    private String details;

    public MedicalRecord(String recordId, Patient patient, String details) {
        this.recordId = recordId;
        this.patient = patient;
        this.details = details;
    }

    public String getDetails() {
        return "Record ID: " + recordId + ", Patient: " + patient.getDetails() + ", Details: " + details;
    }
}
