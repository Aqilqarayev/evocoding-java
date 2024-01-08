package Task2;

public class Patient extends Person {
    private int patientID;

    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Patient(String name, int age, String address, int patientID) {
        super(name, age, address);
        this.patientID = patientID;
    }
}
