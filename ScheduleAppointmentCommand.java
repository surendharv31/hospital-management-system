package HospitalManagementSystem;

class ScheduleAppointmentCommand implements Command {
    private Appointment appointment;

    public ScheduleAppointmentCommand(Appointment appointment) {
        this.appointment = appointment;
    }

    public void execute() {
        System.out.println("Scheduling appointment: " + appointment.getDetails());
    }
}