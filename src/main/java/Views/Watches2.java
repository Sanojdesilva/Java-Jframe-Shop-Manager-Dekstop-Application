/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Models.Watch;
import Controllers.WatchControl;

import javax.swing.JOptionPane;

/**
 *
 * @author AKILA KASUN
 */
public class Watches2 extends javax.swing.JFrame {
    
    Watch w;
    WatchControl wc;

    /**
     * Creates new form Watches2
     */
    public Watches2() {
        initComponents();
        wc = new WatchControl();
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
        txtwatchprice = new javax.swing.JTextField();
        comboxwatchquantity = new javax.swing.JComboBox<>();
        txttype = new javax.swing.JTextField();
        txtwatchno1 = new javax.swing.JTextField();
        txtbrand1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnupdate1 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtwatchprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 140, 30));

        comboxwatchquantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(comboxwatchquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 140, 30));
        jPanel1.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 140, 30));
        jPanel1.add(txtwatchno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, 30));
        jPanel1.add(txtbrand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 140, 30));

        btnBack.setBackground(new java.awt.Color(102, 0, 153));
        btnBack.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/akilawatches (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 461, 80, 30));

        btnupdate1.setText("update");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 461, 90, 30));

        btnadd.setText("add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 461, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            String WatchNo = txtwatchno1.getText();
            String WatchType = txttype.getText();
            String Brand = txtbrand1.getText() ;
            Double Price = Double.parseDouble((String)txtwatchprice.getText());
            int Quantity = Integer.parseInt((String)comboxwatchquantity.getSelectedItem());
           
            
            w = wc.AddWatch(WatchNo, Brand, Price, WatchType, Quantity);
            boolean result = wc.AddWatchToDB(w);
            
            if(result ){
                
                JOptionPane.showMessageDialog(rootPane,"Succusfully Added To The Data Base","Info",1);   
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Commond Unsuccusfull","Error",0);  
            }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
             String WatchNo = txtwatchno1.getText();
            String WatchType = txttype.getText();
            String Brand = txtbrand1.getText() ;
            Double Price = Double.parseDouble((String)txtwatchprice.getText());
            int Quantity = Integer.parseInt((String)comboxwatchquantity.getSelectedItem());
            
           
            boolean result = wc.UpdateWatch(WatchType, Brand, WatchNo, Price, Quantity);
            
            if(result ){
                
                JOptionPane.showMessageDialog(rootPane,"Succusfully  Data Base updated","Info",1);   
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Data Base updated Failed","Error",0);  
            }
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
         String WatchNo = txtwatchno1.getText();
         
          boolean result= wc.deleteWatch(WatchNo);
          
           if(result ){
                
                JOptionPane.showMessageDialog(rootPane,"Succusfully  Deleted from the Data Base ","Info",1);   
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"Delete Failed","Error",0);  
            }
          
         
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Stocks3().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Watches2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Watches2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Watches2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Watches2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Watches2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JComboBox<String> comboxwatchquantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbrand1;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtwatchno1;
    private javax.swing.JTextField txtwatchprice;
    // End of variables declaration//GEN-END:variables
}
