package Task2;

import Task2.Person;

public class Doctor extends Person {
    private String specialization;
    private int yearsOfExperiance;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public Doctor(String name, int age, String address, String specialization, int yearsOfExperiance) {
        super(name, age, address);
        this.specialization = specialization;
        this.yearsOfExperiance = yearsOfExperiance;
    }
}
