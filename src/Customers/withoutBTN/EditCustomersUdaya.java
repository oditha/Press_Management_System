package Customers.withoutBTN;

import ORM.Customer;
import com.alee.laf.WebLookAndFeel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import Customers.ViewCustomersUdaya;
import static Customers.ViewCustomersUdaya.id;
import static Customers.ViewCustomersUdaya.s;
import static Customers.ViewCustomersUdaya.s1;
import static Customers.ViewCustomersUdaya.s2;
import static Customers.ViewCustomersUdaya.s3;
import static Customers.ViewCustomersUdaya.s4;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EditCustomersUdaya extends javax.swing.JFrame {

    boolean FLAG_TXT_VALIDATE = false;
    public static Integer a;

    public EditCustomersUdaya() {
        initComponents();
        laodCus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Customers");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Customer Name");

        txtName.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Customer Address 1");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Customer Address 2");

        txtAddress.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        txtContactNo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNoKeyTyped(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("City");

        txtCity.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCityKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Contact No");

        txtAddress2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtAddress2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddress2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(343, 343, 343))
                    .addComponent(txtName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(321, 321, 321))
                    .addComponent(txtAddress)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(321, 321, 321))
                    .addComponent(txtAddress2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(414, 414, 414))
                    .addComponent(txtCity)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(txtContactNo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(txtAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateTXT();

        if (txtContactNo.getText().isEmpty() && txtName.getText().isEmpty()) {
            
            NotificationPopup.fillFeilds();
            
        } else {

            String name = txtName.getText().toUpperCase();
            String add1 = txtAddress.getText();
            String add2 = txtAddress2.getText();
            String city = txtCity.getText();
            String contac = txtContactNo.getText();

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Customer.class);

                createCriteria.add(Restrictions.eq("idCustomer", a));

                Customer customers = (Customer) createCriteria.uniqueResult();

                //Customers ct = new Customers();
                customers.setName(name);
                customers.setAddress1(add1);
                customers.setAddress2(add2);
                customers.setCity(city);
                customers.setContact1(contac);
                customers.setIsDelete("Active");

                openSession.update(customers);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                ViewCustomersUdaya.loadCustom();

                //ClearTXT();
                dispose();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtContactNo.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityKeyTyped

    private void txtAddress2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddress2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomersUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void validateTXT() {

        if (txtName.getText().isEmpty() && txtContactNo.getText().isEmpty()) {
            FLAG_TXT_VALIDATE = true;
        } else {
            FLAG_TXT_VALIDATE = false;

        }
    }

    private void ClearTXT() {

        txtAddress.setText(null);
        txtAddress2.setText(null);
        txtCity.setText(null);
        txtContactNo.setText(null);
        txtName.setText(null);

        txtName.grabFocus();

    }
    
    
        private void laodCus() {
        txtName.setText(s);
        txtAddress.setText(s2);
        txtAddress2.setText(s3);
        txtCity.setText(s4);
        txtContactNo.setText(s1);

        a = Integer.parseInt(id);
    }

}
