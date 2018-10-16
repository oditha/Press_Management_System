package Customers;

import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.PoolManager;
import ORM.Customer;
import ORM.InvoicePayment;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewCustomersPayments extends javax.swing.JFrame {

    Integer CusID = null;

    public ViewCustomersPayments() {
        initComponents();
        //loadSupInvoice();
        //loadSupGRN();
        loadcus();
        setTotal();
        tableDecor();
        tableSupGRN.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupGRN = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtTotalGRN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        webdateFrom = new com.alee.extended.date.WebDateField();
        webdateTo = new com.alee.extended.date.WebDateField();
        btnFilterGRN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboCustomer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customers Payment History ");

        tableSupGRN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tableSupGRN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN No", "Date", "Payment Type", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tableSupGRN);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setText("Total GRN Payment");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setText("LKR");

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtTotalGRN.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtTotalGRN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotalGRN.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("From");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("To");

        webdateFrom.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateFromMouseClicked(evt);
            }
        });

        webdateTo.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateToMouseClicked(evt);
            }
        });

        btnFilterGRN.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilterGRN.setText("Filter");
        btnFilterGRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterGRNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Select Customer");

        comboCustomer.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboCustomer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCustomerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnFilterGRN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalGRN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilterGRN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalGRN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void webdateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateToMouseClicked

    }//GEN-LAST:event_webdateToMouseClicked

    private void webdateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateFromMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webdateFromMouseClicked

    private void btnFilterGRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterGRNActionPerformed
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            if (comboCustomer.getSelectedIndex() == 0) {
                Criteria createCriteria = openSession.createCriteria(InvoicePayment.class);
                createCriteria.add(Restrictions.between("paymentDate", webdateFrom.getText(), webdateTo.getText()));

                List<InvoicePayment> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupGRN.getModel();
                dtm.setRowCount(0);

                for (InvoicePayment rp : list) {
                    dtm.addRow(new Object[]{rp.getInvoice().getInvoiceNo(), rp.getPaymentDate(), rp.getPaymentType(), Decimal_Formats.Price(rp.getPaymentAmount())});

                }
            } else {
                Criteria createCriteria = openSession.createCriteria(InvoicePayment.class);
                createCriteria.createAlias("customer", "s");
                Criterion date = Restrictions.between("paymentDate", webdateFrom.getText(), webdateTo.getText());
                Criterion id = Restrictions.eq("s.idCustomer", CusID);

                LogicalExpression andExp = Restrictions.and(date, id);
                createCriteria.add(andExp);

                List<InvoicePayment> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupGRN.getModel();
                dtm.setRowCount(0);

                for (InvoicePayment rp : list) {
                    dtm.addRow(new Object[]{rp.getInvoice().getInvoiceNo(), rp.getPaymentDate(), rp.getPaymentType(), Decimal_Formats.Price(rp.getPaymentAmount())});

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterGRNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            tableSupGRN.print();
        } catch (PrinterException ex) {
            // Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuWillBecomeInvisible

        if (comboCustomer.getSelectedIndex() != 0) {

            String[] s = comboCustomer.getSelectedItem().toString().split(" - ");
            CusID = Integer.parseInt(s[0]);

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(InvoicePayment.class);
                createCriteria.createAlias("customer", "s");
                createCriteria.add(Restrictions.eq("s.idCustomer", CusID));

                List<InvoicePayment> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupGRN.getModel();
                dtm.setRowCount(0);

                for (InvoicePayment rp : list) {
                    dtm.addRow(new Object[]{rp.getInvoice().getInvoiceNo(), rp.getPaymentDate(), rp.getPaymentType(), Decimal_Formats.Price(rp.getPaymentAmount())});
                }
                setTotal();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_comboCustomerPopupMenuWillBecomeInvisible

    private void comboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCustomerActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomersPayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilterGRN;
    public static javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tableSupGRN;
    public static javax.swing.JLabel txtTotalGRN;
    private com.alee.extended.date.WebDateField webdateFrom;
    private com.alee.extended.date.WebDateField webdateTo;
    // End of variables declaration//GEN-END:variables

    private void setTotal() {
        Double sum = 0.00;
        for (int i = 0; i < tableSupGRN.getRowCount(); i++) {
            double getsum = Double.parseDouble((String) tableSupGRN.getValueAt(i, 3));
            sum = getsum + sum;
            txtTotalGRN.setText(Decimal_Formats.Price(sum));
        }
    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tableSupGRN.getColumnModel().getColumn(3).setCellRenderer(dtcr);

    }

    private void loadcus() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Customer.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Customer> list = createCriteria.list();
            for (Customer customer : list) {

                comboCustomer.addItem(customer.getIdCustomer() + " - " + customer.getName());

            }
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
