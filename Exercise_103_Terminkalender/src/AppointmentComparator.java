
import java.util.Comparator;


public class AppointmentComparator implements Comparator<Appointment> {

    @Override
    public int compare(Appointment o1, Appointment o2) {
        if (o1.getDateTime().isBefore(o2.getDateTime())) return -1;
        else if (o2.getDateTime().isBefore(o1.getDateTime())) return 1;
        else return 0;
    }
    
}
