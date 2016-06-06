package moneyexpensesmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class MyExpensesinfo extends javax.swing.JFrame {

Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;
Statement stmt = null;

private static final String Expensesinfo_TABLE= "create table Expensesinfo( "
      + "   ID INT NOT NULL AUTO_INCREMENT, Date DATE, Food DOUBLE, "
      + "Transport DOUBLE, Clothing DOUBLE,Living DOUBLE, Medicine DOUBLE, Education DOUBLE, "
      + " Entertainment DOUBLE, Others DOUBLE, "
      + "PRIMARY KEY(ID))"; 

    public MyExpensesinfo() {
        initComponents();
        myConnection = DatabaseConnection.dbConnection();
        update_table();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_expenses = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Clothing = new javax.swing.JLabel();
        transport = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        education = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        living = new javax.swing.JTextField();
        Transport = new javax.swing.JLabel();
        piechart_btn = new javax.swing.JButton();
        medicine = new javax.swing.JTextField();
        new_button = new javax.swing.JButton();
        Living = new javax.swing.JLabel();
        clothing = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        others = new javax.swing.JTextField();
        entertainment = new javax.swing.JTextField();
        Education = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Entertainment = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        edit_btn = new javax.swing.JButton();
        food = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table_expenses.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_expenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_expensesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_expenses);

        Clothing.setText("Clothing :");

        jLabel6.setText("Medicine :");

        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel9.setText("Others :");

        Transport.setText("Transport :");

        piechart_btn.setText("View Pie Chart ");
        piechart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piechart_btnActionPerformed(evt);
            }
        });

        new_button.setText("New");
        new_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_buttonActionPerformed(evt);
            }
        });

        Living.setText("Living :");

        jLabel1.setText("Date :");

        jLabel2.setText("Food :");

        Education.setText("Education :");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Entertainment.setText("Entertainment :");

        date.setDateFormatString("yyyy-MM-dd");

        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        jButton2.setText("View All Expenses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Living)
                                .addComponent(Transport)
                                .addComponent(Clothing)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(living, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clothing, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transport, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Entertainment)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(Education))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(medicine)
                                        .addComponent(education, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(entertainment)
                                        .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(save_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(new_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edit_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(piechart_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(medicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clothing)
                            .addComponent(clothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Education)
                            .addComponent(education, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Living)
                                        .addComponent(living, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Entertainment)
                                        .addComponent(entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Transport)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(new_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(piechart_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))))
        );

        jLabel3.setText("Please enter expenses ID to delete info :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
 
  try{

      String sql= "Insert into Expensesinfo(Date,Food,Transport,Clothing,Living,Medicine,Education,Entertainment,Others) values(?,?,?,?,?,?,?,?,?)";
      
         pst = myConnection.prepareStatement(sql);
        
         pst.setString(1,((JTextField)date.getDateEditor().getUiComponent()).getText());
         pst.setString(2,food.getText());  
         pst.setString(3,transport.getText()); 
         pst.setString(4,clothing.getText());  
         pst.setString(5,living.getText()); 
         pst.setString(6,medicine.getText());  
         pst.setString(7,education.getText()); 
         pst.setString(8,entertainment.getText()); 
         pst.setString(9,others.getText()); 
        //pst.setString(10,ID.getText());
         
         
         pst.execute();
            
        JOptionPane.showMessageDialog(null,"Saved");
            
            
    }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);
            
        }
  update_table();
    }//GEN-LAST:event_save_btnActionPerformed

    private void piechart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piechart_btnActionPerformed
       
        String Food =food.getText();
        String Transport =transport.getText();
        String Clothing =clothing.getText();
        String Living =living.getText();
        String Medicine =medicine.getText();
        String Education =education.getText();
        String Entertainment=entertainment.getText();
        String Others =others.getText();
        
        
       DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("Food",new Double(Food));
        pieDataset.setValue("Transport ",new Double(Transport));
        pieDataset.setValue("Clothing",new Double(Clothing));
        pieDataset.setValue("Living",new Double(Living));
        pieDataset.setValue("Medicine",new Double(Medicine));
        pieDataset.setValue("Education",new Double(Education));
        pieDataset.setValue("Entertainment",new Double(Entertainment));
        pieDataset.setValue("Others",new Double(Others));
        
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart For Expenses",pieDataset,true,true,true);
        PiePlot P =(PiePlot)chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        
    }//GEN-LAST:event_piechart_btnActionPerformed

    private void new_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_buttonActionPerformed
       
        food.setText("");
        transport.setText("");
        clothing.setText("");
         living.setText("");
        education.setText("");
         medicine.setText("");
        entertainment.setText("");
        others.setText("");
        ID.setText("");
       
        ((JTextField)date.getDateEditor().getUiComponent()).setText("");
        
         
    }//GEN-LAST:event_new_buttonActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        
    try{
     
            String value1 = ID.getText();
            String value2 = food.getText();
            String value3 = transport.getText();
            String value4 = clothing.getText();
            String value5 = living.getText();
            String value6 = medicine.getText();
            String value7 = education.getText();
            String value8 = entertainment.getText();
            String value9 = others.getText();
            String value10 = ((JTextField)date.getDateEditor().getUiComponent()).getText();
           

            String sql =" update Expensesinfo set ID= '"+ value1 +"', Food = '"+value2+"', Transport= '"+ value3+"' , Clothing = '"+value4+"',"
            + "Living = '"+value5+"', Medicine = '"+value6+"', Education = '"+value7+"', Entertainment = '"+value8+"',Others = '"+value9+"',Date = '"+value10+"',"
            + "where ID= '"+ value1 +"' ";

            pst= myConnection.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null,"Updated!");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,e);
}
    update_table();
    }//GEN-LAST:event_edit_btnActionPerformed

    private void Table_expensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_expensesMouseClicked
          try{

            int row = Table_expenses.getSelectedRow();

            String Table_click =(Table_expenses.getModel().getValueAt(row,0).toString());
            String sql ="select * from Expensesinfo where ID = '"+ Table_click +"' ";

            pst = myConnection.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){

                String add1 = rs.getString("Food");
                food.setText(add1);

                String add2 = rs.getString("Transport");
                transport.setText(add2);
                
                String add3 = rs.getString("Clothing");
                clothing.setText(add3);

                String add4 = rs.getString("Living");
                living.setText(add4);
                
                String add5 = rs.getString("Medicine");
                medicine.setText(add5);

                String add6 = rs.getString("Education");
                education.setText(add6);
                
                String add7 = rs.getString("Entertainment");
                entertainment.setText(add7);

                String add8 = rs.getString("Others");
                others.setText(add8);
                
                 String add9 = rs.getString("Date");
                ((JTextField)date.getDateEditor().getUiComponent()).setText(add9);
                
                String add10 = rs.getString("ID");
                others.setText(add10);
               

            }

        } catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_Table_expensesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new Allexpenses().setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        int p = JOptionPane.showConfirmDialog(null,"Do you sure want to delete","Delete",JOptionPane.YES_NO_OPTION);

        if(p==0){

            String sql = "delete from Expensesinfo where ID = ?";

            try{

                pst = myConnection.prepareStatement(sql);

                pst.setString(1,ID.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Deleted !");

            }catch(Exception e){

                JOptionPane.showMessageDialog(null,e);

            }
            update_table();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

      private void update_table(){
    
       try {
           String sql = "select * from Expensesinfo ";
           pst = myConnection.prepareStatement(sql);
           rs = pst.executeQuery();
           Table_expenses.setModel(DbUtils.resultSetToTableModel(rs));
            
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }
}

  
    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyExpensesinfo().setVisible(true);
            }
        });

Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;
Statement stmt = null;
        
 try {
      myConnection = DatabaseConnection.dbConnection();
      stmt = myConnection.createStatement();
      stmt.executeUpdate(Expensesinfo_TABLE);
      
      System.out.println("CreateEXPENSESINFO_TABLEMySQL: main(): table created.");
    
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
    private javax.swing.JLabel Clothing;
    private javax.swing.JLabel Education;
    private javax.swing.JLabel Entertainment;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Living;
    private javax.swing.JTable Table_expenses;
    private javax.swing.JLabel Transport;
    private javax.swing.JTextField clothing;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton edit_btn;
    private javax.swing.JTextField education;
    private javax.swing.JTextField entertainment;
    private javax.swing.JTextField food;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField living;
    private javax.swing.JTextField medicine;
    private javax.swing.JButton new_button;
    private javax.swing.JTextField others;
    private javax.swing.JButton piechart_btn;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField transport;
    // End of variables declaration//GEN-END:variables
}
