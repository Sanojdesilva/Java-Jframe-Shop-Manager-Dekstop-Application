/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author AKILA KASUN
 */
public class Stocks extends javax.swing.JFrame {

    /**
     * Creates new form Stocks
     */
    public Stocks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpic1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnwatches = new javax.swing.JButton();
        btnspareparts = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblstocks1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblpic = new javax.swing.JLabel();
        lblpic2 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblmanagment = new javax.swing.JLabel();
        lblstockstopic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        lblpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dwd (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnwatches.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        btnwatches.setForeground(new java.awt.Color(153, 0, 153));
        btnwatches.setText("Watches");
        btnwatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwatchesActionPerformed(evt);
            }
        });
        jPanel1.add(btnwatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 227, 50));

        btnspareparts.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        btnspareparts.setForeground(new java.awt.Color(153, 0, 153));
        btnspareparts.setText("Spare Parts");
        jPanel1.add(btnspareparts, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 227, 50));

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));

        lblstocks1.setFont(new java.awt.Font("Californian FB", 0, 48)); // NOI18N
        lblstocks1.setForeground(new java.awt.Color(204, 204, 204));
        lblstocks1.setText("   STOCKS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setMinimumSize(new java.awt.Dimension(70, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblstocks1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(247, 247, 247))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblstocks1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 100));

        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sssssss.png"))); // NOI18N
        jPanel1.add(lblpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 230, 220));

        lblpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dwd (1).png"))); // NOI18N
        jPanel1.add(lblpic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 210));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 27, 742, 475));

        btnclose.setFont(new java.awt.Font("Californian FB", 0, 12)); // NOI18N
        btnclose.setText("X");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel3.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(983, 0, -1, -1));

        btnback.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
        btnback.setText("Back");
        jPanel3.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 543, -1, 33));

        lblmanagment.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        lblmanagment.setForeground(new java.awt.Color(204, 204, 204));
        lblmanagment.setText("Management");
        jPanel3.add(lblmanagment, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 212, -1, 57));

        lblstockstopic.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        lblstockstopic.setForeground(new java.awt.Color(204, 204, 204));
        lblstockstopic.setText("      Stock");
        jPanel3.add(lblstockstopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, 128, 42));

        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("     System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 275, 128, 52));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
    this.dispose();        
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnwatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwatchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnwatchesActionPerformed

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
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnspareparts;
    private javax.swing.JButton btnwatches;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblmanagment;
    private javax.swing.JLabel lblpic;
    private javax.swing.JLabel lblpic1;
    private javax.swing.JLabel lblpic2;
    private javax.swing.JLabel lblstocks1;
    private javax.swing.JLabel lblstockstopic;
    // End of variables declaration//GEN-END:variables
}