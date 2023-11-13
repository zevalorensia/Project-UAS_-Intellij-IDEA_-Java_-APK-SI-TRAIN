//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tiket;

import com.mysql.jdbc.Connection;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame {
    Connection con;
    Statement st;
    private JButton btnlogin;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel login;
    private JPasswordField password;
    private JTextField username;

    public Login() {
        this.initComponents();
    }

    private void initComponents() {
        this.login = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.username = new JTextField();
        this.password = new JPasswordField();
        this.btnlogin = new JButton();
        this.jLabel3 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.login.setBackground(new Color(71, 104, 139));
        this.jLabel1.setFont(new Font("Times New Roman", 0, 24));
        this.jLabel1.setText("Username");
        this.jLabel2.setFont(new Font("Times New Roman", 0, 24));
        this.jLabel2.setText("Password");
        this.username.setFont(new Font("Times New Roman", 0, 24));
        this.password.setFont(new Font("Times New Roman", 0, 24));
        this.btnlogin.setBackground(new Color(100, 239, 100));
        this.btnlogin.setFont(new Font("Times New Roman", 0, 24));
        this.btnlogin.setText("LOGIN");
        this.btnlogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.btnloginActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Times New Roman", 0, 48));
        this.jLabel3.setText("SI TRAIN ");
        GroupLayout loginLayout = new GroupLayout(this.login);
        this.login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(loginLayout.createParallelGroup(Alignment.LEADING).addGroup(loginLayout.createSequentialGroup().addGroup(loginLayout.createParallelGroup(Alignment.LEADING).addGroup(loginLayout.createSequentialGroup().addGap(39, 39, 39).addGroup(loginLayout.createParallelGroup(Alignment.TRAILING).addComponent(this.jLabel2).addComponent(this.jLabel1)).addGap(18, 18, 18).addGroup(loginLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.username).addComponent(this.password, -1, 207, 32767))).addGroup(loginLayout.createSequentialGroup().addGap(135, 135, 135).addComponent(this.btnlogin, -2, 134, -2))).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, loginLayout.createSequentialGroup().addGap(0, 87, 32767).addComponent(this.jLabel3).addGap(85, 85, 85)));
        loginLayout.setVerticalGroup(loginLayout.createParallelGroup(Alignment.LEADING).addGroup(loginLayout.createSequentialGroup().addGap(19, 19, 19).addComponent(this.jLabel3).addGap(18, 18, 18).addGroup(loginLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jLabel1).addComponent(this.username, -1, 35, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(loginLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jLabel2, -1, -1, 32767).addComponent(this.password)).addGap(36, 36, 36).addComponent(this.btnlogin).addContainerGap(54, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.login, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.login, -1, -1, 32767));
        this.pack();
        this.setLocationRelativeTo((Component)null);
    }

    private void btnloginActionPerformed(ActionEvent evt) {
        try {
            String pass = new String(this.password.getPassword());
            this.con = Koneksi.getKoneksi();
            String var10000 = this.username.getText();
            String sql = "SELECT * FROM admin WHERE username='" + var10000 + "' And password='" + pass + "'";
            this.st = this.con.createStatement();
            ResultSet rs = this.st.executeQuery(sql);
            if (rs.next()) {
                if (this.username.getText().equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                    (new Home()).setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog((Component)null, "Gagal Login");
            }
        } catch (SQLException var5) {
            JOptionPane.showMessageDialog(this, var5.getMessage());
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Login()).setVisible(true);
            }
        });
    }
}
