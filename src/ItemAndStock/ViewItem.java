package ItemAndStock;

import ClassPack.Excel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ORM.Items;
import ORM.RawItemInfo;
import com.alee.laf.WebLookAndFeel;
import java.awt.print.PrinterException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewItem extends javax.swing.JFrame {

    public ViewItem() {
        initComponents();
        loadItems();
        tableASC(tblItem);
        tableASC(tblService);
        tableAlign(tblItem);
        tableAlign(tblService);
        tblItem.setComponentPopupMenu(PopupItem);
        tblService.setComponentPopupMenu(PopupService);
        tblItem.setRowHeight(25);
        tblService.setRowHeight(25);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupItem = new javax.swing.JPopupMenu();
        EditItem = new javax.swing.JMenuItem();
        DeleteItem = new javax.swing.JMenuItem();
        PopupService = new javax.swing.JPopupMenu();
        EditService = new javax.swing.JMenuItem();
        DeleteService = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtViewItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtViewService = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        EditItem.setText("Edit Item");
        EditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditItemActionPerformed(evt);
            }
        });
        PopupItem.add(EditItem);

        DeleteItem.setText("Delete Item");
        DeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemActionPerformed(evt);
            }
        });
        PopupItem.add(DeleteItem);

        EditService.setText("Edit Service");
        EditService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditServiceActionPerformed(evt);
            }
        });
        PopupService.add(EditService);

        DeleteService.setText("Delete Service");
        DeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteServiceActionPerformed(evt);
            }
        });
        PopupService.add(DeleteService);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Item and Services");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtViewItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtViewItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewItemKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search Item");

        tblItem.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Category", "Unit Price", "Selling Price", "IDItem", "Reorder Lv"
            }
        ));
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(4).setMinWidth(0);
            tblItem.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("To Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)
                        .addComponent(jButton3)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Item View", jPanel1);

        txtViewService.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtViewService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtViewServiceKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search Service");

        tblService.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Category", "Unit Price", "Selling Price", "idItem"
            }
        ));
        jScrollPane3.setViewportView(tblService);
        if (tblService.getColumnModel().getColumnCount() > 0) {
            tblService.getColumnModel().getColumn(4).setMinWidth(0);
            tblService.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblService.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtViewService, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(7, 7, 7))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtViewService, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Service View", jPanel2);

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

    private void txtViewItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewItemKeyReleased

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("isService", "NO"));
            createCriteria.add(Restrictions.like("itemName", "%" + txtViewItem.getText() + "%"));

            List<Items> list = createCriteria.list();

            DefaultTableModel dtmItem = (DefaultTableModel) tblItem.getModel();
            dtmItem.setRowCount(0);

            for (Items items : list) {

                if (items.getIsService().equals("NO")) {

                    dtmItem.addRow(new Object[]{
                        items.getItemName(),
                        items.getItemCatagory().getCatagoryName(),
                        items.getItemsUnitPrice(),
                        items.getItemsSellingPrice(),
                        items.getIdRawItems()

                    });

                }

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_txtViewItemKeyReleased

    private void txtViewServiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewServiceKeyReleased

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            createCriteria.add(Restrictions.eq("isService", "YES"));
            createCriteria.add(Restrictions.like("itemName", "%" + txtViewService.getText() + "%"));

            List<Items> list = createCriteria.list();

            DefaultTableModel dtmItem = (DefaultTableModel) tblService.getModel();
            dtmItem.setRowCount(0);

            for (Items items : list) {

                if (items.getIsService().equals("YES")) {

                    dtmItem.addRow(new Object[]{
                        items.getItemName(),
                        items.getItemCatagory().getCatagoryName(),
                        items.getItemsUnitPrice(),
                        items.getItemsSellingPrice(),
                        items.getIdRawItems()

                    });

                }

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_txtViewServiceKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(tblService, new File(path + ".xlsx"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tblService.print();
        } catch (PrinterException ex) {
            // Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(tblItem, new File(path + ".xlsx"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            tblItem.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ViewItem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemActionPerformed

        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {
                int x = tblItem.getSelectedRow();
                String ItemID = (tblItem.getValueAt(x, 4).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Items.class);

                createCriteria.add(Restrictions.eq("idRawItems", Integer.parseInt(ItemID)));

                Items item = (Items) createCriteria.uniqueResult();

                item.setIsDelete("Deactive");

                openSession.update(item);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.Delete();

                loadItems();

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_DeleteItemActionPerformed

    private void DeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteServiceActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {
                int x = tblService.getSelectedRow();
                String ItemID = (tblService.getValueAt(x, 4).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Items.class);

                createCriteria.add(Restrictions.eq("idRawItems", Integer.parseInt(ItemID)));

                Items item = (Items) createCriteria.uniqueResult();

                item.setIsDelete("Deactive");

                openSession.update(item);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.Delete();

                loadItems();

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DeleteServiceActionPerformed

    private void EditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditItemActionPerformed
       
        ItemAndStock.EditItem editItem = new EditItem();
        
        editItem.loadItem(Integer.parseInt(tblItem.getValueAt(tblItem.getSelectedRow(), 4).toString()));
        editItem.setVisible(true);
        
        
    }//GEN-LAST:event_EditItemActionPerformed

    private void EditServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditServiceActionPerformed
        
        ItemAndStock.EditService editService = new EditService();
        
        editService.loadItem(Integer.parseInt(tblService.getValueAt(tblService.getSelectedRow(), 4).toString()));
        editService.setVisible(true);
        
    }//GEN-LAST:event_EditServiceActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeleteItem;
    private javax.swing.JMenuItem DeleteService;
    private javax.swing.JMenuItem EditItem;
    private javax.swing.JMenuItem EditService;
    private javax.swing.JPopupMenu PopupItem;
    private javax.swing.JPopupMenu PopupService;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable tblItem;
    private static javax.swing.JTable tblService;
    private javax.swing.JTextField txtViewItem;
    private javax.swing.JTextField txtViewService;
    // End of variables declaration//GEN-END:variables

    public static void loadItems() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();

            DefaultTableModel dtmItem = (DefaultTableModel) tblItem.getModel();
            dtmItem.setRowCount(0);
            DefaultTableModel dtmServ = (DefaultTableModel) tblService.getModel();
            dtmServ.setRowCount(0);

            for (Items items : list) {

                if (items.getIsService().equals("NO")) {
                    String Re = "0";
                    Iterator<RawItemInfo> iterator = items.getRawItemInfos().iterator();
                    while (iterator.hasNext()) {
                        RawItemInfo next = iterator.next();
                        Re = next.getMinQty();

                    }

                    dtmItem.addRow(new Object[]{
                        items.getItemName(),
                        items.getItemCatagory().getCatagoryName(),
                        items.getItemsUnitPrice(),
                        items.getItemsSellingPrice(),
                        items.getIdRawItems(),
                        Re
                    });

                } else {

                    dtmServ.addRow(new Object[]{
                        items.getItemName(),
                        items.getItemCatagory().getCatagoryName(),
                        items.getItemsUnitPrice(),
                        items.getItemsSellingPrice(),
                        items.getIdRawItems()

                    });

                }

            }
            System.out.println("Start Close");
            openSession.close();
            System.out.println("End Close");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableASC(JTable jt) {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jt.getModel());
        jt.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 1;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }

    private void tableAlign(JTable jt) {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jt.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        

    }

}
