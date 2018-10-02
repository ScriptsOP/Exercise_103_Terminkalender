
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;


public class AppointmentModell extends AbstractListModel {

    private ArrayList<Appointment> termine = new ArrayList<>();
    
    public void add(Appointment t) {
        termine.add(t);
        Collections.sort(termine, new AppointmentComparator());
        fireIntervalAdded(this, termine.size() - 1, termine.size() - 1);
    }
    
    public void remove(Appointment a) {
        termine.remove(a);
        fireContentsChanged(this, 0, termine.size() - 1);
    }
    
    public void removeIndex(int index) {
        termine.remove(index);
        fireContentsChanged(this, 0, termine.size() - 1);
    }
    
    @Override
    public int getSize() {
        return termine.size();
    }

    @Override
    public Object getElementAt(int index) {
        return termine.get(index);
    }
    
}
