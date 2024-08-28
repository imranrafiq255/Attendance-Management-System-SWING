
package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    private boolean mark;
    private LocalDate date;
    private LocalTime time;
    public Attendance(boolean mark, LocalDate date, LocalTime time)
    {
        this.mark = mark;
        this.date = date;
        this.time = time;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
}
