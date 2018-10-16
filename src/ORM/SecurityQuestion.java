package ORM;
// Generated Apr 30, 2018 11:39:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SecurityQuestion generated by hbm2java
 */
public class SecurityQuestion  implements java.io.Serializable {


     private Integer idSecurityQuestion;
     private String q1;
     private String q2;
     private String q3;
     private Set answerses = new HashSet(0);

    public SecurityQuestion() {
    }

    public SecurityQuestion(String q1, String q2, String q3, Set answerses) {
       this.q1 = q1;
       this.q2 = q2;
       this.q3 = q3;
       this.answerses = answerses;
    }
   
    public Integer getIdSecurityQuestion() {
        return this.idSecurityQuestion;
    }
    
    public void setIdSecurityQuestion(Integer idSecurityQuestion) {
        this.idSecurityQuestion = idSecurityQuestion;
    }
    public String getQ1() {
        return this.q1;
    }
    
    public void setQ1(String q1) {
        this.q1 = q1;
    }
    public String getQ2() {
        return this.q2;
    }
    
    public void setQ2(String q2) {
        this.q2 = q2;
    }
    public String getQ3() {
        return this.q3;
    }
    
    public void setQ3(String q3) {
        this.q3 = q3;
    }
    public Set getAnswerses() {
        return this.answerses;
    }
    
    public void setAnswerses(Set answerses) {
        this.answerses = answerses;
    }




}


