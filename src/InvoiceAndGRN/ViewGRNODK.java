package InvoiceAndGRN;

import ClassPack.Decimal_Formats;
import ClassPack.Excel;
import ClassPack.NotificationPopup;
import InvoiceAndGRN.withoutBTN.ViewGRNItemsODK;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;
import ORM.CashBook;

import ORM.RawGrn;
import ORM.RawItemStock;
import ORM.RowGrnItem;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
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

public class ViewGRNODK extends javax.swing.JFrame {
    
    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> GRN = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static int grnpicBillno;
    static boolean maximized = true;
    
    public ViewGRNODK() {
        initComponents();
        loadSup();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        radioView.setSelected(true);
        comboSupllier.grabFocus();
        tableAlign();
        loadAll();
//        SetMaximized();
        jTable1.setRowHeight(30);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSupllier = new javax.swing.JComboBox<>();
        radioFilter = new javax.swing.JRadioButton();
        radioView = new javax.swing.JRadioButton();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        jLabel2 = new javax.swing.JLabel();
        txtEndDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("View Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete GRN");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View GRN ");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Select Supplyer");

        comboSupllier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboSupllier.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupllierPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupllierActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioFilter);
        radioFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        radioFilter.setText("Filter");

        buttonGroup1.add(radioView);
        radioView.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
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

        TxtStartDate.setDateFormat(new SimpleDateFormat
            ("yyyy/MM/dd"));
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Date Start");

        txtEndDate.setDateFormat(new SimpleDateFormat
            ("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Date End");

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
                "Bill No", "GRN Date", "GRN Total", "Supplier", "idGrn"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Filter Using Any Feild");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioView)
                            .addComponent(radioFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(244, 244, 244))
                                    .addComponent(comboSupllier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(radioView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioFilter))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        
        try {
            
            if (radioFilter.isSelected()) {
                
                if (comboSupllier.getSelectedIndex() == 0 && !TxtStartDate.getText().isEmpty() && !txtEndDate.getText().isEmpty()) {
                    
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(RawGrn.class);
                    cr.add(Restrictions.between("rawGrnDate", TxtStartDate.getText(), txtEndDate.getText()));
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    
                    List<RawGrn> list = cr.list();
                    
                    for (RawGrn rawGrn : list) {
                        //System.out.println(rawGrn.getRawGrnDate());
                        Vector v = new Vector();
                        v.add(rawGrn.getRawGrnNo());
                        v.add(rawGrn.getRawGrnDate());
                        v.add(Decimal_Formats.Price(rawGrn.getNetTotal()));
                        v.add(rawGrn.getSupplier().getSupplierName());
                        v.add(rawGrn.getIdRawGrn());
                        dtm.addRow(v);
                    }
                    
                } else if (!TxtStartDate.getText().isEmpty() && !txtEndDate.getText().isEmpty() && comboSupllier.getSelectedIndex() != 0) {
                    
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(RawGrn.class);
                    cr.add(Restrictions.between("rawGrnDate", TxtStartDate.getText(), txtEndDate.getText()));
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.createAlias("supplier", "s");
                    cr.add(Restrictions.eq("s.idSupplier", sup.get(comboSupllier.getSelectedItem().toString())));

                    
                    
                    List<RawGrn> list = cr.list();
                    
                    for (RawGrn rawGrn : list) {
                        //System.out.println(rawGrn.getRawGrnDate());
                        Vector v = new Vector();
                        v.add(rawGrn.getRawGrnNo());
                        v.add(rawGrn.getRawGrnDate());
                        v.add(Decimal_Formats.Price(rawGrn.getNetTotal()));
                        v.add(rawGrn.getSupplier().getSupplierName());
                        v.add(rawGrn.getIdRawGrn());
                        dtm.addRow(v);
                        
                    }
                }
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioViewMouseClicked
        
        loadAll();
        

    }//GEN-LAST:event_radioViewMouseClicked

    private void comboSupllierPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupllierPopupMenuWillBecomeInvisible

//        if (comboSupllier.getSelectedIndex() == 0) {
//
//            if (radioView.isSelected()) {
//
//                loadAll();
//
//            }
//
//        } else {
//
//            if (radioView.isSelected()) {
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria createCriteria = openSession.createCriteria(Grn.class);
//                    createCriteria.add(Restrictions.eq("isActive", "Active"));
//                    createCriteria.createAlias("supplier", "s");
//                    createCriteria.add(Restrictions.eq("s.idSupplier", sup.get(comboSupllier.getSelectedItem().toString().split(" - ")[0])));
//                    List<Grn> list = createCriteria.list();
//
//                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//                    dtm.setRowCount(0);
//
//                    for (Grn grn : list) {
//
//                        GRN.put(grn.getGrnno(), grn.getIdGrn());
//                        GRNPIC.put(grn.getGrnno(), grn.getPhoto());
//                        dtm.addRow(new Object[]{
//                            grn.getGrnno(),
//                            grn.getGrndate(),
//                            Decimal_Formats.Price(grn.getNettTotal()),
//                            grn.getSupplier().getSupplierName()
//
//                        });
//
//                    }
//
//                    openSession.close();
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//            }
//
//        }

    }//GEN-LAST:event_comboSupllierPopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        grnpicBillno = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        new ViewGRNItemsODK().setVisible(true);
        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        
        int button = evt.getButton();
        
        if (button == 3) {
            
            jPopupMenu1.show();
            
        }
        

    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        int r = jTable1.getSelectedRow();
        try {
            
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure to delete this grn. All items in this grn will reverse");
            
            if (showConfirmDialog == 0) {
                
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria cr = openSession.createCriteria(RawGrn.class);
                Transaction beginTransaction = openSession.beginTransaction();
                cr.add(Restrictions.eq("idRawGrn", jTable1.getValueAt(r, 4)));
                RawGrn uniqueResult = (RawGrn) cr.uniqueResult();
                uniqueResult.setIsDelete("Deactive");
                
                openSession.update(uniqueResult);
                
                Iterator<RowGrnItem> iterator = uniqueResult.getRowGrnItems().iterator();
                while (iterator.hasNext()) {
                    
                    RowGrnItem next = iterator.next();
                    
                    Criteria createCriteria = openSession.createCriteria(RawItemStock.class);
                    createCriteria.createAlias("items", "i");
                    createCriteria.add(Restrictions.eq("i.idRawItems", next.getItems().getIdRawItems()));
                    RawItemStock ur = (RawItemStock) createCriteria.uniqueResult();
                    ur.setQty(ur.getQty() - next.getRowItemQty());
                    openSession.update(ur);
                    
                }
                
                Iterator<RowItemGrnPayment> itt = uniqueResult.getRowItemGrnPayments().iterator();
                double sum = 0.00;
                while (itt.hasNext()) {
                    
                    RowItemGrnPayment next = itt.next();
                    next.setIsDelete("Deactive");
                    sum += next.getRowItemGrnPayAmount();
                    openSession.update(next);
                }
                
                CashBook cashBook = new CashBook();
                cashBook.setDate(dateForm.currentdate());
                cashBook.setCreatedBy(Logging.user);
                cashBook.setExpence(0.00);
                cashBook.setIncome(sum);
                cashBook.setDescription("GRN Cancel");
                
                openSession.save(cashBook);
                
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.Delete();
                loadAll();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void comboSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupllierActionPerformed
        

    }//GEN-LAST:event_comboSupllierActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            
            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');
            
            Excel.toExcel(jTable1, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewGRNODK.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGRNODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton radioFilter;
    private javax.swing.JRadioButton radioView;
    public static com.alee.extended.date.WebDateField txtEndDate;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

//
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Supplier> list = createCriteria.list();
            for (Supplier supplier : list) {
                
                comboSupllier.addItem(supplier.getSupplierName());
                sup.put(supplier.getSupplierName(), supplier.getIdSupplier());
                
            }
            openSession.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    private void tableAlign() {
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
//        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        
    }
    
    private void loadAll() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(RawGrn.class);
        cr.add(Restrictions.eq("isDelete", "Active"));
        
        List<RawGrn> list = cr.list();
        System.out.println(list.size());
        for (RawGrn rawGrn : list) {
            System.out.println(rawGrn.getRawGrnDate());
            Vector v = new Vector();
            v.add(rawGrn.getRawGrnNo());
            v.add(rawGrn.getRawGrnDate());
            v.add(Decimal_Formats.Price(rawGrn.getNetTotal()));
            v.add(rawGrn.getSupplier().getSupplierName());
            v.add(rawGrn.getIdRawGrn());
            dtm.addRow(v);
        }
        
    }
    
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
    
}
