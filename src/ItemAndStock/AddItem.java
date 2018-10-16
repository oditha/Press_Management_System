package ItemAndStock;

import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import MainMenu.*;
import ORM.ItemCatagory;
import ORM.Items;
import ORM.RawItemInfo;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class AddItem extends javax.swing.JFrame {

    Map<String, Integer> map = new HashMap<>();
    Map<String, String> CatCode = new HashMap<>();

    public AddItem() {
        initComponents();
        loadCatogories();
        comboCatagory.grabFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNameAdditem = new javax.swing.JTextField();
        lblItemcode = new javax.swing.JLabel();
        txtUPriceItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        comboCatagory = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtRecorderLevelItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSellingPriceItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescriptionService = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtUPriceService = new javax.swing.JTextField();
        txtSellingPriceServi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNameServ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboServiceCatagory = new javax.swing.JComboBox();
        ItemCode = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtNameAdditem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblItemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblItemcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblItemcode.setText("Item Code");

        txtUPriceItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUPriceItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUPriceItemActionPerformed(evt);
            }
        });
        txtUPriceItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUPriceItemKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Unit Price *");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Item Name *");

        comboCatagory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboCatagory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        comboCatagory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCatagoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Catagory *");

        txtRecorderLevelItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRecorderLevelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecorderLevelItemActionPerformed(evt);
            }
        });
        txtRecorderLevelItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRecorderLevelItemKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Selling Price *");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Reorder Level *");

        txtSellingPriceItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSellingPriceItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellingPriceItemKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Description");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblItemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameAdditem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCatagory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUPriceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSellingPriceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecorderLevelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameAdditem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUPriceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSellingPriceItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecorderLevelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Item", jPanel1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtDescriptionService.setColumns(20);
        txtDescriptionService.setRows(5);
        jScrollPane2.setViewportView(txtDescriptionService);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Description");

        txtUPriceService.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUPriceService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUPriceServiceActionPerformed(evt);
            }
        });
        txtUPriceService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUPriceServiceKeyTyped(evt);
            }
        });

        txtSellingPriceServi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSellingPriceServi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellingPriceServiKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Selling Price *");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Unit Price *");

        txtNameServ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Service Name *");

        comboServiceCatagory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboServiceCatagory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        comboServiceCatagory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboServiceCatagoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        ItemCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ItemCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemCode.setText("Item Code");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Catagory *");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNameServ, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboServiceCatagory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUPriceService, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSellingPriceServi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboServiceCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUPriceService, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSellingPriceServi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Service", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUPriceItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUPriceItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUPriceItemActionPerformed

    private void txtRecorderLevelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecorderLevelItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecorderLevelItemActionPerformed

    private void txtUPriceServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUPriceServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUPriceServiceActionPerformed

    private void comboCatagoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCatagoryPopupMenuWillBecomeInvisible

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.createAlias("itemCatagory", "i");
            createCriteria.add(Restrictions.eq("i.idRowItemCatagory", map.get(comboCatagory.getSelectedItem().toString())));

            List list = createCriteria.list();
            int size = list.size();
            size++;
            lblItemcode.setText(CatCode.get(comboCatagory.getSelectedItem().toString()) + Decimal_Formats.Item_Code(size));
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_comboCatagoryPopupMenuWillBecomeInvisible

    private void comboServiceCatagoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboServiceCatagoryPopupMenuWillBecomeInvisible

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.createAlias("itemCatagory", "i");
            createCriteria.add(Restrictions.eq("i.idRowItemCatagory", map.get(comboServiceCatagory.getSelectedItem().toString())));

            List list = createCriteria.list();
            int size = list.size();
            size++;
            ItemCode.setText(CatCode.get(comboServiceCatagory.getSelectedItem().toString()) + Decimal_Formats.Item_Code(size));
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_comboServiceCatagoryPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (validateTxt(jPanel1)&&comboCatagory.getSelectedIndex() != 0) {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            
            ItemCatagory itemCatagory = new ItemCatagory();
            itemCatagory.setIdRowItemCatagory(map.get(comboCatagory.getSelectedItem().toString()));
            
            
            Items items = new Items();
            items.setItemCatagory(itemCatagory);
            items.setItemName(txtNameAdditem.getText());
            items.setItemsUnitPrice(Double.parseDouble(txtUPriceItem.getText()));
            items.setDescription(txtDescription.getText());
            items.setIsDelete("Active");
            items.setIsRaw("YES");
            items.setIsService("NO");
            items.setItemsSellingPrice(Double.parseDouble(txtSellingPriceItem.getText()));
            items.setItemsCode(lblItemcode.getText());

            openSession.save(items);
            
            RawItemInfo rawItemInfo = new RawItemInfo();
            rawItemInfo.setItems(items);
            rawItemInfo.setMinQty(txtRecorderLevelItem.getText());
            
            openSession.save(rawItemInfo);
            
            RawItemStock rawItemStock = new RawItemStock();
            rawItemStock.setItems(items);
            rawItemStock.setQty(0.00);
            rawItemStock.setUnit("Pcs");
            rawItemStock.setIsDelete("Active");
            
            openSession.save(rawItemStock);
            beginTransaction.commit();
            openSession.close();
            
            NotificationPopup.save();
            
            comboCatagory.setSelectedIndex(0);
            txtNameAdditem.setText(null);
            txtUPriceItem.setText(null);
            txtSellingPriceItem.setText(null);
            txtRecorderLevelItem.setText(null);
            txtDescription.setText(null);
            
            comboCatagory.grabFocus();
            
        }else{
        
            NotificationPopup.fillFeilds();
        
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUPriceItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUPriceItemKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUPriceItemKeyTyped

    private void txtSellingPriceItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceItemKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtSellingPriceItemKeyTyped

    private void txtRecorderLevelItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRecorderLevelItemKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtRecorderLevelItemKeyTyped

    private void txtUPriceServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUPriceServiceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUPriceServiceKeyTyped

    private void txtSellingPriceServiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceServiKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtSellingPriceServiKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         if (validateTxt(jPanel2)&&comboServiceCatagory.getSelectedIndex() != 0) {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            
            ItemCatagory itemCatagory = new ItemCatagory();
            itemCatagory.setIdRowItemCatagory(map.get(comboServiceCatagory.getSelectedItem().toString()));
            
            
            Items items = new Items();
            items.setItemCatagory(itemCatagory);
            items.setItemName(txtNameServ.getText());
            items.setItemsUnitPrice(Double.parseDouble(txtUPriceService.getText()));
            items.setDescription(txtDescriptionService.getText());
            items.setIsDelete("Active");
            items.setIsRaw("NO");
            items.setIsService("YES");
            items.setItemsSellingPrice(Double.parseDouble(txtSellingPriceServi.getText()));
            items.setItemsCode(ItemCode.getText());

            openSession.save(items);
            
//            RawItemStock rawItemStock = new RawItemStock();
//            rawItemStock.setItems(items);
//            rawItemStock.setQty(0.00);
//            rawItemStock.setUnit("Pcs");
//            rawItemStock.setIsDelete("Active");
//            
//            openSession.save(rawItemStock);
            beginTransaction.commit();
            openSession.close();
            
            NotificationPopup.save();
            
            comboServiceCatagory.setSelectedIndex(0);
            txtNameServ.setText(null);
            txtUPriceService.setText(null);
            txtSellingPriceServi.setText(null);
            txtDescriptionService.setText(null);
            
            comboServiceCatagory.grabFocus();
            
        }else{
         
             NotificationPopup.fillFeilds();
         
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ItemCode;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboCatagory;
    private javax.swing.JComboBox comboServiceCatagory;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblItemcode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtDescriptionService;
    private javax.swing.JTextField txtNameAdditem;
    private javax.swing.JTextField txtNameServ;
    private javax.swing.JTextField txtRecorderLevelItem;
    private javax.swing.JTextField txtSellingPriceItem;
    private javax.swing.JTextField txtSellingPriceServi;
    private javax.swing.JTextField txtUPriceItem;
    private javax.swing.JTextField txtUPriceService;
    // End of variables declaration//GEN-END:variables

    private void loadCatogories() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(ItemCatagory.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.addOrder(Order.asc("catagoryName"));
            List<ItemCatagory> list = createCriteria.list();
            for (ItemCatagory itemCatagory : list) {

                map.put(itemCatagory.getCatagoryName(), itemCatagory.getIdRowItemCatagory());
                CatCode.put(itemCatagory.getCatagoryName(), itemCatagory.getCatagoryCode());

                if (itemCatagory.getCatoType().equals("Service")) {

                    comboServiceCatagory.addItem(itemCatagory.getCatagoryName());

                } else {

                    comboCatagory.addItem(itemCatagory.getCatagoryName());

                }

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private boolean validateTxt(JPanel jp) {

        boolean flag = true;

        java.awt.Component[] cp = jp.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                if (((JTextField) c).getText().isEmpty()) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        return flag;

    }

}
