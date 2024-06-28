package HospitalManagementSystem;

public class Patient {
    protected String patientId;
    protected String name;
    protected int age;

    public Patient(String patientId, String name, int age) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
    }
	
    public String getDetails() {
    	return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}