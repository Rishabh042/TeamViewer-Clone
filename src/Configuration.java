
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Configuration extends javax.swing.JFrame {

    String IP = "";

    public Configuration(String ip) {
        initComponents();
        
        ImageIcon ic = new ImageIcon("C:\\Users\\hp\\Downloads\\pngwing.com.png");

        Image img = ic.getImage().getScaledInstance(jButton2.getWidth(),jButton2.getHeight(), Image.SCALE_SMOOTH);

        ImageIcon ic2 = new ImageIcon(img);
        jButton2.setIcon(ic2);
        
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK
        );
        
        IP = ip;

        Cofiguration();

    }

    void Cofiguration() {
        try {
            HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/GetConfiguration").asString();
            String ans = res.getBody();
            System.out.println(ans);
            
            StringTokenizer st = new StringTokenizer(ans, ";");
            while(st.hasMoreTokens()){
                String osname = st.nextToken();
                String disksize = st.nextToken();
                String username = st.nextToken();
                String cores = st.nextToken();
                String memorySize = st.nextToken();
                
                
                lb7.setText(osname);
                lb8.setText(disksize);
                lb9.setText(username);
                lb10.setText(cores);
                lb11.setText(memorySize);
            }
            
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("System Configuration");
        getContentPane().add(lb1);
        lb1.setBounds(210, 0, 1160, 100);

        lb6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("Core is :");
        getContentPane().add(lb6);
        lb6.setBounds(560, 700, 210, 50);

        lb2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Opeartion System :");
        getContentPane().add(lb2);
        lb2.setBounds(400, 160, 350, 70);

        lb3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("Disk Size :");
        getContentPane().add(lb3);
        lb3.setBounds(490, 300, 310, 50);

        lb4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("User Name :");
        getContentPane().add(lb4);
        lb4.setBounds(520, 430, 210, 50);

        lb5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("Max Memory :");
        getContentPane().add(lb5);
        lb5.setBounds(450, 560, 330, 50);

        lb11.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb11.setForeground(new java.awt.Color(255, 255, 255));
        lb11.setText("jLabel7");
        getContentPane().add(lb11);
        lb11.setBounds(850, 700, 720, 50);

        lb7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb7.setText("jLabel7");
        getContentPane().add(lb7);
        lb7.setBounds(880, 170, 690, 60);

        lb8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb8.setText("jLabel7");
        getContentPane().add(lb8);
        lb8.setBounds(870, 300, 660, 50);

        lb9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb9.setForeground(new java.awt.Color(255, 255, 255));
        lb9.setText("jLabel7");
        getContentPane().add(lb9);
        lb9.setBounds(870, 420, 700, 50);

        lb10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb10.setForeground(new java.awt.Color(255, 255, 255));
        lb10.setText("jLabel7");
        getContentPane().add(lb10);
        lb10.setBounds(860, 570, 710, 50);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 10, 140, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    connect o1 = new connect(IP);
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuration("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    // End of variables declaration//GEN-END:variables
}
