package task5;

public class Date {
    public Date(int date, int year, int month) {
        this.day = date;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private int day, year, month;

    public void display() {
        String day = this.day + " ";
        String month = this.month + " ";
        String year = this.year + " ";
        if (day.length() == 1) {
            day = "0" + this.day;
        }
        if (month.length() == 1) {
            month = "0" + this.month;
        }
        System.out.println(day+"/"+month+"/"+year);
    }
}
