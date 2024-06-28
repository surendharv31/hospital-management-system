package HospitalManagementSystem;

public class EmergencyContactDecorator extends PatientDecorator {
    private String emergencyContact;

    public EmergencyContactDecorator(Patient decoratedPatient, String emergencyContact) {
        super(decoratedPatient);
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Emergency Contact: " + emergencyContact;
    }
}
