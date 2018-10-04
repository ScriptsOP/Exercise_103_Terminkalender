
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public void save(File f) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));

        for (Appointment a : termine) {
            oos.writeObject(a);
        }
        oos.flush();
        oos.close();
    }

    public void load(File f) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try {
        Appointment a;
        while ((a = (Appointment) ois.readObject()) != null) {
            termine.add(a);
        }
        ois.close();
        } catch (EOFException eof) {
            
        }
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
