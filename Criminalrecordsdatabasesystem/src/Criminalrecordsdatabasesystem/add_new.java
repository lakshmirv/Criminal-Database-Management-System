
package Criminalrecordsdatabasesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lakii
 */
public class add_new extends javax.swing.JFrame {

    private ResultSet rs;

    public add_new() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("CID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(438, 236, 31, 24);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(438, 292, 53, 22);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("DOB(MM-DD-YYYY)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(438, 350, 173, 24);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("CATEGORY");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(438, 409, 103, 24);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("SENTENCE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(438, 473, 98, 24);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("VICTIMS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(438, 547, 74, 24);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("DETAILS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(438, 616, 77, 24);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("PRISON");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(438, 683, 69, 24);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("CITY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(438, 757, 42, 24);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(699, 239, 223, 22);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(699, 294, 223, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(699, 353, 223, 22);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ENTER CRIMINAL DETAILS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 150, 490, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(699, 412, 223, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(699, 476, 223, 22);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(699, 550, 223, 22);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(699, 619, 223, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(699, 686, 223, 22);

        jButton1.setText("ADD CRIMINAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(516, 821, 117, 25);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(22, 830, 63, 25);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(699, 760, 223, 22);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Criminalrecordsdatabasesystem/public log.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1920, 1110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new policemainpage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cid = this.jTextField1.getText();
        String name = this.jTextField2.getText();
        String dob = this.jTextField3.getText();
        String category = this.jTextField4.getText();
        String sentence = this.jTextField5.getText();
        String victims = this.jTextField6.getText();
        String details = this.jTextField7.getText();
        String prison = this.jTextField8.getText();
        String city = this.jTextField9.getText();
        
        
        
    
    
    if (this.jTextField1.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter cid");
    } else if (this.jTextField2.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter name");
    } else if (this.jTextField3.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter dob");
    } else if (this.jTextField4.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter category");
    } else if (this.jTextField5.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter sentence");
    } else if (this.jTextField6.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter victims");
    } else if (this.jTextField7.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter details");
    } else if (this.jTextField8.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter prison");
    } else if (this.jTextField9.getText().equals(" ")) {
      JOptionPane.showMessageDialog(this, "please enter city");
    } 
      try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "LAKSHMI", "cse123");
        Statement stm = con.createStatement();
        String sql = "insert into CRIMINAL values ('" + cid + "','" + name + "','" + dob + "','" + category + "','" + sentence + "','" + victims + "','" + details + "','" + prison + "','" + city + "')";
        this.rs = stm.executeQuery(sql);
        JOptionPane.showMessageDialog(this, "registration succesful");
        setVisible(false);
        (new policemainpage()).setVisible(true);
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
      } 
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(add_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
