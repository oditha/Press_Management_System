/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

//import com.alee.laf.WebLookAndFeel;
import ClassPack.DBbackup;
import ClassPack.PoolManager;
import ClassPack.dateForm;
import Customers.AddCustomersUdaya1;

import OrdersAndQuatations.OrderDueRemideUdaya;
import Customers.ViewCustomerOutstrandingODK;
import Customers.ViewCustomersPayments;
import Customers.ViewCustomersUdaya;
import Customers.ViewDeletedCustomersODK;

import Employees.registerEmployee;
import InvoiceAndGRN.AddGRNODK;
import InvoiceAndGRN.BestSellingItem;
import InvoiceAndGRN.CreateInvoice;
import InvoiceAndGRN.DaillySalesSummeryUdaya;
import InvoiceAndGRN.InvoiceCancelF;

import InvoiceAndGRN.ViewCancelInvoice;

import InvoiceAndGRN.ViewDeletedInvoiceUdaya;
import InvoiceAndGRN.ViewGRNExces;

import InvoiceAndGRN.ViewGRNODK;
import InvoiceAndGRN.ViewInvoiceODKNEW;

import ItemAndStock.AddCatagoryUdaya;
import ItemAndStock.AddItem;
import ItemAndStock.AddShopStock;
import ItemAndStock.ViewItem;
import ItemAndStock.ViewShopStock;

import ItemAndStock.ViewStockODk;
import ItemAndStock.ViewStockRefillReminderODK;
import ORM.Invoice;
import ORM.InvoiceItems;
import OrdersAndQuatations.CreateOrder;
import OrdersAndQuatations.CreateQutation;
import OrdersAndQuatations.ViewCusOrderUdayaNew;
import OrdersAndQuatations.ViewQuatation;

import Suppliers.AddGrnPaymentsUdaya;
import Suppliers.AddSupplierUdaya;
import Suppliers.GrnReturnUdaya;
import Suppliers.ViewDeletedSupp;
import Suppliers.ViewGrnPaymentUdaya;
import Suppliers.ViewReturnGRNUdaya;
import Suppliers.ViewSuppUdaya;
import Suppliers.ViewSuppliersOutstanding;
import java.awt.Color;
import java.awt.Window;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
//        new Logging().UType = "Cashier";//        getContentPane().setBackground(Color.WHITE);
        //        loadBestSellingChart();
        Privilage();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        addInvoice = new javax.swing.JMenuItem();
        cancelInvoice = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        addOrders = new javax.swing.JMenuItem();
        viewOrders = new javax.swing.JMenuItem();
        OrderDue = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        addQuatation = new javax.swing.JMenuItem();
        viewQuatation = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        Summery = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        Items = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        GRN = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        ViewGrn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        ViewGRNReturn = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem46 = new javax.swing.JMenuItem();
        viewGrnPayments = new javax.swing.JMenuItem();
        ViewExess = new javax.swing.JMenuItem();
        Suppliers = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        viewSupplier = new javax.swing.JMenuItem();
        viewDeletedSupplier = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        AddCusPayments = new javax.swing.JMenuItem();
        viewCusPayments = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        viewCustomer = new javax.swing.JMenuItem();
        ViewDeleted = new javax.swing.JMenuItem();
        others = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Keyboard Shortcuts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(25, 35, 148))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 21, 235));
        jLabel2.setText("Create Invoice - F1");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 21, 235));
        jLabel3.setText("Create Order - F2");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 21, 235));
        jLabel4.setText("Create Quation - F3");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 21, 235));
        jLabel5.setText("New Customer - F4");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 21, 235));
        jLabel6.setText("Cancel Invoice - F5");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 21, 235));
        jLabel7.setText("Stock Records - F6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lahiru Printers Ibbagamuwa");

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/invoice.png"))); // NOI18N
        jMenu7.setText("Invoice");
        jMenu7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu7.setPreferredSize(new java.awt.Dimension(140, 40));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });

        addInvoice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        addInvoice.setText("Add Invoice");
        addInvoice.setPreferredSize(new java.awt.Dimension(91, 40));
        addInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addInvoiceMouseClicked(evt);
            }
        });
        addInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvoiceActionPerformed(evt);
            }
        });
        jMenu7.add(addInvoice);

        cancelInvoice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        cancelInvoice.setText("Cancel Invoice");
        cancelInvoice.setPreferredSize(new java.awt.Dimension(91, 40));
        cancelInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelInvoiceActionPerformed(evt);
            }
        });
        jMenu7.add(cancelInvoice);

        jMenu12.setText("Orders");
        jMenu12.setPreferredSize(new java.awt.Dimension(135, 40));

        addOrders.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        addOrders.setText("Add Order");
        addOrders.setPreferredSize(new java.awt.Dimension(110, 40));
        addOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersActionPerformed(evt);
            }
        });
        jMenu12.add(addOrders);

        viewOrders.setText("View Order");
        viewOrders.setPreferredSize(new java.awt.Dimension(73, 40));
        viewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersActionPerformed(evt);
            }
        });
        jMenu12.add(viewOrders);

        OrderDue.setText("Due Reminder");
        OrderDue.setPreferredSize(new java.awt.Dimension(119, 40));
        OrderDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDueActionPerformed(evt);
            }
        });
        jMenu12.add(OrderDue);

        jMenu7.add(jMenu12);

        jMenu5.setText("Quatations");
        jMenu5.setPreferredSize(new java.awt.Dimension(105, 40));

        addQuatation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        addQuatation.setText("Add Quatation");
        addQuatation.setPreferredSize(new java.awt.Dimension(130, 40));
        addQuatation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuatationActionPerformed(evt);
            }
        });
        jMenu5.add(addQuatation);

        viewQuatation.setText("View Quatation");
        viewQuatation.setPreferredSize(new java.awt.Dimension(120, 40));
        viewQuatation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewQuatationActionPerformed(evt);
            }
        });
        jMenu5.add(viewQuatation);

        jMenu7.add(jMenu5);

        view.setText("View");
        view.setPreferredSize(new java.awt.Dimension(73, 40));

        jMenuItem4.setText("View Invoice");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(91, 40));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        view.add(jMenuItem4);

        jMenuItem53.setText("View Delete Invoice");
        jMenuItem53.setPreferredSize(new java.awt.Dimension(177, 40));
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        view.add(jMenuItem53);

        jMenuItem20.setText("Cancelled Invoice");
        jMenuItem20.setPreferredSize(new java.awt.Dimension(109, 40));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        view.add(jMenuItem20);

        jMenu7.add(view);

        Summery.setText("Summary");
        Summery.setPreferredSize(new java.awt.Dimension(99, 40));

        jMenuItem55.setText("Daily Sales Summary");
        jMenuItem55.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        Summery.add(jMenuItem55);

        jMenuItem56.setText("Best Selling Items");
        jMenuItem56.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        Summery.add(jMenuItem56);

        jMenu7.add(Summery);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stock.png"))); // NOI18N
        jMenu8.setText("Stock");
        jMenu8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(140, 75));

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem12.setText("Add Record");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(100, 40));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem12);

        stock.setText("Manage");
        stock.setPreferredSize(new java.awt.Dimension(91, 40));

        jMenuItem11.setText("View Stock");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(161, 40));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        stock.add(jMenuItem11);

        jMenuItem13.setText("View Update Details");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(150, 40));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        stock.add(jMenuItem13);

        jMenu8.add(stock);

        jMenuItem14.setText("Stock Refill Reminder");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(161, 40));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem14);

        jMenuBar2.add(jMenu8);

        Items.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping-bag.png"))); // NOI18N
        Items.setText("Item");
        Items.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        Items.setPreferredSize(new java.awt.Dimension(140, 75));

        jMenuItem16.setText("Add Item                          ");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        Items.add(jMenuItem16);

        jMenuItem17.setText("View Item");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        Items.add(jMenuItem17);

        jMenuItem18.setText("Add Category");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        Items.add(jMenuItem18);

        jMenuBar2.add(Items);

        GRN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/approve.png"))); // NOI18N
        GRN.setText("GRN");
        GRN.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        GRN.setMaximumSize(new java.awt.Dimension(150, 32767));
        GRN.setPreferredSize(new java.awt.Dimension(130, 75));

        jMenu21.setText("Manage");
        jMenu21.setPreferredSize(new java.awt.Dimension(91, 40));

        jMenuItem2.setText("Add GRN               ");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(139, 40));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem2);

        ViewGrn.setText("View GRN");
        ViewGrn.setPreferredSize(new java.awt.Dimension(65, 40));
        ViewGrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGrnActionPerformed(evt);
            }
        });
        jMenu21.add(ViewGrn);

        GRN.add(jMenu21);

        jMenu3.setText("GRN Return");
        jMenu3.setPreferredSize(new java.awt.Dimension(109, 40));

        jMenuItem5.setText("Add GRN Return");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(122, 40));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        ViewGRNReturn.setText("View GRN Return");
        ViewGRNReturn.setPreferredSize(new java.awt.Dimension(122, 40));
        ViewGRNReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGRNReturnActionPerformed(evt);
            }
        });
        jMenu3.add(ViewGRNReturn);

        GRN.add(jMenu3);

        jMenu22.setText("Payment");
        jMenu22.setPreferredSize(new java.awt.Dimension(95, 40));

        jMenuItem46.setText("Add Payment");
        jMenuItem46.setPreferredSize(new java.awt.Dimension(115, 40));
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem46);

        viewGrnPayments.setText("View Payment");
        viewGrnPayments.setPreferredSize(new java.awt.Dimension(119, 40));
        viewGrnPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGrnPaymentsActionPerformed(evt);
            }
        });
        jMenu22.add(viewGrnPayments);

        ViewExess.setText("View Exess Payment");
        ViewExess.setPreferredSize(new java.awt.Dimension(149, 40));
        ViewExess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewExessActionPerformed(evt);
            }
        });
        jMenu22.add(ViewExess);

        GRN.add(jMenu22);

        jMenuBar2.add(GRN);

        Suppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/team.png"))); // NOI18N
        Suppliers.setText("Suppliers");
        Suppliers.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        Suppliers.setPreferredSize(new java.awt.Dimension(160, 40));

        jMenuItem22.setText("View Outstanding");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(141, 40));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        Suppliers.add(jMenuItem22);

        jMenu20.setText("Manage");
        jMenu20.setPreferredSize(new java.awt.Dimension(91, 40));

        jMenuItem1.setText("Add Suppliers");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(87, 40));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem1);

        viewSupplier.setText("View Suppliers");
        viewSupplier.setPreferredSize(new java.awt.Dimension(141, 40));
        viewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSupplierActionPerformed(evt);
            }
        });
        jMenu20.add(viewSupplier);

        viewDeletedSupplier.setText("View Deleted Suppliers");
        viewDeletedSupplier.setPreferredSize(new java.awt.Dimension(163, 40));
        viewDeletedSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeletedSupplierActionPerformed(evt);
            }
        });
        jMenu20.add(viewDeletedSupplier);

        Suppliers.add(jMenu20);

        jMenuBar2.add(Suppliers);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/users.png"))); // NOI18N
        jMenu1.setText("Customer");
        jMenu1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(125, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(175, 75));

        jMenu13.setText("Payments");
        jMenu13.setPreferredSize(new java.awt.Dimension(99, 40));

        AddCusPayments.setText("Add Payment");
        AddCusPayments.setPreferredSize(new java.awt.Dimension(200, 40));
        AddCusPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCusPaymentsActionPerformed(evt);
            }
        });
        jMenu13.add(AddCusPayments);

        viewCusPayments.setText("View Payments");
        viewCusPayments.setPreferredSize(new java.awt.Dimension(95, 40));
        viewCusPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCusPaymentsActionPerformed(evt);
            }
        });
        jMenu13.add(viewCusPayments);

        jMenu1.add(jMenu13);

        jMenuItem28.setText("View Outstanding");
        jMenuItem28.setPreferredSize(new java.awt.Dimension(141, 40));
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem28);

        jMenu6.setText("Manage");
        jMenu6.setPreferredSize(new java.awt.Dimension(141, 40));

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem23.setText("Add Customer");
        jMenuItem23.setPreferredSize(new java.awt.Dimension(87, 40));
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);

        viewCustomer.setText("View Customer");
        viewCustomer.setPreferredSize(new java.awt.Dimension(200, 40));
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });
        jMenu6.add(viewCustomer);

        ViewDeleted.setText("View Deleted Customer");
        ViewDeleted.setPreferredSize(new java.awt.Dimension(167, 40));
        ViewDeleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDeletedActionPerformed(evt);
            }
        });
        jMenu6.add(ViewDeleted);

        jMenu1.add(jMenu6);

        jMenuBar2.add(jMenu1);

        others.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/meeting.png"))); // NOI18N
        others.setText("Other");
        others.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        others.setPreferredSize(new java.awt.Dimension(144, 75));
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });

        jMenuItem43.setText("Cash Book");
        jMenuItem43.setPreferredSize(new java.awt.Dimension(99, 40));
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        others.add(jMenuItem43);

        jMenu4.setText("Employees");
        jMenu4.setPreferredSize(new java.awt.Dimension(105, 40));

        jMenuItem8.setText("Add Employees");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Users");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(110, 40));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        others.add(jMenu4);

        jMenuBar2.add(others);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(953, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AddGRNODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ViewGrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGrnActionPerformed
        new ViewGRNODK().setVisible(true);
    }//GEN-LAST:event_ViewGrnActionPerformed

    private void addInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvoiceActionPerformed

        new CreateInvoice().setVisible(true);

    }//GEN-LAST:event_addInvoiceActionPerformed

    private void AddCusPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCusPaymentsActionPerformed

        new Customers.AddCusInvoicePaymentsUdaya().setVisible(true);


    }//GEN-LAST:event_AddCusPaymentsActionPerformed

    private void addInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInvoiceMouseClicked

    }//GEN-LAST:event_addInvoiceMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked

    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        new ViewInvoiceODKNEW().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void addOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersActionPerformed

        new CreateOrder().setVisible(true);

    }//GEN-LAST:event_addOrdersActionPerformed

    private void viewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersActionPerformed
        new ViewCusOrderUdayaNew().setVisible(true);
    }//GEN-LAST:event_viewOrdersActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new ViewStockODk().setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        new AddShopStock().setVisible(true);

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

        new ViewShopStock().setVisible(true);

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        new ViewStockRefillReminderODK().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new AddItem().setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

        new ViewItem().setVisible(true);


    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new AddCatagoryUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new GrnReturnUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void ViewGRNReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGRNReturnActionPerformed
        new ViewReturnGRNUdaya().setVisible(true);
    }//GEN-LAST:event_ViewGRNReturnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AddSupplierUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void viewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSupplierActionPerformed
        new ViewSuppUdaya().setVisible(true);
    }//GEN-LAST:event_viewSupplierActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        new ViewSuppliersOutstanding().setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed

        new AddCustomersUdaya1().setVisible(true);

    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerActionPerformed
        new ViewCustomersUdaya().setVisible(true);
    }//GEN-LAST:event_viewCustomerActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        DBbackup.BACKUPDB();

        Window[] wins = Window.getWindows();
        for (int i = 0; i < wins.length; i++) {
            System.out.println(wins[i]);
            wins[i].dispose();
        }
        new Logging().setVisible(true);
        new Logging().UType = null;

        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void ViewDeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDeletedActionPerformed
        new ViewDeletedCustomersODK().setVisible(true);
    }//GEN-LAST:event_ViewDeletedActionPerformed

    private void viewDeletedSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeletedSupplierActionPerformed
        new ViewDeletedSupp().setVisible(true);
    }//GEN-LAST:event_viewDeletedSupplierActionPerformed

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othersActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed

        new ViewCashBookUdaya().setVisible(true);

    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        new AddGrnPaymentsUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void viewGrnPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGrnPaymentsActionPerformed
        new ViewGrnPaymentUdaya().setVisible(true);
    }//GEN-LAST:event_viewGrnPaymentsActionPerformed

    private void ViewExessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewExessActionPerformed
        new ViewGRNExces().setVisible(true);

    }//GEN-LAST:event_ViewExessActionPerformed

    private void OrderDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDueActionPerformed
        new OrderDueRemideUdaya().setVisible(true);
    }//GEN-LAST:event_OrderDueActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        new ViewDeletedInvoiceUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        new DaillySalesSummeryUdaya().setVisible(true);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        new BestSellingItem().setVisible(true);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void cancelInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelInvoiceActionPerformed

        new InvoiceCancelF().setVisible(true);

    }//GEN-LAST:event_cancelInvoiceActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        new ViewCancelInvoice().setVisible(true);

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        new registerEmployee().setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        new AddUserUdaya().setVisible(true);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void addQuatationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuatationActionPerformed

        new CreateQutation().setVisible(true);

    }//GEN-LAST:event_addQuatationActionPerformed

    private void viewQuatationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewQuatationActionPerformed

        new ViewQuatation().setVisible(true);

    }//GEN-LAST:event_viewQuatationActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed

        new ViewCustomerOutstrandingODK().setVisible(true);

    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void viewCusPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCusPaymentsActionPerformed

        new ViewCustomersPayments().setVisible(true);

    }//GEN-LAST:event_viewCusPaymentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddCusPayments;
    private javax.swing.JMenu GRN;
    private javax.swing.JMenu Items;
    private javax.swing.JMenuItem OrderDue;
    private javax.swing.JMenu Summery;
    private javax.swing.JMenu Suppliers;
    private javax.swing.JMenuItem ViewDeleted;
    private javax.swing.JMenuItem ViewExess;
    private javax.swing.JMenuItem ViewGRNReturn;
    private javax.swing.JMenuItem ViewGrn;
    private javax.swing.JMenuItem addInvoice;
    private javax.swing.JMenuItem addOrders;
    private javax.swing.JMenuItem addQuatation;
    private javax.swing.JMenuItem cancelInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu others;
    private javax.swing.JMenu stock;
    private javax.swing.JMenu view;
    private javax.swing.JMenuItem viewCusPayments;
    private javax.swing.JMenuItem viewCustomer;
    private javax.swing.JMenuItem viewDeletedSupplier;
    private javax.swing.JMenuItem viewGrnPayments;
    private javax.swing.JMenuItem viewOrders;
    private javax.swing.JMenuItem viewQuatation;
    private javax.swing.JMenuItem viewSupplier;
    // End of variables declaration//GEN-END:variables

    private void Privilage() {

        if (new Logging().UType.equals("Cashier")) {

            viewOrders.setEnabled(false);
            viewQuatation.setEnabled(false);
            view.setEnabled(false);
            Summery.setEnabled(false);
            stock.setEnabled(false);
            Items.setEnabled(false);
            GRN.setEnabled(false);
            Suppliers.setEnabled(false);
            ViewDeleted.setEnabled(false);
            viewCustomer.setEnabled(false);
            viewSupplier.setEnabled(false);
            viewDeletedSupplier.setEnabled(false);
            viewCustomer.setEnabled(false);
            others.setEnabled(false);

            viewCusPayments.setEnabled(false);

            viewGrnPayments.setEnabled(false);

//            .setEnabled(false);
//            AddCusPayments.setEnabled(false);
//
            // jMenuItem28.setEnabled(false);
        }

    }

    private void loadBestSellingChart() {

        try {
            Map<String, Double> hm = new HashMap();
            Map<String, Double> map = new LinkedHashMap<String, Double>();
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);
            createCriteria.add(Restrictions.eq("invoiceType", "Sales Invoice"));
            createCriteria.add(Restrictions.like("invoiceDate", dateForm.currentmonth() + "%"));
            List<Invoice> list = createCriteria.list();
            for (Invoice invoice : list) {

                Iterator<InvoiceItems> iterator = invoice.getInvoiceItemses().iterator();
                while (iterator.hasNext()) {
                    InvoiceItems next = iterator.next();

                    String itemName = next.getItems().getItemName();

                    if (hm.get(itemName) == null) {

                        hm.put(itemName, next.getQty());

                    } else {

                        Double get = hm.get(itemName);
                        hm.put(itemName, get + next.getQty());
                    }

                }

            }
            openSession.close();
            DefaultPieDataset data = new DefaultPieDataset();
            System.out.println("Create Data");

            for (Map.Entry<String, Double> entry : hm.entrySet()) {
                data.setValue(entry.getKey(), entry.getValue());
                System.out.println("Adding data");

            }
            JFreeChart pieChart = ChartFactory.createPieChart3D("Sales Count Current Month", data, true, true, false);
            System.out.println("Create Chart");
            PiePlot3D pie = (PiePlot3D) pieChart.getPlot();
            System.out.println("Create Plot");
            ChartPanel chartPanel = new ChartPanel(pieChart);
            System.out.println("Create Chart");

//            BestSellingChart.removeAll();
//            System.out.println("Remove");
//            BestSellingChart.add(chartPanel);
//            System.out.println("Added");
//            BestSellingChart.validate();
            System.out.println("Validate");
        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
