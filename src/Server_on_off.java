
import java.awt.Color;

public class Server_on_off extends javax.swing.JFrame {

    MyServer obj;
    Welcome wlc;

    public Server_on_off() {
        initComponents();

        setSize(500,550);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK
        );

        setLocationRelativeTo(null);

        bt2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt1.setBackground(new java.awt.Color(255, 255, 0));
        bt1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 51));
        bt1.setText("START");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(130, 120, 230, 70);

        bt2.setBackground(new java.awt.Color(255, 255, 0));
        bt2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt2.setForeground(new java.awt.Color(51, 0, 51));
        bt2.setText("STOP");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(130, 220, 230, 70);

        bt3.setBackground(new java.awt.Color(255, 255, 0));
        bt3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt3.setText("LET'S GO");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(130, 330, 230, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MADE BY :  Rishabh Kataria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 450, 280, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SERVER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -4, 490, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        try {
            obj = new MyServer(9000);

            bt1.setEnabled(false);
            bt2.setEnabled(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed

        obj.shutdown();
        bt1.setEnabled(true);
        bt2.setEnabled(false);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        wlc = new Welcome();
        dispose();
    }//GEN-LAST:event_bt3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server_on_off().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
