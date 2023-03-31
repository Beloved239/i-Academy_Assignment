package Invoice;

public class Invoice {
    String partNumber;
    String description;
    int quantityOfItem;
    double pricePerItem;

    public Invoice(String partNumber, String description, int quantityOfItem, double pricePerItem){
        this.partNumber = partNumber;
        this.description = description;
        if (quantityOfItem>0){
            this.quantityOfItem = quantityOfItem;}
        else {
            this.quantityOfItem=0;
        }
            if (pricePerItem>0){
                this.pricePerItem = pricePerItem;
            }else {
                this.pricePerItem = 0;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
        double invoiceAmount= getQuantityOfItem() * getPricePerItem();
        return invoiceAmount;
    }

    public String displayMessage(){
        String message= "You ordered for "+ getQuantityOfItem()  + " " +"Numbers of " + getDescription() + " " +getPartNumber() +  " " + "at "+ getPricePerItem() + " Total price = " + getInvoiceAmount();
        return message;
    }
}
