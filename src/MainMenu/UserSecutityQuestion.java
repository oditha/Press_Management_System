
package MainMenu;

import ClassPack.PoolManager;
import static MainMenu.Logging.logid;
import ORM.Answers;
import ORM.Login;
import ORM.SecurityQuestion;
import com.alee.laf.WebLookAndFeel;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserSecutityQuestion extends javax.swing.JFrame {


    public UserSecutityQuestion() {
        initComponents();
        loadQue();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        txtAnswer1 = new javax.swing.JTextField();
        q2 = new javax.swing.JLabel();
        txtAnswer2 = new javax.swing.JTextField();
        q3 = new javax.swing.JLabel();
        txtAnswer3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Security Question");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Security Question");

        q1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        q1.setText("jLabel2");

        q2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        q2.setText("jLabel2");

        q3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        q3.setText("jLabel2");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAnswer2)
                    .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAnswer1)
                    .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            
            Criteria createCriteria = openSession.createCriteria(SecurityQuestion.class);
            SecurityQuestion uniqueResult = (SecurityQuestion) createCriteria.uniqueResult();
            int sqID = uniqueResult.getIdSecurityQuestion();
            
            Login login = new Login();
            login.setIdLogin(logid);
            
            SecurityQuestion securityQuestion = new SecurityQuestion();
            securityQuestion.setIdSecurityQuestion(sqID);
            
            Answers answers = new Answers();
            answers.setA1(txtAnswer1.getText());
            answers.setA2(txtAnswer2.getText());
            answers.setA3(txtAnswer3.getText());
            answers.setIsDelete("Active");
            answers.setLogin(login);
            answers.setSecurityQuestion(securityQuestion);
            
            openSession.save(answers);
            beginTransaction.commit();
            
            new Dashboard().setVisible(true);
            this.dispose();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSecutityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    // End of variables declaration//GEN-END:variables

    private void loadQue() {

        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(SecurityQuestion.class);
        SecurityQuestion uniqueResult = (SecurityQuestion) createCriteria.uniqueResult();
        if (uniqueResult != null) {
            q1.setText(uniqueResult.getQ1());
            q2.setText(uniqueResult.getQ2());
            q3.setText(uniqueResult.getQ3());
            
            openSession.close();
        }

    }
}
