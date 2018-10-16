package OrdersAndQuatations;

import InvoiceAndGRN.*;
import ClassPack.Excel;
import InvoiceAndGRN.withoutBTN.ViewInvoicePaymentODK;
import InvoiceAndGRN.withoutBTN.ViewInvoiceItemODK;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import MainMenu.Logging;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoicePayment;
import ORM.Orders;
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

public class ViewCusOrderUdaya_DONTUSE extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> INV = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static String InvoiceNO;

    public ViewCusOrderUdaya_DONTUSE() {
        initComponents();
        loadSup();
        radioView.setSelected(true);
        comboSupllier.grabFocus();
        tableAlign();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        loadAll();
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
        filterText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TxtStartDate1 = new com.alee.extended.date.WebDateField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEndDate1 = new com.alee.extended.date.WebDateField();
        jButton3 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Invoice");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Select Customer");

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

        TxtStartDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Order from");

        txtEndDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText(" To");

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("LOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Order No", "Service name", "Order Date", "Delivery Date", "Order Qty", "Advance", "Total", "ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(300);
        }

        filterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTextKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Filter Using Any Feild");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TxtStartDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtStartDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDate1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setText("Delevery from");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setText("To");

        txtEndDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDate1MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton3.setText("LOAD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(radioView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSupllier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 342, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(TxtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(txtEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)
                                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtStartDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioView)
                                .addComponent(radioFilter))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        viewAll();        // TODO add your handling code here:
    }//GEN-LAST:event_radioViewActionPerformed

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtEndDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEndDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (radioFilter.isSelected()) {

            if (comboSupllier.getSelectedIndex() == 0) {

                try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(Orders.class);
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.add(Restrictions.between("orderDate", TxtStartDate.getText(), txtEndDate.getText()));

                    List<Orders> list = cr.list();

                    for (Orders orders : list) {

                        Vector v = new Vector();
                        v.add(orders.getCustomer().getName());
                        v.add(orders.getOrderNo());
                        v.add(orders.getServiceNameForPrint());
                        v.add(orders.getOrderDate());
                        v.add(orders.getDeliveryDate());
                        v.add(orders.getOrderQty());
                        v.add(orders.getAdvance());
                        v.add(orders.getOrderTotal());
                        v.add(orders.getIdOrders());
                        dtm.addRow(v);

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(Orders.class);
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.add(Restrictions.between("orderDate", TxtStartDate.getText(), txtEndDate.getText()));

                    List<Orders> list = cr.list();

                    for (Orders orders : list) {
                        if (orders.getCustomer().getIdCustomer() == (sup.get(comboSupllier.getSelectedItem().toString()))) {

                            Vector v = new Vector();
                            v.add(orders.getCustomer().getName());
                            v.add(orders.getOrderNo());
                            v.add(orders.getServiceNameForPrint());
                            v.add(orders.getOrderDate());
                            v.add(orders.getDeliveryDate());
                            v.add(orders.getOrderQty());
                            v.add(orders.getAdvance());
                            v.add(orders.getOrderTotal());
                            v.add(orders.getIdOrders());
                            dtm.addRow(v);

                        }

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioViewMouseClicked

        viewAll();


    }//GEN-LAST:event_radioViewMouseClicked

    private void comboSupllierPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupllierPopupMenuWillBecomeInvisible
//

        if (radioFilter.isSelected()) {

            try {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Orders.class);
                cr.add(Restrictions.eq("isDelete", "Active"));

                List<Orders> list = cr.list();

                for (Orders orders : list) {

                    if (orders.getCustomer().getIdCustomer() == (sup.get(comboSupllier.getSelectedItem().toString()))) {

                        Vector v = new Vector();
                        v.add(orders.getCustomer().getName());
                        v.add(orders.getOrderNo());
                        v.add(orders.getServiceNameForPrint());
                        v.add(orders.getOrderDate());
                        v.add(orders.getDeliveryDate());
                        v.add(orders.getOrderQty());
                        v.add(orders.getAdvance());
                        v.add(orders.getOrderTotal());
                        v.add(orders.getIdOrders());
                        dtm.addRow(v);

                    }
                }
                sess.close();
            } catch (Exception e) {

                e.printStackTrace();

            }
//
        }
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
//                    Criteria createCriteria = openSession.createCriteria(InvoiceHasCustomers.class);
//
//                    createCriteria.createAlias("customers", "s");
//                    createCriteria.add(Restrictions.eq("s.idCustomers", sup.get(comboSupllier.getSelectedItem().toString().split(" - ")[1])));
//                    List<InvoiceHasCustomers> list = createCriteria.list();
//
//                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//                    dtm.setRowCount(0);
//
//                    for (InvoiceHasCustomers inv : list) {
//                        String Price = null;
//
//                        try {
//
//                            Price = Decimal_Formats.Price(inv.getInvoice().getDiscount());
//
//                        } catch (Exception ex) {
//
//                        }
//                        INV.put(inv.getInvoice().getInvoiceNo(), inv.getInvoice().getIdInvoice());
////                        GRNPIC.put(inv.getGrnno(), inv.getPhoto());
//
//                        if (inv.getInvoice().getIsActive().equals("Active")) {
//
//                            dtm.addRow(new Object[]{
//                                inv.getInvoice().getInvoiceNo(),
//                                inv.getInvoice().getInvoiceDate(),
//                                Decimal_Formats.Price(inv.getInvoice().getSubTotal()),
//                                Price,
//                                Decimal_Formats.Price(inv.getInvoice().getNettTotal()),
//                                inv.getCustomers().getCustomerscolName(),
//                                inv.getInvoice().getIdInvoice()
//
//                            });
//                        }
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
        InvoiceNO = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        System.out.println(InvoiceNO);
        new ViewOrderItemODK().setVisible(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "This will delete all data related to this Invoice");

        if (showConfirmDialog == 0) {
            int i = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(i, 8);
            try {

                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Orders.class);
                cr.add(Restrictions.eq("isDelete", "Active"));
                cr.add(Restrictions.eq("idOrders", id));
                Transaction tr = sess.beginTransaction();

                Orders uniqueResult = (Orders) cr.uniqueResult();

                if (uniqueResult != null) {

                    uniqueResult.setIsDelete("Deactive");
                    sess.update(uniqueResult);
                    tr.commit();
                    if (tr.wasCommitted()) {
                        NotificationPopup.Delete();
                        viewAll();
                    }

                }
                sess.close();
            } catch (Exception e) {

                e.printStackTrace();

            }

//            try {
//
//                Integer get = INV.get(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(Invoice.class);
//                createCriteria.add(Restrictions.eq("idInvoice", get));
//                Invoice uniqueResult = (Invoice) createCriteria.uniqueResult();
//
//                uniqueResult.setIsActive("DeActive");
//                openSession.update(uniqueResult);
//
//                Iterator iterator = uniqueResult.getInvoiceItems().iterator();
//                while (iterator.hasNext()) {
//
//                    InvoiceItem next = (InvoiceItem) iterator.next();
//                    Integer idItem = next.getItem().getIdItem();
//                    Criteria cc = openSession.createCriteria(Stock.class);
//                    cc.createAlias("item", "i");
//                    cc.add(Restrictions.eq("i.idItem", idItem));
//                    Stock st = (Stock) cc.uniqueResult();
//                    st.setQty(st.getQty() + next.getQty());
//                    openSession.update(st);
//
//                    Iterator it = next.getItemSerealHasInvoiceItems().iterator();
//                    while (it.hasNext()) {
//                        ItemSerealHasInvoiceItem next1 = (ItemSerealHasInvoiceItem) it.next();
//                        Integer idItemSereal = next1.getItemSereal().getIdItemSereal();
//
//                        Criteria ccc = openSession.createCriteria(ItemSereal.class);
//                        ccc.add(Restrictions.eq("idItemSereal", idItemSereal));
//                        ItemSereal s = (ItemSereal) ccc.uniqueResult();
//                        s.setStatus("Unsold");
//
//                        openSession.update(s);
//
//                    }
//
//                }
//
//                openSession.beginTransaction().commit();
//                openSession.close();
//                NotificationPopup.Delete();
//                loadAll();
//            } catch (Exception e) {
//
//                e.printStackTrace();
//
//            }
//
//        }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filterText.getText()));


    }//GEN-LAST:event_filterTextKeyReleased

    private void comboSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupllierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupllierActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(jTable1, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewCusOrderUdaya_DONTUSE.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtStartDate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDate1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtStartDate1MouseClicked

    private void txtEndDate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEndDate1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDate1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (radioFilter.isSelected()) {

            if (comboSupllier.getSelectedIndex() == 0) {

                try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = sess.createCriteria(Orders.class);
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.add(Restrictions.between("deliveryDate", TxtStartDate1.getText(), txtEndDate1.getText()));

                    List<Orders> list = cr.list();

                    for (Orders orders : list) {

                        Vector v = new Vector();
                        v.add(orders.getCustomer().getName());
                        v.add(orders.getOrderNo());
                        v.add(orders.getServiceNameForPrint());
                        v.add(orders.getOrderDate());
                        v.add(orders.getDeliveryDate());
                        v.add(orders.getOrderQty());
                        v.add(orders.getAdvance());
                        v.add(orders.getOrderTotal());
                        v.add(orders.getIdOrders());
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
                    Criteria cr = sess.createCriteria(Orders.class);
                    cr.add(Restrictions.eq("isDelete", "Active"));
                    cr.add(Restrictions.between("deliveryDate", TxtStartDate1.getText(), txtEndDate1.getText()));

                    List<Orders> list = cr.list();

                    for (Orders orders : list) {
                        if (orders.getCustomer().getIdCustomer() == (sup.get(comboSupllier.getSelectedItem().toString()))) {

                            Vector v = new Vector();
                            v.add(orders.getCustomer().getName());
                            v.add(orders.getOrderNo());
                            v.add(orders.getServiceNameForPrint());
                            v.add(orders.getOrderDate());
                            v.add(orders.getDeliveryDate());
                            v.add(orders.getOrderQty());
                            v.add(orders.getAdvance());
                            v.add(orders.getOrderTotal());
                            v.add(orders.getIdOrders());
                            dtm.addRow(v);

                        }

                    }

                    sess.close();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCusOrderUdaya_DONTUSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    public static com.alee.extended.date.WebDateField TxtStartDate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JTextField filterText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioFilter;
    private javax.swing.JRadioButton radioView;
    public static com.alee.extended.date.WebDateField txtEndDate;
    public static com.alee.extended.date.WebDateField txtEndDate1;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Customer.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<Customer> list = cr.list();

            for (Customer customer : list) {

                comboSupllier.addItem(customer.getName());
                sup.put(customer.getName(), customer.getIdCustomer());

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Customers.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Customers> list = createCriteria.list();
//            for (Customers cus : list) {
//
//                comboSupllier.addItem(cus.getCustomerscolName() + " - " + cus.getCustomersNic());
//                sup.put(cus.getCustomersNic(), cus.getIdCustomers());
//
//            }
//            openSession.close();
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
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    private void loadAll() {
//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Invoice.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Invoice> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//
//            for (Invoice inv : list) {
//                String Price = null;
//
//                try {
//
//                    Price = Decimal_Formats.Price(inv.getDiscount());
//
//                } catch (Exception ex) {
//
//                }
//                INV.put(inv.getInvoiceNo(), inv.getIdInvoice());
////                        GRNPIC.put(inv.getGrnno(), inv.getPhoto());
//                String customerscolName = null;
//                Iterator iterator = inv.getInvoiceHasCustomerses().iterator();
//                while (iterator.hasNext()) {
//                    InvoiceHasCustomers next = (InvoiceHasCustomers) iterator.next();
//                    customerscolName = next.getCustomers().getCustomerscolName();
//                }
//                dtm.addRow(new Object[]{
//                    inv.getInvoiceNo(),
//                    inv.getInvoiceDate(),
//                    Decimal_Formats.Price(inv.getSubTotal()),
//                    Price,
//                    Decimal_Formats.Price(inv.getNettTotal()),
//                    customerscolName,
//                    inv.getIdInvoice()
//
//                });
//
//            }
//
//            openSession.close();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
    }

    public void viewAll() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Orders.class);
            cr.add(Restrictions.eq("isDelete", "Active"));

            List<Orders> list = cr.list();

            for (Orders orders : list) {

                Vector v = new Vector();
                v.add(orders.getCustomer().getName());
                v.add(orders.getOrderNo());
                v.add(orders.getServiceNameForPrint());
                v.add(orders.getOrderDate());
                v.add(orders.getDeliveryDate());
                v.add(orders.getOrderQty());
                v.add(orders.getAdvance());
                v.add(orders.getOrderTotal());
                v.add(orders.getIdOrders());
                dtm.addRow(v);

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
