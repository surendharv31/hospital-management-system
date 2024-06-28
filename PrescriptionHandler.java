package HospitalManagementSystem;

public class PrescriptionHandler extends RequestHandler {

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("Prescription")) {
            System.out.println("Handling prescription request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("Cannot handle request.");
        }
    }
}
