package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ItemCatagory generated by hbm2java
 */
public class ItemCatagory  implements java.io.Serializable {


     private Integer idRowItemCatagory;
     private String catagoryName;
     private String catagoryCode;
     private String isDelete;
     private String catoType;
     private Set itemses = new HashSet(0);

    public ItemCatagory() {
    }

    public ItemCatagory(String catagoryName, String catagoryCode, String isDelete, String catoType, Set itemses) {
       this.catagoryName = catagoryName;
       this.catagoryCode = catagoryCode;
       this.isDelete = isDelete;
       this.catoType = catoType;
       this.itemses = itemses;
    }
   
    public Integer getIdRowItemCatagory() {
        return this.idRowItemCatagory;
    }
    
    public void setIdRowItemCatagory(Integer idRowItemCatagory) {
        this.idRowItemCatagory = idRowItemCatagory;
    }
    public String getCatagoryName() {
        return this.catagoryName;
    }
    
    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }
    public String getCatagoryCode() {
        return this.catagoryCode;
    }
    
    public void setCatagoryCode(String catagoryCode) {
        this.catagoryCode = catagoryCode;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public String getCatoType() {
        return this.catoType;
    }
    
    public void setCatoType(String catoType) {
        this.catoType = catoType;
    }
    public Set getItemses() {
        return this.itemses;
    }
    
    public void setItemses(Set itemses) {
        this.itemses = itemses;
    }




}

