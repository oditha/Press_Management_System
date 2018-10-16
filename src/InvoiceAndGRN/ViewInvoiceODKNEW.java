package InvoiceAndGRN;

import ClassPack.Excel;
import InvoiceAndGRN.withoutBTN.ViewInvoicePaymentODK;
import InvoiceAndGRN.withoutBTN.ViewInvoiceItemODK;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import Customers.AddCusInvoicePaymentsUdaya;
import MainMenu.Logging;
import ORM.CashBook;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoiceItems;
import ORM.InvoicePayment;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class ViewInvoiceODKNEW extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> INV = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static String InvoiceNO;

    public ViewInvoiceODKNEW() {
        initComponents();
        loadCus();
        radioView.setSelected(true);
//        comboSupllier.grabFocus();
        tableAlign();
        jTable1.setComponentPopupMenu(jPopupMenu1);
  
        SetMaximized();
        jTable1.setRowHeight(30);
        viewAll();
    }
    static boolean maximized = true;

    private void SetMaximized() {

        if (maximized) {

            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        radioFilter = new javax.swing.JRadioButton();
        radioView = new javax.swing.JRadioButton();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        jLabel2 = new javax.swing.JLabel();
        txtEndDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filterText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("View Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setText("Delete Selected");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem2.setText("View Invoice Payments");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Invoice");

        buttonGroup1.add(radioFilter);
        radioFilter.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioFilter.setText("Filter");

        buttonGroup1.add(radioView);
        radioView.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioView.setText("View ALL");
        radioView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioViewMouseClicked(evt);
            }
        });
        radioView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioViewActionPerformed(evt);
            }
        });

        TxtStartDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Date from");

        txtEndDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Date To");

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("LOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Invoice Type", "Invoice Date", "Invoice Total", "Discount", "Nett Total", "Customer", "ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(7).setMinWidth(0);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        filterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTextKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Filter Using Any Feild");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(radioView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioView)
                            .addComponent(radioFilter)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioViewActionPerformed

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtEndDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEndDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (radioFilter.isSelected()) {

            if (true) {

                try {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();

                    Criteria cr = sess.createCriteria(Invoice.class);
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.add(Restrictions.between("invoiceDate", TxtStartDate.getText(), txtEndDate.getText()));
                  
                    List<Invoice> list = cr.list();

                    for (Invoice invoice : list) {

                        Vector v = new Vector();
                        v.add(invoice.getInvoiceNo());
                        v.add(invoice.getInvoiceType());
                        v.add(invoice.getInvoiceDate());
                        v.add(invoice.getSubtotal());
                        v.add(invoice.getDiscount());
                        v.add(invoice.getNetTotal());

                        Iterator it = invoice.getCustomerHasInvoices().iterator();

                        while (it.hasNext()) {
                            ORM.CustomerHasInvoice next = (ORM.CustomerHasInvoice) it.next();
                            v.add(next.getCustomer().getName());

                        }

                        v.add(invoice.getIdInvoice());
                        dtm.addRow(v);

                    }

                    sess.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();

                }

            } else {

                try {
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();

                    Criteria cr = sess.createCriteria(ORM.Customer.class);

                    cr.add(Restrictions.eq("isDelete", "Active"));

              
                    List<Customer> list = cr.list();

                    for (Customer customer : list) {

                        Iterator ir = customer.getCustomerHasInvoices().iterator();
                        while (ir.hasNext()) {
                            CustomerHasInvoice next = (CustomerHasInvoice) ir.next();

                            Vector v = new Vector();
                            v.add(next.getInvoice().getInvoiceNo());
                            v.add(next.getInvoice().getInvoiceType());
                            v.add(next.getInvoice().getInvoiceDate());
                            v.add(next.getInvoice().getSubtotal());
                            v.add(next.getInvoice().getDiscount());
                            v.add(next.getInvoice().getNetTotal());
                            v.add(customer.getName());
                            v.add(customer.getIdCustomer());
                            dtm.addRow(v);

                        }

                    }

                    sess.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioViewMouseClicked

        viewAll();


    }//GEN-LAST:event_radioViewMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InvoiceNO = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        //   System.out.println(InvoiceNO); 
        new ViewInvoiceItemODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "This will delete all data related to this Invoice");

        if (showConfirmDialog == 0) {
            int i = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(i, 7);
            try {

                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Invoice.class);
                cr.add(Restrictions.eq("isDelete", "Active"));
                cr.add(Restrictions.eq("idInvoice", id));
                Transaction tr = sess.beginTransaction();

                Invoice uniqueResult = (Invoice) cr.uniqueResult();

                if (uniqueResult != null) {

                    uniqueResult.setIsDelete("Deactive");
                    sess.update(uniqueResult);
                    
                    Iterator<InvoicePayment> iterator = uniqueResult.getInvoicePayments().iterator();
                    double total = 0.00;
                    while (iterator.hasNext()) {
                        
                        InvoicePayment next = iterator.next();
                        total += next.getPaymentAmount();
                        next.setIsDelete("Deactive");
                        
                        sess.update(next);
                        
                    }
                    
                    Iterator<InvoiceItems> itt = uniqueResult.getInvoiceItemses().iterator();
                    while (itt.hasNext()) {
                        InvoiceItems next = itt.next();
                        Iterator<RawItemStock> ittt = next.getItems().getRawItemStocks().iterator();
                        while (ittt.hasNext()) {
                            
                            RawItemStock next1 = ittt.next();
                            next1.setQty(next1.getQty()+next.getQty());
                            sess.update(next1);
                            
                        }
                        
                    }
                    
                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(Logging.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Invice Delete");
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(total);
                    
                    sess.save(cashBook);
                    
                    
                    tr.commit();
                    NotificationPopup.Delete();
                   viewAll();
                }
                sess.close();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        if (evt.getButton() == 3) {

//            new AddCusInvoicePaymentsUdaya();
            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filterText.getText()));


    }//GEN-LAST:event_filterTextKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int i = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(i, 7).toString();

        InvoiceNO = jTable1.getValueAt(i, 7).toString();
        ViewInvoicePaymentODK viewInvoicePaymentODK = new ViewInvoicePaymentODK();

        DefaultTableModel dtm = (DefaultTableModel) viewInvoicePaymentODK.tableCusInvoice.getModel();
        dtm.setRowCount(0);
        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Invoice.class);
            cr.add(Restrictions.eq("idInvoice", Integer.parseInt(id)));

            List<Invoice> list = cr.list();

            for (Invoice invoice : list) {

                Vector v = new Vector();
                v.add(invoice.getInvoiceNo());
                Iterator it = invoice.getInvoicePayments().iterator();

                while (it.hasNext()) {
                    InvoicePayment next = (InvoicePayment) it.next();
                    System.out.println(next.getPaymentAmount());
                    if (next.getIsDelete().equals("Active")) {
                        v.add(next.getPaymentDate());
                        v.add(next.getPaymentType());
                        v.add(next.getPaymentAmount());
                        v.add(next.getIdInvoicePayment());
                        dtm.addRow(v);
                    }

                }

            }

            viewInvoicePaymentODK.setVisible(true);
            sess.close();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
            Excel.toExcel(jTable1, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewInvoiceODKNEW.class.getName()).log(Level.SEVERE, null, ex);
        }


        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoiceODKNEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField filterText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioFilter;
    private javax.swing.JRadioButton radioView;
    public static com.alee.extended.date.WebDateField txtEndDate;
    // End of variables declaration//GEN-END:variables

    private void loadCus() {

        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Customer.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<Customer> list = cr.list();

            for (Customer customer : list) {

//                comboSupllier.addItem(customer.getName());
                sup.put(customer.getName(), customer.getIdCustomer());

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }


    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

    }



    public void viewAll() {

        try {

            float s = 0;
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            Session sess = PoolManager.getSessionFactory().openSession();

            Criteria cr = sess.createCriteria(Invoice.class);
            cr.add(Restrictions.eq("isDelete", "Active"));

        

            List<Invoice> list = cr.list();
            // System.out.println(list.size());
            for (Invoice invoice : list) {

                Vector v = new Vector();
                v.add(invoice.getInvoiceNo());
                v.add(invoice.getInvoiceType());
                v.add(invoice.getInvoiceDate());
                v.add(invoice.getSubtotal());
                v.add(invoice.getDiscount());
                v.add(invoice.getNetTotal());

                Iterator it = invoice.getCustomerHasInvoices().iterator();

                while (it.hasNext()) {
                    ORM.CustomerHasInvoice next = (ORM.CustomerHasInvoice) it.next();
                    v.add(next.getCustomer().getName());

                }

                v.add(invoice.getIdInvoice());
                dtm.addRow(v);

            }
            sess.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
