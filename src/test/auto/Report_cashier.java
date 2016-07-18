/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.auto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jdesktop.swingx.JXFrame;

/**
 *
 * @author Алексей
 */
public class Report_cashier extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;

PreparedStatement pst = null;

public Timestamp datatimeEnd_for_earnings;
    /**
     * Creates new form Report
     */
    public Report_cashier() {
        initComponents();
         conn = javaconnect.ConnecrDb();
         Update_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _report = new org.jdesktop.swingx.JXTable();
        _exit = new javax.swing.JButton();
        _additionalExpens = new org.jdesktop.swingx.JXButton();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));

        _report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(_report);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        _exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/auto/1455114901_Log Out.png"))); // NOI18N
        _exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _exitActionPerformed(evt);
            }
        });

        _additionalExpens.setText("Доп расходы");
        _additionalExpens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _additionalExpensActionPerformed(evt);
            }
        });

        jXButton1.setText("Занести отчет");
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Заказы");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Главное меню");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(_additionalExpens, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jXButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_additionalExpens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_exit)
                    .addComponent(jXButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void  Update_table(){
String sql="SELECT Order_dates as Дата, Order_times as Время, Car_number as Номер_автомобиля, "
        + "Klass_of_car as Класс_машины, Kind_of_service as Услуги, "
        + "Second_of_service as Доп_услуги, "
        + "Summa as Оплаченно, Discount as Скидка, Shift as Бригада FROM autoclean_v1.order";
try{
   
pst = conn.prepareStatement(sql);
rs=pst.executeQuery();
_report.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }}

    private void _exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__exitActionPerformed
        if(evt.getSource()==_exit){

            Main_cashier m = new   Main_cashier();
            m.setVisible(true);
            dispose();           }    // TODO add your handling code here:
    }//GEN-LAST:event__exitActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
    
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
     
        if(evt.getSource()==jMenu2){
            new_order nr = new   new_order();
            nr.setVisible(true);
            dispose();} 
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        if(evt.getSource()==jMenu2){
            order or = new order();
            or.setVisible(true);}
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        if(evt.getSource()==jMenu3){
            Main_cashier c = new   Main_cashier();
            c.setVisible(true);
            dispose();      }  // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void _additionalExpensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__additionalExpensActionPerformed
 if(evt.getSource()==_additionalExpens){
            AdditionalSpend as = new   AdditionalSpend();
            as.setVisible(true);
                }
// TODO add your handling code here:
    }//GEN-LAST:event__additionalExpensActionPerformed



    private void jXButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton1ActionPerformed
    try {
      
       _getDataime_of_last_report();
        _get_last_Summ_of_order();
          setDate_to_report();
        
      
    } catch (SQLException ex) {
        Logger.getLogger(Report_cashier.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jXButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report_cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report_cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report_cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report_cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report_cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton _additionalExpens;
    private javax.swing.JButton _exit;
    private org.jdesktop.swingx.JXTable _report;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXButton jXButton1;
    // End of variables declaration//GEN-END:variables
public Timestamp datatimeStart_for_earnings;
public String data_of_order;
public String time_of_order;
public Timestamp datime_of_last_report;
public String dt_of_lastt_report;
public double total_of_order=0;
public double earnings=0;
public double cashbox=0;
public double non_cash=0;
public double chek=0;
public int count_car=0;
public int count_free_car=0;
public double ref_expenses=0;
public double balans_of_day=0;
public String cashier;
public String admin;
    private void _getDataime_of_last_report() throws SQLException{
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat tf = new SimpleDateFormat("HH:mm");
SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

   String sql2="select Current_datime from report where id=(SELECT max(id) from report)";
   pst=conn.prepareStatement(sql2);
   rs=pst.executeQuery();
   if(rs.next()){
        datime_of_last_report=rs.getTimestamp("Current_datime");
 data_of_order= df.format(rs.getTimestamp("Current_datime"));
time_of_order= tf.format(rs.getTimestamp("Current_datime"));
dt_of_lastt_report= dtf.format(rs.getTimestamp("Current_datime"));
  

   }
    }
  private void _get_last_Summ_of_order() throws SQLException{
        Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
   
  String sql="select sum(`order`.Summa) from autoclean_v1.`order` "
          + "where `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"' and Payed='Да'";
  pst=conn.prepareStatement(sql);
  rs=pst.executeQuery();
  if (rs.next()){
      total_of_order=rs.getDouble("sum(`order`.Summa)");
            
    }
  

}
  private void setDate_to_report() throws SQLException{
      get_cashbox();
      get_non_cash();
      get_chek();
      get_count_free_car();
      get_count_car();
      get_expenses();
     cashier=JOptionPane.showInputDialog(_report, cashier,"Введите касира", WIDTH);
       admin=JOptionPane.showInputDialog(_report, admin, "Введите админа", WIDTH);

       Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
      // balans_of_day=total_of_order-(cashbox+non_cash+chek+ref_expenses);
      balans_of_day=cashbox-ref_expenses;
       
       
String sql="INSERT INTO Report (Current_datime, Earnings, Сashbox, Non_cash, Сhek, Free_client, Number_of_car, Expenses, Current_balance, Cashier, Admin) "
        + "VALUE (?, '"+total_of_order+"', '"+cashbox+"', '"+non_cash+"', "
        + "'"+chek +"', '"+count_free_car+"', '"+count_car+"', '"+ ref_expenses+"', '"+balans_of_day+"', '"+cashier+"','"+admin+"')";
  pst=conn.prepareStatement(sql);
  pst.setTimestamp(1, dt);
  
  pst.executeUpdate();
  }
  private void get_cashbox() throws SQLException{
         Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
  String sql="select sum(Summa) from autoclean_v1.`order` \n" +
"where `order`.Kind_payed IN('Нал') and `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"' and Payed='Да'";
  pst=conn.prepareStatement(sql);
 rs=pst.executeQuery();
 if(rs.next()){
 cashbox=rs.getDouble("sum(Summa)");

 }
  }
   private void get_non_cash() throws SQLException{
         Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
  String sql="select sum(Summa) from autoclean_v1.`order` \n" +
"where `order`.Kind_payed IN('Без. нал') and `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"'  and Payed='Да'";
  pst=conn.prepareStatement(sql);
 rs=pst.executeQuery();
 if(rs.next()){
 non_cash=rs.getDouble("sum(Summa)");

 }
  }
    private void get_chek() throws SQLException {
         Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
  String sql="select sum(Summa) from autoclean_v1.`order` \n" +
"where `order`.Kind_payed IN('Чек') and `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"'  and Payed='Да'";
  pst=conn.prepareStatement(sql);
 rs=pst.executeQuery();
 if(rs.next()){
 chek=rs.getDouble("sum(Summa)");

 }
  }
    private void get_count_free_car() throws SQLException{
                 Timestamp dt=Timestamp.valueOf(LocalDateTime.now());

        String sql="select count(*) from autoclean_v1.order where order.Summa='0' and `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"'  and Payed='Да'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
        count_free_car=rs.getInt("count(*)");
        } }
    private void get_count_car() throws SQLException {
         Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
           String sql="select count(*)  from autoclean_v1.order where order.Summa>'0' and `order`.Order_dates BETWEEN '"+data_of_order+"' and '"+dt+"'"
          + "and Order_times BETWEEN '"+time_of_order+"' and '"+dt+"'   and Payed='Да'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
        count_car=rs.getInt("count(*)");
        }
    }
    private void get_expenses() throws SQLException{
    String sql="SELECT expenses.total from autoclean_v1.expenses where Current_dt BETWEEN now()- INTERVAL 1 hour and now()";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    if(rs.next()){
    ref_expenses=rs.getDouble("expenses.total");
    }
    }

  }

