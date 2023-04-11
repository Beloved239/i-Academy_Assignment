package AdvancedOOP;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        validateDay(day);
        if (month==2 && !validateYear(year)&& day > 28){
            System.out.println("This is not a leap Year");
        }

        if (month==2 && day >= 30){
            System.out.println("February dos not have 30 days");
        }

        if ((month == 4 && day > 30) || (month ==6 && day> 30) || (month==9 && day> 30) || (month ==11 && day > 30)){
            System.out.printf("month %d does not have more than 30 days", month);
        }
        this.day=day;
        this.month=month;
        this.year=year;
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

    /**
     * Create a method for validation
     * this method will be private
     * to be used inside this class only
     */

    private void validateDay(int day){
        if (day < 1 || day > 31){
            System.out.println("Ensure the day is within accepted range between 1 and 31 ");
        }
    }

    private boolean validateMonth(int month){
        if (month < 1 || month > 12){
            System.out.println("Ensure the Month is within accepted range between 1 and 12 ");
            return false;
        }
        return true;
    }

    private boolean validateYear(int year){
        return year%4==0;
    }

    private boolean validateCurrentYear(int year){
        int currentYear = Integer.parseInt(String.valueOf(Year.now()));
        System.out.println("Enter a year lesser than current year");
        return !(year > currentYear);
    }


    @Override
    public String toString() {
        return
                getDay() +"-"+
                getMonth()+"-"+
                getYear()
                ;
    }

    //dd-mm-yy

    public void displayDate(){
        System.out.printf("%d-%d-%d",getDay(),getMonth(),getYear());
    }
}
