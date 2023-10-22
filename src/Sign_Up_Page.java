
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.*;

public class Sign_Up_Page extends javax.swing.JFrame {

    JFileChooser jfc;
    File ph;

    public Sign_Up_Page() {
        initComponents();
        ImageIcon ic = new ImageIcon("C:\\Users\\hp\\Downloads\\pngwing.com.png");

        Image img = ic.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_SMOOTH);

        ImageIcon ic2 = new ImageIcon(img);
        jButton1.setIcon(ic2);

        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        psw = new javax.swing.JPasswordField();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("USER SIGNUP");
        lb1.setToolTipText("");
        getContentPane().add(lb1);
        lb1.setBounds(80, 0, 350, 60);

        lb2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("username");
        getContentPane().add(lb2);
        lb2.setBounds(10, 80, 160, 40);

        tf1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(180, 80, 270, 40);

        lb3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("email");
        getContentPane().add(lb3);
        lb3.setBounds(10, 160, 160, 40);

        tf2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(180, 160, 270, 40);

        lb4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("password");
        getContentPane().add(lb4);
        lb4.setBounds(10, 240, 160, 40);

        tf3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(tf3);
        tf3.setBounds(180, 310, 270, 40);

        lb5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("phone");
        getContentPane().add(lb5);
        lb5.setBounds(10, 310, 160, 40);

        psw.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        getContentPane().add(psw);
        psw.setBounds(180, 240, 270, 40);

        lb6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("photo");
        getContentPane().add(lb6);
        lb6.setBounds(10, 390, 70, 30);

        lb7.setText("jLabel7");
        getContentPane().add(lb7);
        lb7.setBounds(160, 370, 110, 100);

        bt1.setBackground(new java.awt.Color(255, 255, 0));
        bt1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt1.setText("BROWSE");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(330, 400, 150, 50);

        bt2.setBackground(new java.awt.Color(255, 255, 0));
        bt2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt2.setText("SUMBIT");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(180, 490, 150, 50);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 10, 72, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        jfc = new JFileChooser();

        int ans = jfc.showOpenDialog(this);

        if (ans == JFileChooser.APPROVE_OPTION) {
            ph = jfc.getSelectedFile();

            ImageIcon ic = new ImageIcon(ph.getPath());

            Image img = ic.getImage().getScaledInstance(lb7.getWidth(), lb7.getHeight(), Image.SCALE_SMOOTH);

            ImageIcon ic1 = new ImageIcon(img);

            lb7.setIcon(ic1);

        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        String username = tf1.getText();
        String email = tf2.getText();
        String password = psw.getText();
        String phone = tf3.getText();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty() || ph == null) {
            JOptionPane.showMessageDialog(rootPane, "ALL FIELDS ARE MANDATORY");
        } else {
            String ans = MyClient.signup(username, email, password, phone, ph);

            if (ans.equals("exist")) {
                JOptionPane.showMessageDialog(rootPane, "Already exits");
            } else if (ans.equals("success")) {
                JOptionPane.showMessageDialog(rootPane, "SUCCESS");
                System.out.println("In Success");
                Welcome_To_Team_Viewer o1 = new Welcome_To_Team_Viewer();
                o1.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, ans);
            }
        }
        dispose();
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Welcome o1 = new Welcome();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
