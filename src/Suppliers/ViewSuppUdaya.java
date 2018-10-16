package Suppliers;

//import ORM.Customers;
//import ORM.Grnpayments;
//import ORM.InvoicePayments;
import ORM.Supplier;
//import ORM.SupplierInvoicePayments;
//import static Reports.SupPaymentHistory.tableSupGRN;
//import static Reports.SupPaymentHistory.tableSupInvoice;
//import static Reports.SupPaymentHistory.txtTotalGRN;
//import static Reports.SupPaymentHistory.txtTotalInvoice;
//import static Reports.ViewCustomersUdaya.s;
//import static Reports.ViewCustomersUdaya.s0;
//import srcs.*;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewSuppUdaya extends javax.swing.JFrame {

    public static String a;
    public static String a1;
    public static String a2;
    public static String a3;
    public static String a4;
    public static String a5;
    public static String a6;
    public static String a7;
    public static String a8;

    public static Integer s01;

    public ViewSuppUdaya() {
        initComponents();
        loadSupp();
        tableSupplier.setComponentPopupMenu(jPopupMenu1);
        tableSupplier.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        jMenuItem3.setText("Edit...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText("Delete");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Suppliers");

        tableSupplier.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact 1", "Contact 2", "Address 1", "Address 2", "City"
            }
        ));
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSupplierMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplier);
        if (tableSupplier.getColumnModel().getColumnCount() > 0) {
            tableSupplier.getColumnModel().getColumn(0).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setMaxWidth(0);
            tableSupplier.getColumnModel().getColumn(1).setMinWidth(300);
            tableSupplier.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableSupplier.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                //createCriteria.add(Restrictions.like("supplierCode", txtSearch.getText() + "%"));

                Criterion code = Restrictions.like("contactNo1", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(code, active);
                createCriteria.add(andExp);

                List<Supplier> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
                dtm.setRowCount(0);

                for (Supplier supplier : list) {

                dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierName(), supplier.getContactNo1(), supplier.getContactNo2(), supplier.getAddress1(), supplier.getAddress2(), supplier.getCity()});

                }

            } else {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                //createCriteria.add(Restrictions.like("supplierName", txtSearch.getText() + "%"));

                Criterion supname = Restrictions.like("supplierName", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isDelete", "Active");
                LogicalExpression andExp = Restrictions.and(supname, active);
                createCriteria.add(andExp);

                List<Supplier> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
                dtm.setRowCount(0);

                for (Supplier supplier : list) {

                dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierName(), supplier.getContactNo1(), supplier.getContactNo2(), supplier.getAddress1(), supplier.getAddress2(), supplier.getCity()});

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            int x = tableSupplier.getSelectedRow();
            a = (tableSupplier.getModel().getValueAt(x, 0).toString());
            a1 = (tableSupplier.getModel().getValueAt(x, 1).toString());
            a2 = (tableSupplier.getModel().getValueAt(x, 2).toString());
            a3 = (tableSupplier.getModel().getValueAt(x, 3).toString());
            a4 = (tableSupplier.getModel().getValueAt(x, 4).toString());
            a5 = (tableSupplier.getModel().getValueAt(x, 5).toString());
            a6 = (tableSupplier.getModel().getValueAt(x, 6).toString());

            EditSupplierUdaya editSupplyer = new EditSupplierUdaya();
            editSupplyer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = tableSupplier.getSelectedRow();
                String supCode = (tableSupplier.getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Supplier.class);

                createCriteria.add(Restrictions.eq("idSupplier", Integer.parseInt(supCode)));

                Supplier supplier = (Supplier) createCriteria.uniqueResult();

                supplier.setIsDelete("Deactive");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadSupp();

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tableSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }

    }//GEN-LAST:event_tableSupplierMouseReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSuppUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableSupplier;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadSupp() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Supplier.class);

            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Supplier> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
            dtm.setRowCount(0);

            for (Supplier supplier : list) {

                dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierName(), supplier.getContactNo1(), supplier.getContactNo2(), supplier.getAddress1(), supplier.getAddress2(), supplier.getCity()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
