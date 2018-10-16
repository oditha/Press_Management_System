package Suppliers;

import ORM.Supplier;
import ORM.SupplierReturn;
import com.alee.laf.WebLookAndFeel;
import ClassPack.PoolManager;
import ORM.RawItemStock;
import ORM.SupReturnTerms;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewReturnGRNUdaya extends javax.swing.JFrame {

    public int getSupID;
    static boolean maximized = true;

    public ViewReturnGRNUdaya() {
        initComponents();
        maximizeWindow();
        tableAlign();
        loadTables();

        TxtToDate.setEnabled(false);
        TxtFromDate.setEnabled(false);

        //jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        TxtFromDate = new com.alee.extended.date.WebDateField();
        TxtToDate = new com.alee.extended.date.WebDateField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View GRN Return");

        TxtFromDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtFromDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtFromDateMouseClicked(evt);
            }
        });

        TxtToDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtToDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtToDateMouseClicked(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jCheckBox1.setText("Filter By Date");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("From");

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "GRN No", "Item Code", "Item Name", "Return Date", "Return QTY", "Return term"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(500);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(500);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(500);
        }

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Type Supplier Name");

        jTextField1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("To");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(811, 811, 811)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("00");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);

            createCriteria.add(Restrictions.between("returnDate", TxtFromDate.getText(), TxtToDate.getText()));
            //Criterion name = Restrictions.between("returnDate", TxtFromDate.getText(), TxtToDate.getText());
            //Criterion active = Restrictions.like("isDelete", "Active");
            createCriteria.add(Restrictions.like("isDelete", "Active"));
//            LogicalExpression andExp = Restrictions.and(name, active);
//            createCriteria.add(andExp);
            System.out.println("yes");
            List<SupplierReturn> list = createCriteria.list();

            for (SupplierReturn sr : list) {
                Iterator iterator = sr.getSupReturnTermses().iterator();

                while (iterator.hasNext()) {

                    SupReturnTerms next = (SupReturnTerms) iterator.next();

                    Vector v = new Vector();
                    v.add(sr.getIdSupplierReturn());
                    v.add(sr.getRowGrnItem().getRawGrn().getRawGrnNo());
                    v.add(sr.getRowGrnItem().getItems().getItemsCode());
                    v.add(sr.getRowGrnItem().getItems().getItemName());
                    v.add(sr.getReturnDate());
                    v.add(sr.getQty());
                    v.add(next.getReturnTerm());

                    dtm.addRow(v);
                }
                //dtm.addRow(new Object[]{sr.getIdSupplierReturn(), sr.getRowGrnItem().getRawGrn().getRawGrnNo(), sr.getRowGrnItem().getRawItems().getRawItemsCode(), sr.getRowGrnItem().getRawItems().getItemName(), sr.getReturnDate(), sr.getQty()});
            }
            
            openSession.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void TxtFromDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtFromDateMouseClicked

    }//GEN-LAST:event_TxtFromDateMouseClicked

    private void TxtToDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtToDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtToDateMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            TxtToDate.setEnabled(true);
            TxtFromDate.setEnabled(true);
            TxtToDate.setDate(null);
            TxtFromDate.setDate(null);
            loadTables();
        } else {
            TxtToDate.setEnabled(false);
            TxtFromDate.setEnabled(false);
            TxtToDate.setDate(null);
            TxtFromDate.setDate(null);
            loadTables();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (!(jTextField1.getText().isEmpty())) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria c = openSession.createCriteria(Supplier.class);

                //c.add(Restrictions.like("supplierName", jTextField1.getText() + "%"));
                Criterion name = Restrictions.like("supplierName", jTextField1.getText() + "%");
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(name, active);
                c.add(andExp);

                Supplier supplier = (Supplier) c.uniqueResult();
                //Supplier supplier = new Supplier();

                Iterator iterator = supplier.getSupplierReturns().iterator();
                
                SupplierReturn supplierReturn = new SupplierReturn();

                while (iterator.hasNext()) {
                    SupplierReturn next = (SupplierReturn) iterator.next();
                    dtm.addRow(new Object[]{next.getIdSupplierReturn(), next.getRowGrnItem().getRawGrn().getRawGrnNo(), next.getRowGrnItem().getItems().getItemsCode(), next.getRowGrnItem().getItems().getItemName(), next.getReturnDate(), next.getQty()});

                }

                openSession.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            loadTables();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        try {
//
//            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
//                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//            if (showConfirmDialog == 0) {
//
//                int x = jTable1.getSelectedRow();
//                String supCode = (jTable1.getValueAt(x, 0).toString());
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);
//
//                createCriteria.add(Restrictions.eq("idSupplierReturn", Integer.parseInt(supCode)));
//
//                SupplierReturn supplier = (SupplierReturn) createCriteria.uniqueResult();
//
//                supplier.setIsActive("Deactive");
//
//                openSession.update(supplier);
//                beginTransaction.commit();
//                openSession.close();
//                NotificationPopup.Delete();
//
//                loadTables();
//
//            } else {
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        if (evt.getButton() == 3) {
//            jPopupMenu1.show();
//        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(RawItemStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReturnGRNUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtFromDate;
    public static com.alee.extended.date.WebDateField TxtToDate;
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadTables() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);

            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<SupplierReturn> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierReturn sr : list) {

                Iterator iterator = sr.getSupReturnTermses().iterator();

                while (iterator.hasNext()) {

                    SupReturnTerms next = (SupReturnTerms) iterator.next();

                    Vector v = new Vector();
                    v.add(sr.getIdSupplierReturn());
                    v.add(sr.getRowGrnItem().getRawGrn().getRawGrnNo());
                    v.add(sr.getRowGrnItem().getItems().getItemsCode());
                    v.add(sr.getRowGrnItem().getItems().getItemName());
                    v.add(sr.getReturnDate());
                    v.add(sr.getQty());
                    v.add(next.getReturnTerm());

                    dtm.addRow(v);

                }

                //dtm.addRow(new Object[]{sr.getIdSupplierReturn(), sr.getRowGrnItem().getRawGrn().getRawGrnNo(), sr.getRowGrnItem().getRawItems().getRawItemsCode(), sr.getRowGrnItem().getRawItems().getItemName(), sr.getReturnDate(), sr.getQty()});
            }

            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void maximizeWindow() {

        if (maximized) {

            ViewReturnGRNUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewReturnGRNUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

    }

}
