package Date;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(03,26, 2023);
        Date today2 = new Date(12, 02, 2027);

        System.out.println(today.displayDate());
        System.out.println(today2.displayDate());
    }
}
