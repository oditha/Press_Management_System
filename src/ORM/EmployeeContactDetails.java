package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1



/**
 * EmployeeContactDetails generated by hbm2java
 */
public class EmployeeContactDetails  implements java.io.Serializable {


     private Integer idEmployeeContactDetails;
     private Employees employees;
     private String contact1;
     private String contact2;
     private String emailAddress;

    public EmployeeContactDetails() {
    }

	
    public EmployeeContactDetails(Employees employees) {
        this.employees = employees;
    }
    public EmployeeContactDetails(Employees employees, String contact1, String contact2, String emailAddress) {
       this.employees = employees;
       this.contact1 = contact1;
       this.contact2 = contact2;
       this.emailAddress = emailAddress;
    }
   
    public Integer getIdEmployeeContactDetails() {
        return this.idEmployeeContactDetails;
    }
    
    public void setIdEmployeeContactDetails(Integer idEmployeeContactDetails) {
        this.idEmployeeContactDetails = idEmployeeContactDetails;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getContact1() {
        return this.contact1;
    }
    
    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }
    public String getContact2() {
        return this.contact2;
    }
    
    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }




}


