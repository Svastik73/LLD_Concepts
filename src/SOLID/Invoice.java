package SOLID;

public class Invoice {
    private Marker mk;
    private  int quantity;

    public Invoice(Marker mark, int quantity){
        this.mk=mark;
        this.quantity=quantity;
    }
    public int total(){
        int price=mk.price*this.quantity;
        return price;
    }
    public void save_to_db(){

    }
}
 interface InvoiceDao{
    public void save(Invoice invoice);
 }
 class Databasesave implements InvoiceDao{
    @Override
     public void save(Invoice invoice) {
        //save to db
    }
 }
 class Filesave  implements InvoiceDao{
     @Override
     public void save(Invoice invoice){
         // save to file
     }
 }
