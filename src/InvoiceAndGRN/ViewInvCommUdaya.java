package InvoiceAndGRN;

import ClassPack.Decimal_Formats;
import ClassPack.PoolManager;
import ORM.EmployeesHasJobroals;

import com.alee.laf.WebLookAndFeel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

class ViewInvCommUdaya extends javax.swing.JFrame {

    Map<String, Integer> emp = new HashMap();

    public ViewInvCommUdaya() {
        initComponents();
        loadEmployee();
        setTotal();
        tableDecor();
        tableASC();
        jTable1.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        txtEndDate = new com.alee.extended.date.WebDateField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View invoice commissions");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item Name", "Total item's commission"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(500);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(500);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
        }

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Total Commision");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0.00");

        jComboBox1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select employee--" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        TxtStartDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });

        txtEndDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtEndDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEndDateMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setText("LOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 97, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
//        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//        dtm.setRowCount(0);
//        try {
//            if (TxtStartDate.getText().equals("")) {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(InvoiceCommissons.class);
//                createCriteria.add(Restrictions.like("isDelete", "Active"));
//                createCriteria.createAlias("employees", "em");
//                createCriteria.add(Restrictions.eq("em.idEmployees", emp.get(jComboBox1.getSelectedItem().toString().split(" - ")[1])));
//
//                List<InvoiceCommissons> list = createCriteria.list();
//
//                for (InvoiceCommissons ic : list) {
//                    dtm.addRow(new Object[]{ic.getPaidDate(), ic.getRawItems().getItemName(), ic.getCommAmount()});
//                }
//            } else {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(InvoiceCommissons.class);
//                createCriteria.add(Restrictions.like("isDelete", "Active"));
//                createCriteria.createAlias("employees", "em");
//                createCriteria.add(Restrictions.eq("em.idEmployees", emp.get(jComboBox1.getSelectedItem().toString().split(" - ")[1])));
//                createCriteria.add(Restrictions.between("paidDate", TxtStartDate.getText(), txtEndDate.getText()));
//                
//                List<InvoiceCommissons> list = createCriteria.list();
//
//                for (InvoiceCommissons ic : list) {
//                    dtm.addRow(new Object[]{ic.getPaidDate(), ic.getRawItems().getItemName(), ic.getCommAmount()});
//                }
//            }
//
//            setTotal();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtEndDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEndDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//        dtm.setRowCount(0);
//        jComboBox1.setSelectedIndex(0);
//
//        try {
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(InvoiceCommissons.class);
//            createCriteria.add(Restrictions.like("isDelete", "Active"));
//            createCriteria.add(Restrictions.between("paidDate", TxtStartDate.getText(), txtEndDate.getText()));
//
//            List<InvoiceCommissons> list = createCriteria.list();
//
//            for (InvoiceCommissons ic : list) {
//                dtm.addRow(new Object[]{ic.getPaidDate(), ic.getRawItems().getItemName(), ic.getCommAmount()});
//            }
//            setTotal();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvCommUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static com.alee.extended.date.WebDateField txtEndDate;
    // End of variables declaration//GEN-END:variables

    private void loadEmployee() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(EmployeesHasJobroals.class);
            createCriteria.add(Restrictions.like("isDelete", "Active"));

            List<EmployeesHasJobroals> list = createCriteria.list();

            for (EmployeesHasJobroals ej : list) {
                jComboBox1.addItem(ej.getEmployees().getEmployeName() + " - " + ej.getEmployees().getEmployeeContactNo());
                emp.put(ej.getEmployees().getEmployeeContactNo(), ej.getEmployees().getIdEmployees());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setTotal() {

        Double sum = 0.00;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            double getsum = Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            sum = getsum + sum;
            jLabel2.setText(Decimal_Formats.Price(sum));
        }

    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(dtcr);
    }

    private void tableASC() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();

        int columnIndexToSort = 0;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }
}
