package ItemAndStock;

import ClassPack.DB;
import ClassPack.Excel;
import ClassPack.PoolManager;
import MainMenu.Logging;
import ORM.Items;
import ORM.RawItemStock;
import com.alee.laf.WebLookAndFeel;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ViewStockODk extends javax.swing.JFrame {

    static boolean maximized = true;
    private static final int QTY_COL = 3;

    public ViewStockODk() {
        initComponents();
//        maximizeWindow();
        loadStock();
        search();
//        SetMaximized();
        tableAlign();
        //setColor();
        tableStock.setRowHeight(30);
//        tableStock.setAutoCreateRowSorter(true);
    }

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Stock ");
        setMinimumSize(new java.awt.Dimension(830, 480));

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Code", "Item Name", "QTY"
            }
        ));
        jScrollPane1.setViewportView(tableStock);
        if (tableStock.getColumnModel().getColumnCount() > 0) {
            tableStock.getColumnModel().getColumn(0).setMinWidth(0);
            tableStock.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableStock.getColumnModel().getColumn(0).setMaxWidth(0);
            tableStock.getColumnModel().getColumn(2).setMinWidth(500);
            tableStock.getColumnModel().getColumn(2).setPreferredWidth(500);
            tableStock.getColumnModel().getColumn(2).setMaxWidth(500);
            tableStock.getColumnModel().getColumn(3).setMinWidth(100);
            tableStock.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableStock.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Search Here");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("To Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        tableStock.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));

//        Integer i;
//
//        try {
//            DecimalFormat decimalFormat = new DecimalFormat("00");
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Item.class);
//            createCriteria.add(Restrictions.like("iitemName", "%" + txtSearch.getText() + "%"));
//            List<Item> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
//            dtm.setRowCount(0);
//
//            for (Item item : list) {
//                Vector v = new Vector();
//                i = item.getIdItem();
//                //dtm.addRow(new Object[]{item.getIdItem(),item.getItemCode(),item.getIitemName()});
//                v.add(item.getIdItem());
//                v.add(item.getItemCode());
//                v.add(item.getIitemName());
//
//                Criteria createCriteria1 = openSession.createCriteria(Stock.class);
//                createCriteria1.createAlias("item", "i");
//                createCriteria1.add(Restrictions.like("i.idItem", i));
//                List<Stock> list1 = createCriteria1.list();
//
//                for (Stock stock : list1) {
//                    //dtm.addRow(new Object[]{stock.getQty()});
//                    v.add(decimalFormat.format(stock.getQty()));
//                }
//                v.add(item.getCatogory().getCatogoryName());
//                v.add(item.getBrands().getBrandName());
//
//                dtm.addRow(v);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            tableStock.print();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
                try {
            
            JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
       String path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
            
                    Excel.toExcel(tableStock, new File(path+".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewStockODk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStockODk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadStock() {

        DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
        dtm.setRowCount(0);

        DecimalFormat decimalFormat = new DecimalFormat("00");

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Items.class);
//          cr.createAlias("RawItems", "i");
//          cr.add(Restrictions.eq("i.isStock", "YES"));
            cr.add(Restrictions.eq("isDelete", "Active"));

            List<Items> list = cr.list();

            for (Items rawItems : list) {

                Iterator iterator = rawItems.getRawItemStocks().iterator();

                if (rawItems.getIsRaw().equals("YES")) {

                    while (iterator.hasNext()) {
                        RawItemStock next = (RawItemStock) iterator.next();

                        Vector v = new Vector();
                        v.add(rawItems.getIdRawItems());
                        v.add(rawItems.getItemsCode());
                        v.add(rawItems.getItemName());
                        v.add(next.getQty());

                        dtm.addRow(v);

                    }

                }

            }

         
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void maximizeWindow() {

        if (maximized) {

            ViewStockODk.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewStockODk.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    private void tableASC() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableStock.getModel());
        tableStock.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 4;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    private void setColor() {
        try {

//            tableStock.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//                @Override
//                public DefaultTableCellRenderer getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
//                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
//
//                    String qty = (String) table.getModel().getValueAt(row, QTY_COL);
//                    int x = Integer.parseInt(qty);
//                    if (x <= 5 ) {
//                        setBackground(Color.yellow);
//                    } else {
//                        setBackground(Color.WHITE);
//
//                    }
//                    return this;
//
//                }
//
//            });
//            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
//
//            for (int i = 0; i < dtm.getRowCount(); i++) {
//                String qty = tableStock.getValueAt(i, 3).toString();
//                //System.out.println(qty);
//                int q = Integer.parseInt(qty);
//
//                if (q <= 5) {
//                    setBackground(Color.YELLOW);
//                } else {
//                    setBackground(Color.WHITE);
//                }
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void search() {

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tableStock.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);

    }
}
