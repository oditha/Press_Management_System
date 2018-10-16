package InvoiceAndGRN;

import ClassPack.Decimal_Formats;
import ClassPack.InvoiceDataHolder;
import ClassPack.InvoiceDataHolderOther;
import ClassPack.ItemDataHolderOrder;
import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import Customers.AddCusInvoicePaymentsUdaya;
import MainMenu.Logging;
import ORM.CashBook;
import ORM.Customer;
import ORM.CustomerHasInvoice;
import ORM.Invoice;
import ORM.InvoiceItems;
import ORM.InvoicePayment;
import ORM.InvoicePaymentInfo;
import ORM.Items;
import ORM.OrderItems;
import ORM.OrderStatus;
import ORM.Orders;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CreateInvoice extends javax.swing.JFrame {

    public static Map<String, Integer> cust = new HashMap();
    public static Map<String, ItemDataHolderOrder> itmNames = new HashMap();

    int idCustomer;
    int idOrder;

    public CreateInvoice() {
        initComponents();
        genOrderNO();
        SearchbleCustomers();
        SearchbleItem();
        SearchbleItemOR();
        tableAlign(tblOR);
        tableAlign(tblInvoice);
        TxtInvoiceDate.setText(dateForm.currentdate());
        tblInvoice.setComponentPopupMenu(jPopupMenu1);
        tblOR.setComponentPopupMenu(jPopupMenu2);
        ComboCustomer.grabFocus();
        tblInvoice.setRowHeight(25);
        tblOR.setRowHeight(25);
        chkDialog.setSelected(false);
        chkPrint.setSelected(true);
        chkPreview.setSelected(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ComboCustomer = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtInvoiceDate = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        ComboItems = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        btnAddCus = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPaidAmount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnSaveInvoice = new javax.swing.JButton();
        txtCashTendred = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPreBalance = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtOrderNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInvoiceNoOR = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUnitPriceORSer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtQTyORSer = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOR = new javax.swing.JTable();
        txtTotalOR = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtDiscountOR = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNetTotalOR = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPaidAmountOR = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCashTenderedOR = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtBalanceOR = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnSaveInvoiceOR = new javax.swing.JButton();
        PrevoiusBalance = new javax.swing.JTextField();
        ComboItemsOR = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtQTYOR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPriceOR = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtAdvancePayment = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        chkPrint = new javax.swing.JCheckBoxMenuItem();
        chkPreview = new javax.swing.JCheckBoxMenuItem();
        chkDialog = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("Remove Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Remove All");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Remove Selected");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Invoice");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ComboCustomer.setEditable(true);
        ComboCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Customer *");

        txtInvoiceNo.setEditable(false);
        txtInvoiceNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Invoice No");

        TxtInvoiceDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtInvoiceDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtInvoiceDateMouseClicked(evt);
            }
        });
        TxtInvoiceDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtInvoiceDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Date");

        ComboItems.setEditable(true);
        ComboItems.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Item");

        txtQTY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("QTY");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Price");

        tblInvoice.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idItem", "Item Name", "Unit Price", "QTY", "Total"
            }
        ));
        tblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblInvoiceMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblInvoice);
        if (tblInvoice.getColumnModel().getColumnCount() > 0) {
            tblInvoice.getColumnModel().getColumn(0).setMinWidth(0);
            tblInvoice.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblInvoice.getColumnModel().getColumn(0).setMaxWidth(0);
            tblInvoice.getColumnModel().getColumn(1).setMinWidth(600);
            tblInvoice.getColumnModel().getColumn(1).setPreferredWidth(600);
            tblInvoice.getColumnModel().getColumn(1).setMaxWidth(600);
        }

        btnAddCus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddCus.setText("Add Customer");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(51, 51, 51));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 195, 101));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Total");

        txtDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Discount");

        txtNetTotal.setEditable(false);
        txtNetTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNetTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNetTotalKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Net Total");

        txtPaidAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaidAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidAmountKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Paid Amount *");

        btnSaveInvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveInvoice.setText("Save Invoice");
        btnSaveInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveInvoiceActionPerformed(evt);
            }
        });

        txtCashTendred.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashTendred.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashTendred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashTendredKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashTendredKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Cash Tendered");

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Balance");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Pervious Balance");

        txtPreBalance.setEditable(false);
        txtPreBalance.setBackground(new java.awt.Color(51, 51, 51));
        txtPreBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPreBalance.setForeground(new java.awt.Color(231, 85, 85));
        txtPreBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPreBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNetTotal)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPaidAmount)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCashTendred, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBalance)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveInvoice))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(210, 210, 210))
                                .addComponent(ComboItems, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCus)))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel28))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddCus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(TxtInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboItems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20))
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCashTendred, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSaveInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Invoice", jPanel1);

        txtOrderNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOrderNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrderNoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Order No and Press ENTER");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Previous Balance");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Invoice No");

        txtInvoiceNoOR.setEditable(false);
        txtInvoiceNoOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInvoiceNoOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblCustomerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblService.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblService.setText("jLabel8");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Customer Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Service");

        txtUnitPriceORSer.setEditable(false);
        txtUnitPriceORSer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUnitPriceORSer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUnitPriceORSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceORSerKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Unit Price");

        txtQTyORSer.setEditable(false);
        txtQTyORSer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQTyORSer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTyORSer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTyORSerKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("QTY");

        tblOR.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblOR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdItem", "Item Name", "Unit Price", "QTY", "Total"
            }
        ));
        tblOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblORMouseReleased(evt);
            }
        });
        tblOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblORKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblOR);
        if (tblOR.getColumnModel().getColumnCount() > 0) {
            tblOR.getColumnModel().getColumn(0).setMinWidth(0);
            tblOR.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblOR.getColumnModel().getColumn(0).setMaxWidth(0);
            tblOR.getColumnModel().getColumn(1).setMinWidth(600);
            tblOR.getColumnModel().getColumn(1).setPreferredWidth(600);
            tblOR.getColumnModel().getColumn(1).setMaxWidth(600);
        }

        txtTotalOR.setEditable(false);
        txtTotalOR.setBackground(new java.awt.Color(0, 0, 0));
        txtTotalOR.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalOR.setForeground(new java.awt.Color(51, 255, 51));
        txtTotalOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Order Total");

        txtDiscountOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiscountOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscountOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountORKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountORKeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Discount");

        txtNetTotalOR.setEditable(false);
        txtNetTotalOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNetTotalOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetTotalOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNetTotalORKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Net Total");

        txtPaidAmountOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaidAmountOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaidAmountOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidAmountORKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Paid Amount");

        txtCashTenderedOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashTenderedOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashTenderedOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashTenderedORKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashTenderedORKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Cash Tendered");

        txtBalanceOR.setEditable(false);
        txtBalanceOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Balance");

        btnSaveInvoiceOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveInvoiceOR.setText("Save Invoice");
        btnSaveInvoiceOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveInvoiceORActionPerformed(evt);
            }
        });

        PrevoiusBalance.setEditable(false);
        PrevoiusBalance.setBackground(new java.awt.Color(51, 51, 51));
        PrevoiusBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrevoiusBalance.setForeground(new java.awt.Color(231, 85, 85));
        PrevoiusBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ComboItemsOR.setEditable(true);
        ComboItemsOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Select Item");

        txtQTYOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQTYOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQTYOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYORKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYORKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("QTY");

        txtPriceOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriceOR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPriceOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceORKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Price");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Advance Payment");

        txtAdvancePayment.setEditable(false);
        txtAdvancePayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdvancePayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInvoiceNoOR, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PrevoiusBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblService, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUnitPriceORSer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQTyORSer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAdvancePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiscountOR)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNetTotalOR)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPaidAmountOR)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCashTenderedOR)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBalanceOR)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSaveInvoiceOR))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(228, 228, 228))
                                    .addComponent(ComboItemsOR, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQTYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPriceOR, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalOR, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtInvoiceNoOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrevoiusBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUnitPriceORSer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblService, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQTyORSer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdvancePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQTYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPriceOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboItemsOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiscountOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNetTotalOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26))
                    .addComponent(jLabel27)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPaidAmountOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCashTenderedOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBalanceOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSaveInvoiceOR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Order Invoice", jPanel2);

        jMenu1.setText("Print Setting");

        chkPrint.setSelected(true);
        chkPrint.setText("Print Invoice");
        jMenu1.add(chkPrint);

        chkPreview.setSelected(true);
        chkPreview.setText("Preview Invoice");
        chkPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPreviewActionPerformed(evt);
            }
        });
        jMenu1.add(chkPreview);

        chkDialog.setSelected(true);
        chkDialog.setText("Show Print Dialog");
        jMenu1.add(chkDialog);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void TxtInvoiceDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtInvoiceDateMouseClicked

    }//GEN-LAST:event_TxtInvoiceDateMouseClicked

    private void TxtInvoiceDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtInvoiceDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInvoiceDateActionPerformed

    private void btnSaveInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInvoiceActionPerformed

            List<InvoiceDataHolderOther> hodler = new ArrayList();
        try {


            InvoiceDataHolderOther id = new InvoiceDataHolderOther();
            id.setInvoiceno("OO");
            id.setCustomer("OO");
            id.setItemname("ITEM");
            id.setCashier("Cash");
            id.setUnitprice(0.00);
            id.setQty(0.00);
            id.setLinetota(0.00);
            id.setOrdertotal(0.00);
            id.setDiscount(0.00);
            id.setNettotal(0.0);
            id.setPaid(0.00);
            id.setBalance(0.00);
            id.setFinalbalance(0.00);

//            hodler.add(id);

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();

            if (!(txtNetTotal.getText().isEmpty() && txtPaidAmount.getText().isEmpty())) {

                Customer customer = new Customer();
                customer.setIdCustomer(cust.get(ComboCustomer.getSelectedItem().toString().split(" - ")[1]));

                Invoice invoice = new Invoice();

                invoice.setInvoiceNo(txtInvoiceNo.getText());
                invoice.setInvoiceDate(TxtInvoiceDate.getText());
                invoice.setSubtotal(Double.parseDouble(txtTotal.getText()));
                invoice.setNetTotal(Double.parseDouble(txtNetTotal.getText()));

                if (txtDiscount.getText().isEmpty()) {

                    invoice.setDiscount(0.00);

                } else {

                    invoice.setDiscount(Double.parseDouble(txtDiscount.getText()));
                }

                invoice.setIsDelete("Active");
                invoice.setCreatedBy(Logging.user);
                invoice.setInvoiceStatus("Paid");
                invoice.setInvoiceTime(dateForm.TimeNow());

                if (Double.parseDouble(txtNetTotal.getText()) <= Double.parseDouble(txtPaidAmount.getText())) {

                    invoice.setPaymentType("CASH");

                } else {

                    invoice.setPaymentType("CREDIT");
                }

                invoice.setPromoCode("N/A");
                invoice.setInvoiceType("Sales Invoice");
                invoice.setServiceNameForPrint("N/A");
                invoice.setServiceQty(0.00);
                invoice.setServiceUnitTotal(0.00);

                openSession.save(invoice);

                for (int i = 0; i < tblInvoice.getRowCount(); i++) {

                    Items items = new Items();
                    items.setIdRawItems(Integer.parseInt(tblInvoice.getValueAt(i, 0).toString()));

                    InvoiceItems invoiceItems = new InvoiceItems();
                    invoiceItems.setQty(Double.parseDouble(tblInvoice.getValueAt(i, 3).toString()));
                    invoiceItems.setUnitPrice(Double.parseDouble(tblInvoice.getValueAt(i, 2).toString()));
                    invoiceItems.setNetTotalItem(Double.parseDouble(tblInvoice.getValueAt(i, 4).toString()));
                    invoiceItems.setIsDelete("Active");
                    invoiceItems.setInvoice(invoice);
                    invoiceItems.setItems(items);

                    openSession.save(invoiceItems);

                    InvoiceDataHolderOther idd = new InvoiceDataHolderOther();
                    idd.setInvoiceno(txtInvoiceNo.getText());
                    idd.setCustomer(ComboCustomer.getSelectedItem().toString().split(" - ")[0]);
                    idd.setItemname(tblInvoice.getValueAt(i, 1).toString());
                    idd.setCashier(Logging.user);
                    idd.setUnitprice(Double.parseDouble(tblInvoice.getValueAt(i, 2).toString()));
                    idd.setQty(Double.parseDouble(tblInvoice.getValueAt(i, 3).toString()));
                    idd.setLinetota(Double.parseDouble(tblInvoice.getValueAt(i, 4).toString()));
                    idd.setOrdertotal(Double.parseDouble(txtTotal.getText()));
                    idd.setDiscount(Double.parseDouble(txtDiscount.getText()));
                    idd.setNettotal(Double.parseDouble(txtNetTotal.getText()));
                    idd.setPaid(Double.parseDouble(txtPaidAmount.getText()));
                    idd.setBalance(Double.parseDouble(txtNetTotal.getText())-Double.parseDouble(txtPaidAmount.getText()));
                    idd.setFinalbalance((Double.parseDouble(txtNetTotal.getText())-Double.parseDouble(txtPaidAmount.getText()))+Double.parseDouble(txtPreBalance.getText()));

                    hodler.add(idd);

                }

                CustomerHasInvoice customerHasInvoice = new CustomerHasInvoice();
                System.out.println(customer.getIdCustomer());
                customerHasInvoice.setCustomer(customer);
                customerHasInvoice.setInvoice(invoice);

                openSession.save(customerHasInvoice);

                InvoicePayment ip = new InvoicePayment();
                ip.setCustomer(customer);
                ip.setInvoice(invoice);
                ip.setIsDelete("Active");

                if (txtPaidAmount.getText().isEmpty()) {

                    ip.setPaymentAmount(0.00);

                } else {

                    ip.setPaymentAmount(Double.parseDouble(txtPaidAmount.getText()));

                }

                ip.setPaymentDate(TxtInvoiceDate.getText());
                ip.setPaymentType("CASH");

                openSession.save(ip);

                InvoicePaymentInfo ipi = new InvoicePaymentInfo();
                ipi.setCashBalance(txtBalance.getText());
                if (txtCashTendred.getText().isEmpty()) {
                    ipi.setCashTenderd("0.00");

                } else {
                    ipi.setCashTenderd(txtCashTendred.getText());

                }

                ipi.setCustromerPerviusBalance(txtPreBalance.getText());
                ipi.setInvoice(invoice);
                ipi.setIsDelete("Active");
                ipi.setTotalWithBalance("N/A");

                openSession.save(ipi);

                if (!txtPaidAmount.getText().isEmpty()) {
                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(Logging.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Paymnet for Invoice " + txtInvoiceNo.getText());
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(txtPaidAmount.getText()));

                    openSession.save(cashBook);
                }

                beginTransaction.commit();
                NotificationPopup.save();

                if (chkPrint.isSelected()) {

                    
                    JRBeanCollectionDataSource bcd = new JRBeanCollectionDataSource(hodler);
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("Bean", bcd);

                    try {
                        JasperPrint jp;
                        jp = JasperFillManager.fillReport(Logging.Invoice, map, bcd);

                        if (chkPreview.isSelected()) {

                            JasperViewer.viewReport(jp, false);
                        }

                        if (chkDialog.isSelected()) {
                            JasperPrintManager.printReport(jp, true);

                        } else {

                            JasperPrintManager.printReport(jp, false);
                        }

                    } catch (Exception ex) {
                        Logger.getLogger(CreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                
                genOrderNO();
                TxtInvoiceDate.setText(dateForm.currentdate());
                ComboCustomer.setSelectedIndex(-1);
                txtPreBalance.setText(null);
                ComboItems.setSelectedIndex(-1);
                txtQTY.setText(null);
                txtPrice.setText(null);
                txtDiscount.setText(null);
                txtNetTotal.setText(null);
                txtPaidAmount.setText(null);
                txtCashTendred.setText(null);
                txtBalance.setText(null);
                txtTotal.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) tblInvoice.getModel();
                dtm.setRowCount(0);
                ComboItems.grabFocus();

            } else {

                JOptionPane.showMessageDialog(null, "Fill required field");

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_btnSaveInvoiceActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnSaveInvoiceORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInvoiceORActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();

            if (!(txtNetTotalOR.getText().isEmpty() && txtPaidAmountOR.getText().isEmpty())) {

                Customer customer = new Customer();
                customer.setIdCustomer(idCustomer);

                Invoice invoice = new Invoice();

                invoice.setInvoiceNo(txtInvoiceNoOR.getText());
                invoice.setInvoiceDate(dateForm.currentdate());
                invoice.setSubtotal(Double.parseDouble(txtTotalOR.getText()));

                if (txtDiscountOR.getText().isEmpty()) {

                    invoice.setDiscount(Double.parseDouble(txtAdvancePayment.getText()) + 0.00);

                } else {

                    invoice.setDiscount(Double.parseDouble(txtAdvancePayment.getText()) + Double.parseDouble(txtDiscountOR.getText()));
                }

                invoice.setNetTotal(Double.parseDouble(txtNetTotalOR.getText()));
                invoice.setIsDelete("Active");
                invoice.setCreatedBy(Logging.user);
                invoice.setInvoiceStatus("Paid");
                invoice.setInvoiceTime(dateForm.TimeNow());

                if (Double.parseDouble(txtNetTotalOR.getText()) <= Double.parseDouble(txtPaidAmountOR.getText())) {

                    invoice.setPaymentType("CASH");

                } else {

                    invoice.setPaymentType("CREDIT");
                }

                invoice.setPromoCode("N/A");
                invoice.setInvoiceType("Order Invoice");
                invoice.setServiceNameForPrint(lblService.getText());
                invoice.setServiceQty(Double.parseDouble(txtQTyORSer.getText()));
                invoice.setServiceUnitTotal(Double.parseDouble(txtUnitPriceORSer.getText()));

                openSession.save(invoice);

                for (int i = 0; i < tblOR.getRowCount(); i++) {

                    Items items = new Items();
                    items.setIdRawItems(Integer.parseInt(tblOR.getValueAt(i, 0).toString()));

                    InvoiceItems invoiceItems = new InvoiceItems();
                    invoiceItems.setQty(Double.parseDouble(tblOR.getValueAt(i, 3).toString()));
                    invoiceItems.setUnitPrice(Double.parseDouble(tblOR.getValueAt(i, 2).toString()));
                    invoiceItems.setNetTotalItem(Double.parseDouble(tblOR.getValueAt(i, 4).toString()));
                    invoiceItems.setIsDelete("Active");
                    invoiceItems.setInvoice(invoice);
                    invoiceItems.setItems(items);

                    openSession.save(invoiceItems);
                }

                CustomerHasInvoice customerHasInvoice = new CustomerHasInvoice();
                System.out.println(customer.getIdCustomer());
                customerHasInvoice.setCustomer(customer);
                customerHasInvoice.setInvoice(invoice);

                openSession.save(customerHasInvoice);

                InvoicePayment ip = new InvoicePayment();
                ip.setCustomer(customer);
                ip.setInvoice(invoice);
                ip.setIsDelete("Active");

                if (txtPaidAmountOR.getText().isEmpty()) {

                    ip.setPaymentAmount(0.00);

                } else {

                    ip.setPaymentAmount(Double.parseDouble(txtPaidAmountOR.getText()));
                }

                ip.setPaymentDate(dateForm.currentdate());
                ip.setPaymentType("CASH");

                openSession.save(ip);

                InvoicePaymentInfo ipi = new InvoicePaymentInfo();
                ipi.setCashBalance(txtBalanceOR.getText());
                if (txtCashTenderedOR.getText().isEmpty()) {
                    ipi.setCashTenderd("0.00");

                } else {
                    ipi.setCashTenderd(txtCashTenderedOR.getText());

                }

                ipi.setCustromerPerviusBalance(PrevoiusBalance.getText());
                ipi.setInvoice(invoice);
                ipi.setIsDelete("Active");
                ipi.setTotalWithBalance("N/A");

                openSession.save(ipi);

                if (!txtPaidAmountOR.getText().isEmpty()) {
                    CashBook cashBook = new CashBook();
                    cashBook.setCreatedBy(Logging.user);
                    cashBook.setDate(dateForm.currentdate());
                    cashBook.setDescription("Paymnet for Invoice " + txtInvoiceNoOR.getText());
                    cashBook.setExpence(0.00);
                    cashBook.setIncome(Double.parseDouble(txtPaidAmountOR.getText()));

                    openSession.save(cashBook);
                }

                Criteria createCriteria = openSession.createCriteria(OrderStatus.class);
                createCriteria.add(Restrictions.eq("isDelete", "Active"));
                createCriteria.createAlias("orders", "o");
                createCriteria.add(Restrictions.eq("o.idOrders", idOrder));
                OrderStatus oder = (OrderStatus) createCriteria.uniqueResult();

                if (oder != null) {

                    oder.setStatus("Complete");
                    openSession.update(oder);

                }

                beginTransaction.commit();
                NotificationPopup.save();

                if (chkPrint.isSelected()) {

                    List<InvoiceDataHolder> holder = new ArrayList();

                    holder.clear();

                    InvoiceDataHolder id = new InvoiceDataHolder();
                    id.setInvoiceno(txtInvoiceNoOR.getText());
                    id.setCustomer(lblCustomerName.getText());
                    id.setService(lblService.getText());
                    id.setUnitprice(Double.parseDouble(txtUnitPriceORSer.getText()));
                    id.setQty(Double.parseDouble(txtQTyORSer.getText()));
                    id.setOrdertotal(Double.parseDouble(txtTotalOR.getText()));
                    id.setAdvance(Double.parseDouble(txtAdvancePayment.getText()));
                    id.setBalance(Double.parseDouble(txtNetTotalOR.getText()));
                    id.setPaid(Double.parseDouble(txtPaidAmountOR.getText()));
                    id.setOrderbalance(Double.parseDouble(txtNetTotalOR.getText()) - Double.parseDouble(txtPaidAmountOR.getText()));
                    id.setFinalbalance((Double.parseDouble(txtNetTotalOR.getText()) - Double.parseDouble(txtPaidAmountOR.getText())) + Double.parseDouble(PrevoiusBalance.getText()));
                    id.setCashier(Logging.user);
                    holder.add(id);
                    holder.add(id);

                    JRBeanCollectionDataSource bcd = new JRBeanCollectionDataSource(holder);
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("Bean", bcd);

                    try {
                        JasperPrint jp;
                        jp = JasperFillManager.fillReport(Logging.OrderInvoice, map, bcd);

                        if (chkPreview.isSelected()) {

                            JasperViewer.viewReport(jp, false);
                        }

                        if (chkDialog.isSelected()) {
                            JasperPrintManager.printReport(jp, true);

                        } else {

                            JasperPrintManager.printReport(jp, false);
                        }

                    } catch (Exception ex) {
                        Logger.getLogger(CreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                genOrderNO();
//                TxtInvoiceDate.setText(dateForm.currentdate());
//                ComboCustomer.setSelectedIndex(-1);
                PrevoiusBalance.setText(null);
                ComboItemsOR.setSelectedIndex(-1);
                txtQTYOR.setText(null);
                txtQTyORSer.setText(null);
                txtPriceOR.setText(null);
                txtDiscountOR.setText(null);
                txtNetTotalOR.setText(null);
                txtPaidAmountOR.setText(null);
                txtCashTenderedOR.setText(null);
                txtBalanceOR.setText(null);
                lblCustomerName.setText(null);
                lblService.setText(null);
                txtAdvancePayment.setText(null);

                txtUnitPriceORSer.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) tblOR.getModel();
                dtm.setRowCount(0);
                txtOrderNo.grabFocus();

            } else {

                JOptionPane.showMessageDialog(null, "Fill required field");

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_btnSaveInvoiceORActionPerformed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                DefaultTableModel dtm = (DefaultTableModel) tblInvoice.getModel();
                ItemDataHolderOrder get = itmNames.get(ComboItems.getSelectedItem().toString());
                String name = get.getItemname();
                int Id = get.getIdItem();
                double unitprice = Double.parseDouble(txtPrice.getText());
                double qty = Double.parseDouble(txtQTY.getText());
                double total = unitprice * qty;

                dtm.addRow(new Object[]{
                    Id,
                    name,
                    unitprice,
                    qty,
                    total

                });

                setTotal();

                txtQTY.setText(null);
                txtPrice.setText(null);
                ComboItems.setSelectedIndex(-1);
                ComboItems.grabFocus();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_txtQTYKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tblInvoice.getModel();
        dtm.removeRow(tblInvoice.getSelectedRow());
        setTotal();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tblInvoice.getModel();
        dtm.setRowCount(0);
        setTotal();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtDiscountKeyTyped

    private void txtNetTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetTotalKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtNetTotalKeyTyped

    private void txtPaidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtPaidAmountKeyTyped

    private void txtCashTendredKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashTendredKeyTyped

        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }

    }//GEN-LAST:event_txtCashTendredKeyTyped

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased

        try {

            double discount = Double.parseDouble(txtDiscount.getText());
            double total = Double.parseDouble(txtTotal.getText());

            txtNetTotal.setText(Decimal_Formats.Price(total - discount));
            txtPaidAmount.setText(Decimal_Formats.Price(total - discount));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtDiscountKeyReleased

    private void txtCashTendredKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashTendredKeyReleased

        try {

            double net = Double.parseDouble(txtPaidAmount.getText());
            double paid = Double.parseDouble(txtCashTendred.getText());

            txtBalance.setText(Decimal_Formats.Price(paid - net));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtCashTendredKeyReleased

    private void txtPreBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreBalanceActionPerformed

    private void txtOrderNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderNoKeyReleased

        if (evt.getKeyCode() == 10) {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria cc = openSession.createCriteria(Orders.class);
            cc.add(Restrictions.eq("orderNo", txtOrderNo.getText()));
            cc.add(Restrictions.eq("isDelete", "Active"));
            Orders odr = (Orders) cc.uniqueResult();
            boolean flag = false;
            if (odr != null) {

                Iterator<OrderStatus> iterator = odr.getOrderStatuses().iterator();
                while (iterator.hasNext()) {
                    OrderStatus next = iterator.next();
                    if (next.getStatus().equals("Pending")) {
                        flag = true;
                    } else {

                        flag = false;

                    }

                }

                if (flag) {

                    DefaultTableModel dtm = (DefaultTableModel) tblOR.getModel();
                    dtm.setRowCount(0);
                    idOrder = odr.getIdOrders();
                    lblCustomerName.setText(odr.getCustomer().getName());
                    idCustomer = odr.getCustomer().getIdCustomer();
                    loadprebalance();
                    lblService.setText(odr.getServiceNameForPrint());
                    txtUnitPriceORSer.setText(Decimal_Formats.Price(odr.getUnitPriceForOrder()));
                    txtQTyORSer.setText(Decimal_Formats.Price(odr.getOrderQty()));
                    txtTotalOR.setText(Decimal_Formats.Price(odr.getOrderTotal()));
                    txtNetTotalOR.setText(Decimal_Formats.Price(odr.getOrderTotal() - odr.getAdvance()));
                    txtPaidAmountOR.setText(Decimal_Formats.Price(odr.getOrderTotal() - odr.getAdvance()));
                    txtAdvancePayment.setText(Decimal_Formats.Price(odr.getAdvance()));

                    Iterator<OrderItems> itt = odr.getOrderItemses().iterator();
                    while (itt.hasNext()) {
                        OrderItems next = itt.next();

                        dtm.addRow(new Object[]{
                            next.getItems().getIdRawItems(),
                            next.getItems().getItemName(),
                            Decimal_Formats.Price(next.getUnitPrice()),
                            next.getQty(),
                            Decimal_Formats.Price(next.getNetTotalOrdersItem())

                        });

                    }

                    Double invnet = 0.0;
                    Double invpayment = 0.0;

                    // Session sess = PoolManager.getSessionFactory().openSession();
                    Criteria cr = openSession.createCriteria(Customer.class);
                    cr.add(Restrictions.eq("idCustomer", idCustomer));

                    Customer uniqueResult = (Customer) cr.uniqueResult();

                    if (uniqueResult != null) {

                        Iterator it = uniqueResult.getCustomerHasInvoices().iterator();

                        while (it.hasNext()) {
                            CustomerHasInvoice next = (CustomerHasInvoice) it.next();

                            if (next.getInvoice().getIsDelete().equals("Active")) {

                                invnet += next.getInvoice().getNetTotal();

                                Iterator it2 = next.getInvoice().getInvoicePayments().iterator();
                                while (it2.hasNext()) {
                                    InvoicePayment next1 = (InvoicePayment) it2.next();

                                    if (next1.getIsDelete().equals("Active")) {

                                        invpayment += next1.getPaymentAmount();

                                    }

                                }

                                System.out.println(next.getInvoice().getNetTotal());

                            }

                        }

// System.out.println(uniqueResult.getName());
                        System.out.println(invnet);
                        //  PrevoiusBalance.setText("" + );
                        PrevoiusBalance.setText("" + (invnet - invpayment));

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "This is not a Pending order");

                }
            } else {

                JOptionPane.showMessageDialog(null, "No results found");

            }

            openSession.close();
        }

    }//GEN-LAST:event_txtOrderNoKeyReleased

    private void txtQTYORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtQTYORKeyTyped

    private void txtQTYORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYORKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                DefaultTableModel dtm = (DefaultTableModel) tblOR.getModel();
                ItemDataHolderOrder get = itmNames.get(ComboItemsOR.getSelectedItem().toString());
                String name = get.getItemname();
                int Id = get.getIdItem();
                double unitprice = Double.parseDouble(txtPriceOR.getText());
                double qty = Double.parseDouble(txtQTYOR.getText());
                double total = unitprice * qty;

                dtm.addRow(new Object[]{
                    Id,
                    name,
                    unitprice,
                    qty,
                    total

                });

                setTotalOrder();

                txtQTYOR.setText(null);
                txtPriceOR.setText(null);
                ComboItemsOR.setSelectedIndex(-1);
                ComboItemsOR.grabFocus();
            }

        } catch (Exception e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_txtQTYORKeyReleased

    private void txtPriceORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtPriceORKeyTyped

    private void tblORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblORKeyReleased

        try {

            int row = tblOR.getSelectedRow();

            double qty = Double.parseDouble(tblOR.getValueAt(row, 3).toString());
            double Price = Double.parseDouble(tblOR.getValueAt(row, 2).toString());

            tblOR.setValueAt(Decimal_Formats.Price(Price * qty), row, 4);
            setTotalOrder();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_tblORKeyReleased

    private void txtUnitPriceORSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceORSerKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtUnitPriceORSerKeyTyped

    private void txtQTyORSerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTyORSerKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtQTyORSerKeyTyped

    private void txtDiscountORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtDiscountORKeyTyped

    private void txtNetTotalORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNetTotalORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtNetTotalORKeyTyped

    private void txtPaidAmountORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidAmountORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtPaidAmountORKeyTyped

    private void txtCashTenderedORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashTenderedORKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_txtCashTenderedORKeyTyped

    private void txtDiscountORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountORKeyReleased

        try {

            double discount = Double.parseDouble(txtDiscountOR.getText());
            double total = Double.parseDouble(txtTotalOR.getText());
            double advance = Double.parseDouble(txtAdvancePayment.getText());

            txtNetTotalOR.setText(Decimal_Formats.Price(total - discount - advance));
            txtPaidAmountOR.setText(Decimal_Formats.Price(total - discount - advance));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtDiscountORKeyReleased

    private void txtCashTenderedORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashTenderedORKeyReleased

        try {

            double net = Double.parseDouble(txtPaidAmountOR.getText());
            double paid = Double.parseDouble(txtCashTenderedOR.getText());

            txtBalanceOR.setText(Decimal_Formats.Price(paid - net));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtCashTenderedORKeyReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblOR.getModel();
        dtm.removeRow(tblOR.getSelectedRow());
        setTotalOrder();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tblInvoiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMouseReleased
        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }
    }//GEN-LAST:event_tblInvoiceMouseReleased

    private void tblORMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblORMouseReleased
        if (evt.getButton() == 3) {

            jPopupMenu2.show();

        }
    }//GEN-LAST:event_tblORMouseReleased

    private void chkPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPreviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPreviewActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCustomer;
    private javax.swing.JComboBox ComboItems;
    private javax.swing.JComboBox ComboItemsOR;
    private javax.swing.JTextField PrevoiusBalance;
    private com.alee.extended.date.WebDateField TxtInvoiceDate;
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnSaveInvoice;
    private javax.swing.JButton btnSaveInvoiceOR;
    private javax.swing.JCheckBoxMenuItem chkDialog;
    private javax.swing.JCheckBoxMenuItem chkPreview;
    private javax.swing.JCheckBoxMenuItem chkPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblService;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTable tblOR;
    private javax.swing.JTextField txtAdvancePayment;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBalanceOR;
    private javax.swing.JTextField txtCashTenderedOR;
    private javax.swing.JTextField txtCashTendred;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDiscountOR;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtInvoiceNoOR;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtNetTotalOR;
    private javax.swing.JTextField txtOrderNo;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtPaidAmountOR;
    private javax.swing.JTextField txtPreBalance;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceOR;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtQTYOR;
    private javax.swing.JTextField txtQTyORSer;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalOR;
    private javax.swing.JTextField txtUnitPriceORSer;
    // End of variables declaration//GEN-END:variables

    private void genOrderNO() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria cc = openSession.createCriteria(ORM.Invoice.class);
            cc.add(Restrictions.eq("invoiceDate", dateForm.currentdate()));
            List list = cc.list();
            int size = list.size();
            size++;
            txtInvoiceNo.setText(dateForm.OrderNo() + "#" + size);
            txtInvoiceNoOR.setText(dateForm.OrderNo() + "#" + size);

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void FilterCustomers(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("contact1", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {
                        str1 = customers.getName() + " - " + customers.getContact1();
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customer.class);
                    createCriteria.add(Restrictions.like("name", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
                    List<Customer> list = createCriteria.list();

                    for (Customer customers : list) {

                        str1 = customers.getName() + " - " + customers.getContact1();;
                        filterArray.add(str1);
                        cust.put(customers.getContact1(), customers.getIdCustomer());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            //System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboCustomer.setSelectedItem(enteredText);
            ComboCustomer.showPopup();
        } else {
            ComboCustomer.hidePopup();
        }

    }

    private void SearchbleCustomers() {
        final JTextField textfield0 = (JTextField) ComboCustomer.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            loadprebalanceInvoice();

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            FilterCustomers(textfield0.getText());

                        }

                    }

                });

            }
        });
    }

    public void SearchItems(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
//            createCriteria.add(Restrictions.like("isService", "YES"));
//            createCriteria.add(Restrictions.like("isRaw", "YES"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();
            ComboItems.removeAllItems();
            for (Items item : list) {

                str1 = item.getItemName() + " # " + item.getItemsCode();
                filterArray.add(str1);
                ItemDataHolderOrder idh = new ItemDataHolderOrder();
                idh.setIdItem(item.getIdRawItems());
                idh.setItemname(item.getItemName());
                idh.setUnitprice(item.getItemsSellingPrice());
                itmNames.put(str1, idh);
                System.out.println(itmNames);
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboItems.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboItems.setSelectedItem(enteredText);
            ComboItems.showPopup();
        } else {
            ComboItems.hidePopup();
        }
    }

    private void SearchbleItem() {
        final JTextField textfield = (JTextField) ComboItems.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {
                            try {

                                ItemDataHolderOrder get = itmNames.get(ComboItems.getSelectedItem().toString());
                                txtPrice.setText(Decimal_Formats.Price(get.getUnitprice()));
                                txtQTY.grabFocus();

                            } catch (Exception e) {

                                e.printStackTrace();

                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            SearchItems(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    public void SearchItemsOR(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Items.class);
            createCriteria.add(Restrictions.like("itemName", "%" + enteredText + "%"));
//            createCriteria.add(Restrictions.like("isService", "YES"));
//            createCriteria.add(Restrictions.like("isRaw", "YES"));
            createCriteria.add(Restrictions.eq("isDelete", "Active"));
            List<Items> list = createCriteria.list();
            ComboItemsOR.removeAllItems();
            for (Items item : list) {

                str1 = item.getItemName() + " # " + item.getItemsCode();
                filterArray.add(str1);
                ItemDataHolderOrder idh = new ItemDataHolderOrder();
                idh.setIdItem(item.getIdRawItems());
                idh.setItemname(item.getItemName());
                idh.setUnitprice(item.getItemsSellingPrice());
                itmNames.put(str1, idh);
                System.out.println(itmNames);
            }
            openSession.close();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            ComboItemsOR.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            ComboItemsOR.setSelectedItem(enteredText);
            ComboItemsOR.showPopup();
        } else {
            ComboItemsOR.hidePopup();
        }
    }

    private void SearchbleItemOR() {
        final JTextField textfield = (JTextField) ComboItemsOR.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {
                            try {

                                ItemDataHolderOrder get = itmNames.get(ComboItemsOR.getSelectedItem().toString());
                                txtPriceOR.setText(Decimal_Formats.Price(get.getUnitprice()));
                                txtQTYOR.grabFocus();

                            } catch (Exception e) {

                                e.printStackTrace();

                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            SearchItemsOR(textfield.getText());

                        }

                    }
                });

            }
        });
    }

    private void setTotal() {

        try {

            double tot = 0.00;

            for (int i = 0; i < tblInvoice.getRowCount(); i++) {

                double parseDouble = Double.parseDouble(tblInvoice.getValueAt(i, 4).toString());

                tot += parseDouble;

            }

            txtTotal.setText(Decimal_Formats.Price(tot));
            txtNetTotal.setText(Decimal_Formats.Price(tot));
            txtDiscount.setText(0.00 + "");
            txtPaidAmount.setText(Decimal_Formats.Price(tot));

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void setTotalOrder() {

        try {

            double tot = 0.00;

            for (int i = 0; i < tblOR.getRowCount(); i++) {

                double parseDouble = Double.parseDouble(tblOR.getValueAt(i, 4).toString());

                tot += parseDouble;

            }

            txtTotalOR.setText(Decimal_Formats.Price(tot));
            txtNetTotalOR.setText(Decimal_Formats.Price(tot - Double.parseDouble(txtAdvancePayment.getText())));
            txtDiscountOR.setText(0.00 + "");
            txtPaidAmountOR.setText(Decimal_Formats.Price(tot - Double.parseDouble(txtAdvancePayment.getText())));

            txtUnitPriceORSer.setText(Decimal_Formats.Price(tot / Double.parseDouble(txtQTyORSer.getText())));

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadprebalance() {

    }

    private void loadprebalanceInvoice() {

        try {

            String mob = ComboCustomer.getSelectedItem().toString().split("-")[1];

            String cusmob = mob.replaceAll("\\s", "");

            Double invnet = 0.0;
            Double invpayment = 0.0;

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Customer.class);
            cr.add(Restrictions.eq("idCustomer", cust.get(ComboCustomer.getSelectedItem().toString().split("-")[1].replaceAll("\\s", ""))));

            Customer uniqueResult = (Customer) cr.uniqueResult();

            if (uniqueResult != null) {

                Iterator it = uniqueResult.getCustomerHasInvoices().iterator();

                while (it.hasNext()) {
                    CustomerHasInvoice next = (CustomerHasInvoice) it.next();

                    if (next.getInvoice().getIsDelete().equals("Active")) {

                        invnet += next.getInvoice().getNetTotal();

                        Iterator it2 = next.getInvoice().getInvoicePayments().iterator();
                        while (it2.hasNext()) {
                            InvoicePayment next1 = (InvoicePayment) it2.next();

                            if (next1.getIsDelete().equals("Active")) {

                                invpayment += next1.getPaymentAmount();

                            }

                        }

                        System.out.println(next.getInvoice().getNetTotal());

                    }

                }

                System.out.println(invnet);
                txtPreBalance.setText("" + (invnet - invpayment));

            }

            sess.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign(JTable table) {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);

    }

}
