package Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice item1 = new Invoice("1209","HP Probook",12,2000 );

        System.out.println(item1.getInvoiceAmount());
        System.out.println(item1.displayMessage());

    }
}
