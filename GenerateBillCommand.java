package HospitalManagementSystem;

public class GenerateBillCommand implements Command {
    private Patient patient;

    public GenerateBillCommand(Patient patient) {
        this.patient = patient;
    }

    @Override
    public void execute() {
        System.out.println("Generating bill for patient: " + patient.getDetails());
    }
}
