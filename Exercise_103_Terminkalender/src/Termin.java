
import java.time.LocalDate;
import java.time.LocalTime;


public class Termin {
    private LocalDate day;
    private LocalDate month;
    private LocalDate year;
    private LocalTime hour;
    private LocalTime minute;
    private String text;

    public Termin(LocalDate day, LocalDate month, LocalDate year, LocalTime hour, LocalTime minute, String text) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.text = text;
    }

    public LocalDate getDay() {
        return day;
    }

    public LocalDate getMonth() {
        return month;
    }

    public LocalDate getYear() {
        return year;
    }

    public LocalTime getHour() {
        return hour;
    }

    public LocalTime getMinute() {
        return minute;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("%s.%s.%s - %s.%s --> %s", getDay(), getMonth(), getYear(), getHour(), getMinute(), getText());
    }
}
