package Ex_9_UniversityStudent;

import java.time.Year;

public class Date {
    private String day;
    private String month;
    private int year;

    public Date(String day, String month, int year) {
        this.day = day;
        this.month = month;

        if (year> Integer.parseInt(Year.now().toString()))
            throw new IllegalArgumentException("Year can not be lesser than current year");
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayBirthDate(){
        System.out.printf("02%s02%s02%d",getDay(),getMonth(),getYear());
//        return getDay()+getMonth()+getYear();
    }
    public int displayAge(){
        return 2023-getYear();
    }

    @Override
    public String toString() {
        return " Date of Birth: " +
                getDay() + '-' +
               getMonth() + '-' +
                getYear() ;
    }
}
