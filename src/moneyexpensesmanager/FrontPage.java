
package moneyexpensesmanager;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class FrontPage extends javax.swing.JFrame {
Connection myConnection=null;
ResultSet rs = null;
PreparedStatement pst = null;

    public FrontPage() {
        initComponents();
         myConnection = DatabaseConnection.dbConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expenses_btn = new javax.swing.JButton();
        incomings_btn = new javax.swing.JButton();
        budget_btn = new javax.swing.JButton();
        statistics_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        expenses_btn.setText("Expenses");
        expenses_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenses_btnActionPerformed(evt);
            }
        });

        incomings_btn.setText("Incomings");
        incomings_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomings_btnActionPerformed(evt);
            }
        });

        budget_btn.setText("Budgets");
        budget_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                budget_btnActionPerformed(evt);
            }
        });

        statistics_btn.setText("Statistics");
        statistics_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistics_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setText("Money Expenses Manager");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneyexpensesmanager/growth1_83463811.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(expenses_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(incomings_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(budget_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statistics_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expenses_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(incomings_btn)
                        .addGap(18, 18, 18)
                        .addComponent(budget_btn)
                        .addGap(18, 18, 18)
                        .addComponent(statistics_btn)
                        .addGap(64, 64, 64))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expenses_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenses_btnActionPerformed
        
          new MyExpensesinfo().setVisible(true);
         setVisible(false);
         
    }//GEN-LAST:event_expenses_btnActionPerformed

    private void budget_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_budget_btnActionPerformed
        new Budget().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_budget_btnActionPerformed

    private void incomings_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomings_btnActionPerformed
        new incomings().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_incomings_btnActionPerformed

    private void statistics_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistics_btnActionPerformed

          
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("Food",new Double(10));
        pieDataset.setValue("Transport ",new Double(10));
        pieDataset.setValue("Clothing",new Double(10));
        pieDataset.setValue("Living",new Double(10));
        pieDataset.setValue("Medicine",new Double(10));
        pieDataset.setValue("Education",new Double(10));
        pieDataset.setValue("Entertainment",new Double(10));
        pieDataset.setValue("Others",new Double(10));
        
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart For Expenses",pieDataset,true,true,true);
        PiePlot P =(PiePlot)chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_statistics_btnActionPerformed

     public void close(){
     
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton budget_btn;
    private javax.swing.JButton expenses_btn;
    private javax.swing.JButton incomings_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton statistics_btn;
    // End of variables declaration//GEN-END:variables
}
