package Suppliers;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import MainMenu.*;
import ORM.Supplier;
import static Suppliers.ViewSuppUdaya.a;
import static Suppliers.ViewSuppUdaya.a1;
import static Suppliers.ViewSuppUdaya.a2;
import static Suppliers.ViewSuppUdaya.a3;
import static Suppliers.ViewSuppUdaya.a4;
import static Suppliers.ViewSuppUdaya.a5;
import static Suppliers.ViewSuppUdaya.a6;
import static Suppliers.ViewSuppUdaya.loadSupp;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyEvent;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EditSupplierUdaya extends javax.swing.JFrame {

    public static int supID;

    public EditSupplierUdaya() {
        initComponents();
        loadSupplier();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCity1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Suppliers");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Supplier Name");

        txtSupName.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSupName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupNameFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Contact Primary");

        txtContact1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtContact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact1FocusLost(evt);
            }
        });
        txtContact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact1KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel11.setText("Address Line 1");

        txtAddress2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtAddress2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress2txtAddress1FocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel12.setText("City");

        txtCity1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCity1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCity1txtCityFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Address Line 2");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Contact Secondary");

        txtContact2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtContact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact2FocusLost(evt);
            }
        });
        txtContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact2ActionPerformed(evt);
            }
        });
        txtContact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact2KeyTyped(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(txtContact2)
                        .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddress2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCity1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost

    }//GEN-LAST:event_txtAddressFocusLost

    private void txtSupNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupNameFocusLost

    }//GEN-LAST:event_txtSupNameFocusLost

    private void txtContact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact2KeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtContact2.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContact2KeyTyped

    private void txtContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2ActionPerformed

    private void txtContact2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact2FocusLost

    }//GEN-LAST:event_txtContact2FocusLost

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!txtSupName.getText().isEmpty() && !txtContact1.getText().isEmpty()) {
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                createCriteria.add(Restrictions.eq("idSupplier", supID));
                Supplier supplier = (Supplier) createCriteria.uniqueResult();

                supplier.setSupplierName(txtSupName.getText());
                supplier.setAddress1(txtAddress.getText());
                supplier.setAddress2(txtAddress2.getText());
                supplier.setCity(txtCity1.getText());
                supplier.setContactNo1(txtContact1.getText());
                supplier.setContactNo2(txtContact2.getText());
                supplier.setIsDelete("Active");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();

                NotificationPopup.save();
                ClearTXT();
                dispose();
                ViewSuppUdaya.loadSupp();

            } catch (Exception e) {

                e.printStackTrace();

            }

        } else {

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAddress2txtAddress1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress2txtAddress1FocusLost

    }//GEN-LAST:event_txtAddress2txtAddress1FocusLost

    private void txtCity1txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCity1txtCityFocusLost

    }//GEN-LAST:event_txtCity1txtCityFocusLost

    private void txtContact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact1KeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtContact1.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContact1KeyTyped

    private void txtContact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact1FocusLost

    }//GEN-LAST:event_txtContact1FocusLost

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSupplierUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtSupName;
    // End of variables declaration//GEN-END:variables

    private void loadSupplier() {

        txtSupName.setText(a1);
        txtContact1.setText(a2);
        txtContact2.setText(a3);
        txtAddress.setText(a4);
        txtAddress2.setText(a5);
        txtCity1.setText(a6);

        supID = Integer.parseInt(a);
    }
    
       private void ClearTXT() {

        txtAddress.setText(null);
        txtAddress2.setText(null);
        txtCity1.setText(null);
        txtContact1.setText(null);
        txtContact2.setText(null);
        txtSupName.setText(null);

        txtSupName.grabFocus();

    }

}
