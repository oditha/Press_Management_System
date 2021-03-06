package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Quatations generated by hbm2java
 */
public class Quatations  implements java.io.Serializable {


     private Integer idOrders;
     private Customer customer;
     private String quatationNo;
     private String quatationDate;
     private Double quatationTotal;
     private String isDelete;
     private Double advance;
     private String createdBy;
     private String serviceNameForPrint;
     private Double quatationQty;
     private Double unitPriceForOrder;
     private Set quattionItemses = new HashSet(0);

    public Quatations() {
    }

	
    public Quatations(Customer customer) {
        this.customer = customer;
    }
    public Quatations(Customer customer, String quatationNo, String quatationDate, Double quatationTotal, String isDelete, Double advance, String createdBy, String serviceNameForPrint, Double quatationQty, Double unitPriceForOrder, Set quattionItemses) {
       this.customer = customer;
       this.quatationNo = quatationNo;
       this.quatationDate = quatationDate;
       this.quatationTotal = quatationTotal;
       this.isDelete = isDelete;
       this.advance = advance;
       this.createdBy = createdBy;
       this.serviceNameForPrint = serviceNameForPrint;
       this.quatationQty = quatationQty;
       this.unitPriceForOrder = unitPriceForOrder;
       this.quattionItemses = quattionItemses;
    }
   
    public Integer getIdOrders() {
        return this.idOrders;
    }
    
    public void setIdOrders(Integer idOrders) {
        this.idOrders = idOrders;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getQuatationNo() {
        return this.quatationNo;
    }
    
    public void setQuatationNo(String quatationNo) {
        this.quatationNo = quatationNo;
    }
    public String getQuatationDate() {
        return this.quatationDate;
    }
    
    public void setQuatationDate(String quatationDate) {
        this.quatationDate = quatationDate;
    }
    public Double getQuatationTotal() {
        return this.quatationTotal;
    }
    
    public void setQuatationTotal(Double quatationTotal) {
        this.quatationTotal = quatationTotal;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Double getAdvance() {
        return this.advance;
    }
    
    public void setAdvance(Double advance) {
        this.advance = advance;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getServiceNameForPrint() {
        return this.serviceNameForPrint;
    }
    
    public void setServiceNameForPrint(String serviceNameForPrint) {
        this.serviceNameForPrint = serviceNameForPrint;
    }
    public Double getQuatationQty() {
        return this.quatationQty;
    }
    
    public void setQuatationQty(Double quatationQty) {
        this.quatationQty = quatationQty;
    }
    public Double getUnitPriceForOrder() {
        return this.unitPriceForOrder;
    }
    
    public void setUnitPriceForOrder(Double unitPriceForOrder) {
        this.unitPriceForOrder = unitPriceForOrder;
    }
    public Set getQuattionItemses() {
        return this.quattionItemses;
    }
    
    public void setQuattionItemses(Set quattionItemses) {
        this.quattionItemses = quattionItemses;
    }




}


