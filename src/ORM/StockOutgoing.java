package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * StockOutgoing generated by hbm2java
 */
public class StockOutgoing  implements java.io.Serializable {


     private Integer stockOutgoing;
     private Items items;
     private Double qty;
     private String unit;
     private String isDelete;
     private String date;
     private String createdBy;

    public StockOutgoing() {
    }

	
    public StockOutgoing(Items items) {
        this.items = items;
    }
    public StockOutgoing(Items items, Double qty, String unit, String isDelete, String date, String createdBy) {
       this.items = items;
       this.qty = qty;
       this.unit = unit;
       this.isDelete = isDelete;
       this.date = date;
       this.createdBy = createdBy;
    }
   
    public Integer getStockOutgoing() {
        return this.stockOutgoing;
    }
    
    public void setStockOutgoing(Integer stockOutgoing) {
        this.stockOutgoing = stockOutgoing;
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
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




}


