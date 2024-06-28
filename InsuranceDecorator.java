package HospitalManagementSystem;

class InsuranceDecorator extends PatientDecorator {
    private String insuranceDetails;

    public InsuranceDecorator(Patient decoratedPatient, String insuranceDetails) {
        super(decoratedPatient);
        this.insuranceDetails = insuranceDetails;
    }

    public String getDetails() {
        return super.getDetails() + ", Insurance: " + insuranceDetails;
    }
}