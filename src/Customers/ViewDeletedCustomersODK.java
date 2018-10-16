package Customers;


import ClassPack.Excel;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Customer;
import com.alee.laf.WebLookAndFeel;
import java.io.File;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewDeletedCustomersODK extends javax.swing.JFrame {

    public static String s;
    public static String s1;
    public static String s2;
    public static String s3;

    public static String s0;

    public ViewDeletedCustomersODK() {
        initComponents();
        loadCustom();
        tableCustomer.setComponentPopupMenu(jPopupMenu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem3.setText("Activate");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Deleted Customers");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 12))); // NOI18N

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Type NIC or Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Name", "Address", "Contact No"
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
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("To Exel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
//        try {
//
//            char c = evt.getKeyChar();
//            if (Character.isDigit(c)) {
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(Customers.class);
//                //createCriteria.add(Restrictions.like("customersNic", txtSearch.getText() + "%"));
//
//                Criterion nic = Restrictions.like("customersNic", "%" + txtSearch.getText() + "%");
//                Criterion active = Restrictions.like("isActive", "Deactive");
//                LogicalExpression andExp = Restrictions.and(nic, active);
//                createCriteria.add(andExp);
//
//                List<Customers> list = createCriteria.list();
//
//                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
//                dtm.setRowCount(0);
//                for (Customers customers : list) {
//
//                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});
//
//                }
//
//            } else {
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//
//                Criteria createCriteria = openSession.createCriteria(Customers.class);
//                //createCriteria.add(Restrictions.like("customerscolName", txtSearch.getText() + "%"));
//
//                Criterion cusname = Restrictions.like("customerscolName", "%" + txtSearch.getText() + "%");
//                Criterion active = Restrictions.like(""
//                        + "", "Deactive");
//                LogicalExpression andExp = Restrictions.and(cusname, active);
//                createCriteria.add(andExp);
//
//                List<Customers> list = createCriteria.list();
//
//                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
//                dtm.setRowCount(0);
//                for (Customers customers : list) {
//
//                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});
//
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked

    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableCustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu.show();
        }

    }//GEN-LAST:event_tableCustomerMouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//
        int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, " Are you sure want to Activate this customer?");

      

        if (showConfirmDialog == 0) {

            try {
                int x = tableCustomer.getSelectedRow();
                String supCode = (tableCustomer.getModel().getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Customer.class);

                createCriteria.add(Restrictions.eq("idCustomer", Integer.parseInt(supCode)));

                Customer supplier = (Customer) createCriteria.uniqueResult();

                supplier.setIsDelete("Active");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadCustom();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
//

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableCustomer, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewDeletedCustomersODK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeletedCustomersODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadCustom() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(ORM.Customer.class);

            createCriteria.add(Restrictions.like("isDelete", "Deactive"));

            List<Customer> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            for (Customer customers : list) {

                Vector v = new Vector();
                v.add(customers.getIdCustomer());
                v.add(customers.getName());
                v.add(customers.getAddress1()+customers.getAddress2()+customers.getCity());
                v.add(customers.getContact1());
                dtm.addRow(v);
                
                
                
            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
