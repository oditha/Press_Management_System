package InvoiceAndGRN;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;

import ORM.CashBook;
import ORM.Invoice;
import ORM.InvoiceCancel;
import ORM.InvoiceItems;
import ORM.InvoicePayment;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class InvoiceCancelF extends javax.swing.JFrame {

    HashMap<String, Integer> invid = new HashMap();
    HashMap<String, Integer> ItmId = new HashMap();
    HashMap<String, Integer> Itm = new HashMap();

    public int getInvoID;
    public int getItemID;
    public int getInvoItemID;
    public int getCusID;
    public double UnitPrice;

    public InvoiceCancelF() {
        initComponents();
        TxtStartDate.setText(dateForm.currentdate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Invoice");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Invoice No");

        txtInvoiceNo.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtInvoiceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInvoiceNoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Reson");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Date");

        TxtStartDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd")
        );
        TxtStartDate.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        btnSave.setText("Cancel");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(129, 129, 129)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure to cancel this invoice? You must keep invoice after cancel");

            if (showConfirmDialog == 0) {

                double invoicepayment = 0.00;

                Session opeSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = opeSession.beginTransaction();

                Invoice invoice = new Invoice();
                invoice.setIdInvoice(getInvoID);
                InvoiceCancel invoiceCancel = new InvoiceCancel();

                invoiceCancel.setCancelDate(TxtStartDate.getText());
                invoiceCancel.setCancelTime(dateForm.TimeNow());
                invoiceCancel.setCreatedBy(Logging.user);
                invoiceCancel.setInvoice(invoice);
                invoiceCancel.setIsDelete("Active");
                invoiceCancel.setReson(jTextArea1.getText());

                opeSession.save(invoiceCancel);

                Criteria createCriteria = opeSession.createCriteria(Invoice.class);
                createCriteria.add(Restrictions.eq("invoiceNo", "INV-" + txtInvoiceNo.getText()));
                createCriteria.add(Restrictions.eq("isDelete", "Active"));

                Invoice uniqueResult = (Invoice) createCriteria.uniqueResult();
                if (uniqueResult != null) {

                    uniqueResult.setIsDelete("Deactive");

                    opeSession.update(uniqueResult);

                    Iterator<InvoiceItems> iterator = uniqueResult.getInvoiceItemses().iterator();
                    while (iterator.hasNext()) {

                        InvoiceItems next = iterator.next();

                        Iterator<RawItemStock> itt = next.getItems().getRawItemStocks().iterator();
                        while (itt.hasNext()) {

                            RawItemStock next1 = itt.next();

                            next1.setQty(next1.getQty() + next.getQty());

                            opeSession.update(next1);

                        }

                    }

                    Iterator<InvoicePayment> iii = uniqueResult.getInvoicePayments().iterator();
                    while (iii.hasNext()) {

                        InvoicePayment next = iii.next();
                        invoicepayment += next.getPaymentAmount();
                        next.setIsDelete("Deactive");

                        opeSession.save(next);
                    }

                    CashBook cashBook = new CashBook();
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setCreatedBy(Logging.user);
                    cashBook.setDescription("Cancel Invoice - " + "INV-" + txtInvoiceNo.getText());
                    cashBook.setExpence(invoicepayment);
                    cashBook.setIncome(0.00);

                    opeSession.save(cashBook);

                }

                beginTransaction.commit();
                opeSession.close();
                NotificationPopup.save();
                txtInvoiceNo.setText(null);
                jTextArea1.setText(null);
                txtInvoiceNo.grabFocus();

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtInvoiceNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvoiceNoKeyReleased

        try {

            String text = txtInvoiceNo.getText();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);

            //createCriteria.add(Restrictions.eq("invoiceNo", text));
            Criterion id = Restrictions.eq("invoiceNo", text);
            Criterion active1 = Restrictions.like("isDelete", "Active");

            LogicalExpression andExp1 = Restrictions.and(id, active1);
            createCriteria.add(andExp1);

            Invoice inv = (Invoice) createCriteria.uniqueResult();

            getInvoID = inv.getIdInvoice();
            System.out.println(getInvoID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtInvoiceNoKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceCancelF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtInvoiceNo;
    // End of variables declaration//GEN-END:variables
}
