package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer idLogin;
     private Employees employees;
     private String userName;
     private String passWord;
     private String privilage;
     private String isDelete;
     private Set answerses = new HashSet(0);

    public Login() {
    }

	
    public Login(Employees employees) {
        this.employees = employees;
    }
    public Login(Employees employees, String userName, String passWord, String privilage, String isDelete, Set answerses) {
       this.employees = employees;
       this.userName = userName;
       this.passWord = passWord;
       this.privilage = privilage;
       this.isDelete = isDelete;
       this.answerses = answerses;
    }
   
    public Integer getIdLogin() {
        return this.idLogin;
    }
    
    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getPrivilage() {
        return this.privilage;
    }
    
    public void setPrivilage(String privilage) {
        this.privilage = privilage;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Set getAnswerses() {
        return this.answerses;
    }
    
    public void setAnswerses(Set answerses) {
        this.answerses = answerses;
    }




}


