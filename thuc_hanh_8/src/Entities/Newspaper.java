package Entities;

import java.io.Serializable;

public class Newspaper extends Documents implements Serializable {
    private String date;

    public Newspaper() {
    }

    public Newspaper(int code, String nameProducer, int issueNumber, String date) {
        super(code, nameProducer, issueNumber);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper: " +
                "date='" + date + '\'' + ", " + super.toString();
    }
}
