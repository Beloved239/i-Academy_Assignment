package AdvancedOOPPractice2;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int day, int month, int year) {
        validateDay(day);
        if (month == 2 && day >= 30){
            System.out.println("February can't be greater than 29 days");
        }

        if (month== 2 && !validateYear(year) && day > 28){
            System.out.println("This is not a leap year");
        }

        if ((month==4 && day>30) || (month==6 && day>30) || (month==9 && day>30) ||(month==11&& day>30)){
            System.out.println("Days can't be greater than 30 days");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

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
        validateMonth(month);
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        validateCurrentYear(year);
        validateYear(year);
        this.year = year;
    }


    private boolean validateDay(int day){
        if (day < 1 || day > 31){
            System.out.println("Ensure Days are in Range");
            return false;
        }return true;
    }

    private boolean validateMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Ensure Month is in range");
            return false;
        }
        return true;
    }

    private boolean validateYear(int year){
        return year%4==0;
    }

    private int validateCurrentYear(int year){
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        if (year > currentYear){
            System.out.println("Year can't be greater than current year");
        }return year;
    }

    @Override
    public String toString() {
        return
                getDay()+"-"+
                getMonth()+"-"+
                getYear()+"-"
                ;
    }


    public void  displayDate(){
        System.out.printf("%d-%d-%d",getDay(),getMonth(),getYear());
    }
}
