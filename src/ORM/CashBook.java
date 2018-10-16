package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * CashBook generated by hbm2java
 */
public class CashBook  implements java.io.Serializable {


     private Integer idCashBook;
     private String date;
     private String description;
     private Double income;
     private Double expence;
     private String createdBy;

    public CashBook() {
    }

    public CashBook(String date, String description, Double income, Double expence, String createdBy) {
       this.date = date;
       this.description = description;
       this.income = income;
       this.expence = expence;
       this.createdBy = createdBy;
    }
   
    public Integer getIdCashBook() {
        return this.idCashBook;
    }
    
    public void setIdCashBook(Integer idCashBook) {
        this.idCashBook = idCashBook;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getIncome() {
        return this.income;
    }
    
    public void setIncome(Double income) {
        this.income = income;
    }
    public Double getExpence() {
        return this.expence;
    }
    
    public void setExpence(Double expence) {
        this.expence = expence;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




}

