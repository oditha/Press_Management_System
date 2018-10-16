/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPack;

/**
 *
 * @author danushka
 */
public class InvoicePaymentDataHolder {
    
    private String customer;
    private String invno;
    private double invtotal;
    private double outstading;
    private double paid;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getInvno() {
        return invno;
    }

    public void setInvno(String invno) {
        this.invno = invno;
    }

    public double getInvtotal() {
        return invtotal;
    }

    public void setInvtotal(double invtotal) {
        this.invtotal = invtotal;
    }

    public double getOutstading() {
        return outstading;
    }

    public void setOutstading(double outstading) {
        this.outstading = outstading;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    
    
}
