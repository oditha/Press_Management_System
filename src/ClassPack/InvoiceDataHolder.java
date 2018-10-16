
package ClassPack;


public class InvoiceDataHolder {
 
    private String invoiceno;
    private String customer;
    private String service;
    private String cashier;
    private double unitprice;
    private double qty;
    private double ordertotal;
    private double advance;
    private double balance;
    private double paid;
    private double orderbalance;
    private double finalbalance;

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(double ordertotal) {
        this.ordertotal = ordertotal;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getOrderbalance() {
        return orderbalance;
    }

    public void setOrderbalance(double orderbalance) {
        this.orderbalance = orderbalance;
    }

    public double getFinalbalance() {
        return finalbalance;
    }

    public void setFinalbalance(double finalbalance) {
        this.finalbalance = finalbalance;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }
    
    
}
