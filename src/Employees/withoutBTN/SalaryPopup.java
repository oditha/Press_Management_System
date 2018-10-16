/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees.withoutBTN;

import ClassPack.PoolManager;
import Employees.SalaryReport;
import static Employees.SalaryReport.Staff22;
import ORM.AllowanceHasEmployees;
import ORM.Employees;
import ORM.EmployeesHasDeductions;
import ORM.Payments;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Danushka
 */
public class SalaryPopup extends javax.swing.JFrame {
    
    public SalaryPopup() {
        initComponents();
        loadcombo();
        Loadall();
        jComboBox1.setSelectedItem(SalaryReport.Staff);
        /// jComboBox1.setSelectedItem(EmployeeDeductions.Stafffffff);
        // datel();
        ///  System.out.println(PreviosMonth.pre(date));
        System.out.println(SalaryReport.Staff22);
        System.out.println(SalaryReport.Staff);
        System.out.println(SalaryReport.monthYear);
        System.out.println(SalaryReport.monthYear.split("/")[0]+SalaryReport.monthYear.split("/")[1]);
        jComboBox1.setVisible(false);
        LoadAllowance();
        LoadDeduction();
        TotalPayment();
        SetMaximized();
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
    public String date;
    
    Map<String, Integer> hm = new HashMap();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Deductiontable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Paymentstbl = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtbasicsalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTotalAllow = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtServiceCharge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalDeduct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtETF = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtNetSalary = new javax.swing.JTextField();
        txtEPF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSubtotal1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllowanceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Salary report");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Deduction"));

        Deductiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Amount"
            }
        ));
        jScrollPane2.setViewportView(Deductiontable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Payments"));

        Paymentstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Amount"
            }
        ));
        jScrollPane3.setViewportView(Paymentstbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Salary"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select staff");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Basic Salary");

        txtbasicsalary.setEditable(false);
        txtbasicsalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbasicsalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Toltal allowence");

        txtTotalAllow.setEditable(false);
        txtTotalAllow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotalAllow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Service Chages");

        txtServiceCharge.setEditable(false);
        txtServiceCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtServiceCharge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Deduction");

        txtTotalDeduct.setEditable(false);
        txtTotalDeduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotalDeduct.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Payment");

        txtTotalPayment.setEditable(false);
        txtTotalPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotalPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("EPF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ETF");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Net Salary");

        txtETF.setEditable(false);
        txtETF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtETF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtETF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtETFActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtNetSalary.setEditable(false);
        txtNetSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNetSalary.setForeground(new java.awt.Color(51, 204, 0));
        txtNetSalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtEPF.setEditable(false);
        txtEPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEPF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPFActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sub Total");

        txtSubtotal1.setEditable(false);
        txtSubtotal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSubtotal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNetSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtbasicsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtServiceCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtTotalDeduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(txtEPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubtotal1)
                                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(txtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtTotalAllow, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(130, 130, 130))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbasicsalary, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalAllow, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubtotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtServiceCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalDeduct, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtETF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtEPF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNetSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Allownce"));

        AllowanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Amount"
            }
        ));
        jScrollPane5.setViewportView(AllowanceTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
//        LoadAllowance();
//        LoadServiceCharges();
//        LoadDeduction();
//        TotalPayment();
//
//        Setnet();


    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void txtEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPFActionPerformed
        
        Double etf = Double.parseDouble(txtETF.getText());
        Double epf = Double.parseDouble(txtEPF.getText());
        
        Double deduction = Double.parseDouble(txtTotalDeduct.getText());
        Double payment = Double.parseDouble(txtTotalPayment.getText());
        Double sub = Double.parseDouble(txtSubtotal1.getText());
        
        txtTotal.setText("" + (deduction + payment + epf));
        
        txtNetSalary.setText("" + (sub - (deduction + payment + epf)));
        
        txtETF.grabFocus();
    }//GEN-LAST:event_txtEPFActionPerformed

    private void txtETFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtETFActionPerformed
        
        Double etf = Double.parseDouble(txtETF.getText());
        Double epf = Double.parseDouble(txtEPF.getText());
        
        Double deduction = Double.parseDouble(txtTotalDeduct.getText());
        Double payment = Double.parseDouble(txtTotalPayment.getText());
        Double sub = Double.parseDouble(txtSubtotal1.getText());
        
        txtTotal.setText("" + (deduction + payment + etf + epf));
        
        txtNetSalary.setText("" + (sub - (deduction + payment + etf + epf)));
    }//GEN-LAST:event_txtETFActionPerformed
    
    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllowanceTable;
    private javax.swing.JTable Deductiontable;
    private javax.swing.JTable Paymentstbl;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtETF;
    private javax.swing.JTextField txtNetSalary;
    private javax.swing.JTextField txtServiceCharge;
    private javax.swing.JTextField txtSubtotal1;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalAllow;
    private javax.swing.JTextField txtTotalDeduct;
    private javax.swing.JTextField txtTotalPayment;
    private javax.swing.JTextField txtbasicsalary;
    // End of variables declaration//GEN-END:variables

    private void loadcombo() {
        
        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(Employees.class);
        
        createCriteria.add(Restrictions.like("isDelete", "Active"));
        
        List<Employees> list = createCriteria.list();
        
        for (Employees list1 : list) {
            
            jComboBox1.addItem(list1.getEmployeeNic() + "-" + list1.getEmployeName());
            hm.put(list1.getEmployeeNic(), list1.getIdEmployees());
            
        }
        
    }
    
    private void LoadAllowance() {
       
           DecimalFormat decimalFormat = new DecimalFormat("00");

        LocalDate now = LocalDate.of(Integer.parseInt(SalaryReport.monthYear.split("/")[1]), Integer.parseInt(SalaryReport.monthYear.split("/")[0]), 10);// 2015-11-24
        LocalDate earlier = now.plusMonths(1); // 2015-10-24

        earlier.getMonth(); // java.time.Month = OCTOBER
//System.out.println(decimalFormat.format(earlier.getMonth().getValue()));
//earlier.getMonth.getValue(); // 10
        earlier.getYear(); // 
        
        
        DefaultTableModel dtm = (DefaultTableModel) AllowanceTable.getModel();
        dtm.setRowCount(0);
        double alTotal = 0.0;
        try {
            
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(AllowanceHasEmployees.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            cr.add(Restrictions.like("date",  earlier.getYear()+"/"+decimalFormat.format(earlier.getMonth().getValue())+"%"));
            cr.createAlias("employees", "e");
            cr.add(Restrictions.eq("e.idEmployees", Integer.parseInt(SalaryReport.Stafid)));
            List<AllowanceHasEmployees> list = cr.list();
            
            for (AllowanceHasEmployees list1 : list) {
                Vector v = new Vector();
                v.add(list1.getDate());
                v.add(list1.getAllowance().getType());
                v.add(list1.getAmount());
                dtm.addRow(v);
                
//                txtbasicsalary.setText("" + list1.getEmployees().getBasicSalary());
                
            }
            
//            for (int i = 0; i < AllowanceTable.getRowCount(); i++) {
//                
//                alTotal += (double) AllowanceTable.getValueAt(i, 2);
//                
//            }
//            txtTotalAllow.setText("" + alTotal);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }
    
    private void LoadServiceCharges() {
//        double ttl = 0.0;
//        Session sess = PoolManager.getSessionFactory().openSession();
//        Criteria cr = sess.createCriteria(Employees.class);
//        cr.add(Restrictions.eq("isDelete", "Active"));
//        List<Employees> list = cr.list();
//
//        //     System.out.println(list.size());
//        Criteria cr2 = sess.createCriteria(ServiceCharge.class);
//        cr2.add(Restrictions.like("serviceChargeDate", PreviosMonth.pre(date) + "%"));
//        
//        List<ServiceCharge> list1 = cr2.list();
//        
//        for (ServiceCharge list11 : list1) {
//            
//            ttl += list11.getAmount();
//            
//        }
//        
//        txtServiceCharge.setText("" + (ttl / list.size()));
//        Double basic = Double.parseDouble(txtbasicsalary.getText());
//        Double allowance = Double.parseDouble(txtTotalAllow.getText());
//        
//        txtSubtotal1.setText("" + (basic + allowance + (ttl / list.size())));
        
    }
    
    private void LoadDeduction() {
        
           DecimalFormat decimalFormat = new DecimalFormat("00");

        LocalDate now = LocalDate.of(Integer.parseInt(SalaryReport.monthYear.split("/")[1]), Integer.parseInt(SalaryReport.monthYear.split("/")[0]), 10);// 2015-11-24
        LocalDate earlier = now.plusMonths(1); // 2015-10-24

        earlier.getMonth(); // java.time.Month = OCTOBER
//System.out.println(decimalFormat.format(earlier.getMonth().getValue()));
//earlier.getMonth.getValue(); // 10
        earlier.getYear(); // 
        DefaultTableModel model = (DefaultTableModel) Deductiontable.getModel();
        model.setRowCount(0);
        Double ttl = 0.0;
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(EmployeesHasDeductions.class);
         cr.add(Restrictions.like("date",  earlier.getYear()+"/"+decimalFormat.format(earlier.getMonth().getValue())+"%"));
            cr.createAlias("employees", "e");
            cr.add(Restrictions.eq("e.idEmployees", Integer.parseInt(SalaryReport.Stafid)));
        System.out.println(earlier.getYear()+"/"+decimalFormat.format(earlier.getMonth().getValue())+SalaryReport.Stafid);
        List<EmployeesHasDeductions> list = cr.list();
        
        for (EmployeesHasDeductions list1 : list) {
            Vector v = new Vector();
            v.add(list1.getDate());
            v.add(list1.getDeductions().getType());
            v.add(list1.getAmount());
            model.addRow(v);
         //   ttl += list1.getAmount();
            
        }
        
      //  txtTotalDeduct.setText("" + ttl);
        
    }
    
    private void TotalPayment() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        System.out.println(SalaryReport.monthYear.split("/")[1]+ Integer.parseInt(SalaryReport.monthYear.split("/")[0])+ "%");
        Double ttl = 0.0;
        DefaultTableModel dtm = (DefaultTableModel) Paymentstbl.getModel();
        dtm.setRowCount(0);
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(ORM.Payments.class);
        cr.createAlias("employees", "e");
         cr.add(Restrictions.eq("e.idEmployees", Integer.parseInt(SalaryReport.Stafid)));
         int month=Integer.parseInt(SalaryReport.monthYear.split("/")[0]);
         System.out.println(decimalFormat.format(month));
        //cr.add(Restrictions.like("e.idEmployees", hm.get(jComboBox1.getSelectedItem().toString().split("-")[0])));
        cr.add(Restrictions.like("date", SalaryReport.monthYear.split("/")[1]+"/"+decimalFormat.format(month) + "%"));
        List<Payments> list = cr.list();
        for (Payments list1 : list) {
            Vector v = new Vector();
            v.add(list1.getDate());
            v.add(list1.getDescription());
            v.add(list1.getAmount());
            dtm.addRow(v);
            
            ttl += list1.getAmount();
        }
        
       //txtTotalPayment.setText("" + ttl);
        
    }
    
    private void Setnet() {
        
//        Double deduction = Double.parseDouble(txtTotalDeduct.getText());
//        Double payment = Double.parseDouble(txtTotalPayment.getText());
//        Double sub = Double.parseDouble(txtSubtotal1.getText());
//        
//        txtTotal.setText("" + (deduction + payment));
//        
//        txtNetSalary.setText("" + (sub - (deduction + payment)));
        
    }
    
    private void Loadall() {
        
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(ORM.Salary.class);
        cr.add(Restrictions.eq("idSalary", Integer.parseInt(Staff22)));
        
        List<ORM.Salary> list = cr.list();
        
        for (ORM.Salary list1 : list) {
            Double basic = list1.getEmployees().getBasicSalary();
            Double Tal = list1.getTotalAllowance();
            Double TServicecharge = Double.parseDouble(list1.getServiceCharge());
            
            txtbasicsalary.setText("" + list1.getEmployees().getBasicSalary());
            txtTotalAllow.setText("" + list1.getTotalAllowance());
            txtServiceCharge.setText("" + list1.getServiceCharge());
            txtSubtotal1.setText("" + (basic + Tal + TServicecharge));
            
            txtTotalDeduct.setText("" + list1.getTotalDeductions());
            txtTotalPayment.setText("" + list1.getTotalPayments());
            txtEPF.setText("" + list1.getEpf());
            txtETF.setText("" + list1.getEtf());
            txtTotal.setText("" + (list1.getTotalDeductions() + list1.getTotalPayments() + list1.getEpf() + list1.getEtf()));
            Double net = Double.parseDouble(txtSubtotal1.getText()) - Double.parseDouble(txtTotal.getText());
            txtNetSalary.setText("" + net);
        }
        
    }
    
}
