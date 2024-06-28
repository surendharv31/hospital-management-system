package HospitalManagementSystem;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patient and doctor
        Patient patient = new Patient("P001", "John Doe", 30);
        Doctor doctor = new Doctor("D001", "Dr. Smith", "Cardiology");

        // Decorate patient with additional details
        Patient decoratedPatient = new EmergencyContactDecorator(new InsuranceDecorator(patient, "Insurance123"), "Emergency Contact: Jane Doe");

        // Create appointment and prescription
        Appointment appointment = new Appointment("A001", decoratedPatient, doctor, "2024-07-01");
        Prescription prescription = new Prescription("RX001", decoratedPatient, doctor, "Medication XYZ");

        // Command pattern: schedule appointment and generate bill
        Command scheduleAppointment = new ScheduleAppointmentCommand(appointment);
        Command generateBill = new GenerateBillCommand(decoratedPatient);
        scheduleAppointment.execute();
        generateBill.execute();

        // Chain of Responsibility pattern: handle requests
        RequestHandler appointmentHandler = new AppointmentHandler();
        RequestHandler prescriptionHandler = new PrescriptionHandler();
        appointmentHandler.setNextHandler(prescriptionHandler);
        appointmentHandler.handleRequest("Appointment");
        appointmentHandler.handleRequest("Prescription");

        // Proxy pattern: access medical record
        MedicalRecord medicalRecord = new MedicalRecord("MR001", decoratedPatient, "Medical history details...");
        MedicalRecordAccess proxyAccess = new ProxyMedicalRecordAccess(medicalRecord, "Doctor");
        proxyAccess.accessMedicalRecord();
    }
}

