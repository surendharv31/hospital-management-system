package HospitalManagementSystem;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialty;

    public Doctor(String doctorId, String name, String specialty) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
    }

    public String getDetails() {
        return "ID: " + doctorId + ", Name: " + name + ", Specialty: " + specialty;
    }
}
