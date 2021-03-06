package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Jobroals generated by hbm2java
 */
public class Jobroals  implements java.io.Serializable {


     private Integer idJobroals;
     private String jobcode;
     private String roleName;
     private String isDelete;
     private Set employeesHasJobroalses = new HashSet(0);
     private Set tmpemployeesHasJobroalses = new HashSet(0);

    public Jobroals() {
    }

    public Jobroals(String jobcode, String roleName, String isDelete, Set employeesHasJobroalses, Set tmpemployeesHasJobroalses) {
       this.jobcode = jobcode;
       this.roleName = roleName;
       this.isDelete = isDelete;
       this.employeesHasJobroalses = employeesHasJobroalses;
       this.tmpemployeesHasJobroalses = tmpemployeesHasJobroalses;
    }
   
    public Integer getIdJobroals() {
        return this.idJobroals;
    }
    
    public void setIdJobroals(Integer idJobroals) {
        this.idJobroals = idJobroals;
    }
    public String getJobcode() {
        return this.jobcode;
    }
    
    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Set getEmployeesHasJobroalses() {
        return this.employeesHasJobroalses;
    }
    
    public void setEmployeesHasJobroalses(Set employeesHasJobroalses) {
        this.employeesHasJobroalses = employeesHasJobroalses;
    }
    public Set getTmpemployeesHasJobroalses() {
        return this.tmpemployeesHasJobroalses;
    }
    
    public void setTmpemployeesHasJobroalses(Set tmpemployeesHasJobroalses) {
        this.tmpemployeesHasJobroalses = tmpemployeesHasJobroalses;
    }




}


