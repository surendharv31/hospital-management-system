package HospitalManagementSystem;

abstract class PatientDecorator extends Patient {
    protected Patient decoratedPatient;

    public PatientDecorator(Patient decoratedPatient) {
        super(decoratedPatient.patientId, decoratedPatient.name, decoratedPatient.age);
        this.decoratedPatient = decoratedPatient;
    }

    public String getDetails() {
        return decoratedPatient.getDetails();
    }
}