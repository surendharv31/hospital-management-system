package HospitalManagementSystem;

class RealMedicalRecordAccess implements MedicalRecordAccess {
    private MedicalRecord medicalRecord;

    public RealMedicalRecordAccess(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public void accessMedicalRecord() {
        System.out.println("Accessing medical record: " + medicalRecord.getDetails());
    }
}