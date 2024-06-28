package HospitalManagementSystem;

class AppointmentHandler extends RequestHandler {
    public void handleRequest(String requestType) {
        if (requestType.equals("Appointment")) {
            System.out.println("Handling appointment request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
