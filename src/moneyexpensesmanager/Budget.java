package moneyexpensesmanager;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Budget extends javax.swing.JFrame {

private static final String BUDGET_TABLE = "create table budget( "
      + "   Month VARCHAR(20)PRIMARY KEY, Year VARCHAR(20) PRIMARY KEY, Daily DOUBLE,Weekly DOUBLE, "
      + "   Monthly DOUBLE )"; 
    
Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;
Statement stmt = null;
    
    public Budget() {
        initComponents();
         myConnection = DatabaseConnection.dbConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Weekly = new javax.swing.JTextField();
        txt_Monthly = new javax.swing.JTextField();
        save_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo_month = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Daily = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Daily (RM)");

        jLabel2.setText("Weekly (RM)");

        jLabel3.setText("Monthly (RM)");

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel4.setText("Month:");

        combo_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));

        jButton1.setText("Back to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Year :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("eg. 2014");

        txt_Daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DailyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Press Enter to continue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Weekly)
                                    .addComponent(txt_Daily)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(txt_Monthly)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(save_btn)))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 339, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Daily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Weekly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Monthly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
         try{
        String sql= "Insert into budget(Month,Year,Daily,Weekly,Monthly) values(?,?,?,?,?)";
        
         pst = myConnection.prepareStatement(sql);
         
         String value = combo_month.getSelectedItem().toString();
         pst.setString(1,value);
         pst.setString(2,txt_year.getText());  
         pst.setString(3,txt_Daily.getText());  
         pst.setString(4,txt_Weekly.getText()); 
         pst.setString(5,txt_Monthly.getText()); 
         
        
         pst.execute();
            
        JOptionPane.showMessageDialog(null,"Saved");
            
            
    }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new FrontPage().setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_DailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DailyActionPerformed
     try{

            
            double dailyBudget = Double.parseDouble(txt_Daily.getText());

            //Arithmetic Operation
            double weeklyBudget;
            weeklyBudget= dailyBudget * 7;
            txt_Weekly.setText(""+ weeklyBudget);
            
            double monthlyBudget;
            monthlyBudget= weeklyBudget *4;
            txt_Monthly.setText(""+ monthlyBudget);
  
            JOptionPane.showMessageDialog(null,"Calculated.");


        }catch(Exception e){

            JOptionPane.showMessageDialog(null,"Failed");
        }
    }//GEN-LAST:event_txt_DailyActionPerformed


    public static void main(String args[]) {

Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;
Statement stmt = null;

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Budget().setVisible(true);
            }
        });
        
       try {
      myConnection = DatabaseConnection.dbConnection();
      stmt = myConnection.createStatement();
      stmt.executeUpdate(BUDGET_TABLE);
      //stmt.executeUpdate("insert into myConnection(Daily, Weekly,Monthly) values(100, 100,100)");
     // stmt.executeUpdate("insert into myConnection(id, firstName) values(200, 'B')");
      System.out.println("CreateBUDGET_TABLEMySQL: main(): table created.");
    
       } catch (SQLException e) {
      System.out.println("error: failed to create a connection object.");
      e.printStackTrace();
    
       } catch (Exception e) {
      System.out.println("other error:");
      e.printStackTrace();
    
       } finally {
      
    try {
        stmt.close();
        myConnection.close();        
      
    } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_month;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField txt_Daily;
    private javax.swing.JTextField txt_Monthly;
    private javax.swing.JTextField txt_Weekly;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
