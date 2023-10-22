
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Welcome extends javax.swing.JFrame 
{
    
    Sign_Up_Page sup;
    Login_Page lpg;
    Server_on_off sof;
    public Welcome() 
    {
        initComponents();
        
        
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
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGNUP / LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 80);

        bt1.setBackground(new java.awt.Color(255, 255, 0));
        bt1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 51, 0));
        bt1.setText("SIGNUP");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(130, 160, 230, 60);

        bt2.setBackground(new java.awt.Color(255, 255, 0));
        bt2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 51, 51));
        bt2.setText("LOGIN");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(130, 280, 240, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
      sup = new Sign_Up_Page();
      dispose();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
     lpg = new Login_Page();
     dispose();
    }//GEN-LAST:event_bt2ActionPerformed
    
    

            
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
