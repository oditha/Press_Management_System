package OrdersAndQuatations;

import InvoiceAndGRN.*;
import ClassPack.Excel;
import InvoiceAndGRN.withoutBTN.ViewInvoicePaymentODK;
import InvoiceAndGRN.withoutBTN.ViewInvoiceItemODK;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;
import ORM.CashBook;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoicePayment;
import ORM.OrderStatus;
import ORM.Orders;
import static OrdersAndQuatations.ViewCusOrderUdaya_DONTUSE.TxtStartDate1;
import static OrdersAndQuatations.ViewCusOrderUdaya_DONTUSE.txtEndDate1;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

public class ViewCusOrderUdayaNew extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> INV = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static String InvoiceNO;

    public ViewCusOrderUdayaNew() {
        initComponents();
        loadSup();
        radioView.setSelected(true);
        comboCustomer.grabFocus();
        tableAlign();
        jTable1.setComponentPopupMenu(jPopupMenu1);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboCustomer = new javax.swing.JComboBox<>();
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
        radioOrder = new javax.swing.JRadioButton();
        radioDelivery = new javax.swing.JRadioButton();

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
        setTitle("View Orders");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Select Customer");

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
        jLabel2.setText("From");

        txtEndDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText(" To");

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
                "Customer Name", "Order No", "Service name", "Order Date", "Delivery Date", "Order Qty", "Advance", "Total", "ID", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(300);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(8).setMinWidth(0);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
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

        buttonGroup2.add(radioOrder);
        radioOrder.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioOrder.setText("Order Date");
        radioOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioOrderMouseClicked(evt);
            }
        });
        radioOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrderActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioDelivery);
        radioDelivery.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        radioDelivery.setText("Delivery Date");
        radioDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(radioView, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(radioOrder))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(radioDelivery)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(637, 637, 637))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(radioOrder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioDelivery))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(radioView)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioFilter)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

            if (radioOrder.isSelected()) {
                if (comboCustomer.getSelectedIndex() == 0) {

                    try {

                        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                        dtm.setRowCount(0);
                        Session sess = PoolManager.getSessionFactory().openSession();
                        Criteria cr = sess.createCriteria(Orders.class);
                        cr.add(Restrictions.eq("isDelete", "Active"));
                        cr.add(Restrictions.between("orderDate", TxtStartDate.getText(), txtEndDate.getText()));

                        List<Orders> list = cr.list();

                        String Status = "";
                        for (Orders orders : list) {

                            Set orderStatuses = orders.getOrderStatuses();
                            Iterator<OrderStatus> iterator = orderStatuses.iterator();
                            while (iterator.hasNext()) {
                                OrderStatus next = iterator.next();
                                Status = next.getStatus();
                            }
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
                            v.add(Status);

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

                        String Status = "";
                        for (Orders orders : list) {
                            if (orders.getCustomer().getIdCustomer() == (sup.get(comboCustomer.getSelectedItem().toString()))) {

                                Set orderStatuses = orders.getOrderStatuses();
                                Iterator<OrderStatus> iterator = orderStatuses.iterator();
                                while (iterator.hasNext()) {
                                    OrderStatus next = iterator.next();
                                    Status = next.getStatus();
                                }

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
                                v.add(Status);
                                dtm.addRow(v);

                            }

                        }

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }
            } else if (radioDelivery.isSelected()) {

                if (comboCustomer.getSelectedIndex() == 0) {

                    try {

                        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                        dtm.setRowCount(0);
                        Session sess = PoolManager.getSessionFactory().openSession();
                        Criteria cr = sess.createCriteria(Orders.class);
                        cr.add(Restrictions.eq("isDelete", "Active"));
                        cr.add(Restrictions.between("deliveryDate", TxtStartDate.getText(), txtEndDate.getText()));

                        List<Orders> list = cr.list();
                        String Status = "";

                        for (Orders orders : list) {

                            Set orderStatuses = orders.getOrderStatuses();
                            Iterator<OrderStatus> iterator = orderStatuses.iterator();
                            while (iterator.hasNext()) {
                                OrderStatus next = iterator.next();
                                Status = next.getStatus();
                            }
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
                            v.add(Status);
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
                        cr.add(Restrictions.between("deliveryDate", TxtStartDate.getText(), txtEndDate.getText()));

                        List<Orders> list = cr.list();

                        String Status = "";
                        for (Orders orders : list) {
                            if (orders.getCustomer().getIdCustomer() == (sup.get(comboCustomer.getSelectedItem().toString()))) {

                                Set orderStatuses = orders.getOrderStatuses();
                                Iterator<OrderStatus> iterator = orderStatuses.iterator();
                                while (iterator.hasNext()) {
                                    OrderStatus next = iterator.next();
                                    Status = next.getStatus();
                                }

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
                                v.add(Status);
                                dtm.addRow(v);

                            }

                        }

                        sess.close();

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                }

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioViewMouseClicked

        viewAll();


    }//GEN-LAST:event_radioViewMouseClicked

    private void comboCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuWillBecomeInvisible
//

        if (radioFilter.isSelected()) {

            try {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Orders.class);
                cr.add(Restrictions.eq("isDelete", "Active"));

                List<Orders> list = cr.list();
                String Status = "";

                for (Orders orders : list) {

                    Set orderStatuses = orders.getOrderStatuses();
                    Iterator<OrderStatus> iterator = orderStatuses.iterator();
                    while (iterator.hasNext()) {
                        OrderStatus next = iterator.next();
                        Status = next.getStatus();
                    }

                    if (orders.getCustomer().getIdCustomer() == (sup.get(comboCustomer.getSelectedItem().toString()))) {

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
                        v.add(Status);
                        dtm.addRow(v);

                    }
                }
                sess.close();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_comboCustomerPopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        InvoiceNO = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        System.out.println(InvoiceNO);
        new ViewOrderItemODK().setVisible(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "This will delete all data related to this Order");

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
                    
                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(Logging.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Order Cancel Advance Refund");
                    cashBook.setExpence(uniqueResult.getAdvance());
                    cashBook.setIncome(0.00);
                    
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

            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filterText.getText()));


    }//GEN-LAST:event_filterTextKeyReleased

    private void comboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCustomerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(jTable1, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewCusOrderUdayaNew.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void radioOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioOrderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrderMouseClicked

    private void radioOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrderActionPerformed

    private void radioDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDeliveryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDeliveryActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCusOrderUdayaNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JTextField filterText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioDelivery;
    private javax.swing.JRadioButton radioFilter;
    private javax.swing.JRadioButton radioOrder;
    private javax.swing.JRadioButton radioView;
    public static com.alee.extended.date.WebDateField txtEndDate;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

        try {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Customer.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            List<Customer> list = cr.list();

            for (Customer customer : list) {

                comboCustomer.addItem(customer.getName());
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
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);

    }

    public void viewAll() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Orders.class);
            cr.add(Restrictions.eq("isDelete", "Active"));

            List<Orders> list = cr.list();

            String Status = "";

            for (Orders orders : list) {

                Set orderStatuses = orders.getOrderStatuses();
                Iterator<OrderStatus> iterator = orderStatuses.iterator();
                while (iterator.hasNext()) {
                    OrderStatus next = iterator.next();
                    Status = next.getStatus();
                }

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
                v.add(Status);
                dtm.addRow(v);

            }
            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
