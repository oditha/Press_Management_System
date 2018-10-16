/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees.withoutBTN;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import Employees.EmployeeAllowance;
import ORM.AllowanceHasEmployees;
import ORM.CashBook;
import ORM.Employees;
import ORM.EmployeesHasDeductions;
//import ORM.InvoiceCommissons;
import ORM.Payments;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Danushka
 */
public class Salary extends javax.swing.JFrame {

    public Salary() {
        initComponents();
        loadcombo();
        txtETF.setText("0.0");
        txtEPF.setText("0.0");
        jComboBox1.setSelectedItem(EmployeeDeductions.Stafffffff);
        // datel();
        ///  System.out.println(PreviosMonth.pre(date));
        SetMaximized();
       // txtSubtotal1.setText("0.0");
        jComboBox1.setEnabled(false);
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
        btnPay = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSubtotal1 = new javax.swing.JTextField();
        webdateFrom = new com.alee.extended.date.WebDateField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        webdateTo = new com.alee.extended.date.WebDateField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllowanceTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ServicechargeTBL = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payroll");

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        txtbasicsalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Toltal allowence");

        txtTotalAllow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Service Chages");

        txtServiceCharge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total Deduction");

        txtTotalDeduct.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total Payment");

        txtTotalPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("EPF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ETF");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Net Salary");

        txtETF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtETF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtETFActionPerformed(evt);
            }
        });
        txtETF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtETFKeyTyped(evt);
            }
        });

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtNetSalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtEPF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPFActionPerformed(evt);
            }
        });
        txtEPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEPFKeyTyped(evt);
            }
        });

        btnPay.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPay.setText("PAY");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancel.setText("Calculate");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sub Total");

        txtSubtotal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        webdateFrom.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateFromMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setText("To");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel13.setText("From");

        btnFilter.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        webdateTo.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webdateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webdateToMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 222, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNetSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtbasicsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtServiceCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtTotalDeduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtEPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotal1)
                            .addComponent(txtTotalPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtETF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtTotalAllow, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(302, 302, 302))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(webdateTo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(webdateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(webdateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(webdateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbasicsalary, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalAllow, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtServiceCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalDeduct, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtETF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtEPF, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNetSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Alllowance", jPanel5);

        ServicechargeTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Invoice No", "Amount"
            }
        ));
        jScrollPane6.setViewportView(ServicechargeTBL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Service Charges", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

        boolean b = false;
        java.awt.Component[] cp = jPanel4.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;
                    NotificationPopup.fillFeilds();
                    break;

                } else {

                    b = false;

                }

            }
        }

        if (b == false) {

            if (jComboBox1.getSelectedIndex() != 0) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction tr = openSession.beginTransaction();

                    Employees employees = new ORM.Employees();
                    employees.setIdEmployees(hm.get(jComboBox1.getSelectedItem().toString().split("-")[0]));

                    ORM.Salary s = new ORM.Salary();
                    s.setBasicSalary(Double.parseDouble(txtbasicsalary.getText()));
                    s.setTotalAllowance(Double.parseDouble(txtTotalAllow.getText()));
                    s.setServiceCharge(txtServiceCharge.getText());
                    s.setTotalDeductions(Double.parseDouble(txtTotalDeduct.getText()));
                    s.setTotalPayments(Double.parseDouble(txtTotalPayment.getText()));
                    s.setDate(dateForm.currentdate());
                    s.setEmployees(employees);
                    s.setEtf(Double.parseDouble(txtETF.getText()));
                    s.setEpf(Double.parseDouble(txtEPF.getText()));
                    s.setNetTotal(Double.parseDouble(txtNetSalary.getText()));
                    s.setIsDelete("Active");

                    openSession.save(s);
                    CashBook cashBook = new CashBook();

                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Salary Paid" + jComboBox1.getSelectedItem().toString().split("-")[0]);
                    cashBook.setExpence(Double.parseDouble(txtNetSalary.getText()));
                    cashBook.setIncome(0.0);
                    openSession.save(cashBook);
                    tr.commit();
                    if (tr.wasCommitted()) {

                        NotificationPopup.save();
                        this.dispose();
                        new EmployeeAllowance().setVisible(true);

                    }

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }

        }

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
      //   Double etf = Double.parseDouble(txtETF.getText());
//        Double epf = Double.parseDouble(txtEPF.getText());
//
//        Double deduction = Double.parseDouble(txtTotalDeduct.getText());
//        Double payment = Double.parseDouble(txtTotalPayment.getText());
//        Double sub = Double.parseDouble(txtSubtotal1.getText());
//
//        txtTotal.setText("" + (deduction + payment + epf));
//
//        txtNetSalary.setText("" + (sub - (deduction + payment + epf)));
//
//        txtETF.grabFocus();
        
        
        
        
          Double etf = Double.parseDouble(txtETF.getText());
        Double epf = Double.parseDouble(txtEPF.getText());

        Double deduction = Double.parseDouble(txtTotalDeduct.getText());
        Double payment = Double.parseDouble(txtTotalPayment.getText());
        Double sub = Double.parseDouble(txtSubtotal1.getText());

        txtTotal.setText("" + (deduction + payment + etf + epf));

        txtNetSalary.setText("" + (sub - (deduction + payment + etf + epf)));
        
        
        
        
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible

        
        
       
        
        
        
        

    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void txtEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPFActionPerformed

//      
    }//GEN-LAST:event_txtEPFActionPerformed

    private void txtETFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtETFActionPerformed

       
    }//GEN-LAST:event_txtETFActionPerformed

    private void txtEPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEPFKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtEPFKeyTyped

    private void txtETFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtETFKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtETFKeyTyped

    private void webdateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateFromMouseClicked

    }//GEN-LAST:event_webdateFromMouseClicked

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed

        LoadAllowance();
//        LoadServiceCharges();
        LoadDeduction();
        TotalPayment();

        Setnet();


    }//GEN-LAST:event_btnFilterActionPerformed

    private void webdateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webdateToMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_webdateToMouseClicked

    public static void main(String args[]) {
        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllowanceTable;
    private javax.swing.JTable Deductiontable;
    private javax.swing.JTable Paymentstbl;
    private javax.swing.JTable ServicechargeTBL;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPay;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private com.alee.extended.date.WebDateField webdateFrom;
    private com.alee.extended.date.WebDateField webdateTo;
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
//        DefaultTableModel dtm = (DefaultTableModel) AllowanceTable.getModel();
//        dtm.setRowCount(0);
//        double alTotal = 0.0;
//        try {
//
//            Session sess = PoolManager.getSessionFactory().openSession();
//            Criteria cr = sess.createCriteria(AllowanceHasEmployees.class);
//            cr.add(Restrictions.eq("isDelete", "Active"));
//            //  cr.add(Restrictions.eq("date", dateForm.currentdate()));
//            cr.add(Restrictions.between("date", webdateFrom.getText(), webdateTo.getText()));
//            cr.createAlias("employees", "e");
//            cr.add(Restrictions.eq("e.idEmployees", hm.get(jComboBox1.getSelectedItem().toString().split("-")[0])));
//            List<AllowanceHasEmployees> list = cr.list();
//
//            for (AllowanceHasEmployees list1 : list) {
//                Vector v = new Vector();
//                v.add(list1.getDate());
//                v.add(list1.getAllowance().getType());
//                v.add(list1.getAmount());
//                dtm.addRow(v);
//
//                txtbasicsalary.setText("" + list1.getEmployees().getBasicSalary());
//
//            }
//
//            for (int i = 0; i < AllowanceTable.getRowCount(); i++) {
//
//                alTotal += (double) AllowanceTable.getValueAt(i, 2);
//
//            }
//            txtTotalAllow.setText("" + alTotal);
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        }
//
//    }
//
//    private void LoadServiceCharges() {
//        double ttl = 0.0;
//        DefaultTableModel dtm=(DefaultTableModel) ServicechargeTBL.getModel();
//        dtm.setRowCount(0);
//        Session sess = PoolManager.getSessionFactory().openSession();
//        Criteria cr = sess.createCriteria(InvoiceCommissons.class);
//       // cr.add(Restrictions.eq("", date))
//        cr.createAlias("employees", "e");
//        cr.add(Restrictions.between("paidDate", webdateFrom.getText(), webdateTo.getText()));
//        List<InvoiceCommissons> list = cr.list();
//        
//        for (InvoiceCommissons invoiceCommissons : list) {
//            Vector v = new Vector();
//            v.add(invoiceCommissons.getPaidDate());
//            v.add(invoiceCommissons.getInvoice().getInvoiceNo());
//            v.add(invoiceCommissons.getCommAmount());
//            dtm.addRow(v);
//            ttl+=invoiceCommissons.getCommAmount();
//            
//            
//            
//        }
//        
//        
//        Double basic = Double.parseDouble(txtbasicsalary.getText());
//        Double allowance = Double.parseDouble(txtTotalAllow.getText());
//txtServiceCharge.setText(""+ttl);
//        txtSubtotal1.setText("" + (basic + allowance + ttl));
}

    private void LoadDeduction() {
        DefaultTableModel model = (DefaultTableModel) Deductiontable.getModel();
        model.setRowCount(0);
        Double ttl = 0.0;
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(EmployeesHasDeductions.class);
        cr.createAlias("employees", "e");
        cr.add(Restrictions.eq("e.idEmployees", hm.get(jComboBox1.getSelectedItem().toString().split("-")[0])));
        //  cr.add(Restrictions.eq("date", dateForm.currentdate()));
        cr.add(Restrictions.between("date", webdateFrom.getText(), webdateTo.getText()));
        List<EmployeesHasDeductions> list = cr.list();

        for (EmployeesHasDeductions list1 : list) {
            Vector v = new Vector();
            v.add(list1.getDate());
            v.add(list1.getDeductions().getType());
            v.add(list1.getAmount());
            model.addRow(v);
            ttl += list1.getAmount();

        }

        txtTotalDeduct.setText("" + ttl);

    }

    private void TotalPayment() {

        Double ttl = 0.0;
        DefaultTableModel dtm = (DefaultTableModel) Paymentstbl.getModel();
        dtm.setRowCount(0);
        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(ORM.Payments.class);
        cr.createAlias("employees", "e");
        cr.add(Restrictions.like("e.idEmployees", hm.get(jComboBox1.getSelectedItem().toString().split("-")[0])));
        //   cr.add(Restrictions.like("date", PreviosMonth.pre(date) + "%"));
        cr.add(Restrictions.between("date", webdateFrom.getText(), webdateTo.getText()));
        List<Payments> list = cr.list();
        for (Payments list1 : list) {
            Vector v = new Vector();
            v.add(list1.getDate());
            v.add(list1.getDescription());
            v.add(list1.getAmount());
            dtm.addRow(v);

            ttl += list1.getAmount();
        }

        txtTotalPayment.setText("" + ttl);

    }

    private void Setnet() {

        Double deduction = 0.0;
         deduction = Double.parseDouble(txtTotalDeduct.getText());
        Double payment = 0.0;
         payment = Double.parseDouble(txtTotalPayment.getText());
        Double sub = 0.0;

        sub = Double.parseDouble(txtSubtotal1.getText());

        txtTotal.setText("" + (deduction + payment));

        txtNetSalary.setText("" + (sub - (deduction + payment)));

    }

}
