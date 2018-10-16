package InvoiceAndGRN;

import ClassPack.Decimal_Formats;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Items;
import ORM.Promotion;
import ORM.PromotionItems;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddPromotionUdaya extends javax.swing.JFrame {

    Map<String, Integer> item = new HashMap();
    Integer itemId = null;

    public AddPromotionUdaya() {
        initComponents();
        ComboToTXT();
        setTotal();
        jTable1.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        comboIyem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        webOrderDate = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        webDeliverDate = new com.alee.extended.date.WebDateField();
        jLabel2 = new javax.swing.JLabel();
        txtDisPresent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDisLKR = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lableAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Promotion");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("ItemName");

        comboIyem.setEditable(true);
        comboIyem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        comboIyem.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboIyemPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "UPrice"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(550);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(550);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(550);
            jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Promotion code");

        txtProCode.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Start Date");

        webOrderDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webOrderDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webOrderDateMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("End Date");

        webDeliverDate.setBorder(null);
        webDeliverDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDeliverDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webDeliverDateMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Discount (LKR)");

        txtDisPresent.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtDisPresent.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisPresent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDisPresentKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Discount (%)");

        txtDisLKR.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        txtDisLKR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisLKR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDisLKRKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisLKRKeyReleased(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setText("Total Amount");

        lableAmount.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lableAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lableAmount.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(webOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtProCode, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDisLKR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(78, 78, 78))
                                    .addComponent(txtDisPresent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboIyem, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(comboIyem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lableAmount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(46, 46, 46))
                                    .addComponent(txtDisPresent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDisLKR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(webOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboIyemPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboIyemPopupMenuWillBecomeInvisible
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("idRawItems", item.get(comboIyem.getSelectedItem().toString().split(" - ")[1])));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));

            List<Items> list = createCriteria.list();

            for (Items ri : list) {
                itemId = ri.getIdRawItems();
                //System.out.println(itemId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboIyemPopupMenuWillBecomeInvisible

    private void webOrderDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webOrderDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webOrderDateMouseClicked

    private void webDeliverDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDeliverDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webDeliverDateMouseClicked

    private void txtDisLKRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisLKRKeyReleased

    }//GEN-LAST:event_txtDisLKRKeyReleased

    private void txtDisLKRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisLKRKeyPressed
        try {
            if (evt.getKeyCode() == 10) {
                Double D = ((Double.parseDouble(lableAmount.getText()) - Double.parseDouble(txtDisLKR.getText())) / Double.parseDouble(lableAmount.getText())) * 100;
                Double d = 100 - D;

                txtDisPresent.setText(null);
                txtDisPresent.setText("" + Decimal_Formats.Price(d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtDisLKRKeyPressed

    private void txtDisPresentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisPresentKeyPressed
        if (evt.getKeyCode() == 10) {
            Double D = ((100 - Double.parseDouble(txtDisPresent.getText()))) / 100;
            Double d = Double.parseDouble(lableAmount.getText()) - (D * Double.parseDouble(lableAmount.getText()));

            txtDisLKR.setText(null);
            txtDisLKR.setText(Decimal_Formats.Price(d));
        }
    }//GEN-LAST:event_txtDisPresentKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Promotion.class);
            createCriteria.add(Restrictions.eq("promotionCode", txtProCode.getText()));
            createCriteria.add(Restrictions.like("isDelete", "Active"));
            Promotion uniqueResult = (Promotion) createCriteria.uniqueResult();

            if (uniqueResult != null) {
                NotificationPopup.already();
            } else {
                Transaction beginTransaction = openSession.beginTransaction();

                Promotion promotion = new Promotion();
                promotion.setPromotionCode(txtProCode.getText());
                promotion.setPromoStartDate(webOrderDate.getText());
                promotion.setPromoEndDate(webDeliverDate.getText());
                promotion.setDiscountAmountPresent(Double.parseDouble(txtDisPresent.getText()));
                promotion.setDiscountAmountRs(Double.parseDouble(txtDisLKR.getText()));
                promotion.setIsDelete("Active");

                openSession.save(promotion);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Items rawItems = new Items();
                    rawItems.setIdRawItems(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));

                    PromotionItems pi = new PromotionItems();
                    pi.setPromotion(promotion);
                    pi.setItems(rawItems);
                    pi.setIsDelete("Active");

                    openSession.save(pi);
                }

                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();
                ClearTxt();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPromotionUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboIyem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lableAmount;
    private javax.swing.JTextField txtDisLKR;
    private javax.swing.JTextField txtDisPresent;
    private javax.swing.JTextField txtProCode;
    public static com.alee.extended.date.WebDateField webDeliverDate;
    public static com.alee.extended.date.WebDateField webOrderDate;
    // End of variables declaration//GEN-END:variables

    public void comboFilter(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
            createCriteria.add(Restrictions.like("isRow", "NO"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();
            comboIyem.removeAllItems();
            for (Items item : list) {

                str1 = item.getItemName() + " - " + item.getItemsCode();
                filterArray.add(str1);

                this.item.put(item.getItemsCode(), item.getIdRawItems());

                //itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboIyem.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboIyem.setSelectedItem(enteredText);
            comboIyem.showPopup();
        } else {
            comboIyem.hidePopup();
        }
    }

    private void ComboToTXT() {
        final JTextField textfield = (JTextField) comboIyem.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {
//                                comboItemCode.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[1]);
                                loadTable();

                            } catch (Exception e) {
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    private void setTotal() {

        Double sum = 0.00;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            double getsum = Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            sum = getsum + sum;
            lableAmount.setText(Decimal_Formats.Price(sum));
        }
    }

    private void ClearTxt() {
        comboIyem.setSelectedItem(null);
        txtProCode.setText(null);
        txtDisLKR.setText(null);
        txtDisPresent.setText(null);
        webDeliverDate.setDate(null);
        webOrderDate.setDate(null);

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
    }

    private void loadTable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("idRawItems", itemId));

            Items uniqueResult = (Items) createCriteria.uniqueResult();

            dtm.addRow(new Object[]{uniqueResult.getIdRawItems(), uniqueResult.getItemName(),uniqueResult.getItemsUnitPrice()});
            comboIyem.removeAllItems();

            setTotal();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
