package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * InvoiceItems generated by hbm2java
 */
public class InvoiceItems  implements java.io.Serializable {


     private Integer idInvoiceItems;
     private Invoice invoice;
     private Items items;
     private Double qty;
     private Double unitPrice;
     private Double netTotalItem;
     private String isDelete;
     private Set customerReturns = new HashSet(0);

    public InvoiceItems() {
    }

	
    public InvoiceItems(Invoice invoice, Items items) {
        this.invoice = invoice;
        this.items = items;
    }
    public InvoiceItems(Invoice invoice, Items items, Double qty, Double unitPrice, Double netTotalItem, String isDelete, Set customerReturns) {
       this.invoice = invoice;
       this.items = items;
       this.qty = qty;
       this.unitPrice = unitPrice;
       this.netTotalItem = netTotalItem;
       this.isDelete = isDelete;
       this.customerReturns = customerReturns;
    }
   
    public Integer getIdInvoiceItems() {
        return this.idInvoiceItems;
    }
    
    public void setIdInvoiceItems(Integer idInvoiceItems) {
        this.idInvoiceItems = idInvoiceItems;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Items getItems() {
        return this.items;
    }
    
    public void setItems(Items items) {
        this.items = items;
    }
    public Double getQty() {
        return this.qty;
    }
    
    public void setQty(Double qty) {
        this.qty = qty;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getNetTotalItem() {
        return this.netTotalItem;
    }
    
    public void setNetTotalItem(Double netTotalItem) {
        this.netTotalItem = netTotalItem;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Set getCustomerReturns() {
        return this.customerReturns;
    }
    
    public void setCustomerReturns(Set customerReturns) {
        this.customerReturns = customerReturns;
    }




}


