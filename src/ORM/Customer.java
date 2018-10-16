package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer idCustomer;
     private String name;
     private String contact1;
     private String address1;
     private String address2;
     private String city;
     private String isDelete;
     private Set customerReturns = new HashSet(0);
     private Set invoicePayments = new HashSet(0);
     private Set customerHasInvoices = new HashSet(0);
     private Set orderses = new HashSet(0);
     private Set quatationses = new HashSet(0);

    public Customer() {
    }

    public Customer(String name, String contact1, String address1, String address2, String city, String isDelete, Set customerReturns, Set invoicePayments, Set customerHasInvoices, Set orderses, Set quatationses) {
       this.name = name;
       this.contact1 = contact1;
       this.address1 = address1;
       this.address2 = address2;
       this.city = city;
       this.isDelete = isDelete;
       this.customerReturns = customerReturns;
       this.invoicePayments = invoicePayments;
       this.customerHasInvoices = customerHasInvoices;
       this.orderses = orderses;
       this.quatationses = quatationses;
    }
   
    public Integer getIdCustomer() {
        return this.idCustomer;
    }
    
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getContact1() {
        return this.contact1;
    }
    
    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
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
    public Set getInvoicePayments() {
        return this.invoicePayments;
    }
    
    public void setInvoicePayments(Set invoicePayments) {
        this.invoicePayments = invoicePayments;
    }
    public Set getCustomerHasInvoices() {
        return this.customerHasInvoices;
    }
    
    public void setCustomerHasInvoices(Set customerHasInvoices) {
        this.customerHasInvoices = customerHasInvoices;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }
    public Set getQuatationses() {
        return this.quatationses;
    }
    
    public void setQuatationses(Set quatationses) {
        this.quatationses = quatationses;
    }




}


