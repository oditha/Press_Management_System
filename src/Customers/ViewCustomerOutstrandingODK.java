package Customers;

import ClassPack.Excel;

import Customers.withoutBTN.ViewCustomerOutstandingHistoryODK;
import ClassPack.PoolManager;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.InvoicePayment;
import ORM.RawGrn;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
import Suppliers.ViewGrnPaymentUdaya;
import com.alee.laf.WebLookAndFeel;
import java.awt.print.PrinterException;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.Restrictions;

public class ViewCustomerOutstrandingODK extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();

    public ViewCustomerOutstrandingODK() {

        initComponents();
        tblAddPayments.setComponentPopupMenu(jPopupMenu1);
        tableAlign();
        tblAddPayments.setRowHeight(30);
        loadoutstanding();
        jMenuItem2.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("View History");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("View GRN Payments");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Customer Outstanding");

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suplier / Customer Name", "Phone No", "Total Purchased", "Total Paid", "Outstanding", "idCustomer"
            }
        ));
        tblAddPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAddPaymentsMouseReleased(evt);
            }
        });
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(5).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("To Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased


    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void tblAddPaymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddPaymentsMouseReleased

        int button = evt.getButton();
        System.out.println(button);

        if (button == 3) {

            jPopupMenu1.show();

        }


    }//GEN-LAST:event_tblAddPaymentsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ViewCustomerOutstandingHistoryODK viewCustomerOutstandingHistoryODK = new ViewCustomerOutstandingHistoryODK();
        DefaultTableModel dtm = (DefaultTableModel) viewCustomerOutstandingHistoryODK.jTable1.getModel();
        dtm.setRowCount(0);
        int idcustomer = Integer.parseInt(tblAddPayments.getValueAt(tblAddPayments.getSelectedRow(), 5).toString());
        System.out.println("id" + idcustomer);
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria cr = openSession.createCriteria(Customer.class);
            cr.add(Restrictions.eq("idCustomer", idcustomer));

            Customer uniqueResult = (Customer) cr.uniqueResult();

            Double paid = 0.0;
            Double net = 0.0;
            if (uniqueResult != null) {

                System.out.println(uniqueResult.getName());
                viewCustomerOutstandingHistoryODK.name.setText(uniqueResult.getName());
                viewCustomerOutstandingHistoryODK.contact.setText(uniqueResult.getContact1());

                Iterator it = uniqueResult.getCustomerHasInvoices().iterator();
                while (it.hasNext()) {
                    CustomerHasInvoice next = (CustomerHasInvoice) it.next();

                    Vector v = new Vector();
                    v.add(next.getInvoice().getInvoiceNo());
                    v.add(next.getInvoice().getInvoiceDate());

                    v.add(next.getInvoice().getNetTotal());

                    if (next.getInvoice().getIsDelete().equals("Active")) {

                        Iterator it2 = next.getInvoice().getInvoicePayments().iterator();
                        while (it2.hasNext()) {
                            InvoicePayment next1 = (InvoicePayment) it2.next();

                            if (next1.getIsDelete().equals("Active")) {

                                paid += next1.getPaymentAmount();

                            }

                        }

                    }

                    v.add(paid);
                    v.add((next.getInvoice().getNetTotal() - paid));
                    dtm.addRow(v);
                    System.out.println(next.getInvoice().getInvoiceNo());

                }

                viewCustomerOutstandingHistoryODK.setVisible(true);

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(tblAddPayments, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewCustomerOutstrandingODK.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria cr = openSession.createCriteria(Supplier.class);
//            cr.add(Restrictions.eq("idSupplier", tblAddPayments.getValueAt(tblAddPayments.getSelectedRow(), 5)));
//
//            List<Supplier> list = cr.list();
//            for (Supplier supplier : list) {
//
//                new ViewGrnPaymentUdaya().comboSup.setSelectedItem(supplier.getIdSupplier() + " - " + supplier.getSupplierName());
//                new ViewGrnPaymentUdaya().setVisible(true);
//
//            }
//            openSession.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
            tblAddPayments.print();
            
        } catch (PrinterException ex) {
            Logger.getLogger(ViewCustomerOutstrandingODK.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerOutstrandingODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddPayments;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

//        try {
//            
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Supplier.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Supplier> list = createCriteria.list();
//            for (Supplier supplier : list) {
//                
//                comboSup.addItem(supplier.getSupplierCode() + " - " + supplier.getSupplierName());
//                sup.put(supplier.getSupplierCode(), supplier.getIdSupplier());
//                
//            }
//            openSession.close();
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//            
//        }
//        
    }

    private void loadTable() {

//        try {
//            
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Grn.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            createCriteria.createAlias("supplier", "s");
//            createCriteria.add(Restrictions.eq("s.idSupplier", sup.get(comboSup.getSelectedItem().toString().split(" - ")[0])));
//            List<Grn> list = createCriteria.list();
//            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
//            dtm.setRowCount(0);
//            for (Grn grn : list) {
//                
//                Double nettTotal = grn.getNettTotal();
//                Double amount = 0.00;
//                Iterator iterator = grn.getGrnpaymentses().iterator();
//                while (iterator.hasNext()) {
//                    Grnpayments gp = (Grnpayments) iterator.next();
//                    
//                    if (gp.getIsActive().equals("Active")) {
//                        
//                        amount += gp.getAmount();
//                    }
//                    
//                }
//                
//                if (nettTotal > amount) {
//                    
//                    dtm.addRow(new Object[]{
//                        grn.getIdGrn(),
//                        grn.getGrnno(),
//                        grn.getGrndate(),
//                        Decimal_Formats.Price(grn.getNettTotal()),
//                        Decimal_Formats.Price(amount),
//                        Decimal_Formats.Price(nettTotal - amount)
//                    
//                    });
//                    
//                }
//                
//            }
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//            
//        }
    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);

        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    private void loadoutstanding() {
        DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
        dtm.setRowCount(0);

        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria cr = openSession.createCriteria(Customer.class);
        cr.add(Restrictions.eq("isDelete", "Active"));
        List<Customer> list = cr.list();

        for (Customer uniqueResult : list) {

            Double invnet = 0.0;
            Double invpayment = 0.0;
            Iterator it = uniqueResult.getCustomerHasInvoices().iterator();

            while (it.hasNext()) {
                CustomerHasInvoice next = (CustomerHasInvoice) it.next();

                if (next.getInvoice().getIsDelete().equals("Active")) {

                    invnet += next.getInvoice().getNetTotal();

                    Iterator it2 = next.getInvoice().getInvoicePayments().iterator();
                    while (it2.hasNext()) {
                        InvoicePayment next1 = (InvoicePayment) it2.next();

                        if (next1.getIsDelete().equals("Active")) {

                            invpayment += next1.getPaymentAmount();

                        }

                    }

                    System.out.println(next.getInvoice().getNetTotal());

                }

            }

            if (!(invnet - invpayment == 0.00)) {

                Vector v = new Vector();
                v.add(uniqueResult.getName());
                v.add(uniqueResult.getContact1());
                v.add(invnet);
                v.add(invpayment);
                v.add((invnet - invpayment));
                v.add(uniqueResult.getIdCustomer());
                dtm.addRow(v);

            }
        }

        openSession.close();

    }

}
