package InvoiceAndGRN;

import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;

import ORM.CashBook;
import ORM.GrnhasExess;
import ORM.RawGrn;
import ORM.RawItemStock;
import ORM.Items;
import ORM.RowGrnItem;
import ORM.RowItemGrnPayment;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddGRNODK extends javax.swing.JFrame {
//sup

    Map<String, Integer> sup = new HashMap();
    Map<String, Integer> item = new HashMap();
    static boolean maximized = true;

    public AddGRNODK() {
        initComponents();
        TxtDate.setText(dateForm.setdate());
        loadSup();
        loadBrands();
        ComboToTXT2();
        ComboToTXT3();
        tableAlign();
//        setMaximized();
        jTable1.setRowHeight(30);
        // jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        comboSupllier = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBillNO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGrossPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGRNTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        TxtDate = new com.alee.extended.date.WebDateField();
        comboItemName = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Excceesamount = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();
        btnSave2 = new javax.swing.JButton();
        btnSave3 = new javax.swing.JButton();

        jMenuItem3.setText("Delete Selected");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText("Delete All");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        jMenuItem1.setText("View Serial No");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add GRN");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText(" Supplyer");

        comboSupllier.setEditable(true);
        comboSupllier.setMaximumSize(null);
        comboSupllier.setMinimumSize(null);
        comboSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupllierActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("GRN DATE");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Item Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Cost", "QTY", "Total", "iditem"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("Save GRN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setText("Bill No");

        txtBillNO.setMaximumSize(null);
        txtBillNO.setMinimumSize(null);
        txtBillNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNOActionPerformed(evt);
            }
        });
        txtBillNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBillNOKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setText("Cost");

        txtGrossPrice.setEditable(false);
        txtGrossPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGrossPrice.setMaximumSize(null);
        txtGrossPrice.setMinimumSize(null);
        txtGrossPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrossPriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setText("Quantity");

        txtQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel11.setText("GRN Total");

        txtGRNTotal.setEditable(false);
        txtGRNTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGRNTotal.setMaximumSize(null);
        txtGRNTotal.setMinimumSize(null);
        txtGRNTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGRNTotalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel13.setText("Paid Amount");

        txtPaid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaid.setText("00");
        txtPaid.setMaximumSize(null);
        txtPaid.setMinimumSize(null);
        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
        });

        TxtDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtDate.setMaximumSize(null);
        TxtDate.setMinimumSize(null);
        TxtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtDateMouseClicked(evt);
            }
        });

        comboItemName.setEditable(true);
        comboItemName.setToolTipText("Press Enter after select Item");
        comboItemName.setMaximumSize(null);
        comboItemName.setMinimumSize(null);
        comboItemName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboItemNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemNameActionPerformed(evt);
            }
        });
        comboItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboItemNameKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setText("Exess amount");

        Excceesamount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Excceesamount.setText("00");
        Excceesamount.setMaximumSize(null);
        Excceesamount.setMinimumSize(null);
        Excceesamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcceesamountActionPerformed(evt);
            }
        });
        Excceesamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ExcceesamountKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ExcceesamountKeyReleased(evt);
            }
        });

        btnSave1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave1.setText("Remove All");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnSave2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave2.setText("Add New Item");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        btnSave3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave3.setText("Remove Selected");
        btnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSupllier, 0, 435, Short.MAX_VALUE)
                                .addComponent(comboItemName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17))
                                .addComponent(txtBillNO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGRNTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Excceesamount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnSave3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(comboSupllier, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGRNTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Excceesamount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!(comboSupllier.getSelectedIndex() == -1 && txtBillNO.getText().isEmpty() && TxtDate.getText().isEmpty() && txtGRNTotal.getText().isEmpty())) {
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction tr = openSession.beginTransaction();

                Supplier supplier = new Supplier();
                supplier.setIdSupplier(sup.get(comboSupllier.getSelectedItem().toString()));

                RawGrn rawGrn = new RawGrn();
                rawGrn.setRawGrnNo(txtBillNO.getText());
                // rawGrn.setRawGrnDate(dateForm.setdate(TxtDate.getText()));
                rawGrn.setRawGrnDate(TxtDate.getText());
                rawGrn.setRawGrnNo(txtBillNO.getText());
                rawGrn.setNetTotal(Double.parseDouble(txtGRNTotal.getText()));
                rawGrn.setIsDelete("Active");
                rawGrn.setSupplier(supplier);
                GrnhasExess grnhasExess = new GrnhasExess();
                grnhasExess.setRawGrn(rawGrn);
                grnhasExess.setExessAmount(Excceesamount.getText());
                grnhasExess.setExessDate(TxtDate.getText());
                grnhasExess.setIsDelete("Active");
               
                openSession.save(rawGrn);
                openSession.save(grnhasExess);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Items rawItems = new Items();
                    rawItems.setIdRawItems(item.get(jTable1.getValueAt(i, 0).toString()));

                    RowGrnItem rowGrnItem = new RowGrnItem();
                    rowGrnItem.setRawGrn(rawGrn);
                    rowGrnItem.setItems(rawItems);
                    rowGrnItem.setRowItemQty(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
//                    rowGrnItem.setRowGrnItemUnit(UnitCombo.getSelectedItem().toString());
                    rowGrnItem.setGrossPrice(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    rowGrnItem.setRowItemTotal(Double.parseDouble(jTable1.getValueAt(i, 4).toString()));

                    openSession.save(rowGrnItem);

                    Criteria cr = openSession.createCriteria(RawItemStock.class);
                    cr.createAlias("items", "i");
                    cr.add(Restrictions.eq("i.idRawItems", Integer.parseInt(jTable1.getValueAt(i, 5).toString())));
                    RawItemStock stk = (RawItemStock) cr.uniqueResult();

                    double qtk = stk.getQty();
                    double nowqtk = Double.parseDouble(jTable1.getValueAt(i, 3).toString());
                    System.out.println("stock" + qtk);
                    System.out.println("new" + nowqtk);

                    stk.setQty((qtk + nowqtk));

                    openSession.update(stk);

                }

                RowItemGrnPayment rw = new RowItemGrnPayment();
                rw.setRawGrn(rawGrn);
                rw.setRowItemGrnPayDate(TxtDate.getText());
                rw.setRowItemGrnPayAmount(Double.parseDouble(txtPaid.getText()));
                rw.setIsDelete("Active");
                rw.setSupplier(supplier);
                rw.setRowItemGrnPayType("Cash");
                openSession.save(rw);

                CashBook cb = new CashBook();
                cb.setDate(TxtDate.getText());
                cb.setIncome(0.00);
                cb.setExpence(Double.parseDouble(txtPaid.getText()));
                cb.setDescription("GRN Payment " + txtBillNO.getText());

                openSession.save(cb);
                tr.commit();

                if (tr.wasCommitted()) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setRowCount(0);
                    comboSupllier.setSelectedIndex(-1);
                    txtBillNO.setText(null);
                    comboItemName.setSelectedIndex(-1);
                    txtQTY.setText(null);
                    txtGrossPrice.setText(null);
                    txtGRNTotal.setText(null);
                    txtPaid.setText(null);
                    Excceesamount.setText(null);
                    new NotificationPopup().save();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "Fill Data and try again");

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void TxtDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDateMouseClicked


    }//GEN-LAST:event_TxtDateMouseClicked

    private void comboItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemNameActionPerformed

    }//GEN-LAST:event_comboItemNameActionPerformed

    private void comboItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboItemNameKeyReleased


    }//GEN-LAST:event_comboItemNameKeyReleased

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        setg();
    }//GEN-LAST:event_txtQTYActionPerformed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased


    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped

        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }

    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaidKeyTyped

    private void txtPaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyReleased

        try {
            double grntot = Double.parseDouble(txtGRNTotal.getText());
            double paid = Double.parseDouble(txtPaid.getText());
            if (paid > grntot) {

                Excceesamount.setText("" + Decimal_Formats.Price((paid - grntot)));

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Paid amout Greater than GRN total. Do you want to continue?",
                        "Payment Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog != 0) {

                    txtPaid.setText(null);
                    txtPaid.grabFocus();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtPaidKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int button = evt.getButton();
        if (button == 3) {

            jPopupMenu1.show();

        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        
//        try {
//            
//            
//            pID = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
//            pName = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
//            
//            new ViewGRNSerials().setVisible(true);
//            
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comboSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupllierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupllierActionPerformed

    private void txtBillNOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillNOKeyReleased

//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria cr = openSession.createCriteria(RawGrn.class);
//            cr.add(Restrictions.eq("rawGrnNo", txtBillNO.getText()));
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_txtBillNOKeyReleased

    private void txtBillNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNOActionPerformed
        comboItemName.grabFocus();
    }//GEN-LAST:event_txtBillNOActionPerformed

    private void txtGrossPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrossPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrossPriceActionPerformed

    private void ExcceesamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExcceesamountKeyTyped
        // TODO add your handling code here:maximized
    }//GEN-LAST:event_ExcceesamountKeyTyped

    private void ExcceesamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExcceesamountKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcceesamountKeyReleased

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        txtGRNTotal.setText("0.0");
        //    setg();

    }//GEN-LAST:event_btnSave1ActionPerformed

    private void txtGRNTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGRNTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGRNTotalActionPerformed

    private void ExcceesamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcceesamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcceesamountActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed

    


    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed

        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());

        int x = jTable1.getRowCount();
        if (x == 0) {
            txtGRNTotal.setText("0.00");
        } else {
            Double sum = 0.00;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String s1 = dtm.getValueAt(i, 4).toString();
                Double getsum = Double.parseDouble(s1);
                sum = getsum + sum;
                txtGRNTotal.setText(Decimal_Formats.Price(sum));
            }
        }

    }//GEN-LAST:event_btnSave3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGRNODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Excceesamount;
    private com.alee.extended.date.WebDateField TxtDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnSave3;
    public static javax.swing.JComboBox<String> comboItemName;
    public static javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBillNO;
    private javax.swing.JTextField txtGRNTotal;
    private javax.swing.JTextField txtGrossPrice;
    private javax.swing.JTextField txtPaid;
    public static javax.swing.JTextField txtQTY;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

    }

    private void loadBrands() {

    }

    private void loadPriceVariation() {

    }

    private void setGrnTotal() {

        Double ttl = 0.0;
        Double tblttl = 0.0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            ttl = Double.parseDouble(jTable1.getValueAt(i, 4).toString());

            tblttl += ttl;

        }

        txtGRNTotal.setText("" + Decimal_Formats.Price(tblttl));

    }

    public void comboFilter2(String enteredText) {

        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
//            createCriteria.createAlias("brands", "b");
//            createCriteria.add(Restrictions.eq("b.idBrands", bra.get(comboBrands.getSelectedItem().toString())));
            createCriteria.add(Restrictions.like("supplierName", "%" + enteredText + "%"));
            List<Supplier> list = createCriteria.list();
            comboSupllier.removeAllItems();
            for (Supplier supplier : list) {

                str1 = supplier.getSupplierName();
                sup.put(supplier.getSupplierName(), supplier.getIdSupplier());
                filterArray.add(str1);

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboSupllier.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboSupllier.setSelectedItem(enteredText);
            comboSupllier.showPopup();
        } else {
            comboSupllier.hidePopup();
        }
    }

    private void ComboToTXT2() {
        final JTextField textfield = (JTextField) comboSupllier.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {
//                                comboItemCode.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[1]);
//                                loadPriceVariation();

                            } catch (Exception e) {
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    public void comboFilter3(String enteredText) {

        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("isRaw", "YES"));
//            createCriteria.createAlias("brands", "b");
//            createCriteria.add(Restrictions.eq("b.idBrands", bra.get(comboBrands.getSelectedItem().toString())));
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
            List<Items> list = createCriteria.list();
            comboItemName.removeAllItems();

            for (Items rawItems : list) {

                str1 = rawItems.getItemName()+ " # " + rawItems.getItemsCode() + " # " + rawItems.getItemsUnitPrice();
                item.put(rawItems.getItemsCode(), rawItems.getIdRawItems());

                filterArray.add(str1);

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboItemName.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboItemName.setSelectedItem(enteredText);
            comboItemName.showPopup();
        } else {
            comboItemName.hidePopup();
        }
    }

    private void ComboToTXT3() {
        final JTextField textfield = (JTextField) comboItemName.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {
                                //     comboItemName.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[0]);
                                //      JOptionPane.showMessageDialog(rootPane, comboItemName.getSelectedItem().toString().split("-")[0]);
//                            loadPriceVariation();
                                Session sess = PoolManager.getSessionFactory().openSession();
                                Criteria cr = sess.createCriteria(Items.class);
                                cr.add(Restrictions.eq("idRawItems", item.get(comboItemName.getSelectedItem().toString().split(" # ")[1])));
                               Items uniqueResult = (Items) cr.uniqueResult();

                                if (uniqueResult != null) {

                                    txtGrossPrice.setText("" + Decimal_Formats.Price(uniqueResult.getItemsUnitPrice()));
                                    
                                    txtQTY.grabFocus();
                                }

                            } catch (Exception e) {

                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter3(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    private void setMaximized() {

        if (maximized) {

            AddGRNODK.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddGRNODK.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void setg() {

        boolean flag = true;
        int row = 0;
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        double tblQty = 0.0;
        double tblAmount = 0.0;

        double unitprice = Double.parseDouble(txtGrossPrice.getText());
        double QTY = Double.parseDouble(txtQTY.getText());

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            String itemCode = (String) jTable1.getValueAt(i, 0);

            if (itemCode.equals(comboItemName.getSelectedItem().toString().split(" # ")[1])) {

                flag = false;

                tblQty = Double.parseDouble(jTable1.getValueAt(i, 3).toString());
                tblAmount = Double.parseDouble(jTable1.getValueAt(i, 4).toString());

                jTable1.setValueAt(Decimal_Formats.Price(unitprice), i, 2);
                jTable1.setValueAt(Decimal_Formats.Qty((tblQty + QTY)), i, 3);
                jTable1.setValueAt(Decimal_Formats.Price(((tblQty + QTY) * unitprice)), i, 4);

                break;

            } else {

                flag = true;

            }

        }

        if (flag == true) {

            Vector v = new Vector();
            v.add(comboItemName.getSelectedItem().toString().split(" # " )[1]);
            v.add(comboItemName.getSelectedItem().toString().split(" # " )[0]);
            v.add(Decimal_Formats.Price(Double.parseDouble(txtGrossPrice.getText())));
            v.add(Decimal_Formats.Qty(QTY));
            v.add(Decimal_Formats.Price(QTY * unitprice));
            v.add(item.get(comboItemName.getSelectedItem().toString().split(" # ")[1]));
            dtm.addRow(v);

        }

        setGrnTotal();
        comboItemName.setSelectedIndex(-1);
        txtGrossPrice.setText(null);
        txtQTY.setText(null);
//        UnitCombo.setSelectedIndex(0);
        comboItemName.grabFocus();

    }

}
