/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import java.sql.ResultSet;
import DataBaseConnection.DBconnector;
import javax.swing.JOptionPane;
import Controllers.PaymentController;
import Controllers.CustomerController;
import Models.Customer;

/**
 *
 * @author AKILA KASUN
 */
public class Sales extends javax.swing.JFrame {

    DBconnector dob ;
    ResultSet rs ;
    PaymentController pob ;
    CustomerController ccob;
    Customer cob;
    double sum = 0;
    public Sales() {
        initComponents();
        dob = DBconnector.getSingleInstance() ;
        pob = new PaymentController();
        ccob = new CustomerController();
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
        txtprice = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtwatchno = new javax.swing.JTextField();
        combocbrand = new javax.swing.JComboBox<>();
        btnaddcustomer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btntotalprice = new javax.swing.JButton();
        btnaddtocart = new javax.swing.JButton();
        btnsearchWatch = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        btncustomerdetails = new javax.swing.JButton();
        btnsearchCutomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 170, 30));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 170, 30));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 170, 30));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 170, 30));
        jPanel1.add(txtwatchno, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 170, 30));

        combocbrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accurist", "ADINA Watches", "Adidas", "Adriatica", "A.L.B Atelier Le Brézéguet", "Alba", "Alexandre Christie", "American Waltham Watch Company", "Andersen Geneve", "Anonimo (watch)", "anOrdain", "Ansonia Clock Company", "Apple Inc.", "Aquastar", "Aragon", "Armand Nicolet", "Armani Exchange", "Armitron", "John Arnold", "Hajime Asaoka", "ASUAG", "Audemars Piguet", "Alpina", "Ateliers deMonaco", " ", "Backes & Strauss", "B-UHR", "Batman Secret Gadgets Watches", "Bausele", "Baume et Mercier", "Ball Watch Company", "Webb C. Ball", "Bedat & Co", "Beijing Watch Factory", "Bell & Ross", "Benetton Group", "Benrus", "BOLDR Supply Co", "Jochen Benzinger", "Binda Group", "Blancpain", "Blumarine", "Ernest Borel", "Bovet Fleurier", "Edouard Bovet", "Bozeman Watch Company", "Abraham-Louis Breguet", "Breguet (watch)", "Breil (company)", "Breitling", "Bremont Watch Company", "Gustav Bruemmer", "Buccellati", "Bulgari", "Bulova", "Burberry", " ", "Carl F. Bucherer", "Cartier SA", "Casio", "Cecil Purnell", "Catorex", "Century Time Gems Ltd", "Certina", "Chanel", "Charles Jourdan", "Charriol", "Konstantin Chaykin", "Chopard", "Christian Jacques", "Christopher Ward", "Chronoswiss", "Chung nam group", "Citizen Watch Co.", "Ck Calvin Klein", "Concord watch", "Corum", "Curtis Australia", "Cyma Watches", "Czapek & Cie", " ", "D1 Milano", "Dakota Watch Company", "Damasko", "Damiani", "Dan Henry Watches", "Daniel Wellington", "George Daniels", "Daywatch", "Aaron Lufkin Dennison", "Edward John Dent", "Dior", "D. Dornblüth & Sohn", "Doxa S.A.", "Dreffa", "Dubey Schaldenbrand", "Roger Dubuis", "Dueber-Hampden Watch Company", " ", "Thomas Earnshaw", "Ebel", "Eberhard & Co.", "Edox", "Etienne Aigner", "Elgin National Watch Company", "Emporio Armani", "EPOS", "Endura Watch Factory", "Louis Erard", "ETA SA", "ESPRIT", "Eterna", " ", "Fastrack (fashion accessories)", "A. Favre & Fils", "Carlo Ferrara", "Festina", "Favre-Leuba", "Fendi", "Fila", "Fortis Uhren", "Frédérique Constant", "Fossil, Inc.", "Folli Follie", "Charles Frodsham", "French Connection", "Karsten Frässdorf", "Fitbit", "Franck Muller", " ", "Gallet & Co.", "Garmin", "Léon Gallet", "Romain Gauthier", "General Watch Co", "Louis George (biography)", "Giordano", "Girard-Perregaux", "Glashütte Original", "Glycine Watch", "George Graham", "Greubel Forsey", "Moritz Grossmann", "Grovana Watch", "Gruen Watch Co.", "Guess Watches Co.", " ", "Halda Watch Company", "Vianney Halter", "Hamilton Watch Company", "Hangzhou Watch Company", "Hanhart", "Hanowa", "John Harrison", "Hermès", "HMT Limited", "E. Howard & Co.", "Hublot", "Hugo Boss", " ", "Ikepod", "Illinois Watch Company", "Ingersoll Watch Company", "International Watch Company", "Invicta Watch Group", " ", "Jaeger-LeCoultre", "Pierre Jaquet-Droz", "Georg Jensen", "Jacob & Co", "Jean Perret", "F.P. Journe", "Jowissa", "Junghans", "Jules Jurgensen", "Jorg Gray", "Jaipur Watch Company", " ", "Kienzle", "Kudoke", "Kurono Tokyo", "Kikuchi Nakagawa", " ", "Lacoste", "Laco Uhrenmanufaktur", "Lancashire Watch Company", "Lang & Heyne", "A. Lange & Söhne", "Jean Lassale", "Leijona watch", "Lemania", "Levi Strauss & Co.", "Lilienthal Berlin", "Limit", "Linde Werdelin", "Lip", "Peter Litherland", "Locman", "Longines", "Louis Erard", "Louis Moinet", "Louis Vuitton", "Luch", "Luminox", " ", "Maitres du Temps", "Manhattan Watch Company", "Manistee Watch", "Manufacture royale", "Marc Ecko", "Mathey-Tissot", "Maurice Lacroix", "MB&F", "MeisterSinger", "Melbourne Watch Company", "Mido", "Molnija", "Ming", "Mondaine", "Louis Moinet", "Montblanc", "Montegrappa", "Morellato Group", "Moschino", "H. Moser & Cie", "Mossimo", "Movado", "Franck Muller", " ", "Newgate Watches", "Nivada", "Nixon Watches", "Nomos Glashütte", "Nostal", "Nike Inc.", " ", "Ollech & Wajs", "Omega SA", "Orex", "Orient Watch Co., Ltd.", "Oris", "O bag", " ", "Panerai", "Parmigiani Fleurier", "Parnis Watches", "Antoni Patek", "Patek Philippe & Co.", "Perrelet", "Pequignet", "Petrodvorets Watch Factory (Russian: Петродворцовый часовой завод)", "Philip Zepter", "Piaget SA", "Pierre De Roche", "Adrien Philippe", "Philip Watch", "Henry Pitkin", "Pobeda (Russian: Победа, Victory)", "Poljot", "Polo Ralph Lauren", "Prada", "Pulsar (watch)", "Police (brand)", "PRIM", " ", "Ritzy Group", "Rado", "Raketa (Russian: Ракета, Rocket)", "David Ramsay", "Razer Inc.", "Raymond Weil", "Regina", "Reguladora", "Ressence", "Revue Thommen", "Richard Mille", "Roamer", "Rodania", "Rolex", "ROSTAM", "ROMAGO", "Ronda AG", "Rotary Watches", "Daniel Roth", " ", "Samsung Galaxy Watch", "Sandoz watches", "Schwarz Etienne", "Sea-Gull", "Sector", "Seiko", "Seiko Epson", "Seiko Instruments", "Seikosha", "Sekonda", "Shinola Detroit", "Shanghai Watch Co.", "Shoreham Watches", "Sinn (watchmaker)", "SSIH previous holding company, now integrated into Swatch Group", "Skagen Designs", "Alexander Shorokhoff", "Slava watches", "Slow watch", "Roger W. Smith", "SMH short for Société de Microélectronique et d'Horlogerie previous name of the company issued from the merger of ASUAG & SSIH, now Swatch Group", "Solvil et Titus", "Speake-Marin", "Star Watch Case Company", "Stauer", "Stepan Sarpaneva", "Stowa", "Andreas Strehler", "Stührling", "STUNIII", "Suunto", "Swatch Group", " ", "TAG Heuer", "Technos", "Seth Thomas", "Thomas Tompion", "Tianjin Sea-Gull", "Tiffany & Co", "Timex Group", "Tissot", "Titan Industries", "Tommy Hilfiger", "Tourneau", "ToyWatch", "Traska", "Rashid Tsoroev", "Tudor", "Tutima", "TW Steel", "Titoni", "Hawler", "Tusal", " ", "Ulysse Nardin", "Universal Genève", "kidus", "Urwerk", " ", "Vacheron Constantin", "Vacuum Chronometer Corporation", "Valjoux", "Versus (Versace)", "Victorinox", "Visconti (company)", "Vostok watches", " ", "Waltham International SA", "Waltham Watch Company", "Christopher Ward (watchmaker)", "Wenger", "Westclox", "WeWOOD", "West End Watch Co", "Wittnauer", "Wyler (company)", "Joseph Windmills", "Harry Winston", " ", "Xezo", " ", "Yema (watch)", " ", "Zenith", "Zeno-Watch Basel", "Zetner (watchmaker) U.K.", "Zodiac Watches", "Zero West" }));
        jPanel1.add(combocbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 170, 30));

        btnaddcustomer.setBackground(new java.awt.Color(102, 0, 153));
        btnaddcustomer.setFont(new java.awt.Font("Californian FB", 1, 17)); // NOI18N
        btnaddcustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnaddcustomer.setText("Add Customer");
        btnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 140, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 70));

        btnBack.setBackground(new java.awt.Color(102, 0, 153));
        btnBack.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SAL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        btntotalprice.setText("toal price");
        btntotalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalpriceActionPerformed(evt);
            }
        });
        jPanel1.add(btntotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 120, 30));

        btnaddtocart.setText("add to cart");
        btnaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtocartActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 110, 30));

        btnsearchWatch.setText("search");
        btnsearchWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchWatchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearchWatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 110, -1));

        btnpayment.setText("reset");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 130, 30));

        btncustomerdetails.setText("customer details");
        btncustomerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btncustomerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 180, 30));

        btnsearchCutomer.setText("search");
        btnsearchCutomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchCutomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearchCutomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 110, -1));

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

    private void btncustomerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncustomerdetailsActionPerformed

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
         new Payment().setVisible(true);
    }//GEN-LAST:event_btnpaymentActionPerformed

    private void btnsearchCutomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchCutomerActionPerformed
        try{
            String cusID = txtID.getText();
            rs = dob.ShowExecuteQuary("select *from cutomer where CustomerID = '"+cusID+"'");
            if(rs.next()){
                txtID.setText(rs.getString("CustomerID"));
                txtname.setText(rs.getString("CustomerName"));
                txtEmail.setText(rs.getString("Email"));
            }else{
                JOptionPane.showMessageDialog(rootPane,"Customer Not Found !","Error",0);
            }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(rootPane,"Customer Not Found !","Error",0);
        }
        
        
    }//GEN-LAST:event_btnsearchCutomerActionPerformed

    private void btnsearchWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchWatchActionPerformed
        try{
            String WatchID = txtwatchno.getText();
            rs = dob.ShowExecuteQuary("select * from watches where ModelNo = '"+WatchID+"' ");
            if(rs.next()){
                txtprice.setText(rs.getString("Price"));
                txtwatchno.setText(rs.getString("ModelNo"));
            }else{
                JOptionPane.showMessageDialog(rootPane,"Watches Not Found !","Error",0);
            }
        }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(rootPane,"Watches Not Found !","Error",0);
        }
        
    }//GEN-LAST:event_btnsearchWatchActionPerformed

    private void btnaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtocartActionPerformed
            double price = Double.parseDouble(txtprice.getText());
            String WatchID = txtwatchno.getText();
            double totalPrice = price ;
            this.sum += totalPrice ;
            String cusID = txtID.getText();
            String invoice = WatchID.substring(0,2);
            invoice = invoice.concat(cusID.substring(0,3));
            if(sum == totalPrice){
                try{  
                    boolean result = dob.ExecuteQuary("insert into payment values ('"+invoice+"','DS',"+totalPrice+", "+totalPrice+" )");
                    if(result){
                         JOptionPane.showMessageDialog(rootPane,"Successfully Added to the payment Database !" , "Info",1);
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"Database Error while adding the payment" , "Error",0);
                    }
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }else if(sum > totalPrice){
                rs = dob.ShowExecuteQuary("update payment set TotalPrice = "+sum+" where InvoiceNo = '"+invoice+"' ");
                if(rs.next()){
                     JOptionPane.showMessageDialog(rootPane,"Successfull updated" , "info",1);
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Updating Error" , "Error",0);
                }
            }
            boolean result = dob.ExecuteQuary("insert into purchase values ('"+cusID+"','"+WatchID+"', "+price+" )");
            if(result){
                JOptionPane.showMessageDialog(rootPane,"Successfully Added to the purchase Database !" , "Info",1);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Database Error while adding the purchase" , "Error",0);
            }
            
    }//GEN-LAST:event_btnaddtocartActionPerformed

    private void btntotalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalpriceActionPerformed
         JOptionPane.showMessageDialog(rootPane,"Total Price : " + sum , "info",1);
    }//GEN-LAST:event_btntotalpriceActionPerformed

    private void btnaddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcustomerActionPerformed
        String cusname = txtname.getText();
        String cusId = txtID.getText();
        String cusEmail = txtEmail.getText();
        
        cob = ccob.AddCustomer(cusname, cusId, cusEmail);
        boolean result = ccob.InsterCustomerToDB(cob);
        if(result){
                JOptionPane.showMessageDialog(rootPane,"Successfully Added to the Customer Database !" , "Info",1);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Database Error while adding the Customer" , "Error",0);
            }
    }//GEN-LAST:event_btnaddcustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MainMenue().setVisible(true);
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnaddcustomer;
    private javax.swing.JButton btnaddtocart;
    private javax.swing.JButton btncustomerdetails;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnsearchCutomer;
    private javax.swing.JButton btnsearchWatch;
    private javax.swing.JButton btntotalprice;
    private javax.swing.JComboBox<String> combocbrand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtwatchno;
    // End of variables declaration//GEN-END:variables
}
