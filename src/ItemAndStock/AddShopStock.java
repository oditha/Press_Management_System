
package ItemAndStock;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import MainMenu.Logging;
import ORM.Items;
import ORM.RawItemStock;
import ORM.StockOutgoing;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddShopStock extends javax.swing.JFrame {

    Map<String, Integer> item = new HashMap<>();

    public AddShopStock() {
        initComponents();
        ComboToTXT3();
        tableAlign(jTable1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        txtQTY = new javax.swing.JTextField();
        txtAddStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Get from stock");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Item");

        jComboBox.setEditable(true);

        txtQTY.setEditable(false);
        txtQTY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtAddStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAddStock.setToolTipText("Press Enter to add");
        txtAddStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddStockKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Item Name", "QTY"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Avb. QTY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Add Stock");

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Press Enter to add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(94, 94, 94)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            
            Transaction beginTransaction = openSession.beginTransaction();
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                
                Items items = new Items();
                items.setIdRawItems(item.get(jTable1.getValueAt(i, 0).toString()));
                
                StockOutgoing stockOutgoing = new StockOutgoing();
                
                stockOutgoing.setCreatedBy(Logging.user);
                stockOutgoing.setDate(dateForm.currentdate());
                stockOutgoing.setIsDelete("Active");
                stockOutgoing.setItems(items);
                stockOutgoing.setQty(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                stockOutgoing.setUnit("Pcs");
                
                openSession.save(stockOutgoing);
                
                Criteria createCriteria = openSession.createCriteria(RawItemStock.class);
                createCriteria.createAlias("items", "i");
                createCriteria.add(Restrictions.eq("i.idRawItems", item.get(jTable1.getValueAt(i, 0).toString())));
                RawItemStock uniqueResult = (RawItemStock) createCriteria.uniqueResult();
                if (uniqueResult != null) {
                    
                    uniqueResult.setQty(uniqueResult.getQty() - Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    openSession.save(uniqueResult);
                }
                
                
            }
            
            beginTransaction.commit();
            NotificationPopup.save();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            jComboBox.grabFocus();
            openSession.close();
            
            
        } catch (Exception e) {
        
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAddStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddStockKeyReleased

        if (evt.getKeyCode() == 10) {
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            
            dtm.addRow(new Object[]{
            
                jComboBox.getSelectedItem().toString().split(" # ")[1],
                jComboBox.getSelectedItem().toString().split(" # ")[0],
                txtAddStock.getText()
            
            
            });
            
            txtAddStock.setText(null);
            txtQTY.setText(null);
            jComboBox.setSelectedIndex(-1);
            jComboBox.grabFocus();
        }else{
        
            double avb = Double.parseDouble(txtQTY.getText());
            double qty = Double.parseDouble(txtAddStock.getText());
            
            if (avb < qty) {
                
                JOptionPane.showMessageDialog(null, "You cannot get this Qty");
                txtAddStock.setText(null);
                
            }
        
        
        }
        
    }//GEN-LAST:event_txtAddStockKeyReleased

   
    public static void main(String args[]) {
       
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddShopStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddStock;
    private javax.swing.JTextField txtQTY;
    // End of variables declaration//GEN-END:variables

    public void comboFilter3(String enteredText) {

        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("isRaw", "YES"));
              createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
            List<Items> list = createCriteria.list();
            jComboBox.removeAllItems();

            for (Items rawItems : list) {

                str1 = rawItems.getItemName() + " # " + rawItems.getItemsCode()+ " # " + rawItems.getItemsUnitPrice();
                item.put(rawItems.getItemsCode(), rawItems.getIdRawItems());

                filterArray.add(str1);

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            jComboBox.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            jComboBox.setSelectedItem(enteredText);
            jComboBox.showPopup();
        } else {
            jComboBox.hidePopup();
        }
    }

    private void ComboToTXT3() {
        
        final JTextField textfield = (JTextField) jComboBox.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {

                                Session sess = PoolManager.getSessionFactory().openSession();
                                Criteria cr = sess.createCriteria(RawItemStock.class);
                                cr.createAlias("items", "i");
                                cr.add(Restrictions.eq("i.idRawItems", item.get(jComboBox.getSelectedItem().toString().split(" # ")[1])));
                                RawItemStock uniqueResult = (RawItemStock) cr.uniqueResult();

                                if (uniqueResult != null) {
                                    
                                    txtQTY.setText(uniqueResult.getQty()+"");
                                    txtAddStock.grabFocus();
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

    private void tableAlign(JTable jt) {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jt.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        

    }
    
}
