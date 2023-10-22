
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class Disk_Drivers extends javax.swing.JFrame {

    String IP = "";
    ArrayList<Disk> al;
    mytablemodel mtm;
    JTable jt;
    JScrollPane jsp;

    public Disk_Drivers(String ip) throws UnirestException {
        initComponents();
        
        ImageIcon ic = new ImageIcon("C:\\Users\\hp\\Downloads\\pngwing.com.png");

        Image img = ic.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(), Image.SCALE_SMOOTH);

        ImageIcon ic2 = new ImageIcon(img);
        jButton1.setIcon(ic2);
        

        mtm = new mytablemodel();
        al = new ArrayList();
        
        jsp = new JScrollPane(jt);
        jTable1.setModel(mtm);

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK
        );
        IP = ip;
        
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jTable1.getSelectedRow();
                moreInfo(row, ip);
            }
        });
        
        
        ShowDrive();
        
    }

    Disk_Drivers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    void moreInfo(int row, String gloip) {
        String name = al.get(row).diskname;

        DriveDetail obj = new DriveDetail(name, gloip);
        obj.setVisible(true);

    }

    class mytablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int i, int j) {
            Disk ds = al.get(i);

            if (j == 0) {
                return ds.diskname;
            } else if (j == 1) {
                return ds.type;
            } else if (j == 2) {
                return ds.totalspace;
            } else {
                return ds.freespace;
            }

        }

        @Override
        public String getColumnName(int j) {
            String col[] = {"diskname", "type", "totalSpace", "freespace"};
            return col[j];
        }
    }

    void ShowDrive() throws UnirestException {
        HttpResponse<String> res = Unirest.get("http://" + IP + ":9000/ShowDrive").asString();
        String ans = res.getBody();
        System.out.println(ans);

        StringTokenizer st = new StringTokenizer(ans, "~~");
        while (st.hasMoreTokens()) {
            String res2 = st.nextToken();

            StringTokenizer st2 = new StringTokenizer(res2, ";;");

            String aDrive = st2.nextToken();
            String type = st2.nextToken();
            String totalSpace = st2.nextToken();
            String freeSpace = st2.nextToken();

            System.out.println(aDrive);
            System.out.println(type);
            System.out.println(totalSpace);
            System.out.println(freeSpace);

            al.add(new Disk(aDrive, type, totalSpace, freeSpace));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 255, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 210, 1020, 500);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DISK DRIVERS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 0, 1170, 120);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 20, 140, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    connect o1 = new connect(IP);
   dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Disk_Drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disk_Drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disk_Drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disk_Drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Disk_Drivers("").setVisible(true);
                } catch (UnirestException ex) {
                    Logger.getLogger(Disk_Drivers.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
