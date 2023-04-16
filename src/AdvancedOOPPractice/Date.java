package AdvancedOOPPractice;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        validateDay(day);
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        validateCurrentYear(year);
        this.year = year;
    }

    private boolean validateDay(int day){
        if (day<1 || day > 31){
            System.out.println("Ensure the day is within Acceptable range");
            return false;
        }return true;
    }

    private boolean validateCurrentYear(int year){
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        System.out.println("Enter a year lesser than the current year");
        return  !(year > currentYear);
    }

    @Override
    public String toString() {
        return
                getDay()+"-"+
                getMonth()+"-"+
                getYear();
    }
}
