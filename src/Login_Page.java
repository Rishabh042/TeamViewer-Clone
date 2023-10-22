

import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class Login_Page extends javax.swing.JFrame {

    public Login_Page() 
    {
        initComponents();
        
        ImageIcon ic = new ImageIcon("C:\\Users\\hp\\Downloads\\pngwing.com.png");

        Image img = ic.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(), Image.SCALE_SMOOTH);

        ImageIcon ic2 = new ImageIcon(img);
        jButton1.setIcon(ic2);
        
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        psw = new javax.swing.JPasswordField();
        bt1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 340, 70);

        lb1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("email");
        getContentPane().add(lb1);
        lb1.setBounds(70, 160, 110, 30);

        tf1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(220, 160, 210, 30);

        lb2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("password");
        getContentPane().add(lb2);
        lb2.setBounds(60, 240, 110, 30);

        psw.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(psw);
        psw.setBounds(220, 240, 210, 30);

        bt1.setBackground(new java.awt.Color(255, 255, 0));
        bt1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt1.setText("LOGIN");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(120, 350, 200, 70);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 10, 72, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String u = tf1.getText().trim();
        String p = psw.getText().trim();
        
        if(checkLogin(u,p))
        {
            JOptionPane.showMessageDialog(rootPane, "Login Successful");
            
            Welcome_To_Team_Viewer obj = new Welcome_To_Team_Viewer();
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Login Failed");
        }
        dispose();
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Welcome o1 = new Welcome();
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     
     static boolean checkLogin(String u, String p)
     {
         try 
         {
             ResultSet rs = DBLoader.executeSQL("select * from users where email=\'"+u+"\'and password=\'"+p+"\'");
             
             if(rs.next())
                 return true;
             else
                 return false;
         }
         catch (Exception ex) 
         {
             ex.printStackTrace();
         }
        return false;
     } 
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
