package InvoiceAndGRN;


import static InvoiceAndGRN.AddGRNODK.maximized;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class AddInvoicesODK extends javax.swing.JFrame {
//
//    public static Map<String, Integer> cus = new HashMap<String, Integer>();
//
//    Map<String, Integer> itm = new HashMap();
//    Map<String, String> itmNames = new HashMap();
//    Map<String, Integer> cust = new HashMap();
//    Map<String, Integer> Serieal = new HashMap();
//    ArrayList<SupInvoiceHolder> al = new ArrayList();
  static boolean maximized = true;
    public AddInvoicesODK() {
        initComponents();
        //txtGrnDate.setText(dateForm.setdate());
        comboCustomer.grabFocus();
        loadInvNo();
        ComboToTXT();
//        ComboToTXT2();
        jTable1.setComponentPopupMenu(jPopupMenu1);

        tableAlign();
Setmaximized();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        txtGrnDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboItemName = new javax.swing.JComboBox<>();
        txtSerial = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Delete Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete All");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem4.setText("View Serial numbers");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice | Bit Win Computers");

        txtGrnDate.setEditable(false);

        jLabel3.setText("INVOICE DATE");

        jLabel4.setText("Item Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Unit Price", "QTY", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        btnSave.setText("Save Invoice");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Invoice No");

        txtInvoiceNo.setEditable(false);

        jLabel10.setText("Quantity");

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQTYKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        jLabel11.setText("Invoice Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        jLabel12.setText("Paid Amount");

        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidKeyTyped(evt);
            }
        });

        jLabel14.setText("Unit Price");

        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        jLabel16.setText("Discount");

        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
        });

        jLabel17.setText("Net Total");

        txtNetTotal.setEditable(false);
        txtNetTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtNetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetTotalActionPerformed(evt);
            }
        });

        jLabel8.setText("Item Code");

        comboItemName.setEditable(true);
        comboItemName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboItemNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtSerial.setToolTipText("Press Enter To Search");
        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });
        txtSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialKeyReleased(evt);
            }
        });

        comboCustomer.setEditable(true);

        jLabel1.setText("Select Customer");

        jButton1.setText("Add New Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGrnDate)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txtSerial)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtInvoiceNo)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(390, 390, 390)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

//        if (!txtNetTotal.getText().isEmpty()) {
//
//            try {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Invoice invoice = new Invoice();
//
//                invoice.setInvoiceNo(txtInvoiceNo.getText());
//                invoice.setInvoiceDate(txtGrnDate.getText());
//
//                invoice.setSubTotal(Double.parseDouble(txtTotal.getText()));
//                try {
//                    invoice.setDiscount(Double.parseDouble(txtDiscount.getText()));
//                } catch (Exception e) {
//                }
//                invoice.setNettTotal(Double.parseDouble(txtNetTotal.getText()));
//                invoice.setIsActive("Active");
//                invoice.setCreatedBy(Login.Uname);
//
//                openSession.save(invoice);
//
//                Customers customer = new Customers();
//                customer.setIdCustomers(cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1]));
//                InvoiceHasCustomers ihc = new InvoiceHasCustomers();
//                ihc.setCustomers(customer);
//                ihc.setInvoice(invoice);
//                openSession.save(ihc);
//
//                for (int i = 0; i < jTable1.getRowCount(); i++) {
//
//                    Item item = new Item();
//                    item.setIdItem(itm.get(jTable1.getValueAt(i, 0).toString()));
//
//                    InvoiceItem invoiceItem = new InvoiceItem();
//                    invoiceItem.setInvoice(invoice);
//                    invoiceItem.setItem(item);
//                    invoiceItem.setQty(Integer.parseInt(Decimal_Formats.Qty(Double.parseDouble(jTable1.getValueAt(i, 4).toString()))));
//                    invoiceItem.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
//                    invoiceItem.setNettTotalItm(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
//                    invoiceItem.setWarranry(jTable1.getValueAt(i, 2).toString());
//                    invoiceItem.setIsActive("Active");
//
//                    openSession.save(invoiceItem);
//
//                    Iterator<SupInvoiceHolder> iterator = al.iterator();
//                    while (iterator.hasNext()) {
//                        SupInvoiceHolder next = iterator.next();
//                        if (next.getProduct().equals(jTable1.getValueAt(i, 0).toString())) {
//                            System.out.println(Serieal);
//                            System.out.println(next.getProduct() + "-" + next.getSerial() + " " + Serieal.get(next.getSerial()));
//
//                            ItemSereal itemSereal = new ItemSereal();
//                            itemSereal.setIdItemSereal(Serieal.get(next.getSerial()));
//
//                            ItemSerealHasInvoiceItem cusinserial = new ItemSerealHasInvoiceItem();
//                            cusinserial.setItemSereal(itemSereal);
//                            cusinserial.setInvoiceItem(invoiceItem);
//
//                            openSession.save(cusinserial);
//
//                            Criteria ccc = openSession.createCriteria(ItemSereal.class);
//                            ccc.add(Restrictions.eq("idItemSereal", Serieal.get(next.getSerial())));
//                            ItemSereal uniqueResult = (ItemSereal) ccc.uniqueResult();
//
//                            if (uniqueResult != null) {
//
//                                uniqueResult.setStatus("SOLD");
//                                openSession.update(uniqueResult);
//
//                            }
//
//                        }
//
//                    }
//
//                    Criteria createCriteria = openSession.createCriteria(Stock.class);
//                    createCriteria.createAlias("item", "i");
//                    createCriteria.add(Restrictions.eq("i.idItem", itm.get(jTable1.getValueAt(i, 0).toString())));
//                    Stock stk = (Stock) createCriteria.uniqueResult();
//                    stk.setQty(stk.getQty() - Double.parseDouble(jTable1.getValueAt(i, 4).toString()));
//
//                    openSession.update(stk);
//
//                }
//
//                InvoicePayments ip = new InvoicePayments();
//                ip.setCustomers(customer);
//                ip.setInvoice(invoice);
//                ip.setAmount(Double.parseDouble(txtPaid.getText()));
//                ip.setPaymentDate(txtGrnDate.getText());
//                ip.setPaymentType("Cash");
//                ip.setIsActive("Active");
//
//                openSession.save(ip);
//
//                CashBook cb = new CashBook();
//                cb.setDebit(0.00);
//                cb.setCredit(Double.parseDouble(txtPaid.getText()));
//                cb.setCbdate(txtGrnDate.getText());
//                cb.setDescriotion("Payment for Invoice " + txtInvoiceNo.getText());
//                openSession.save(cb);
//                beginTransaction.commit();
//                openSession.close();
//                comboItemName.setSelectedIndex(-1);
//                comboCustomer.setSelectedIndex(-1);
//                comboPrice.setSelectedIndex(-1);
//
//                txtNetTotal.setText(null);
//                txtTotal.setText(null);
//                txtPaid.setText(null);
//                txtDiscount.setText(null);
//
//                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//                dtm.setRowCount(0);
//                al.clear();
//                NotificationPopup.save();
//
//                boolean FLAG = false;
//
//                try {
//
//                    Session openSession1 = PoolManager.getSessionFactory().openSession();
//                    
//                    Criteria cc = openSession1.createCriteria(Invoice.class);
//                    cc.add(Restrictions.eq("invoiceNo", txtInvoiceNo.getText()));
//                    Invoice uniqueResult = (Invoice) cc.uniqueResult();
//                    if (uniqueResult != null) {
//
//                        Set invoiceItems = uniqueResult.getInvoiceItems();
//                        Iterator iterator = invoiceItems.iterator();
//                        while (iterator.hasNext()) {
//                            InvoiceItem next = (InvoiceItem) iterator.next();
//                            Iterator iterator1 = next.getItemSerealHasInvoiceItems().iterator();
//                            while (iterator1.hasNext()) {
//                                ItemSerealHasInvoiceItem next1 = (ItemSerealHasInvoiceItem) iterator1.next();
//
//                                FLAG = true;
//
//                            }
//                        }
//
//                    }
//
//                    System.out.println(FLAG);
//
//                } catch (Exception e) {
//                }
//
//                if (FLAG) {
//
//                    try {
//                        Map<String, Object> map = new HashMap<String, Object>();
//                        map.put("InvoiceNO", txtInvoiceNo.getText());
//                        System.out.println(map);
//                        JasperPrint jp = JasperFillManager.fillReport(Login.jrCusInvoiceWithSerial, map, DB.getCon());
////                JasperViewer.viewReport(jp);
//                        JasperPrintManager.printReport(jp, true);
//                    } catch (Exception ex) {
//                        Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                } else {
//
//                    try {
//                        Map<String, Object> map = new HashMap<String, Object>();
//                        map.put("InvoiceNO", txtInvoiceNo.getText());
//                        System.out.println(map);
//                        JasperPrint jp = JasperFillManager.fillReport(Login.jrCusInvoice, map, DB.getCon());
////                JasperViewer.viewReport(jp);
//                        JasperPrintManager.printReport(jp, true);
//                    } catch (Exception ex) {
//                        Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                }
//
//                
//
//                loadInvNo();
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//
//            }
//
//        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

//        if (evt.getKeyCode() == 10) {
//
//            boolean flag = true;
//
//            double tblQty = 0.0;
//            double tblAmount = 0.0;
//
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//
//            double unitprice = Double.parseDouble(txtUnitPrice.getText());
//            double QTY = Double.parseDouble(txtQTY.getText());
//
//            for (int i = 0; i < jTable1.getRowCount(); i++) {
//
//                String itemCode = (String) jTable1.getValueAt(i, 0);
//
//                if (itemCode.equals(comboItemName.getSelectedItem().toString().split(" - ")[1])) {
//
//                    flag = false;
//
//                    tblQty = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
//                    tblAmount = Double.parseDouble(jTable1.getValueAt(i, 5).toString());
//
////                    if (!txtItemDiscount.getText().isEmpty()) {
////
//////                        double Discount = Doubl(tblQty + QTY)e.parseDouble(txtItemDiscount.getText());
//////                        jTable1.setValueAt((tblQty + QTY), i, 4);
//////                        jTable1.setValueAt((tblQty + QTY) * (unitprice - Discount), i, 5);
//////                        jTable1.setValueAt((unitprice - Discount), i, 3);
////
////                    } 
//                    jTable1.setValueAt(unitprice, i, 3);
//                    jTable1.setValueAt((tblQty + QTY), i, 4);
//                    jTable1.setValueAt(((tblQty + QTY) * unitprice), i, 5);
//
//                    break;
//
//                } else {
//
//                    flag = true;
//
//                }
//            }
//
//            if (flag == true) {
//
//                // if (txtItemDiscount.getText().isEmpty()) {
//                dtm.addRow(new Object[]{
//                    comboItemName.getSelectedItem().toString().split(" - ")[1],
//                    comboItemName.getSelectedItem().toString().split(" - ")[0],
//                    comboPrice.getSelectedItem().toString().split(" - ")[1],
//                    unitprice,
//                    txtQTY.getText(),
//                    unitprice * QTY
//
//                });
//                //     } 
////else {
////
////                    double Discount = Double.parseDouble(txtItemDiscount.getText());
////                    dtm.addRow(new Object[]{
////                        comboItemName.getSelectedItem().toString().split(" - ")[1],
////                        comboItemName.getSelectedItem().toString().split(" - ")[0],
////                        comboPrice.getSelectedItem().toString().split(" - ")[1],
////                        unitprice - Discount,
////                        txtQTY.getText(),
////                        (unitprice - Discount) * QTY
////
////                    });
////
////                }
//
//            }
//            System.out.println(flag);
//            if (!txtSerial.getText().isEmpty()) {
//
//                SupInvoiceHolder sih = new SupInvoiceHolder();
//                sih.setProduct(comboItemName.getSelectedItem().toString().split(" - ")[1]);
//                sih.setSerial(txtSerial.getText().toUpperCase());
//
//                al.add(sih);
//
//            }
//
//            setGrnTotal();
//
//            comboItemName.setSelectedIndex(-1);
////            comboSerial.setSelectedIndex(-1);
//            comboPrice.setSelectedIndex(-1);
//
//            txtUnitPrice.setText(null);
//            txtQTY.setText(null);
//            //txtItemDiscount.setText(null);
//            txtSerial.setText(null);
//            txtSerial.grabFocus();
//            ////////////////////////////////------------------------------
//
//        }

    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased

        try {

            double disco = Double.parseDouble(txtDiscount.getText());
            double tot = Double.parseDouble(txtTotal.getText());

            double net = tot - disco;

            txtNetTotal.setText(net + "");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtDiscountKeyReleased

    private void txtPaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyReleased

        try {
            double grntot = Double.parseDouble(txtNetTotal.getText());
            double paid = Double.parseDouble(txtPaid.getText());
            if (paid > grntot) {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Paid amout Greater than Invoice total. Do you want to continue?",
                        "Payment Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog != 0) {

                    txtPaid.setText(null);
                    txtPaid.grabFocus();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtPaidKeyReleased

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtSerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyReleased

//        try {
//
//            if (evt.getKeyCode() == 10) {
//
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria cc = openSession.createCriteria(ItemSereal.class);
//                    cc.add(Restrictions.eq("serealNo", txtSerial.getText()));
//                    ItemSereal uniqueResult = (ItemSereal) cc.uniqueResult();
//
//                    if (uniqueResult != null) {
//
//                        if (uniqueResult.getStatus().equals("SOLD")) {
//
//                            JOptionPane.showMessageDialog(null, "Item alredy Sold. Try new one", "Item not avaliable",
//                                    JOptionPane.ERROR_MESSAGE);
//
//                        } else if (uniqueResult.getStatus().equals("Return")) {
//
//                            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "This item was returned by customer. Do you want to continue?",
//                                    "Item Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//                            if (showConfirmDialog == 0) {
//                                comboItemName.removeAllItems();
//                                String name = uniqueResult.getItem().getIitemName();
//                                String itemCode = uniqueResult.getItem().getItemCode();
//                                itm.put(itemCode, uniqueResult.getItem().getIdItem());
//                                comboItemName.addItem(name + " - " + itemCode);
//                                Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
//                                loadPriceVariationV2(itemCode);
//                                txtQTY.setText("1");
//
//                            } else {
//
//                                txtSerial.grabFocus();
//                                txtSerial.setText(null);
//
//                            }
//
//                        } else if (uniqueResult.getStatus().equals("Supplier Return")) {
//
//                            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "This item wait for return to Supplier. Do you want to continue?",
//                                    "Item Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//                            if (showConfirmDialog == 0) {
//                                comboItemName.removeAllItems();
//                                String name = uniqueResult.getItem().getIitemName();
//                                String itemCode = uniqueResult.getItem().getItemCode();
//                                itm.put(itemCode, uniqueResult.getItem().getIdItem());
//                                comboItemName.addItem(name + " - " + itemCode);
//                                Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
//                                loadPriceVariationV2(itemCode);
//                                txtQTY.setText("1");
//
//                            } else {
//
//                                txtSerial.grabFocus();
//                                txtSerial.setText(null);
//
//                            }
//
//                        } else {
//
//                            comboItemName.removeAllItems();
//                            String name = uniqueResult.getItem().getIitemName();
//                            String itemCode = uniqueResult.getItem().getItemCode();
//                            itm.put(itemCode, uniqueResult.getItem().getIdItem());
//                            comboItemName.addItem(name + " - " + itemCode);
//                            Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
//                            loadPriceVariationV2(itemCode);
//                            txtQTY.setText("1");
//
//                        }
//                    }
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            }
//
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_txtSerialKeyReleased

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtNetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetTotalActionPerformed

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtDiscountKeyTyped

    private void txtPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaidKeyTyped

    private void txtQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyPressed
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria cc = openSession.createCriteria(Stock.class);
//            cc.createAlias("item", "i");
//            cc.add(Restrictions.eq("i.idItem", itm.get(comboItemName.getSelectedItem().toString().split(" - ")[1])));
//            Stock uniqueResult = (Stock) cc.uniqueResult();
//            if (uniqueResult != null) {
//
//                if (uniqueResult.getQty() < Double.parseDouble(txtQTY.getText())) {
//
//                    JOptionPane.showMessageDialog(null, "QTY you entered not avaliable on Stock.", "Stock Error", JOptionPane.ERROR_MESSAGE);
//                    txtQTY.setText(null);
//                    txtQTY.grabFocus();
//                }
//
//            }
//
//        } catch (Exception e) {
//
//        }


    }//GEN-LAST:event_txtQTYKeyPressed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        int button = evt.getButton();
        if (button == 3) {

            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //new AddCustomers().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

//        int r = jTable1.getSelectedRow();
//        String itemcode = (String) jTable1.getValueAt(r, 0);
//        String itemName = (String) jTable1.getValueAt(r, 1);
//
//        ViewInvoiceSerials viewInvoiceSerials = new ViewInvoiceSerials();
//
//        DefaultTableModel dtm = (DefaultTableModel) viewInvoiceSerials.jTable1.getModel();
//        dtm.setRowCount(0);
//
//        Iterator<SupInvoiceHolder> iterator = al.iterator();
//
//        while (iterator.hasNext()) {
//
//            SupInvoiceHolder next = iterator.next();
//
//            if (next.getProduct().equals(itemcode)) {
//
//                java.util.Vector v = new java.util.Vector();
//
//                v.add(itemName);
//                v.add(next.getSerial());
//                dtm.addRow(v);
//                viewInvoiceSerials.productName.setText(itemName);
//                viewInvoiceSerials.setVisible(true);
//            }
//
//        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoicesODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JComboBox<String> comboItemName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGrnDate;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void loadInvNo() {
//
//        Session openSession = PoolManager.getSessionFactory().openSession();
//        Criteria createCriteria = openSession.createCriteria(Invoice.class);
//        createCriteria.setProjection(Projections.rowCount());
//        List list = createCriteria.list();
//        String InvNo = Decimal_Formats.InvNo(Integer.parseInt(list.get(0).toString()) + 1);
//        txtInvoiceNo.setText("INV-" + InvNo);

    }

    private void loadItemNames() {
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Item.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Item> list = createCriteria.list();
//            comboItemName.removeAllItems();
//            for (Item item : list) {
//
//                comboItemName.addItem(item.getIitemName() + " - " + item.getItemCode());
//                itm.put(item.getItemCode(), item.getIdItem());
//                itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());
//
//            }
//
//            comboItemName.setSelectedIndex(-1);
//            openSession.close();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//    }
//
//    private void loadPriceVariation() {
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
//            createCriteria.createAlias("item", "i");
//            createCriteria.add(Restrictions.eq("i.idItem", itm.get(comboItemName.getSelectedItem().toString().split(" - ")[1])));
//            List<ItemPrices> list = createCriteria.list();
//            comboPrice.removeAllItems();
//            comboPrice.addItem("Select");
//            for (ItemPrices itemPrices : list) {
//
//                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()) + " - " + itemPrices.getSupWarrenty());
//
//                if (list.size() == 1) {
//
//                    comboPrice.setSelectedIndex(1);
//
//                    txtUnitPrice.setText(Decimal_Formats.Price(itemPrices.getNettPrice()));
//                    txtQTY.grabFocus();
//
//                } else {
//
//                    txtUnitPrice.setText(null);
//                    comboPrice.grabFocus();
//                }
//            }
//
//            openSession.close();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }

    }

    private void loadPriceVariationV2(String code) {
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
//            createCriteria.createAlias("item", "i");
//            createCriteria.add(Restrictions.eq("i.idItem", itm.get(code)));
//            List<ItemPrices> list = createCriteria.list();
//            comboPrice.removeAllItems();
//            comboPrice.addItem("Select");
//            for (ItemPrices itemPrices : list) {
//
//                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()) + " - " + itemPrices.getSupWarrenty());
//
//                if (list.size() == 1) {
//
//                    comboPrice.setSelectedIndex(1);
//
//                    txtUnitPrice.setText(Decimal_Formats.Price(itemPrices.getNettPrice()));
//                    txtQTY.grabFocus();
//
//                } else {
//
//                    txtUnitPrice.setText(null);
//                    comboPrice.grabFocus();
//                }
//            }
//
//            openSession.close();
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }

    }

    private void setGrnTotal() {
//
//        double tot = 0;
//
//        for (int i = 0; i < jTable1.getRowCount(); i++) {
//
//            tot += Double.parseDouble(jTable1.getValueAt(i, 5).toString());
//
//        }
//
//        txtTotal.setText("" + Decimal_Formats.Price(tot));
//        txtNetTotal.setText("" + Decimal_Formats.Price(tot));
    }

    public void comboFilter(String enteredText) {
//        List<String> filterArray = new ArrayList<String>();
//
//        String str1 = "";
//
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Item.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            createCriteria.add(Restrictions.like("iitemName", "%" + enteredText + "%"));
//            List<Item> list = createCriteria.list();
//            comboItemName.removeAllItems();
//            for (Item item : list) {
//
//                str1 = item.getIitemName() + " - " + item.getItemCode();
//                filterArray.add(str1);
//                itm.put(item.getItemCode(), item.getIdItem());
//                itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());
//
//            }
//
//        } catch (Exception ex) {
//            System.out.println("error" + ex);
//        }
//
//        if (filterArray.size() > 0) {
//            comboItemName.setModel(new DefaultComboBoxModel(filterArray.toArray()));
//            comboItemName.setSelectedItem(enteredText);
//            comboItemName.showPopup();
//        } else {
//            comboItemName.hidePopup();
//        }
    }

    private void ComboToTXT() {
//        final JTextField textfield = (JTextField) comboItemName.getEditor().getEditorComponent();
//        textfield.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent ke) {
//                SwingUtilities.invokeLater(new Runnable() {
//                    public void run() {
//                        if (ke.getKeyCode() == 10) {
//
//                            try {
////                                comboItemCode.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[1]);
//                                loadPriceVariation();
//
//                            } catch (Exception e) {
//                            }
//
//                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {
//
//                            comboFilter(textfield.getText());
//
//                        }
//
//                    }
//                });
//
//            }
//        });
    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
//        List<String> filterArray = new ArrayList<String>();
//
//        String str1 = "";
//
//        try {
//
//            if (enteredText.matches("\\d+")) {
//
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria createCriteria = openSession.createCriteria(Customers.class);
//                    createCriteria.add(Restrictions.like("customersContactNo", "%" + enteredText + "%"));
//                    createCriteria.add(Restrictions.eq("isActive", "Active"));
//                    List<Customers> list = createCriteria.list();
//
//                    for (Customers customers : list) {
//                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
//                        filterArray.add(str1);
//                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());
//                    }
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            } else {
//
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria createCriteria = openSession.createCriteria(Customers.class);
//                    createCriteria.add(Restrictions.like("customerscolName", "%" + enteredText + "%"));
//                    createCriteria.add(Restrictions.eq("isActive", "Active"));
//                    List<Customers> list = createCriteria.list();
//
//                    for (Customers customers : list) {
//
//                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
//                        filterArray.add(str1);
//                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());
//
//                    }
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            }
//
//        } catch (Exception ex) {
//            System.out.println("error" + ex);
//        }
//
//        if (filterArray.size() > 0) {
//            comboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
//            comboCustomer.setSelectedItem(enteredText);
//            comboCustomer.showPopup();
//        } else {
//            comboCustomer.hidePopup();
//        }
    }

    private void ComboToTXT2() {
//        final JTextField textfield0 = (JTextField) comboCustomer.getEditor().getEditorComponent();
//        textfield0.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent ke) {
//                SwingUtilities.invokeLater(new Runnable() {
//                    public void run() {
//                        if (ke.getKeyCode() == 10) {
//
//                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {
//
//                            comboFilter2(textfield0.getText());
//
//                        }
//
//                    }
//                });
//
//            }
//        });
   }

    private void Setmaximized() {
      
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
