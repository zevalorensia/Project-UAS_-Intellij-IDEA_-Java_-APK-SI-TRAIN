/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import com.mysql.jdbc.Connection;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Home extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;
    
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Koneksi.getKoneksi();  
        fnama.requestFocus();
        bayangan1.setVisible(false);
        bayangan2.setVisible(false);
        bayangan3.setVisible(false);
        bayangan4.setVisible(false);
        bayangan5.setVisible(false);
        
       
        
//        Mmbuat ID Penumpang Otomatis
        autoid();
//        Memanggil Nama Kereta Api
//        kereta();
//        Mengambil Tanggal Sekarang
        Date date = new Date();
        tanggal.setDate(date); 
//        Memanggil Data Kelas
       // kelas();
      // harga1();
      
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stasiun_tujuan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sanak = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ckereta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sdewasa = new javax.swing.JSpinner();
        fbayar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cgerbong = new javax.swing.JComboBox<>();
        ltotal = new javax.swing.JLabel();
        lkembali = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        falamat = new javax.swing.JTextField();
        bayangan5 = new javax.swing.JTextField();
        hdewasa = new javax.swing.JLabel();
        hanak = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        stasiun_awal = new javax.swing.JTextField();
        berangkat = new javax.swing.JLabel();
        tiba = new javax.swing.JLabel();
        bayangan1 = new javax.swing.JTextField();
        bayangan2 = new javax.swing.JTextField();
        bayangan3 = new javax.swing.JTextField();
        bayangan4 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        btnsimpan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(71, 104, 139));
        jPanel1.setPreferredSize(new java.awt.Dimension(864, 432));

        jPanel2.setBackground(new java.awt.Color(237, 239, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nama Penumpang :");

        fnama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Stasiun Awal        :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Stasiun Tujuan     :");

        stasiun_tujuan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        stasiun_tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Surabaya Gubeng (SGU)", "Gambir (GMR)", "Solo Balapan (SLO)", "Semarang Tawang (SMT)", "Banjar (BJR)" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("ID Penumpang      :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Dewasa     :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Anak-anak :");

        sanak.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        sanak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                anak(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Rp.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Rp.");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Total         :");

        fid.setEditable(false);
        fid.setBackground(new java.awt.Color(204, 204, 255));
        fid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Kereta Api           :");

        ckereta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ckereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Argo Wilis", "Argo Parahyangan", "Lodaya" }));
        ckereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckeretaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Bayar        :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Kembali     :");

        sdewasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        sdewasa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dewasa(evt);
            }
        });

        fbayar.setBackground(new java.awt.Color(237, 239, 240));
        fbayar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bayar(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Gerbong              :");

        cgerbong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cgerbong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Eksekutif 1", "Eksekutif 2", "Ekonomi 1", "Ekonomi 2", "Ekonomi 3" }));
        cgerbong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas(evt);
            }
        });

        ltotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ltotal.setText("0");

        lkembali.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lkembali.setText("0");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Alamat                 :");

        falamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        bayangan5.setEditable(false);

        hdewasa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hdewasa.setText("0");

        hanak.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hanak.setText("0");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("/ Org");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("/ Org");

        stasiun_awal.setEditable(false);
        stasiun_awal.setBackground(new java.awt.Color(204, 204, 255));
        stasiun_awal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        stasiun_awal.setText("Bandung (BD)");

        berangkat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        berangkat.setText("00.00 WIB");

        tiba.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tiba.setText("00.00 WIB");

        bayangan1.setEditable(false);

        bayangan2.setEditable(false);

        bayangan3.setEditable(false);

        bayangan4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        bayangan4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bayangan4dewasa(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stasiun_awal, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stasiun_tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cgerbong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckereta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(berangkat)
                                            .addComponent(tiba)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bayangan4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(sanak, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hanak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel14))
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lkembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fbayar)
                                            .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(sdewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hdewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel25)))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bayangan5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bayangan2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(bayangan3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(falamat, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(falamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(stasiun_awal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(berangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(stasiun_tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiba, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bayangan4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(ckereta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cgerbong, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayangan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayangan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayangan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(sdewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hdewasa)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sanak, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(hanak)
                            .addComponent(jLabel26))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(176, 196, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnsimpan.setBackground(new java.awt.Color(176, 196, 222));
        btnsimpan.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Keluar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Penumpang");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporan(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
  
    
    private void autoid(){
       try{
            con = Koneksi.getKoneksi();
            String sql = "SELECT COUNT(id) as kode FROM penumpang";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                String kode = rs.getString("kode");
                int a = Integer.parseInt(kode);
                int b = a+1;
                fid.setText("MR."+b);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
 
    private void dewasa(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dewasa
        int a = (int) sdewasa.getValue();
        int b = Integer.parseInt(hdewasa.getText());
        int c = a*b;
        ltotal.setText("Rp. "+c);
        bayangan1.setText(""+c);
        
    }//GEN-LAST:event_dewasa

    private void anak(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_anak
      int a = Integer.parseInt(bayangan1.getText());
      int m = Integer.parseInt(hanak.getText());
      int b = (int) sanak.getValue();
      int c = b*m;
      int d = c+a;
      ltotal.setText("Rp. "+d);
      bayangan2.setText(""+d);
    }//GEN-LAST:event_anak

    private void bayar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayar
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(sanak.getValue().equals(0)){
            int a = Integer.parseInt(bayangan1.getText());
            int b = Integer.parseInt(fbayar.getText());
            int c = b-a;
            lkembali.setText("Rp. "+c);
          }else{
            int a = Integer.parseInt(bayangan2.getText());
            int b = Integer.parseInt(fbayar.getText());
            int c = b-a;
            lkembali.setText("Rp. "+c);
          }
      }
    }//GEN-LAST:event_bayar

    private void ckeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckeretaActionPerformed
        
        if(ckereta.getSelectedItem().equals("Argo Wilis")){
        bayangan4.setValue(1);
        ckereta.setSelectedIndex(1);
       }else if(ckereta.getSelectedItem().equals("Argo Parahyangan")){
       bayangan4.setValue(2);
       ckereta.setSelectedIndex(2);
       }
       else if(ckereta.getSelectedItem().equals("Lodaya")){
       bayangan4.setValue(3);
       ckereta.setSelectedIndex(3);
       }
       
       if(ckereta.getSelectedItem().equals("Argo Wilis") && stasiun_tujuan.getSelectedItem().equals("Surabaya Gubeng (SGU)")){
            berangkat.setText("08.30 WIB");
            tiba.setText("20.19 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Wilis") && stasiun_tujuan.getSelectedItem().equals("Gambir (GMR)")){
            berangkat.setText("06.30 WIB");
            tiba.setText("09.45 WIB");
        }else if(ckereta.getSelectedItem().equals("Argo Wilis") && stasiun_tujuan.getSelectedItem().equals("Solo Balapan (SLO)")){
            berangkat.setText("07.20 WIB");
            tiba.setText("16.15 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Wilis") && stasiun_tujuan.getSelectedItem().equals("Semarang Tawang (SMT)")){
            berangkat.setText("06.15 WIB");
            tiba.setText("13.45 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Wilis") && stasiun_tujuan.getSelectedItem().equals("Banjar (BJR)")){
            berangkat.setText("09.10 WIB");
            tiba.setText("13.03 WITA");
            
            //Argo Parahyangan
        }else if(ckereta.getSelectedItem().equals("Argo Parahyangan") && stasiun_tujuan.getSelectedItem().equals("Surabaya Gubeng (SGU)")){
            berangkat.setText("07.30 WIB");
            tiba.setText("19.19 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Parahyangan") && stasiun_tujuan.getSelectedItem().equals("Gambir (GMR)")){
            berangkat.setText("08.30 WIB");
            tiba.setText("11.45 WIB");
        }else if(ckereta.getSelectedItem().equals("Argo Parahyangan") && stasiun_tujuan.getSelectedItem().equals("Solo Balapan (SLO)")){
            berangkat.setText("09.20 WIB");
            tiba.setText("18.15 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Parahyangan") && stasiun_tujuan.getSelectedItem().equals("Semarang Tawang (SMT)")){
            berangkat.setText("08.15 WIB");
            tiba.setText("15.45 WITA");
        }else if(ckereta.getSelectedItem().equals("Argo Parahyangan") && stasiun_tujuan.getSelectedItem().equals("Banjar (BJR)")){
            berangkat.setText("10.10 WIB");
            tiba.setText("14.03 WITA");
            
            //Lodaya
        }else if(ckereta.getSelectedItem().equals("Lodaya") && stasiun_tujuan.getSelectedItem().equals("Surabaya Gubeng (SGU)")){
            berangkat.setText("08.15 WIB");
            tiba.setText("20.05 WITA");
        }else if(ckereta.getSelectedItem().equals("Lodaya") && stasiun_tujuan.getSelectedItem().equals("Gambir (GMR)")){
            berangkat.setText("10.30 WIB");
            tiba.setText("14.45 WIB");
        }else if(ckereta.getSelectedItem().equals("Lodaya") && stasiun_tujuan.getSelectedItem().equals("Solo Balapan (SLO)")){
            berangkat.setText("07.20 WIB");
            tiba.setText("14.15 WITA");
        }else if(ckereta.getSelectedItem().equals("Lodaya") && stasiun_tujuan.getSelectedItem().equals("Semarang Tawang (SMT)")){
            berangkat.setText("07.15 WIB");
            tiba.setText("14.45 WITA");
        }else if(ckereta.getSelectedItem().equals("Lodaya") && stasiun_tujuan.getSelectedItem().equals("Banjar (BJR)")){
            berangkat.setText("09.10 WIB");
            tiba.setText("13.07 WITA");
        }
    }//GEN-LAST:event_ckeretaActionPerformed

    private void bayangan4dewasa(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bayangan4dewasa
         
    }//GEN-LAST:event_bayangan4dewasa

    private void simpan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan
        
        try{
            con = Koneksi.getKoneksi();
            String sql = "INSERT INTO penumpang VALUES('"+fid.getText()+"','"+fnama.getText()+"','"+falamat.getText()+"','"+stasiun_awal.getText()+"','"+stasiun_tujuan.getSelectedItem()+"','"+berangkat.getText()+"','"+tiba.getText()+"','"+tanggal.getDate()+"','"+ckereta.getSelectedItem()+"','"+cgerbong.getSelectedItem()+"','"+sdewasa.getValue()+"','"+sanak.getValue()+"','"+ltotal.getText()+"')";
            st = con.createStatement();
            st.execute(sql);
            this.dispose();
            Index.oke();


        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_simpan

    private void kelas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas
        
        if(cgerbong.getSelectedItem().equals("Eksekutif 1")){
            bayangan5.setText("eksekutif1");
        }else if(cgerbong.getSelectedItem().equals("Eksekutif 2")){
            bayangan5.setText("eksekutif2");
        }else if(cgerbong.getSelectedItem().equals("Ekonomi 1")){
            bayangan5.setText("ekonomi1");
        }else if(cgerbong.getSelectedItem().equals("Ekonomi 2")){
            bayangan5.setText("ekonomi2");
        }else if(cgerbong.getSelectedItem().equals("Ekonomi 3")){
            bayangan5.setText("ekonomi3");
        }
        
        con = Koneksi.getKoneksi();
        
        if((cgerbong.getSelectedItem().equals("Eksekutif 1")) || (cgerbong.getSelectedItem().equals("Eksekutif 2"))){
            try{    
                st = con.createStatement();
                
                String sql1 = "SELECT * FROM harga WHERE id='1'";
                rs = st.executeQuery(sql1);
                while(rs.next()){
                    hdewasa.setText(rs.getString("harga"));
                }
            
                String sql2 = "SELECT * FROM harga WHERE id='2'";
                rs = st.executeQuery(sql2);
                while(rs.next()){
                    hanak.setText(rs.getString("harga"));
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }else if((cgerbong.getSelectedItem().equals("Ekonomi 1")) || (cgerbong.getSelectedItem().equals("Ekonomi 2")) || (cgerbong.getSelectedItem().equals("Ekonomi 3"))){
            try{    
                st = con.createStatement();
                
                String sql1 = "SELECT * FROM harga WHERE id='3'";
                rs = st.executeQuery(sql1);
                while(rs.next()){
                    hdewasa.setText(rs.getString("harga"));
                }
            
                String sql2 = "SELECT * FROM harga WHERE id='4'";
                rs = st.executeQuery(sql2);
                while(rs.next()){
                    hanak.setText(rs.getString("harga"));
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_kelas

    private void laporan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporan
        new Penumpang().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporan

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayangan1;
    private javax.swing.JTextField bayangan2;
    private javax.swing.JTextField bayangan3;
    private javax.swing.JSpinner bayangan4;
    private javax.swing.JTextField bayangan5;
    private javax.swing.JLabel berangkat;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cgerbong;
    private javax.swing.JComboBox<String> ckereta;
    private javax.swing.JTextField falamat;
    private javax.swing.JTextField fbayar;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fnama;
    private javax.swing.JLabel hanak;
    private javax.swing.JLabel hdewasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lkembali;
    private javax.swing.JLabel ltotal;
    private javax.swing.JSpinner sanak;
    private javax.swing.JSpinner sdewasa;
    private javax.swing.JTextField stasiun_awal;
    private javax.swing.JComboBox<String> stasiun_tujuan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JLabel tiba;
    // End of variables declaration//GEN-END:variables
}
