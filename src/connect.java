
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class connect extends javax.swing.JFrame {

    String IP = "";

    public connect(String ip) {
        initComponents();
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        IP = ip;
        
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK
        );

        getIp();

        //        Mouse Motion Listener To Move the mouse
        lb1.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                try {
                    moveMouse(x, y);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

////        Mouse Listener To make Mouse Clickable.
        lb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    clickMouse();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
//        
////        Mouse Wheel Listener To Make The Mouse Scrollable.
        lb1.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int scroll = e.getScrollAmount();
                try {
                    mouseScrollable(scroll);
                } catch (UnirestException ex) {
                    Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        lb1.requestFocus();

        lb1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                try {
                    ClickKey(key);
                } catch (UnirestException ex) {
                    Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                
                try {
                    ReleaseKey(key);
                } catch (UnirestException ex) {
                    Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }

        });

    }

    connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getIp() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Inside Function");
                        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/getScreenshot").asString();
                        if (res.getStatus() == 200) {
                            String path = res.getBody();

                            System.out.println("Path : " + path);

                            if (path.length() > 0) {
                                URL url = new URL("http://" + IP + ":9000/getResource/" + path);

                                ImageIcon ic = new ImageIcon(url);

                                Image img = ic.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH);

                                ImageIcon ic2 = new ImageIcon(img);

                                lb1.setIcon(ic2);
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();

    }

    void moveMouse(int x, int y) throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/mouse-move").queryString("xcoord", x)
                .queryString("ycoord", y)
                .asString();
    }

    void clickMouse() throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/clickMouse").asString();
    }

    void mouseScrollable(int scroll) throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/MouseScrollable").queryString("scroll", scroll).asString();
    }

    void ClickKey(int key) throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/ClickKey").queryString("Key", key).asString();
    }

    void ReleaseKey(int key) throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/ReleaseKey").queryString("Key", key).asString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        bt6 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("ShutDown");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setText("label1");
        getContentPane().add(lb1);
        lb1.setBounds(0, 20, 1330, 750);

        bt6.setBackground(new java.awt.Color(255, 255, 0));
        bt6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt6.setText("View Drivers");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6);
        bt6.setBounds(1340, 660, 180, 80);

        bt1.setBackground(new java.awt.Color(255, 255, 0));
        bt1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(51, 0, 51));
        bt1.setText("ShutDown");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(1340, 60, 160, 80);

        bt2.setBackground(new java.awt.Color(255, 255, 0));
        bt2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt2.setText("Restart");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(1340, 180, 140, 80);

        bt3.setBackground(new java.awt.Color(255, 255, 0));
        bt3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt3.setForeground(new java.awt.Color(51, 51, 0));
        bt3.setText("Sleep");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(1340, 320, 140, 70);

        bt4.setBackground(new java.awt.Color(255, 255, 0));
        bt4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt4.setText("Send Message");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(1340, 440, 190, 70);

        bt5.setBackground(new java.awt.Color(255, 255, 0));
        bt5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bt5.setText("Get Configuration");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5);
        bt5.setBounds(1340, 550, 232, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        try {
            Disk_Drivers o1 = new Disk_Drivers(IP);
            o1.setVisible(true);
            dispose();
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        try {
            HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/Restart").asString();
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        try {

            String ans = JOptionPane.showInputDialog(this, "Write a Message");

            HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/SendMessage").queryString("message", ans).asString();
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        try {
            HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/Sleep").asString();
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        Configuration o1 = new Configuration(IP);
        o1.setVisible(true);

    }//GEN-LAST:event_bt5ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        try {
            HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/Shutdown").asString();
        } catch (UnirestException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new connect("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables

    private void Rectangle(Dimension screenSize) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
