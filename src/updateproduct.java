import java.sql.*;
import javax.swing.JOptionPane;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class updateproduct extends javax.swing.JFrame {

    /**
     * Creates new form updateproduct
     */ResultSet rs;
    public updateproduct() {
        initComponents();
        setBounds(1,1,856, 702);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (64).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 100, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("Update Product");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 40, 390, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 122, 860, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 860, 2);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 580, 860, 2);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (74).png"))); // NOI18N
        b2.setText("Reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(360, 620, 140, 40);

        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (73).png"))); // NOI18N
        b3.setText("Close");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(610, 620, 140, 40);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("Update");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(100, 620, 140, 40);

        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (78).png"))); // NOI18N
        b4.setText("Search");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(610, 150, 160, 50);

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setText("Product Name");
        getContentPane().add(l1);
        l1.setBounds(150, 260, 129, 40);

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(350, 260, 360, 40);

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setText("Rate");
        getContentPane().add(l2);
        l2.setBounds(150, 350, 110, 40);

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setText("Discription");
        getContentPane().add(l3);
        l3.setBounds(150, 430, 110, 40);

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setText("Product Id");
        getContentPane().add(l4);
        l4.setBounds(50, 150, 100, 40);

        t3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(350, 340, 360, 40);

        t4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t4);
        t4.setBounds(350, 430, 360, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(220, 150, 220, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (77).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 860, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
setVisible(false);
updateproduct u1=new updateproduct();
u1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      try
      {
Class.forName("com.mysql.jdbc.Driver");
      

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","");
Statement st=c.createStatement();
int i=st.executeUpdate("update newproduct set productname='"+t2.getText()+"',rate='"+t3.getText()+"',description='"+t4.getText()+"'");
if(i==1)
{t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));

JOptionPane.showMessageDialog(null,"successfully updates");
}      }
      catch(Exception m)
      {
        System.out.print(m); } 
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from newproduct where productid='"+t1.getText()+"'");
if(rs.next())
{t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
}
else
    JOptionPane.showMessageDialog(null,"ProductId Does not exist");
}
catch(Exception e)
{
    
}// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

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
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
