package test.auto;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 '12ІІІІІЙЙЙЙЙЙЙЙЙЙ@author Алексей
 */
public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDb(){
           try{
             

         Class.forName("com.mysql.jdbc.Driver");
         Properties properties=new Properties();
         properties.setProperty("user","root");
         //properties.setProperty("user","karlovvemail");
         properties.setProperty("password","af3fJFMNk24f");
         //properties.setProperty("password","mRfg3GVXES54nj");
         properties.setProperty("useUnicode","true");
         properties.setProperty("characterEncoding","UTF-8");
        Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.1.102:3306/autoclean_v1", properties);
         //Connection conn=DriverManager.getConnection("jdbc:mysql://www.db4free.net:3306/cleanservicedb", properties);
       System.out.println("Connected");
        
                    return conn;
        }
            /*
                        String userName = "root";
            String pas sword = "admin";
            String url = "jdbc:mysql://127.0.0.1/chat";
            Class.forName ("com.mysql.jdbc.Driver").newInstance(); // загружаем драйвер
            conn = DriverManager.getConnection (url, userName, password); // задаём строку подключения
             JOptionPane.showMessageDialog(null, "Database connection established");
          
               }*/
    catch (ClassNotFoundException | SQLException | HeadlessException e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
        
    }
}