package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * CustomerHasInvoice generated by hbm2java
 */
public class CustomerHasInvoice  implements java.io.Serializable {


     private Integer idRecord;
     private Customer customer;
     private Invoice invoice;

    public CustomerHasInvoice() {
    }

    public CustomerHasInvoice(Customer customer, Invoice invoice) {
       this.customer = customer;
       this.invoice = invoice;
    }
   
    public Integer getIdRecord() {
        return this.idRecord;
    }
    
    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }




}

