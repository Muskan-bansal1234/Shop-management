import java.sql.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class updatebuyer extends javax.swing.JFrame {

    /**
     * Creates new form updatebuyer
     */
    ResultSet rs;
    public updatebuyer() {
        initComponents();
        setBounds(1,1,858, 692);
        
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
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(600, 200));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (60).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 111, 86);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setText("Update Buyer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 20, 400, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 126, 860, 2);

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setText("Contact No.");
        getContentPane().add(l2);
        l2.setBounds(90, 320, 130, 40);

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setText("Email");
        getContentPane().add(l3);
        l3.setBounds(90, 380, 130, 40);

        l5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l5.setText("Gender");
        getContentPane().add(l5);
        l5.setBounds(90, 500, 130, 40);

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setText("Address");
        getContentPane().add(l4);
        l4.setBounds(90, 440, 130, 40);

        l6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l6.setText("Contact No.");
        getContentPane().add(l6);
        l6.setBounds(90, 140, 130, 50);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 570, 860, 2);

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (74).png"))); // NOI18N
        b2.setText("Reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(320, 610, 120, 33);

        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (78).png"))); // NOI18N
        b4.setText("Search");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(600, 150, 130, 37);

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("Update");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(70, 610, 120, 31);

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(260, 320, 430, 28);

        t3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(260, 380, 430, 28);

        t4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t4);
        t4.setBounds(260, 450, 430, 28);

        t5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t5);
        t5.setBounds(260, 510, 430, 28);

        t6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t6);
        t6.setBounds(250, 150, 260, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 220, 860, 2);

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setText("Name");
        getContentPane().add(l1);
        l1.setBounds(90, 260, 130, 40);

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(260, 260, 430, 28);

        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (73).png"))); // NOI18N
        b3.setText("Close");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(570, 610, 120, 31);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (77).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -30, 850, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
setVisible(false);
updatebuyer u1=new updatebuyer();
u1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","");
Statement st=c.createStatement();
ResultSet rs=st.executeQuery("select * from newbuyer where Contact='"+t6.getText()+"'");
if(rs.next())
{t1.setText(rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
}
else
    JOptionPane.showMessageDialog(null,"ContactId Does not exist");
}
catch(Exception e)
{
    
}// TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

      try
      {
Class.forName("com.mysql.jdbc.Driver");
      

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","");
Statement st=c.createStatement();
int i=st.executeUpdate("update newbuyer set Name='"+t1.getText()+"',Contact='"+t2.getText()+"',Email='"+t3.getText()+"',Address='"+t4.getText()+"',Gender='"+t5.getText()+"'");
if(i==1)
{t1.setText(rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
JOptionPane.showMessageDialog(null,"successfully updates");
}      }
      catch(Exception m)
      {
        System.out.print(m); } 
//String s=t6.getText();lpl[rffur handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(updatebuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatebuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatebuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatebuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatebuyer().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
