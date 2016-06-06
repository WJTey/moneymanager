package moneyexpensesmanager;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.*;

public class DatabaseConnection {
    
    public static Connection dbConnection(){
    
    Connection con;
  
    try{
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneymanager","root","");

        
        return con;
        
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    return null;
    
    }
    
    }
    
 public static void main(String [] args){
  
  dbConnection();
  JOptionPane.showMessageDialog(null, "Connected"); 
  new FrontPage().setVisible(true);
  
  
  }
  
  

}



