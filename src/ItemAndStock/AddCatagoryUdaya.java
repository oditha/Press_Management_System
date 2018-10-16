package ItemAndStock;

import com.alee.laf.WebLookAndFeel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.ItemCatagory;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class AddCatagoryUdaya extends javax.swing.JFrame {

    public AddCatagoryUdaya() {
        initComponents();
        txtCatID.grabFocus();
        LoadCato();
        tblCato.setComponentPopupMenu(jPopupMenu1);
        tblCato.setRowHeight(25);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        btnAddCat = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCato = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCatID = new javax.swing.JTextField();
        txtCatoName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        jMenuItem1.setText("Remove");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Catogory ");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel2.setText("Add Catogory");

        btnAddCat.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnAddCat.setText("Add New");
        btnAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCatActionPerformed(evt);
            }
        });

        tblCato.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblCato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catogoty"
            }
        ));
        tblCato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCatoMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblCato);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Catogory Code");

        txtCatID.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCatID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCatIDFocusLost(evt);
            }
        });
        txtCatID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCatIDKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCatIDKeyReleased(evt);
            }
        });

        txtCatoName.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCatoName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCatoNameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Catogory Name");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Catogory Type");

        jComboBox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Service", "Raw Item/Service" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtCatID)
                    .addComponent(txtCatoName)
                    .addComponent(btnAddCat, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCatoName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCatActionPerformed

        String catID = txtCatID.getText().toUpperCase();
        String CatoName = txtCatoName.getText().toUpperCase();

        if (catID != null && CatoName != null) {

            try {

                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cc = sess.createCriteria(ItemCatagory.class);

                Criterion contact = Restrictions.like("catagoryName", txtCatoName.getText());
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(contact, active);
                cc.add(andExp);

               ItemCatagory uniqueResult = (ItemCatagory) cc.uniqueResult();

                if (uniqueResult != null) {
                    NotificationPopup.already();
                    //txtItemName.setText(null);
                    txtCatoName.grabFocus();
                } else {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    ItemCatagory catogory = new ItemCatagory();
                    catogory.setCatagoryCode(catID);
                    catogory.setCatagoryName(CatoName);
                    catogory.setIsDelete("Active");
                    catogory.setCatoType(jComboBox1.getSelectedItem().toString());

                    openSession.save(catogory);
                    beginTransaction.commit();
                    openSession.close();

                    txtCatID.setText(null);
                    txtCatoName.setText(null);

                    LoadCato();
                    NotificationPopup.save();
                    openSession.close();

                    txtCatID.setText(null);
                    txtCatoName.setText(null);

                    txtCatID.grabFocus();

                }

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_btnAddCatActionPerformed

    private void txtCatIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatIDKeyTyped

        if (txtCatID.getText().length() == 2) {

            evt.consume();

        }

    }//GEN-LAST:event_txtCatIDKeyTyped

    private void txtCatIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatIDKeyReleased

        try {

            String code = txtCatID.getText().toUpperCase();

            Session s = PoolManager.getSessionFactory().openSession();
            Criteria cc = s.createCriteria(ItemCatagory.class);
//            cc.add(Restrictions.eq("catagoryCode", code));

            Criterion contact = Restrictions.like("catagoryCode", code);
            Criterion active = Restrictions.like("isDelete", "Active");
            LogicalExpression andExp = Restrictions.and(contact, active);
            cc.add(andExp);

            ItemCatagory uniqueResult = (ItemCatagory) cc.uniqueResult();

            if (uniqueResult != null) {

                JOptionPane.showMessageDialog(null, "Catogory Code already used");
                txtCatID.setText(null);
                txtCatID.grabFocus();
            }

            s.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_txtCatIDKeyReleased

    private void txtCatIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCatIDFocusLost

        txtCatoName.grabFocus();


    }//GEN-LAST:event_txtCatIDFocusLost

    private void tblCatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatoMouseReleased
        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }
    }//GEN-LAST:event_tblCatoMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Session openSession = PoolManager.getSessionFactory().openSession();
        String code = tblCato.getValueAt(tblCato.getSelectedRow(), 0).toString().split(" - ")[0].toString();
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Remove?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {
                Transaction beginTransaction = openSession.beginTransaction();
                Criteria cc = openSession.createCriteria(ItemCatagory.class);
                cc.add(Restrictions.eq("catagoryCode", code));
                ItemCatagory uniqueResult = (ItemCatagory) cc.uniqueResult();
                uniqueResult.setIsDelete("DeActive");

                openSession.update(uniqueResult);
                beginTransaction.commit();
                NotificationPopup.Delete();
                openSession.close();
                LoadCato();
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtCatoNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatoNameKeyReleased
       
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(ItemCatagory.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("catagoryName", txtCatoName.getText()));
            
            ItemCatagory uniqueResult = (ItemCatagory) createCriteria.uniqueResult();
            if (uniqueResult != null) {
                
                JOptionPane.showMessageDialog(null, "Category already avaliable");
                txtCatoName.setText(null);
                txtCatoName.grabFocus();
            }
            
            
        } catch (Exception e) {
        
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_txtCatoNameKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCatagoryUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCat;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCato;
    private javax.swing.JTextField txtCatID;
    private javax.swing.JTextField txtCatoName;
    // End of variables declaration//GEN-END:variables

    private void LoadCato() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(ItemCatagory.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));

            List<ItemCatagory> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblCato.getModel();
            dtm.setRowCount(0);
            for (ItemCatagory catogory : list) {

                dtm.addRow(new Object[]{catogory.getCatagoryCode() + " - " + catogory.getCatagoryName()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
