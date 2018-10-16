package InvoiceAndGRN.withoutBTN;


import ClassPack.Excel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import InvoiceAndGRN.ViewInvoiceODK_DONTUSE;
import ORM.Invoice;
import ORM.InvoicePayment;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewInvoicePaymentODK extends javax.swing.JFrame {

    public ViewInvoicePaymentODK() {
        initComponents();
        loadInvoicePay();
        tableDecor();
//        SetMaximized();
        tableCusInvoice.setRowHeight(30);
           tableCusInvoice.setComponentPopupMenu(jPopupMenu1);
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

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        webdateFrom = new com.alee.extended.date.WebDateField();
        webdateTo = new com.alee.extended.date.WebDateField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCusInvoice = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Payment");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("From");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
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
        jLabel2.setText("Search by");

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

        tableCusInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Date", "Payment Type", "Amount", "idinvoice"
            }
        ));
        tableCusInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCusInvoiceMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableCusInvoice);
        if (tableCusInvoice.getColumnModel().getColumnCount() > 0) {
            tableCusInvoice.getColumnModel().getColumn(4).setMinWidth(0);
            tableCusInvoice.getColumnModel().getColumn(4).setPreferredWidth(0);
            tableCusInvoice.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void webdateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateToMouseClicked

    }//GEN-LAST:event_webdateToMouseClicked

    private void webdateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateFromMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webdateFromMouseClicked

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
  
          DefaultTableModel dtm= (DefaultTableModel)tableCusInvoice.getModel();
           dtm.setRowCount(0);
           try {
               
               
           Session sess = PoolManager.getSessionFactory().openSession();
           Criteria cr = sess.createCriteria(Invoice.class);
           cr.add(Restrictions.eq("idInvoice", Integer.parseInt(ViewInvoiceODK_DONTUSE.InvoiceNO)));
           cr.add(Restrictions.between("paymentDate", webdateFrom.getText(), webdateTo.getText()));
           
           List<Invoice> list = cr.list();
           
           
               for (Invoice invoice : list) {
                   
               Vector v = new Vector();
               v.add(invoice.getInvoiceNo());
               Iterator it = invoice.getInvoicePayments().iterator();
               
                   while (it.hasNext()) {
                       InvoicePayment next = (InvoicePayment) it.next();
                       
                       v.add(next.getPaymentDate());
                       v.add(next.getPaymentType());
                       v.add(next.getPaymentAmount());
                       dtm.addRow(v);
                       
                       
                       
                   }
               
               }
           
           
           
           
         
           
           
           
           
           
           
           
        } catch (Exception e) {
        e.printStackTrace();
        
        
        
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tableCusInvoice.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        tableCusInvoice.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
//            tableCusInvoice.print();
//        } catch (PrinterException ex) {
//            Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableCusInvoiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCusInvoiceMouseReleased
      if (evt.getButton()==3) {
            
            jPopupMenu1.show();
            
        }
    }//GEN-LAST:event_tableCusInvoiceMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        int i=JOptionPane.showConfirmDialog(rootPane, "Are Sure Want To Delete?");
        if (i==0) {
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(InvoicePayment.class);
            Transaction tr = sess.beginTransaction();
            cr.add(Restrictions.eq("isDelete", "Active"));
            cr.add(Restrictions.eq("idInvoicePayment", tableCusInvoice.getValueAt(tableCusInvoice.getSelectedRow(), 4)));



            InvoicePayment uniqueResult = (InvoicePayment) cr.uniqueResult();
            if (uniqueResult!=null) {
                
                uniqueResult.setIsDelete("Deactive");
                tr.commit();
                
                NotificationPopup.Delete();
                
                        
                
                
                
                
            }
            
            
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableCusInvoice, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewInvoicePaymentODK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoicePaymentODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTable tableCusInvoice;
    private com.alee.extended.date.WebDateField webdateFrom;
    private com.alee.extended.date.WebDateField webdateTo;
    // End of variables declaration//GEN-END:variables

    private void loadInvoicePay() {
//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Transaction beginTransaction = openSession.beginTransaction();
//            Criteria createCriteria = openSession.createCriteria(InvoicePayment.class);
//            createCriteria.createAlias("customers", "c");
//            createCriteria.add(Restrictions.eq("c.idCustomers", s0));
//            createCriteria.add(Restrictions.eq("isDelete", "Active"));
//            List<InvoicePayment> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableCusInvoice.getModel();
//            dtm.setRowCount(0);
//            for (InvoicePayment ip : list) {
//                dtm.addRow(new Object[]{ip.getPaymentDate(), ip.getPaymentType(), ip.getPaymentAmount()});
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tableCusInvoice.getColumnModel().getColumn(3).setCellRenderer(dtcr);

    }

}
