package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Deductions generated by hbm2java
 */
public class Deductions  implements java.io.Serializable {


     private Integer idDeductions;
     private String type;
     private Set employeesHasDeductionses = new HashSet(0);

    public Deductions() {
    }

    public Deductions(String type, Set employeesHasDeductionses) {
       this.type = type;
       this.employeesHasDeductionses = employeesHasDeductionses;
    }
   
    public Integer getIdDeductions() {
        return this.idDeductions;
    }
    
    public void setIdDeductions(Integer idDeductions) {
        this.idDeductions = idDeductions;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getEmployeesHasDeductionses() {
        return this.employeesHasDeductionses;
    }
    
    public void setEmployeesHasDeductionses(Set employeesHasDeductionses) {
        this.employeesHasDeductionses = employeesHasDeductionses;
    }




}


