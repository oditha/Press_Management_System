package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * InvoicePayment generated by hbm2java
 */
public class InvoicePayment  implements java.io.Serializable {


     private Integer idInvoicePayment;
     private Customer customer;
     private Invoice invoice;
     private String paymentDate;
     private String paymentType;
     private Double paymentAmount;
     private String isDelete;

    public InvoicePayment() {
    }

	
    public InvoicePayment(Customer customer, Invoice invoice) {
        this.customer = customer;
        this.invoice = invoice;
    }
    public InvoicePayment(Customer customer, Invoice invoice, String paymentDate, String paymentType, Double paymentAmount, String isDelete) {
       this.customer = customer;
       this.invoice = invoice;
       this.paymentDate = paymentDate;
       this.paymentType = paymentType;
       this.paymentAmount = paymentAmount;
       this.isDelete = isDelete;
    }
   
    public Integer getIdInvoicePayment() {
        return this.idInvoicePayment;
    }
    
    public void setIdInvoicePayment(Integer idInvoicePayment) {
        this.idInvoicePayment = idInvoicePayment;
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
    public String getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public Double getPaymentAmount() {
        return this.paymentAmount;
    }
    
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}


