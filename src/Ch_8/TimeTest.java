package Ch_8;

public class TimeTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

//        displayTime("After time object is created", time);
        System.out.println(time.toUniversalString());

        time.setTime(12,45,20);
//        displayTime ("After time object is created", time);
        System.out.println("After time object is created "+time.displayTime());

        try{
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }




    }



}
