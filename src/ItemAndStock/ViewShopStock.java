package ItemAndStock;

import ClassPack.PoolManager;
import ORM.Items;
import ORM.StockOutgoing;
import com.alee.laf.WebLookAndFeel;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ViewShopStock extends javax.swing.JFrame {

    public ViewShopStock() {
        initComponents();
        loadRec();
        tableAlign(tblItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtItemSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtDateFrom = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        txtDateTo = new com.alee.extended.date.WebDateField();
        jLabel5 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idRec", "Item Name", "Qty", "Date", "Take by"
            }
        ));
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        txtItemSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search Item");

        TxtDateFrom.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtDateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtDateFromMouseClicked(evt);
            }
        });
        TxtDateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDateFromActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("From");

        txtDateTo.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtDateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDateToMouseClicked(evt);
            }
        });
        txtDateTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateToActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("To");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(TxtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDateFromMouseClicked

    }//GEN-LAST:event_TxtDateFromMouseClicked

    private void TxtDateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateFromActionPerformed

    private void txtDateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDateToMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateToMouseClicked

    private void txtDateToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateToActionPerformed

    private void txtItemSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemSearchKeyReleased

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.like("itemName", "%" + txtItemSearch.getText() + "%"));
            List<Items> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblItem.getModel();
            dtm.setRowCount(0);
            for (Items items : list) {

                Iterator<StockOutgoing> iterator = items.getStockOutgoings().iterator();
                while (iterator.hasNext()) {
                    StockOutgoing next = iterator.next();
                    dtm.addRow(new Object[]{
                        next.getStockOutgoing(),
                        next.getItems().getItemName(),
                        next.getQty(),
                        next.getDate(),
                        next.getCreatedBy()

                    });

                }

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_txtItemSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(StockOutgoing.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.between("date", TxtDateFrom.getText(), txtDateTo.getText()));
            createCriteria.addOrder(Order.desc("stockOutgoing"));
            List<StockOutgoing> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tblItem.getModel();
            dtm.setRowCount(0);
            for (StockOutgoing so : list) {

                dtm.addRow(new Object[]{
                    so.getStockOutgoing(),
                    so.getItems().getItemName(),
                    so.getQty(),
                    so.getDate(),
                    so.getCreatedBy()

                });

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewShopStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField TxtDateFrom;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private com.alee.extended.date.WebDateField txtDateTo;
    private javax.swing.JTextField txtItemSearch;
    // End of variables declaration//GEN-END:variables

    private void loadRec() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(StockOutgoing.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.addOrder(Order.desc("stockOutgoing"));
            List<StockOutgoing> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tblItem.getModel();
            dtm.setRowCount(0);
            for (StockOutgoing so : list) {

                dtm.addRow(new Object[]{
                    so.getStockOutgoing(),
                    so.getItems().getItemName(),
                    so.getQty(),
                    so.getDate(),
                    so.getCreatedBy()

                });

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign(JTable jt) {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jt.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

}
