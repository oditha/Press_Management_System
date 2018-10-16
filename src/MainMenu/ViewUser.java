package MainMenu;

import ClassPack.NotificationPopup;
import ClassPack.PoolManager;
import static MainMenu.ResetPasswordUdaya.txtPasswordReset;
import ORM.Employees;
import ORM.Login;
import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewUser extends javax.swing.JFrame {

    public static int getUserID;
    public static String getPassword;

    Map<String, Integer> employee = new HashMap();

    public ViewUser() {
        initComponents();
        lablePassword.setVisible(false);
        loadUser();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        //ComboToTXT2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        lablePassword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jMenuItem1.setText("Update User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete User");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Username", "Password", "Idstaf"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setText("Filter Using Any Feild");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lablePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(lablePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
       int button = evt.getButton();

        if (button == 3) {

            jPopupMenu1.show();

        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        
        
        
        try {
            
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Login.class);
            cr.add(Restrictions.eq("idLogin", (int)jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
            
            Login emp = (Login) cr.uniqueResult();
            
            
            if (emp!=null) {
                
                AddUserUdaya addUserUdaya = new AddUserUdaya();
                addUserUdaya.comboEmployee.setSelectedItem(emp.getEmployees().getEmployeeNic() + " - " + emp.getEmployees().getEmployeName());
                
                addUserUdaya.setVisible(true);
                
                
            }
            
            
            
        } catch (Exception e) {
        
        e.printStackTrace();
        
        }
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   
        
        int i = JOptionPane.showConfirmDialog(rootPane, "Are You Sure Want to Delete?");
        
        if (i==0) {
            
   
        try {
            
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Login.class);
            cr.add(Restrictions.eq("idLogin", (int)jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
            Transaction tr = sess.beginTransaction();
            Login emp = (Login) cr.uniqueResult();
            
            
            if (emp!=null) {
                
                emp.setIsDelete("Deactive");
                tr.commit();
                loadUser();
                if (tr.wasCommitted()) {
                        NotificationPopup.save();
                }
                
            }
            
            
            
        } catch (Exception e) {
        
        e.printStackTrace();
        
        }
             }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lablePassword;
    // End of variables declaration//GEN-END:variables

    private void loadUser() {

        
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        
        try {
            Session sess = PoolManager.getSessionFactory().openSession();
            
            Criteria cr = sess.createCriteria(Login.class);
            cr.add(Restrictions.eq("isDelete", "Active"));
            
            List<Login> list = cr.list();
            
            
            for (Login login : list) {
                
                Vector v = new Vector();
                v.add(login.getEmployees().getEmployeName());
                v.add(login.getUserName());
                v.add(login.getPassWord());
                v.add(login.getIdLogin());
                dtm.addRow(v);
                
                
                
            }
            
            
            
            
            
            
            sess.close();
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Employees.class);
//            createCriteria.add(Restrictions.like("isDelete", "Active"));
//
//            List<Employees> list = createCriteria.list();
//
//            for (Employees emp : list) {
//                employee.put(emp.getEmployeeNic(), emp.getIdEmployees());
//                comboEmployee.addItem(emp.getEmployeeNic() + " - " + emp.getEmployeName());
//
//            }
//            openSession.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void ComboToTXT2() {

//        final JTextField textfield0 = (JTextField) comboEmployee.getEditor().getEditorComponent();
//        textfield0.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent ke) {
//                SwingUtilities.invokeLater(new Runnable() {
//                    public void run() {
//                        if (ke.getKeyCode() == 10) {
//
//                            //settotal();
//                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {
//
//                            comboFilter2(textfield0.getText());
//
//                        }
//
//                    }
//                });
//
//            }
//        });
    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

//            if (enteredText.matches("\\d+")) {
//
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria createCriteria = openSession.createCriteria(Employees.class);
//                    createCriteria.add(Restrictions.like("employeeContactNo", "%" + enteredText + "%"));
//                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
//                    List<Employees> list = createCriteria.list();
//
//                    for (Employees em : list) {
//                        str1 = em.getEmployeName() + " - " + em.getEmployeeNic();
//                        filterArray.add(str1);
//                        employee.put(em.getEmployeeContactNo(), em.getIdEmployees());
//                        comboEmployee.addItem(str1);
//                    }
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            } else {
//
//                try {
//
//                    Session openSession = PoolManager.getSessionFactory().openSession();
//                    Criteria createCriteria = openSession.createCriteria(Employees.class);
//                    createCriteria.add(Restrictions.like("employeName", "%" + enteredText + "%"));
//                    createCriteria.add(Restrictions.eq("isDelete", "Active"));
//                    List<Employees> list = createCriteria.list();
//
//                    for (Employees em : list) {
//
//                        str1 = em.getEmployeName() + " - " + em.getEmployeeNic();
//                        filterArray.add(str1);
//                        employee.put(em.getEmployeeContactNo(), em.getIdEmployees());
//                        comboEmployee.addItem(str1);
//
//                    }
//
//                } catch (Exception e) {
//
//                    e.printStackTrace();
//
//                }
//
//            }
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

//        if (filterArray.size() > 0) {
//            comboEmployee.setModel(new DefaultComboBoxModel(filterArray.toArray()));
//            comboEmployee.setSelectedItem(enteredText);
//            comboEmployee.showPopup();
//        } else {
//            comboEmployee.hidePopup();
//        }
    }

    private void clearTXT() {
//        lablePassword.setVisible(false);
//        txtUserName.setText("");
//        txtPassword.setText("");
//        txtRePassword.setText("");
//        comboUserType.setSelectedIndex(0);

    }

}