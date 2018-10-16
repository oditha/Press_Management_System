package OrdersAndQuatations;

import ClassPack.DB;
import ClassPack.Decimal_Formats;
import ClassPack.ItemDataHolderOrder;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;
import ORM.CashBook;
import ORM.Customer;
import ORM.Items;
import ORM.OrderItems;
import ORM.OrderStatus;
import ORM.Orders;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreateOrder extends javax.swing.JFrame {

    public static Map<String, Integer> cust = new HashMap();
    public static Map<String, ItemDataHolderOrder> itmNames = new HashMap();

    public CreateOrder() {
        initComponents();
        genOrderNO();
        ComboService.grabFocus();
        SearchbleService();
        TxtOrderDate.setText(dateForm.currentdate());
        SearchbleCustomers();
        SearchbleItem();
        jTable1.setRowHeight(25);
        jTable1.setComponentPopupMenu(jPopupMenu1);
        chkPrint.setSelected(true);
        chkPreview.setSelected(false);
        chkDialog.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        ComboService = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtOrderNo = new javax.swing.JTextField();
        TxtOrderDate = new com.alee.extended.date.WebDateField();
        TxtRecoorectDate = new com.alee.extended.date.WebDateField();
        TxtDeliveryDate = new com.alee.extended.date.WebDateField();
        txtGovNo = new javax.swing.JTextField();
        txtOrderQty = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ComboItems = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtOrderTotal = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtAdvance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        ComboCustomer = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        chkPrint = new javax.swing.JCheckBoxMenuItem();
        chkPreview = new javax.swing.JCheckBoxMenuItem();
        chkDialog = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("Remove Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Remove All");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Order");

        ComboService.setEditable(true);
        ComboService.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Service");

        txtOrderNo.setEditable(false);
        txtOrderNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TxtOrderDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtOrderDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtOrderDateMouseClicked(evt);
            }
        });
        TxtOrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOrderDateActionPerformed(evt);
            }
        });

        TxtRecoorectDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtRecoorectDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtRecoorectDateMouseClicked(evt);
            }
        });
        TxtRecoorectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRecoorectDateActionPerformed(evt);
            }
        });

        TxtDeliveryDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtDeliveryDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtDeliveryDateMouseClicked(evt);
            }
        });
        TxtDeliveryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDeliveryDateActionPerformed(evt);
            }
        });

        txtGovNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtOrderQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOrderQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOrderQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrderQtyKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrderQtyKeyReleased(evt);
            }
        });

        ComboItems.setEditable(true);
        ComboItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Item");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        txtQTY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idItem", "Item Name", "Unit Price", "QTY", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(600);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(600);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(600);
        }

        txtOrderTotal.setEditable(false);
        txtOrderTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOrderTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAdvance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdvance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAdvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdvanceKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Order No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Order Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Recorrection Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Delivery Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("GOV Order No");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Order QTY");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("QTY");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Price");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Order Total");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Unit Price");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Advance");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        ComboCustomer.setEditable(true);
        ComboCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Select Customer");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Type QTY and Press Enter");

        jMenu1.setText("Print Settings");

        chkPrint.setSelected(true);
        chkPrint.setText("Print Receipt");
        jMenu1.add(chkPrint);

        chkPreview.setSelected(true);
        chkPreview.setText("Preview Receipt");
        chkPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPreviewActionPerformed(evt);
            }
        });
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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(210, 210, 210))
                                            .addComponent(ComboService, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ComboCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtRecoorectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGovNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtDeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtOrderTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAdvance, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboItems, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPrice)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtQTY)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1070, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtRecoorectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboService, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(4, 4, 4)
                            .addComponent(txtGovNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addComponent(txtOrderQty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboItems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtOrderDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtOrderDateMouseClicked

    }//GEN-LAST:event_TxtOrderDateMouseClicked

    private void TxtOrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOrderDateActionPerformed

    private void TxtRecoorectDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtRecoorectDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRecoorectDateMouseClicked

    private void TxtRecoorectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRecoorectDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRecoorectDateActionPerformed

    private void TxtDeliveryDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDeliveryDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDeliveryDateMouseClicked

    private void TxtDeliveryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDeliveryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDeliveryDateActionPerformed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                ItemDataHolderOrder get = itmNames.get(ComboItems.getSelectedItem().toString());
                String name = get.getItemname();
                int Id = get.getIdItem();
                double unitprice = Double.parseDouble(txtPrice.getText());
                double qty = Double.parseDouble(txtQTY.getText());
                double total = unitprice * qty;

                dtm.addRow(new Object[]{
                    Id,
                    name,
                    unitprice,
                    qty,
                    total

                });

                setTotal();

                txtQTY.setText(null);
                txtPrice.setText(null);
                ComboItems.setSelectedIndex(-1);
                ComboItems.grabFocus();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtOrderQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderQtyKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }


    }//GEN-LAST:event_txtOrderQtyKeyTyped

    private void txtAdvanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdvanceKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtAdvanceKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());
        setTotal();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        setTotal();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }


    }//GEN-LAST:event_jTable1MouseReleased

    private void txtOrderQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderQtyKeyReleased

        if (!(txtOrderTotal.getText().isEmpty() && txtOrderQty.getText().isEmpty())) {

            try {
                double parseDouble = Double.parseDouble(txtOrderQty.getText());
                double total = Double.parseDouble(txtOrderTotal.getText());
                txtUnitPrice.setText(Decimal_Formats.Price(total / parseDouble));

            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_txtOrderQtyKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!(txtOrderTotal.getText().isEmpty() && txtUnitPrice.getText().isEmpty() && txtAdvance.getText().isEmpty())) {

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Customer customer = new Customer();
                customer.setIdCustomer(cust.get(ComboCustomer.getSelectedItem().toString().split(" - ")[1]));

                Orders orders = new Orders();

                orders.setOrderNo(txtOrderNo.getText());
                orders.setOrderDate(TxtOrderDate.getText());
                orders.setRecorrectionDate(TxtRecoorectDate.getText());
                orders.setDeliveryDate(TxtDeliveryDate.getText());
                orders.setOrderTotal(Double.parseDouble(txtOrderTotal.getText()));
                orders.setIsDelete("Active");
                orders.setAdvance(Double.parseDouble(txtAdvance.getText()));
                orders.setCustomer(customer);
                orders.setGovorderNo(txtGovNo.getText());
                orders.setAcceptedBy(Logging.user);
                orders.setServiceNameForPrint(ComboService.getSelectedItem().toString());
                orders.setOrderQty(Double.parseDouble(txtOrderQty.getText()));
                orders.setUnitPriceForOrder(Double.parseDouble(txtUnitPrice.getText()));

                openSession.save(orders);

                OrderStatus orderStatus = new OrderStatus();

                orderStatus.setIsDelete("Active");
                orderStatus.setOrders(orders);
                orderStatus.setStatus("Pending");

                openSession.save(orderStatus);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Items items = new Items();
                    items.setIdRawItems(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));

                    OrderItems orderItems = new OrderItems();
                    orderItems.setQty(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
                    orderItems.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    orderItems.setNetTotalOrdersItem(Double.parseDouble(jTable1.getValueAt(i, 4).toString()));
                    orderItems.setIsDelete("Active");
                    orderItems.setOrders(orders);
                    orderItems.setItems(items);

                    openSession.save(orderItems);
                }

                CashBook cashBook = new CashBook();
                cashBook.setCreatedBy(Logging.user);
                cashBook.setDate(dateForm.currentdate());
                cashBook.setDescription("Advance payment for order " + txtOrderNo.getText());
                cashBook.setExpence(0.00);
                cashBook.setIncome(Double.parseDouble(txtAdvance.getText()));

                openSession.save(cashBook);

                beginTransaction.commit();

                if (chkPrint.isSelected()) {

                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("IdOrder", orders.getIdOrders());

                    JasperPrint jp = JasperFillManager.fillReport(Logging.OrderRecipt, map, DB.getCon());

                    if (chkPreview.isSelected()) {

                        JasperViewer.viewReport(jp, false);
                    }
                    if (chkDialog.isSelected()) {
                        JasperPrintManager.printReport(jp, true);

                    } else {

                        JasperPrintManager.printReport(jp, false);
                    }

                }
                openSession.close();

                NotificationPopup.save();

                genOrderNO();
                ComboService.setSelectedIndex(-1);
                ComboCustomer.setSelectedIndex(-1);
                ComboItems.setSelectedIndex(-1);
                TxtOrderDate.setText(dateForm.currentdate());
                TxtRecoorectDate.setText(null);
                TxtDeliveryDate.setText(null);
                txtGovNo.setText(null);
                txtOrderQty.setText(null);
                txtPrice.setText(null);
                txtQTY.setText(null);
                txtOrderTotal.setText(null);
                txtUnitPrice.setText(null);
                txtAdvance.setText(null);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                ComboService.grabFocus();

            } catch (Exception e) {

                e.printStackTrace();

            }

        } else {

            JOptionPane.showMessageDialog(null, "Complete the process");

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void chkPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPreviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPreviewActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCustomer;
    private javax.swing.JComboBox ComboItems;
    private javax.swing.JComboBox ComboService;
    private com.alee.extended.date.WebDateField TxtDeliveryDate;
    private com.alee.extended.date.WebDateField TxtOrderDate;
    private com.alee.extended.date.WebDateField TxtRecoorectDate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBoxMenuItem chkDialog;
    private javax.swing.JCheckBoxMenuItem chkPreview;
    private javax.swing.JCheckBoxMenuItem chkPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtGovNo;
    private javax.swing.JTextField txtOrderNo;
    private javax.swing.JTextField txtOrderQty;
    private javax.swing.JTextField txtOrderTotal;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void genOrderNO() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria cc = openSession.createCriteria(Orders.class);
            cc.add(Restrictions.eq("orderDate", dateForm.currentdate()));
            List list = cc.list();
            int size = list.size();
            size++;
            txtOrderNo.setText(dateForm.OrderNo() + "#" + size);

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void SearchbleService(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
            createCriteria.add(Restrictions.like("isService", "YES"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();
            ComboService.removeAllItems();
            for (Items item : list) {

                str1 = item.getItemName() + " - " + item.getItemsCode();
                filterArray.add(str1);

                //itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboService.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboService.setSelectedItem(enteredText);
            ComboService.showPopup();
        } else {
            ComboService.hidePopup();
        }
    }

    private void SearchbleService() {
        final JTextField textfield = (JTextField) ComboService.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {

                            } catch (Exception e) {
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            SearchbleService(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    public void SearchItems(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
//            createCriteria.add(Restrictions.like("isService", "YES"));
//            createCriteria.add(Restrictions.like("isRaw", "YES"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();
            ComboItems.removeAllItems();
            for (Items item : list) {

                str1 = item.getItemName() + " # " + item.getItemsCode();
                filterArray.add(str1);
                ItemDataHolderOrder idh = new ItemDataHolderOrder();
                idh.setIdItem(item.getIdRawItems());
                idh.setItemname(item.getItemName());
                idh.setUnitprice(item.getItemsSellingPrice());
                itmNames.put(str1, idh);
                System.out.println(itmNames);
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboItems.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboItems.setSelectedItem(enteredText);
            ComboItems.showPopup();
        } else {
            ComboItems.hidePopup();
        }
    }

    private void SearchbleItem() {
        final JTextField textfield = (JTextField) ComboItems.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {
                            try {

                                ItemDataHolderOrder get = itmNames.get(ComboItems.getSelectedItem().toString());
                                txtPrice.setText(Decimal_Formats.Price(get.getUnitprice()));
                                txtQTY.grabFocus();

                            } catch (Exception e) {

                                e.printStackTrace();

                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            SearchItems(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    public void FilterCustomers(String enteredText) {
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

                        str1 = customers.getName() + " - " + customers.getContact1();;
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            //System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboCustomer.setSelectedItem(enteredText);
            ComboCustomer.showPopup();
        } else {
            ComboCustomer.hidePopup();
        }

    }

    private void SearchbleCustomers() {
        final JTextField textfield0 = (JTextField) ComboCustomer.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            FilterCustomers(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

    private void setTotal() {

        try {

            double tot = 0.00;

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                double parseDouble = Double.parseDouble(jTable1.getValueAt(i, 4).toString());

                tot += parseDouble;

            }

            txtOrderTotal.setText(Decimal_Formats.Price(tot));

            if (!txtOrderQty.getText().isEmpty()) {
                double parseDouble = Double.parseDouble(txtOrderQty.getText());
                txtUnitPrice.setText(Decimal_Formats.Price(tot / parseDouble));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);

    }

}
