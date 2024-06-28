package HospitalManagementSystem;

class ProxyMedicalRecordAccess implements MedicalRecordAccess {
    private RealMedicalRecordAccess realAccess;
    private String userRole;

    public ProxyMedicalRecordAccess(MedicalRecord medicalRecord, String userRole) {
        this.realAccess = new RealMedicalRecordAccess(medicalRecord);
        this.userRole = userRole;
    }
    
    @Override
    public void accessMedicalRecord() {
        if ("Doctor".equals(userRole) || "Admin".equals(userRole)) {
            realAccess.accessMedicalRecord();
        } else {
            System.out.println("Access denied. Insufficient permissions.");
        }
    }
}
