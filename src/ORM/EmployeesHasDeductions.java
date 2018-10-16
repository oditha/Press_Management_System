package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * EmployeesHasDeductions generated by hbm2java
 */
public class EmployeesHasDeductions  implements java.io.Serializable {


     private Integer employeesHasDeductionscol;
     private Deductions deductions;
     private Employees employees;
     private String date;
     private Double amount;

    public EmployeesHasDeductions() {
    }

	
    public EmployeesHasDeductions(Deductions deductions, Employees employees) {
        this.deductions = deductions;
        this.employees = employees;
    }
    public EmployeesHasDeductions(Deductions deductions, Employees employees, String date, Double amount) {
       this.deductions = deductions;
       this.employees = employees;
       this.date = date;
       this.amount = amount;
    }
   
    public Integer getEmployeesHasDeductionscol() {
        return this.employeesHasDeductionscol;
    }
    
    public void setEmployeesHasDeductionscol(Integer employeesHasDeductionscol) {
        this.employeesHasDeductionscol = employeesHasDeductionscol;
    }
    public Deductions getDeductions() {
        return this.deductions;
    }
    
    public void setDeductions(Deductions deductions) {
        this.deductions = deductions;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }




}

