package Customers;

import ClassPack.Excel;

import Customers.withoutBTN.EditCustomersUdaya;
import ORM.Customer;
//import ORM.InvoicePayments;
//import srcs.*;
import com.alee.laf.WebLookAndFeel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import InvoiceAndGRN.withoutBTN.ViewInvoicePaymentODK;
import ORM.InvoicePayment;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewCustomersUdaya extends javax.swing.JFrame {

    public static String id;
    public static String s;
    public static String s1;
    public static String s2;
    public static String s3;
    public static String s4;

    public static String s0;

    public ViewCustomersUdaya() {
        initComponents();
        loadCustom();
        tableCustomer.setComponentPopupMenu(jPopupMenu);
        tableCustomer.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("Edit...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem1);

        jMenuItem2.setText("View Invoice Payment");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem2);

        jMenuItem3.setText("Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Customers");

        tableCustomer.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Name", "Contact No", "Address 1", "Address 2", "City"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCustomerMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);
        if (tableCustomer.getColumnModel().getColumnCount() > 0) {
            tableCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
            tableCustomer.getColumnModel().getColumn(1).setMinWidth(250);
            tableCustomer.getColumnModel().getColumn(1).setPreferredWidth(250);
            tableCustomer.getColumnModel().getColumn(1).setMaxWidth(250);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("View delete customers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Exel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {

            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Customer.class);
                //createCriteria.add(Restrictions.like("customersNic", txtSearch.getText() + "%"));

                Criterion contact = Restrictions.like("contact1", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(contact, active);
                createCriteria.add(andExp);

                List<Customer> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customer customers : list) {

                dtm.addRow(new Object[]{customers.getIdCustomer(), customers.getName(), customers.getContact1(), customers.getAddress1(), customers.getAddress2(), customers.getCity()});

                }

            } else {

                Session openSession = PoolManager.getSessionFactory().openSession();

                Criteria createCriteria = openSession.createCriteria(Customer.class);
                //createCriteria.add(Restrictions.like("customerscolName", txtSearch.getText() + "%"));

                Criterion cusname = Restrictions.like("name", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(cusname, active);
                createCriteria.add(andExp);

                List<Customer> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customer customers : list) {

                dtm.addRow(new Object[]{customers.getIdCustomer(), customers.getName(), customers.getContact1(), customers.getAddress1(), customers.getAddress2(), customers.getCity()});

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked

    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableCustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu.show();
        }

    }//GEN-LAST:event_tableCustomerMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int x = tableCustomer.getSelectedRow();
        id = (tableCustomer.getModel().getValueAt(x, 0).toString());
        s = (tableCustomer.getModel().getValueAt(x, 1).toString());
        s1 = (tableCustomer.getModel().getValueAt(x, 2).toString());
        s2 = (tableCustomer.getModel().getValueAt(x, 3).toString());
        s3 = (tableCustomer.getModel().getValueAt(x, 4).toString());
        s4 = (tableCustomer.getModel().getValueAt(x, 5).toString());

        EditCustomersUdaya ed = new EditCustomersUdaya();
        ed.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        int x = tableCustomer.getSelectedRow();
        s0 = (tableCustomer.getModel().getValueAt(x, 0).toString());

        int s01 = Integer.parseInt(s0);

        ViewInvoicePaymentODK cusInvoicePayment = new ViewInvoicePaymentODK();

        DefaultTableModel dtm = (DefaultTableModel) cusInvoicePayment.tableCusInvoice.getModel();
        dtm.setRowCount(0);

        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(InvoicePayment.class);
        cr.createAlias("customers", "s");
        cr.add(Restrictions.eq("s.idCustomers", s01));
        cr.add(Restrictions.eq("isDelete", "Delete"));

        List<InvoicePayment> l = cr.list();

        for (InvoicePayment ip : l) {
            dtm.addRow(new Object[]{ip.getInvoice().getInvoiceNo(), ip.getPaymentDate(), ip.getPaymentType(), decimalFormat.format(ip.getPaymentAmount())});

        }

        cusInvoicePayment.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = tableCustomer.getSelectedRow();
                String supCode = (tableCustomer.getModel().getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Customer.class);

                createCriteria.add(Restrictions.eq("idCustomer", Integer.parseInt(supCode)));

                Customer supplier = (Customer) createCriteria.uniqueResult();

                supplier.setIsDelete("Deactive");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadCustom();

            } else {

                //do NO Code
                
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ViewDeletedCustomersODK().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableCustomer, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewCustomersUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomersUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadCustom() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Customer.class);

            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Customer> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            for (Customer customers : list) {

                dtm.addRow(new Object[]{customers.getIdCustomer(), customers.getName(), customers.getContact1(), customers.getAddress1(), customers.getAddress2(), customers.getCity()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
