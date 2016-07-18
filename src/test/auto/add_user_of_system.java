/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.auto;

import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Алексей
 */
public class add_user_of_system {
    Connection conn = null;
ResultSet rs = null;

PreparedStatement pst = null;
public String cashier;
public String admin;
 
 public add_user_of_system() {
       
                 conn = javaconnect.ConnecrDb();
               
     
    }
 public void set_cashier_and_admin(){
    try {
        Timestamp dt=Timestamp.valueOf(LocalDateTime.now());
 
        String schtemp;
        String admtmp;
        schtemp= JOptionPane.showInputDialog(null, cashier, "Введите имя касира", WIDTH);
        cashier=schtemp;
        String sql="insert into user_of_sys(Second_first_name, Current_dt_of_add)value('"+cashier+"', '"+dt+"')";
        pst=conn.prepareStatement(sql);
        pst.executeUpdate();
        admtmp= JOptionPane.showInputDialog(null, admin, "Введите имя администратора", WIDTH);
         admin=admtmp;
        String sql2="insert into user_of_sys(Second_first_name, Current_dt_of_add)value('"+admin+"', '"+dt+"')";
        pst=conn.prepareStatement(sql2);
        pst.executeUpdate();
       new_order rn = new new_order();   
       rn.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(new_order.class.getName()).log(Level.SEVERE, null, ex);
    }

}
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
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                add_user_of_system add_user_of_system = new add_user_of_system();
                add_user_of_system.set_cashier_and_admin();
            }
        });
    }   
}
