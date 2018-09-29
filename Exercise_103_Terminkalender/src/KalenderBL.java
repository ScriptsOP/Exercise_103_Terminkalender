
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class KalenderBL extends AbstractListModel {

    private ArrayList<Termin> termine = new ArrayList<>();
    
    public void add(Termin t) {
        termine.add(t);
        fireIntervalAdded(this, termine.size() - 1, termine.size() - 1);
    }
    
    public void remove(int index) {
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
