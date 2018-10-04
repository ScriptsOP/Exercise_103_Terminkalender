
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Appointment implements Serializable {
    private LocalDateTime dateTime;
    private String text;
    private static transient DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");

    public Appointment(LocalDateTime dateTime, String text) {
        this.dateTime = dateTime;
        this.text = text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s --> %s", dateTime.format(dtf), getText());
    }
}
