package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * EmployeesHasJobroals generated by hbm2java
 */
public class EmployeesHasJobroals  implements java.io.Serializable {


     private Integer id;
     private Employees employees;
     private Jobroals jobroals;
     private String isDelete;

    public EmployeesHasJobroals() {
    }

	
    public EmployeesHasJobroals(Employees employees, Jobroals jobroals) {
        this.employees = employees;
        this.jobroals = jobroals;
    }
    public EmployeesHasJobroals(Employees employees, Jobroals jobroals, String isDelete) {
       this.employees = employees;
       this.jobroals = jobroals;
       this.isDelete = isDelete;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public Jobroals getJobroals() {
        return this.jobroals;
    }
    
    public void setJobroals(Jobroals jobroals) {
        this.jobroals = jobroals;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}

