/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.Mesaj;
import gui.ayarlar.TextAyarlari;
import gui.veritabani.IBilgiKontrol;
import gui.veritabani.transactions.HesapBilgileri;
import gui.veritabani.transactions.StokEkle;
import java.awt.Color;
import javax.swing.JButton;
/**
 *
 * @author Hakan
 */
public class StokEkleEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiKontrol {

    private JButton JButton;

    /**
     * Creates new form StokEkleEkrani
     */
  private StokEkle stokEkleObject=null;
    
    public StokEkleEkrani() {
        initComponents();
        getEdits();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
     @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        stokEklePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(stokKoduText);
        TextAyarlari.setOnlyAlphabetic(stokAdıText);
        TextAyarlari.setOnlyAlphabetic(stokModeliText);
        TextAyarlari.setOnlyNumber(stokAdediText);
        TextAyarlari.setOnlyNumber(stokTarihiText);
        TextAyarlari.setOnlyAlphabetic(stokKaydıYapanText);
        
    }

    public StokEkle getStokEkleObject() {
        if (this.stokEkleObject==null) {
            stokEkleObject= new StokEkle();
        }
        return stokEkleObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(stokEklePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
      return HesapBilgileri.getInstance();
    }
    
    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stokEklePanel = new javax.swing.JPanel();
        stokAdıLabel = new javax.swing.JLabel();
        stokModelLabel = new javax.swing.JLabel();
        kayitIslemleriLabel = new javax.swing.JLabel();
        stokModeliLabel = new javax.swing.JLabel();
        stokTarihiLabel = new javax.swing.JLabel();
        stokKayitYapanLabel = new javax.swing.JLabel();
        stokAdıText = new javax.swing.JTextField();
        stokKaydıYapanText = new javax.swing.JTextField();
        stokTarihiText = new javax.swing.JTextField();
        stokModeliText = new javax.swing.JTextField();
        stokAdediText = new javax.swing.JTextField();
        cikisIkon = new javax.swing.JLabel();
        stokSilButon = new javax.swing.JButton();
        stokEkleButon = new javax.swing.JButton();
        stokGuncelleButon = new javax.swing.JButton();
        urunFiyatıLabel = new javax.swing.JLabel();
        stokKoduLabel = new javax.swing.JLabel();
        stokKoduText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        alisFiyatiLabel = new javax.swing.JLabel();
        alisFiyatiText = new javax.swing.JTextField();
        satisFiyatiLabel = new javax.swing.JLabel();
        satisFiyatiText = new javax.swing.JTextField();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        sayinLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOK KAYIT İŞLEMLERİ");

        stokAdıLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokAdıLabel.setText("Stok Adı");

        stokModelLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokModelLabel.setText("Stok Adedi");

        kayitIslemleriLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kayitIslemleriLabel.setText("-Kayıt İşlemleri-");

        stokModeliLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokModeliLabel.setText("Stok Modeli");

        stokTarihiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokTarihiLabel.setText("Stok Tarihi");

        stokKayitYapanLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokKayitYapanLabel.setText("Stok Kaydı Yapan");

        stokAdıText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokAdıTextActionPerformed(evt);
            }
        });

        stokKaydıYapanText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokKaydıYapanTextActionPerformed(evt);
            }
        });

        stokTarihiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokTarihiTextActionPerformed(evt);
            }
        });

        stokModeliText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokModeliTextActionPerformed(evt);
            }
        });

        stokAdediText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokAdediTextActionPerformed(evt);
            }
        });

        cikisIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoCikis.png"))); // NOI18N
        cikisIkon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cikisIkon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisIkonMouseClicked(evt);
            }
        });

        stokSilButon.setBackground(new java.awt.Color(255, 204, 255));
        stokSilButon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokSilButon.setText("Stok Sil");
        stokSilButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stokSilButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stokSilButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stokSilButonMouseExited(evt);
            }
        });

        stokEkleButon.setBackground(new java.awt.Color(204, 204, 255));
        stokEkleButon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokEkleButon.setText("Stok Ekle");
        stokEkleButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stokEkleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stokEkleButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stokEkleButonMouseExited(evt);
            }
        });
        stokEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokEkleButonActionPerformed(evt);
            }
        });

        stokGuncelleButon.setBackground(new java.awt.Color(255, 255, 204));
        stokGuncelleButon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokGuncelleButon.setText("Stok Güncelle");
        stokGuncelleButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stokGuncelleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stokGuncelleButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stokGuncelleButonMouseExited(evt);
            }
        });

        urunFiyatıLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        urunFiyatıLabel.setText("-Ürün Fiyatı-");

        stokKoduLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokKoduLabel.setText("Stok Kodu");

        stokKoduText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokKoduTextActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stok Kodu", "Stok Adı", "Stok Modeli", "Stok Adedi", "Stok Tarihi", "Kaydı Yapan", "Alış Fiyatı", "Satış Fiyatı"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        alisFiyatiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alisFiyatiLabel.setText("Alış Fiyatı");

        alisFiyatiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alisFiyatiTextActionPerformed(evt);
            }
        });

        satisFiyatiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        satisFiyatiLabel.setText("Satış Fiyatı");

        satisFiyatiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisFiyatiTextActionPerformed(evt);
            }
        });

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");

        sayinLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sayinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sayinLabel.setText("SAYIN");

        javax.swing.GroupLayout stokEklePanelLayout = new javax.swing.GroupLayout(stokEklePanel);
        stokEklePanel.setLayout(stokEklePanelLayout);
        stokEklePanelLayout.setHorizontalGroup(
            stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stokEklePanelLayout.createSequentialGroup()
                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stokEklePanelLayout.createSequentialGroup()
                                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stokAdıLabel)
                                    .addComponent(stokModeliLabel)
                                    .addComponent(stokModelLabel)
                                    .addComponent(stokTarihiLabel)
                                    .addComponent(stokKayitYapanLabel)
                                    .addComponent(stokKoduLabel))
                                .addGap(18, 18, 18)
                                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stokKoduText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stokModeliText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stokAdediText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stokTarihiText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stokKaydıYapanText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stokAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                                        .addComponent(satisFiyatiLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(satisFiyatiText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                                        .addComponent(alisFiyatiLabel)
                                        .addGap(28, 28, 28)
                                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(urunFiyatıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(alisFiyatiText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(stokEklePanelLayout.createSequentialGroup()
                                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                                        .addComponent(stokEkleButon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(stokSilButon)
                                        .addGap(18, 18, 18)
                                        .addComponent(stokGuncelleButon)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stokEklePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cikisIkon)
                                .addGap(127, 127, 127)
                                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sayinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(stokEklePanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(kayitIslemleriLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        stokEklePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alisFiyatiText, urunFiyatıLabel});

        stokEklePanelLayout.setVerticalGroup(
            stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stokEklePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cikisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                        .addComponent(sayinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdSoyadLabel)))
                .addGap(27, 27, 27)
                .addComponent(kayitIslemleriLabel)
                .addGap(25, 25, 25)
                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokKoduText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunFiyatıLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokAdıText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alisFiyatiLabel)
                            .addComponent(alisFiyatiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokModeliText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satisFiyatiLabel)
                            .addComponent(satisFiyatiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokAdediText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokTarihiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokKaydıYapanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stokEklePanelLayout.createSequentialGroup()
                        .addComponent(stokKoduLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokAdıLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokModeliLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokModelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokTarihiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokKayitYapanLabel)))
                .addGap(18, 18, 18)
                .addGroup(stokEklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokGuncelleButon)
                    .addComponent(stokSilButon)
                    .addComponent(stokEkleButon))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );

        stokEklePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {stokAdediText, stokAdıLabel, stokAdıText, stokKaydıYapanText, stokKayitYapanLabel, stokKoduLabel, stokKoduText, stokModelLabel, stokModeliLabel, stokModeliText, stokTarihiLabel, stokTarihiText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stokEklePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stokEklePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stokAdıTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokAdıTextActionPerformed
       
    }//GEN-LAST:event_stokAdıTextActionPerformed

    private void stokKaydıYapanTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokKaydıYapanTextActionPerformed
       
    }//GEN-LAST:event_stokKaydıYapanTextActionPerformed

    private void stokTarihiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokTarihiTextActionPerformed
       
    }//GEN-LAST:event_stokTarihiTextActionPerformed

    private void stokModeliTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokModeliTextActionPerformed
       
    }//GEN-LAST:event_stokModeliTextActionPerformed

    private void stokAdediTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokAdediTextActionPerformed
       
    }//GEN-LAST:event_stokAdediTextActionPerformed

    private void stokKoduTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokKoduTextActionPerformed
       
    }//GEN-LAST:event_stokKoduTextActionPerformed

    private void stokEkleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokEkleButonMouseEntered
         ButonAyarları.setBgFg(stokEkleButon, Color.BLACK, Color.WHITE);
    }//GEN-LAST:event_stokEkleButonMouseEntered

    private void stokEkleButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokEkleButonMouseExited
        ButonAyarları.setOriginalBgFg(stokEkleButon);
    }//GEN-LAST:event_stokEkleButonMouseExited

    private void stokSilButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokSilButonMouseEntered
        ButonAyarları.setBgFg(stokSilButon, Color.BLACK, Color.WHITE);
    }//GEN-LAST:event_stokSilButonMouseEntered

    private void stokSilButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokSilButonMouseExited
          ButonAyarları.setOriginalBgFg(stokSilButon);
    }//GEN-LAST:event_stokSilButonMouseExited

    private void stokGuncelleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokGuncelleButonMouseEntered
          ButonAyarları.setBgFg(stokGuncelleButon, Color.BLACK, Color.WHITE);
    }//GEN-LAST:event_stokGuncelleButonMouseEntered

    private void stokGuncelleButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokGuncelleButonMouseExited
        ButonAyarları.setOriginalBgFg(stokGuncelleButon);
    }//GEN-LAST:event_stokGuncelleButonMouseExited

    private void cikisIkonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisIkonMouseClicked
         ActionAyarlari.SetVisible(this, new KullaniciEkrani());
    }//GEN-LAST:event_cikisIkonMouseClicked

    private void alisFiyatiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alisFiyatiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alisFiyatiTextActionPerformed

    private void satisFiyatiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisFiyatiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satisFiyatiTextActionPerformed

    private void stokEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokEkleButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.stokKayitYap();  
        }
        else{
        Mesaj.bosOlamazMesaji(this);
        }
    }//GEN-LAST:event_stokEkleButonActionPerformed

    private void stokKayitYap(){
        //Stok Bilgileri
        this.getStokEkleObject().setStokKodu(this.stokKoduText.getText());
        this.getStokEkleObject().setStokAdı(this.stokAdıText.getText().trim());
        this.getStokEkleObject().setStokModeli(this.stokModeliText.getText());
        this.getStokEkleObject().setStokAdedi(this.stokAdediText.getText());
        this.getStokEkleObject().setStokTarihi(this.stokTarihiText.getText());
        this.getStokEkleObject().setStokKayitYapan(this.stokKaydıYapanText.getText());
        this.getStokEkleObject().setAlisFiyati(this.alisFiyatiText.getText());
        this.getStokEkleObject().setSatisFiyati(this.satisFiyatiText.getText());
        
        if (this.getStokEkleObject().stokOnaylandiMi()) {
            Mesaj.ozelMesajGoster(this, "Stok Kayıt Edlidi.");
        }
        else{
            Mesaj.ozelMesajGoster(this, "Stok Kayıt Edilmemiştir.\n"
                            +"Bilgileri Kontrol Ediniz..");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(StokEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokEkleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alisFiyatiLabel;
    private javax.swing.JTextField alisFiyatiText;
    private javax.swing.JLabel cikisIkon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kayitIslemleriLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel satisFiyatiLabel;
    private javax.swing.JTextField satisFiyatiText;
    private javax.swing.JLabel sayinLabel;
    private javax.swing.JTextField stokAdediText;
    private javax.swing.JLabel stokAdıLabel;
    private javax.swing.JTextField stokAdıText;
    private javax.swing.JButton stokEkleButon;
    private javax.swing.JPanel stokEklePanel;
    private javax.swing.JButton stokGuncelleButon;
    private javax.swing.JTextField stokKaydıYapanText;
    private javax.swing.JLabel stokKayitYapanLabel;
    private javax.swing.JLabel stokKoduLabel;
    private javax.swing.JTextField stokKoduText;
    private javax.swing.JLabel stokModelLabel;
    private javax.swing.JLabel stokModeliLabel;
    private javax.swing.JTextField stokModeliText;
    private javax.swing.JButton stokSilButon;
    private javax.swing.JLabel stokTarihiLabel;
    private javax.swing.JTextField stokTarihiText;
    private javax.swing.JLabel urunFiyatıLabel;
    // End of variables declaration//GEN-END:variables


}
