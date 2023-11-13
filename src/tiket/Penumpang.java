//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tiket;

import com.mysql.jdbc.Connection;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Penumpang extends JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    private JButton Hapus;
    private JButton jButton1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JTable penumpang;

    public Penumpang() {
        this.initComponents();
        Koneksi.getKoneksi();
        this.data();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.penumpang = new JTable();
        this.jPanel3 = new JPanel();
        this.jButton1 = new JButton();
        this.jPanel5 = new JPanel();
        this.Hapus = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem2 = new JMenuItem();
        this.jMenuItem1 = new JMenuItem();
        this.jMenu2 = new JMenu();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(71, 104, 139));
        this.jPanel2.setBackground(new Color(71, 104, 139));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder("Data Penumpang"));
        this.penumpang.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "Nama", "Alamat", "Kereta", "Gerbong", "Stasiun Tujuan", "Jam Berangkatl", "Jam Tiba", "Tanggal", "Dewasa", "Anak", "Total"}) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, true};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.penumpang);
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 350, 32767).addContainerGap()));
        this.jPanel3.setBackground(new Color(71, 104, 139));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder("Print"));
        this.jButton1.setBackground(new Color(171, 196, 222));
        this.jButton1.setFont(new Font("Tahoma", 0, 18));
        this.jButton1.setText("Print");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Penumpang.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.jButton1, -2, 206, -2).addContainerGap(27, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1, -2, 52, -2).addContainerGap(-1, 32767)));
        this.jPanel5.setBackground(new Color(71, 104, 139));
        this.jPanel5.setBorder(BorderFactory.createTitledBorder("Hapus Semua Data"));
        this.Hapus.setBackground(new Color(171, 196, 222));
        this.Hapus.setFont(new Font("Tahoma", 0, 18));
        this.Hapus.setText("Hapus");
        this.Hapus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Penumpang.this.HapusActionPerformed(evt);
            }
        });
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.Hapus, -1, 205, 32767).addGap(20, 20, 20)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.Hapus, -2, 49, -2).addContainerGap(-1, 32767)));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED, 273, 32767).addComponent(this.jPanel5, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -1, -1, 32767))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jPanel3, Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel5, -1, -1, 32767)).addContainerGap(-1, 32767)));
        this.jMenu1.setText("File");
        this.jMenuItem2.setText("Admin");
        this.jMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Penumpang.this.jMenuItem2ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem2);
        this.jMenuItem1.setText("Keluar");
        this.jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {Penumpang.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.jMenu2.setText("Tiket");
        this.jMenu2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Penumpang.this.home(evt);
            }
        });
        this.jMenuBar1.add(this.jMenu2);
        this.setJMenuBar(this.jMenuBar1);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }


    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    private void home(MouseEvent evt) {
        (new Home()).setVisible(true);
        this.dispose();
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt) {
        (new Admin()).setVisible(true);
        this.dispose();
    }

    private void HapusActionPerformed(ActionEvent evt) {
        try {
            int pesan = JOptionPane.showOptionDialog(this, "Yakin Ingin Menghapus Data?", "Bener Yeuh", 0, 3, (Icon)null, (Object[])null, (Object)null);
            if (pesan == 0) {
                this.con = Koneksi.getKoneksi();
                String sql = "DELETE FROM penumpang";
                this.st = this.con.createStatement();
                this.st.execute(sql);
                JOptionPane.showMessageDialog((Component)null, "Berhasil");
                DefaultTableModel model = (DefaultTableModel)this.penumpang.getModel();
                model.setRowCount(0);
                this.data();
            }
        } catch (SQLException var5) {
            JOptionPane.showMessageDialog((Component)null, var5);
        }

    }

    private void data() {
        try {
            this.con = Koneksi.getKoneksi();
            String sql1 = "SELECT * FROM penumpang order by id ASC";
            this.st = this.con.createStatement();
            this.rs = this.st.executeQuery(sql1);

            while(this.rs.next()) {
                DefaultTableModel model = (DefaultTableModel)this.penumpang.getModel();
                Object[] row = new Object[]{this.rs.getString("id"), this.rs.getString("nama"), this.rs.getString("alamat"), this.rs.getString("kereta"), this.rs.getString("gerbong"), this.rs.getString("awal"), this.rs.getString("tujuan"), this.rs.getString("berangkat"), this.rs.getString("tiba"), this.rs.getString("tanggal"), this.rs.getString("dewasa"), this.rs.getString("anak"), this.rs.getString("total")};
                model.addRow(row);
            }
        } catch (SQLException var4) {
            JOptionPane.showMessageDialog((Component)null, var4);
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Penumpang.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Penumpang()).setVisible(true);
            }
        });
    }
}
