package OrdersAndQuatations;

import InvoiceAndGRN.withoutBTN.*;
import ClassPack.Excel;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import InvoiceAndGRN.ViewInvoiceODK_DONTUSE;
import ORM.Invoice;
import ORM.InvoiceItems;
import ORM.OrderItems;
import ORM.Orders;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewOrderItemODK extends javax.swing.JFrame {

    HashMap<String, Integer> product = new HashMap();

    public static String Name;
    public static Integer idInvItem;
    public static Integer idItem;

    public ViewOrderItemODK() {
        initComponents();
        loadData();
        tableAlign();
        // jTable1.setComponentPopupMenu(jPopupMenu1);
//        SetMaximized();
        jTable1.setRowHeight(30);

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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Delete Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Order Item ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Unit Price", "QTY", "Net Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("To Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        int rows = jTable1.getRowCount();

        if (rows != 1) {

            int i = JOptionPane.showConfirmDialog(rootPane, "Are You Sure Want to Delete?");
            Double nettotal = 0.0;
            Double Subtotal = 0.0;
            if (i == 0) {
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(InvoiceItems.class);
                Transaction tr = sess.beginTransaction();
                cr.add(Restrictions.eq("idInvoiceItems", jTable1.getValueAt(jTable1.getSelectedRow(), 6)));
                InvoiceItems uniqueResult = (InvoiceItems) cr.uniqueResult();

                if (uniqueResult != null) {
                    nettotal = uniqueResult.getInvoice().getNetTotal();
                    Subtotal = uniqueResult.getInvoice().getSubtotal();

                    uniqueResult.setIsDelete("Deactive");
                    uniqueResult.getInvoice().setNetTotal((nettotal - uniqueResult.getNetTotalItem()));
                    uniqueResult.getInvoice().setSubtotal((Subtotal - uniqueResult.getNetTotalItem()));
                    Iterator it = uniqueResult.getItems().getRawItemStocks().iterator();

                    while (it.hasNext()) {

                        RawItemStock ris = (RawItemStock) it.next();

                        if (ris.getItems().getIsService().equals("YES")) {

                            ris.setQty(ris.getQty() + (uniqueResult.getQty()));

                        }

                    }

                    tr.commit();

                    if (tr.wasCommitted()) {

                        sess.update(uniqueResult);
                        NotificationPopup.Delete();
                        loadData();
                        new InvoiceAndGRN.ViewInvoiceODK_DONTUSE().dispose();
                        new InvoiceAndGRN.ViewInvoiceODK_DONTUSE().setVisible(true);

                        this.dispose();
                        //  new ViewInvoiceODK().viewAll();
                    }

                }

            }

        } else {

            JOptionPane.showMessageDialog(rootPane, "invoice has only 1 item view invoice  Pleace goto invoice and delete the invoice ");

        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(jTable1, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewOrderItemODK.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrderItemODK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadData() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        ViewCusOrderUdayaNew viewCusOrderUdaya = new ViewCusOrderUdayaNew();

        try {
            System.out.println(new ViewInvoiceODK_DONTUSE().InvoiceNO);
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(ORM.Orders.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            cr.add(Restrictions.eq("idOrders", Integer.parseInt(viewCusOrderUdaya.InvoiceNO)));
            List<Orders> list = cr.list();

            for (Orders Orders : list) {

                Iterator it = Orders.getOrderItemses().iterator();

                while (it.hasNext()) {
                    OrderItems next = (OrderItems) it.next();

                    Vector v = new Vector();
                    v.add(next.getItems().getItemsCode());
                    v.add(next.getItems().getItemName());
                    v.add(next.getUnitPrice());
                    v.add(next.getQty());
                    v.add(next.getNetTotalOrdersItem());
                    dtm.addRow(v);
                }

            }
            sess.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {
//
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
//        jTable1.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
//        jTable1.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);

    }

}
