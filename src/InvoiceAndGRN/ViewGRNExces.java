package InvoiceAndGRN;

import ClassPack.Excel;
import InvoiceAndGRN.withoutBTN.ViewGRNItemsODK;
import ClassPack.PoolManager;
import ORM.Employees;
import ORM.GrnhasExess;
import ORM.RawGrn;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.io.File;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewGRNExces extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> GRN = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static int grnpicBillno;
    static boolean maximized = true;

    public ViewGRNExces() {
        initComponents();
        loadSup();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        //   radioView.setSelected(true);
        comboSupllier.grabFocus();
        tableAlign();
        //loadAll();
//        SetMaximized();
        jTable1.setRowHeight(30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSupllier = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("View Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete GRN");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View GRN Excess");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Select Supplyer");

        comboSupllier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboSupllier.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupllierPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupllierActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "GRN Date", "GRN Total", "Exess Amount", "Supplier", "idGrn"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Filter Using Any Feild");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupllierPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupllierPopupMenuWillBecomeInvisible

        System.out.println("Start Method");

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        if (comboSupllier.getSelectedIndex() != 0) {
            try {
                Session sess = PoolManager.getSessionFactory().openSession();
                Criteria cr = sess.createCriteria(Supplier.class);
                cr.add(Restrictions.eq("isDelete", "Active"));
                cr.add(Restrictions.eq("idSupplier", sup.get(comboSupllier.getSelectedItem().toString())));

                Supplier uniqueResult = (Supplier) cr.uniqueResult();
                System.out.println("Filter Done");
                if (uniqueResult != null) {

                    System.out.println("RS Avaliable");

                    Iterator it = uniqueResult.getRawGrns().iterator();
                    while (it.hasNext()) {
                        RawGrn rawGrn = (RawGrn) it.next();
                        System.out.println("Reding Grn");
                        if (rawGrn.getIsDelete().equals("Active")) {
                            Iterator it2 = rawGrn.getGrnhasExesses().iterator();
                            System.out.println(rawGrn.getGrnhasExesses().size());
                            while (it2.hasNext()) {
                            System.out.println("Looking for exess");
                                GrnhasExess grnhasExess = (GrnhasExess) it2.next();

                                if (!grnhasExess.getExessAmount().equals("00")) {
                                    Vector v = new Vector();
                                    System.out.println("Exess Found");
                                    System.out.println(grnhasExess.getExessAmount());
                                    v.add(grnhasExess.getRawGrn().getRawGrnNo());
                                    v.add(grnhasExess.getRawGrn().getRawGrnDate());
                                    v.add(grnhasExess.getRawGrn().getNetTotal());
                                    //  v.add(grnhasExess.getRawGrn().get);
                                    v.add(grnhasExess.getExessAmount());
                                    v.add(grnhasExess.getRawGrn().getSupplier().getSupplierName());
                                    v.add(grnhasExess.getRawGrn().getIdRawGrn());

                                    dtm.addRow(v);
                                }

                            }

                        }

                    }

                }

                sess.close();

            } catch (Exception e) {

                e.printStackTrace();

            }

        } else {

            dtm.setRowCount(0);
        }


    }//GEN-LAST:event_comboSupllierPopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        grnpicBillno = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        new ViewGRNItemsODK().setVisible(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        int button = evt.getButton();

        if (button == 3) {

            jPopupMenu1.show();

        }


    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
//        grnpicBillno = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
////        new ViewGRNPIC().setVisible(true);
//        int r = jTable1.getSelectedRow();
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria cr = openSession.createCriteria(RawGrn.class);
//            Transaction beginTransaction = openSession.beginTransaction();
//            cr.add(Restrictions.eq("idRawGrn", jTable1.getValueAt(r, 4)));
//            RawGrn uniqueResult = (RawGrn) cr.uniqueResult();
//            uniqueResult.setIsDelete("Deactive");
//            
//            openSession.update(uniqueResult);
//            beginTransaction.commit();
//            loadAll();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void comboSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupllierActionPerformed


    }//GEN-LAST:event_comboSupllierActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            JFileChooser fc = new JFileChooser();
            int showDialog = fc.showDialog(null, "Open");
            File sf = fc.getSelectedFile();
            String path = sf.getAbsolutePath();
            path = path.replace('\\', '/');

            Excel.toExcel(jTable1, new File(path + ".xlsx"));
        } catch (Exception ex) {
            Logger.getLogger(ViewGRNExces.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGRNExces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

//
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Supplier> list = createCriteria.list();
            for (Supplier supplier : list) {

                comboSupllier.addItem(supplier.getSupplierName());
                sup.put(supplier.getSupplierName(), supplier.getIdSupplier());

            }
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
//        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    private void loadAll() {

        try {

        } catch (Exception e) {

            e.printStackTrace();

        }

//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Grn.class);
//            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            List<Grn> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//
//            for (Grn grn : list) {
//
//                GRN.put(grn.getGrnno(), grn.getIdGrn());
//                GRNPIC.put(grn.getGrnno(), grn.getPhoto());
//                dtm.addRow(new Object[]{
//                    grn.getGrnno(),
//                    grn.getGrndate(),
//                    Decimal_Formats.Price(grn.getNettTotal()),
//                    grn.getSupplier().getSupplierName()
//
//                });
//
//            }
//
//            openSession.close();
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
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

}
