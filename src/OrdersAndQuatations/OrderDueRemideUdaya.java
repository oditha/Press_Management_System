package OrdersAndQuatations;

import ClassPack.Decimal_Formats;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import ORM.OrderItems;
import ORM.OrderStatus;
import ORM.Orders;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class OrderDueRemideUdaya extends javax.swing.JFrame {

    static boolean maximized = true;

    public OrderDueRemideUdaya() {
        initComponents();
//        maximizeWindow();
        tableDecor();
        webDeliverDate.setText(dateForm.currentdate());
        loadOrder();
        tableDESC();
        jTable1.setRowHeight(25);
//        jTable2.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        webDeliverDate = new com.alee.extended.date.WebDateField();
        btnFilter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFilter1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Order due reminder");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Filter by delivery date");

        webDeliverDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDeliverDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webDeliverDateMouseClicked(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Order No", "Customer", "Order Date", "Delivery Date", "Total Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(250);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(250);
        }

        btnFilter1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter1.setText("Print");
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1229, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webDeliverDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void webDeliverDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDeliverDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webDeliverDateMouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
//            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
//            dtm.setRowCount(0);
            int x = jTable1.getSelectedRow();
            int y = Integer.parseInt(jTable1.getValueAt(x, 0).toString());

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(OrderItems.class);
            createCriteria.createAlias("orders", "o");
            createCriteria.add(Restrictions.eq("o.idOrders", y));

            List<OrderItems> list = createCriteria.list();

            for (OrderItems oi : list) {
//                dtm.addRow(new Object[]{oi.getItems().getItemName(), oi.getUnitPrice(), Decimal_Formats.Qty(oi.getQty()), oi.getNetTotalOrdersItem()});
            }
            
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        try {
            //SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Calendar c = Calendar.getInstance();
            c.setTime(webDeliverDate.getDate());
            c.add(Calendar.DAY_OF_YEAR, 3);

            String newDate = new SimpleDateFormat("yyyy/MM/dd").format(c.getTime());
            System.out.println(newDate);

            Session openSession = PoolManager.getSessionFactory().openSession();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            Criteria createCriteria = openSession.createCriteria(Orders.class);
            createCriteria.add(Restrictions.between("deliveryDate", webDeliverDate.getText(), newDate));
            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<Orders> list = createCriteria.list();

            for (Orders orders : list) {
                dtm.addRow(new Object[]{orders.getIdOrders(), orders.getOrderNo(), orders.getCustomer().getName(), orders.getOrderDate(), orders.getDeliveryDate(), orders.getOrderTotal()});
            }
            
            openSession.close();
//            DefaultTableModel dtm1 = (DefaultTableModel) jTable2.getModel();
//            dtm1.setRowCount(0);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed

        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(OrderDueRemideUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFilter1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDueRemideUdaya().setVisible(true);
            }
        });
    }

    private void maximizeWindow() {

        if (maximized) {

            OrderDueRemideUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            OrderDueRemideUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnFilter1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static com.alee.extended.date.WebDateField webDeliverDate;
    // End of variables declaration//GEN-END:variables

    private void loadOrder() {

        try {
            //SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Calendar c = Calendar.getInstance();
            //c.setTime(webDeliverDate.getDate());
            c.add(Calendar.DAY_OF_YEAR, 5);

            String newDate = new SimpleDateFormat("yyyy/MM/dd").format(c.getTime());
            //System.out.println(s);

            Session openSession = PoolManager.getSessionFactory().openSession();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            Criteria createCriteria = openSession.createCriteria(OrderStatus.class);
            createCriteria.createAlias("orders", "or");
            createCriteria.add(Restrictions.like("status", "Pending"));
            createCriteria.add(Restrictions.like("isDelete", "Active"));
            createCriteria.add(Restrictions.between("or.deliveryDate", webDeliverDate.getText(), newDate));

            List<OrderStatus> list = createCriteria.list();

            for (OrderStatus orders : list) {
                dtm.addRow(new Object[]{orders.getOrders().getIdOrders(), orders.getOrders().getOrderNo(), orders.getOrders().getCustomer().getName(), orders.getOrders().getOrderDate(), orders.getOrders().getDeliveryDate(), orders.getOrders().getOrderTotal()});
            }
            
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(dtcr);



    }

    private void tableDESC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 4;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();

    }
}
