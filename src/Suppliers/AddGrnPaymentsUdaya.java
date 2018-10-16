package Suppliers;

import ORM.CashBook;
import ORM.RawGrn;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddGrnPaymentsUdaya extends javax.swing.JFrame {

    Integer SupId = null;
    Map<String, Integer> cust = new HashMap();

    public AddGrnPaymentsUdaya() {
        initComponents();
        ComboToTXT2();
        //loadSup();
        tableAlign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCurBalance = new javax.swing.JTextField();
        comboSup = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GRN Payments");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Select Supplyer");

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCurBalance.setEditable(false);
        txtCurBalance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCurBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalanceActionPerformed(evt);
            }
        });

        comboSup.setEditable(true);
        comboSup.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboSup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupActionPerformed(evt);
            }
        });

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "GRN NO", "GRN Date", "GRN Total", "Total Paid", "Outstanding", "Paid Amount"
            }
        ));
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(0).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Current Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCurBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel4)))))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupPopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboSupPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (int i = 0; i < tblAddPayments.getRowCount(); i++) {
            System.out.println(i);
            if (tblAddPayments.getValueAt(i, 6) != null) {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    RawGrn grn0 = new RawGrn();
                    grn0.setIdRawGrn(Integer.parseInt(tblAddPayments.getValueAt(i, 0).toString()));

                    Supplier supplier = new Supplier();
                    supplier.setIdSupplier(SupId = cust.get(comboSup.getSelectedItem().toString().split(" - ")[1]));

                    RowItemGrnPayment grn = new RowItemGrnPayment();
                    grn.setRowItemGrnPayDate(dateForm.currentdate());
                    grn.setRowItemGrnPayAmount(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    grn.setRowItemGrnPayType("Cash");
                    grn.setSupplier(supplier);
                    grn.setIsDelete("Active");
                    grn.setRawGrn(grn0);
                    openSession.save(grn);

                    CashBook cashBook = new CashBook();
                    cashBook.setIncome(0.00);
                    cashBook.setExpence(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Payment for supplier GRN " + tblAddPayments.getValueAt(i, 1).toString());

                    openSession.save(cashBook);

                    beginTransaction.commit();
                    openSession.close();

                    NotificationPopup.save();

                    comboSup.setSelectedIndex(0);
//                    comboType.setSelectedIndex(0);
                    txtCurBalance.setText(null);
                    DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
                    dtm.setRowCount(0);
                    comboSup.grabFocus();

                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        }

//        if (!txtPaidAmo.getText().isEmpty()) {
//
//            try {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Supplier supplier = new Supplier();
//                supplier.setIdSupplier(sup.get(comboSup.getSelectedItem().toString().split(" - ")[0]));
//
//                Grnpayments grn = new Grnpayments();
//                grn.setPaymentDate(dateForm.currentdate());
//                grn.setAmount(Double.parseDouble(txtPaidAmo.getText()));
//                grn.setPaymentType(comboType.getSelectedItem().toString());
//                grn.setSupplier(supplier);
//                grn.setIsActive("Active");
//
//                openSession.save(grn);
//
//                CashBook cashBook = new CashBook();
//                cashBook.setCredit(0.00);
//                cashBook.setDebit(Double.parseDouble(txtPaidAmo.getText()));
//                cashBook.setCbdate(dateForm.currentdate());
//
//                openSession.save(cashBook);
//
//                beginTransaction.commit();
//                openSession.close();
//
//                NotificationPopup.save();
//
//                comboSup.setSelectedIndex(0);
//                comboType.setSelectedIndex(0);
//                txtCurBalance.setText(null);
//                txtPaidAmo.setText(null);
//
//                comboSup.grabFocus();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//
//        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased

        if (evt.getKeyCode() == 10) {
            try {
                int row = tblAddPayments.getSelectedRow();
                String Value = tblAddPayments.getValueAt(row, 3).toString();

                tblAddPayments.editCellAt(tblAddPayments.getSelectedRow() + 1, 6);
                tblAddPayments.setSurrendersFocusOnKeystroke(true);
                tblAddPayments.getEditorComponent().requestFocus();
                tblAddPayments.setRowSelectionInterval(tblAddPayments.getSelectedRow() + 1, tblAddPayments.getSelectedRow() + 1);

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void txtCurBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurBalanceActionPerformed

    private void comboSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGrnPaymentsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Supplier> list = createCriteria.list();
            for (Supplier supplier : list) {

                comboSup.addItem(supplier.getIdSupplier() + " - " + supplier.getSupplierName());

            }
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadTable() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(RawGrn.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.createAlias("supplier", "s");
            createCriteria.add(Restrictions.eq("s.idSupplier", SupId));
            List<RawGrn> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
            for (RawGrn grn : list) {

                Double nettTotal = grn.getNetTotal();
                Double amount = 0.00;
                Iterator iterator = grn.getRowItemGrnPayments().iterator();
                while (iterator.hasNext()) {
                    RowItemGrnPayment gp = (RowItemGrnPayment) iterator.next();

                    if (gp.getIsDelete().equals("Active")) {

                        amount += gp.getRowItemGrnPayAmount();
                    }

                }

                if (nettTotal > amount) {

                    dtm.addRow(new Object[]{
                        grn.getIdRawGrn(),
                        grn.getRawGrnNo(),
                        grn.getRawGrnDate(),
                        Decimal_Formats.Price(grn.getNetTotal()),
                        Decimal_Formats.Price(amount),
                        Decimal_Formats.Price(nettTotal - amount)

                    });

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblAddPayments.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Supplier.class);
                    createCriteria.add(Restrictions.like("contactNo1", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Supplier> list = createCriteria.list();

                    for (Supplier customers : list) {
                        str1 = customers.getSupplierName() + " - " + customers.getContactNo1();
                        filterArray.add(str1);
                        cust.put(customers.getContactNo1(), customers.getIdSupplier());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Supplier.class);
                    createCriteria.add(Restrictions.like("supplierName", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Supplier> list = createCriteria.list();

                    for (Supplier customers : list) {

                        str1 = customers.getSupplierName() + " - " + customers.getContactNo1();
                        filterArray.add(str1);
                        cust.put(customers.getContactNo1(), customers.getIdSupplier());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboSup.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboSup.setSelectedItem(enteredText);
            comboSup.showPopup();
        } else {
            comboSup.hidePopup();
        }
    }

    private void ComboToTXT2() {
        final JTextField textfield0 = (JTextField) comboSup.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            double grntot = 0;
                            double paidtot = 0;

                            //String[] s = comboSup.getSelectedItem().toString().split(" - ");
                            SupId = cust.get(comboSup.getSelectedItem().toString().split(" - ")[1]);

                            try {

                                Session openSession = PoolManager.getSessionFactory().openSession();
                                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                                createCriteria.add(Restrictions.eq("idSupplier", SupId));
                                Supplier uniqueResult = (Supplier) createCriteria.uniqueResult();

                                Iterator iterator = uniqueResult.getRawGrns().iterator();

                                while (iterator.hasNext()) {

                                    RawGrn grn = (RawGrn) iterator.next();
                                    if (grn.getIsDelete().equals("Active")) {
                                        grntot += grn.getNetTotal();

                                    }

                                }

                                Iterator iterator1 = uniqueResult.getRowItemGrnPayments().iterator();
                                while (iterator1.hasNext()) {

                                    RowItemGrnPayment next = (RowItemGrnPayment) iterator1.next();
                                    if (next.getIsDelete().equals("Active")) {
                                        paidtot += next.getRowItemGrnPayAmount();

                                    }

                                }
                                txtCurBalance.setText(Decimal_Formats.Price(grntot - paidtot) + "");
                                openSession.close();
                                loadTable();
                            } catch (Exception e) {

                                e.printStackTrace();

                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

}
