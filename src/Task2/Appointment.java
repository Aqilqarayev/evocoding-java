package Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Appointment {
    List<AppointmentDetails> userlist;

    public List<AppointmentDetails> getMylist() {
        return userlist;
    }

    public void setlist(List<AppointmentDetails> userlist) {
        this.userlist = userlist;
    }

    public Appointment() {
        this.userlist = new ArrayList<>();
    }

    public void scheduleAppointments(int appointmentID, Patient patient, Doctor doctor, LocalDate appointmentDate) {
        userlist.add(new AppointmentDetails(appointmentID, patient, doctor, appointmentDate));
    }
    public void cancelAppointment(int appointmentID, Patient patient, Doctor doctor, LocalDate appointmentDate) {
      userlist.remove(new AppointmentDetails(appointmentID,patient,doctor,appointmentDate));
    }
}
