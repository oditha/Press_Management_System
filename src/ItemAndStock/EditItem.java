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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EditItem extends javax.swing.JFrame {

    Map<String, Integer> map = new HashMap<>();
    Map<String, String> CatCode = new HashMap<>();

    int IdItem;

    public EditItem() {
        initComponents();
        loadCatogories();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");

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
        jLabel2.setText("Unit Price");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

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
        jLabel4.setText("Catagory");

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
        jLabel5.setText("Selling Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Reorder Level");

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

        jTabbedPane1.addTab("Edit Item", jPanel1);

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (validateTxt(jPanel1) && comboCatagory.getSelectedIndex() != 0) {

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Items.class);
                createCriteria.add(Restrictions.eq("idRawItems", IdItem));
                Items itm = (Items) createCriteria.uniqueResult();
                Transaction beginTransaction = openSession.beginTransaction();
               

                    ItemCatagory itemCatagory = new ItemCatagory();
                    itemCatagory.setIdRowItemCatagory(map.get(comboCatagory.getSelectedItem().toString()));

                    
                    itm.setItemCatagory(itemCatagory);
                    itm.setItemName(txtNameAdditem.getText());
                    itm.setItemsUnitPrice(Double.parseDouble(txtUPriceItem.getText()));
                    itm.setDescription(txtDescription.getText());
                    itm.setItemsSellingPrice(Double.parseDouble(txtSellingPriceItem.getText()));
                    itm.setItemsCode(lblItemcode.getText());
                    
                    openSession.update(itm);

                    Criteria cc = openSession.createCriteria(RawItemInfo.class);
                    cc.createAlias("items", "i");
                    cc.add(Restrictions.eq("i.idRawItems", IdItem));
                    RawItemInfo uniqueResult = (RawItemInfo) cc.uniqueResult();
                    
                    if (uniqueResult != null) {
                        
                        uniqueResult.setMinQty(txtRecorderLevelItem.getText());
                        
                        openSession.update(uniqueResult);
                    }

                    

                    beginTransaction.commit();
                    NotificationPopup.save();
                    ViewItem.loadItems();
                    dispose();
               

                openSession.close();

            } catch (Exception e) {

                e.printStackTrace();

            }

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

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboCatagory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblItemcode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtNameAdditem;
    private javax.swing.JTextField txtRecorderLevelItem;
    private javax.swing.JTextField txtSellingPriceItem;
    private javax.swing.JTextField txtUPriceItem;
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

//                    comboServiceCatagory.addItem(itemCatagory.getCatagoryName());

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

    public void loadItem(int idItem) {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("idRawItems", idItem));
            Items itm = (Items) createCriteria.uniqueResult();

            if (itm != null) {

                IdItem = itm.getIdRawItems();

                lblItemcode.setText(itm.getItemsCode());
                txtNameAdditem.setText(itm.getItemName());
                txtSellingPriceItem.setText(itm.getItemsSellingPrice() + "");
                txtUPriceItem.setText(itm.getItemsUnitPrice() + "");
                String Re = "0";
                Iterator<RawItemInfo> iterator = itm.getRawItemInfos().iterator();
                while (iterator.hasNext()) {
                    RawItemInfo next = iterator.next();
                    Re = next.getMinQty();

                }
                txtRecorderLevelItem.setText(Re);
                txtDescription.setText(itm.getDescription());
                comboCatagory.setSelectedItem(itm.getItemCatagory().getCatagoryName());
                txtNameAdditem.grabFocus();

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
