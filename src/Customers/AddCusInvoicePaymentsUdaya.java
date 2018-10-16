package Customers;

import ClassPack.DB;
import ORM.CashBook;
import ORM.Customer;
import ORM.Invoice;
import ORM.CustomerHasInvoice;
import ORM.InvoicePayment;
import com.alee.laf.WebLookAndFeel;
import ClassPack.Decimal_Formats;
import ClassPack.InvoicePaymentDataHolder;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddCusInvoicePaymentsUdaya extends javax.swing.JFrame {

    Map<String, Integer> cust = new HashMap();

    public AddCusInvoicePaymentsUdaya() {
        initComponents();
        ComboToTXT2();
        tableAlign();
        jTable1.setRowHeight(25);
        chkPrint.setSelected(true);
        chkPreview.setSelected(false);
        chkDialog.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCurBalance = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        chkPrint = new javax.swing.JCheckBoxMenuItem();
        chkPreview = new javax.swing.JCheckBoxMenuItem();
        chkDialog = new javax.swing.JCheckBoxMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Payments");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Select Customer");

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCurBalance.setEditable(false);
        txtCurBalance.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtCurBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalanceActionPerformed(evt);
            }
        });

        comboCustomer.setEditable(true);
        comboCustomer.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboCustomer.setToolTipText("Press Enter after choose");
        comboCustomer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCustomerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        tblAddPayments.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Invoice No", "Invoice Date", "Invoice Total", "Total Paid", "Outstanding", "Paid Amount"
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

        jMenu1.setText("Print Setting");

        chkPrint.setSelected(true);
        chkPrint.setText("Print Receipt");
        jMenu1.add(chkPrint);

        chkPreview.setSelected(true);
        chkPreview.setText("Preview Receipt");
        jMenu1.add(chkPreview);

        chkDialog.setSelected(true);
        chkDialog.setText("Show Print Dialog");
        jMenu1.add(chkDialog);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCurBalance))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurBalance))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuWillBecomeInvisible
//        loadTableV2();

    }//GEN-LAST:event_comboCustomerPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        List<InvoicePaymentDataHolder> holder = new ArrayList<>();

        holder.clear();

        InvoicePaymentDataHolder ip = new InvoicePaymentDataHolder();
        ip.setCustomer("TEST");
        ip.setInvno("INV");
        ip.setInvtotal(0.00);
        ip.setOutstading(0.00);
        ip.setPaid(0.00);

        holder.add(ip);
        Session openSession = PoolManager.getSessionFactory().openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        for (int i = 0; i < tblAddPayments.getRowCount(); i++) {
            System.out.println(i);
            if (tblAddPayments.getValueAt(i, 6) != null) {

                try {

                    Invoice Inv = new Invoice();
                    Inv.setIdInvoice(Integer.parseInt(tblAddPayments.getValueAt(i, 0).toString()));

                    Customer customer = new Customer();
                    customer.setIdCustomer(cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1]));

                    InvoicePayment invpay = new InvoicePayment();
                    invpay.setPaymentDate(dateForm.currentdate());
                    invpay.setPaymentAmount(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    invpay.setPaymentType("Cash");
                    invpay.setCustomer(customer);
                    invpay.setIsDelete("Active");
                    invpay.setInvoice(Inv);
                    openSession.save(invpay);

                    CashBook cashBook = new CashBook();
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Payment for Invoice " + tblAddPayments.getValueAt(i, 1).toString());

                    openSession.save(cashBook);

                    InvoicePaymentDataHolder ipp = new InvoicePaymentDataHolder();
                    ipp.setCustomer(comboCustomer.getSelectedItem().toString());
                    ipp.setInvno(tblAddPayments.getValueAt(i, 1).toString());
                    ipp.setInvtotal(Double.parseDouble(tblAddPayments.getValueAt(i, 3).toString()));
                    ipp.setOutstading(Double.parseDouble(tblAddPayments.getValueAt(i, 5).toString()) - Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    ipp.setPaid(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));

                    holder.add(ipp);

                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        }

        beginTransaction.commit();
        openSession.close();

        NotificationPopup.save();

        if (chkPrint.isSelected()) {

            System.out.println(holder);
            JRBeanCollectionDataSource bcd = new JRBeanCollectionDataSource(holder);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("Bean", bcd);

            try {
                JasperPrint jp;
                jp = JasperFillManager.fillReport(Logging.PaymentRecipt, map, bcd);

                if (chkPreview.isSelected()) {

                    JasperViewer.viewReport(jp, false);
                }

                if (chkDialog.isSelected()) {
                JasperPrintManager.printReport(jp, true);
                    
                }else{
                
                JasperPrintManager.printReport(jp, false);
                }
                
            } catch (Exception ex) {
                Logger.getLogger(AddCusInvoicePaymentsUdaya.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        comboCustomer.setSelectedIndex(-1);

        txtCurBalance.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
        dtm.setRowCount(0);
        comboCustomer.grabFocus();

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

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCusInvoicePaymentsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBoxMenuItem chkDialog;
    private javax.swing.JCheckBoxMenuItem chkPreview;
    private javax.swing.JCheckBoxMenuItem chkPrint;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance;
    // End of variables declaration//GEN-END:variables

    private void loadTableV2() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(CustomerHasInvoice.class);
            createCriteria.createAlias("customer", "c");
            createCriteria.add(Restrictions.eq("c.idCustomer", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            List<CustomerHasInvoice> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
            for (CustomerHasInvoice cusin : list) {

                Double nettTotal = cusin.getInvoice().getNetTotal();
                Double amount = 0.00;
                Iterator iterator = cusin.getInvoice().getInvoicePayments().iterator();
                while (iterator.hasNext()) {
                    InvoicePayment gp = (InvoicePayment) iterator.next();

                    if (gp.getIsDelete().equals("Active")) {

                        amount += gp.getPaymentAmount();
                    }

                }

                if (nettTotal > amount) {

                    dtm.addRow(new Object[]{
                        cusin.getInvoice().getIdInvoice(),
                        cusin.getInvoice().getInvoiceNo(),
                        cusin.getInvoice().getInvoiceDate(),
                        Decimal_Formats.Price(cusin.getInvoice().getNetTotal()),
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
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("contact1", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {
                        str1 = customers.getName() + " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("name", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {

                        str1 = customers.getName() + " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboCustomer.setSelectedItem(enteredText);
            comboCustomer.showPopup();
        } else {
            comboCustomer.hidePopup();
        }

    }

    private void ComboToTXT2() {
        final JTextField textfield0 = (JTextField) comboCustomer.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {
                            loadTableV2();
                            settotal();

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

    private void settotal() {
        double invtotal = 0;
        double paidtot = 0;

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Customer.class);
            createCriteria.add(Restrictions.eq("idCustomer", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            Customer uniqueResult = (Customer) createCriteria.uniqueResult();

            Iterator iterator = uniqueResult.getCustomerHasInvoices().iterator();

            while (iterator.hasNext()) {

                CustomerHasInvoice invhascus = (CustomerHasInvoice) iterator.next();

                invtotal += invhascus.getInvoice().getNetTotal();

            }

            Iterator iterator1 = uniqueResult.getInvoicePayments().iterator();
            while (iterator1.hasNext()) {

                InvoicePayment next = (InvoicePayment) iterator1.next();
                if (next.getIsDelete().equals("Active")) {
                    paidtot += next.getPaymentAmount();

                }

            }
            txtCurBalance.setText(Decimal_Formats.Price(invtotal - paidtot) + "");
            openSession.close();
            loadTableV2();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
