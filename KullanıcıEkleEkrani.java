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
import gui.veritabani.transactions.KullaniciEkle;
import java.awt.Color;

/**
 *
 * @author Hakan
 */
public class KullanıcıEkleEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    /**
     * Creates new form KullanıcıEkleEkrani
     */
    private KullaniciEkle kullaniciEkleObject = null;

    public KullanıcıEkleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        KullanıcıEKlePanel.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        TextAyarlari.setMaxLimit(tcNoText, 11);
    }

    public KullaniciEkle getKullaniciEkleObject() {
        if (this.kullaniciEkleObject == null) {
            kullaniciEkleObject = new KullaniciEkle();
        }
        return kullaniciEkleObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(KullanıcıEKlePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KullanıcıEKlePanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        kisiselBilgilerLabel1 = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        telNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        guvenlikBilgilerLabel = new javax.swing.JLabel();
        telNoLabel1 = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox<>();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        kaydetButon = new javax.swing.JButton();
        cikisIkon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Otomasyonu-Kullanıcı Ekle");

        KullanıcıEKlePanel.setBackground(new java.awt.Color(255, 255, 204));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad:");

        kisiselBilgilerLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel1.setText("Kişisel Bilgiler");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adSoyadText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adSoyadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adSoyadTextActionPerformed(evt);
            }
        });

        tcNoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. Numarası:");

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No:");

        telNoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        guvenlikBilgilerLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guvenlikBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgilerLabel.setText("Güvenlik Bilgileri");

        telNoLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel1.setText("Telefon No:");

        guvenlikSorusu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil Hayvanınızın Adı Nedir?", "En Sevdiğiniz Nesne Nedir?", "İlkokul Öğretmeninizin Adı Nedir?", "Yaşamak İstediğiniz Yer Neresidir?", "Rastgele Cümle Giriniz.(Önerilir)" }));

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cevap:");

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        kaydetButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kaydetButon.setText("KAYDET");
        kaydetButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kaydetButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kaydetButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kaydetButonMouseExited(evt);
            }
        });
        kaydetButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetButonActionPerformed(evt);
            }
        });

        cikisIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoCikis.png"))); // NOI18N
        cikisIkon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisIkonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout KullanıcıEKlePanelLayout = new javax.swing.GroupLayout(KullanıcıEKlePanel);
        KullanıcıEKlePanel.setLayout(KullanıcıEKlePanelLayout);
        KullanıcıEKlePanelLayout.setHorizontalGroup(
            KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                        .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                                .addComponent(telNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                                .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                                .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(cikisIkon))
                    .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                        .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guvenlikBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kaydetButon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(377, Short.MAX_VALUE)))
        );

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adSoyadText, tcNoText});

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guvenlikBilgilerLabel, kisiselBilgilerLabel1});

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guvenlikSorusu, telNoText});

        KullanıcıEKlePanelLayout.setVerticalGroup(
            KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cikisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KullanıcıEKlePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addComponent(guvenlikBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kaydetButon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(KullanıcıEKlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KullanıcıEKlePanelLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadText, guvenlikSorusu, tcNoLabel, tcNoText, telNoLabel, telNoText});

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikBilgilerLabel, kisiselBilgilerLabel1});

        KullanıcıEKlePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikCevapLabel, guvenlikCevapText, kaydetButon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KullanıcıEKlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(KullanıcıEKlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaydetButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaydetButonMouseEntered
        ButonAyarları.setBgFg(kaydetButon, Color.BLACK, Color.WHITE);
    }//GEN-LAST:event_kaydetButonMouseEntered

    private void kaydetButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaydetButonMouseExited
        ButonAyarları.setOriginalBgFg(kaydetButon);
    }//GEN-LAST:event_kaydetButonMouseExited

    private void kaydetButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.kayitGerceklestir();

        } else {
            Mesaj.bosOlamazMesaji(this);
        }
    }//GEN-LAST:event_kaydetButonActionPerformed
    private void kayitGerceklestir() {
        //Kişisel Bilgiler
        this.getKullaniciEkleObject().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciEkleObject().setTcNo(this.tcNoText.getText().trim());
        this.getKullaniciEkleObject().setTelNo(this.telNoText.getText());

        //Guvenlik Bilgileri
        this.getKullaniciEkleObject().setGuvenlikSorusu(String.valueOf(this.guvenlikSorusu.getSelectedItem()));
        this.getKullaniciEkleObject().setGuvenlikCevap(this.guvenlikCevapText.getText().trim());

        //Sistem Tarafından Verilecek Bilgiler
        this.getKullaniciEkleObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciEkleObject().setSifre(this.randomSifreAl());

        if (this.getKullaniciEkleObject().basvuruOnaylandiMi()) {
            Mesaj.ozelMesajGoster(this, "Kullanıcı Kaydınız Kabul Edilmiştir.\n"
                    + "Müsteri Numaranız:" + this.getKullaniciEkleObject().getMusteriNo()
                    + "\nŞifreniz:" + this.getKullaniciEkleObject().getSifre());

            ActionAyarlari.SetVisible(this, new KullaniciEkrani());
        } else {
            Mesaj.ozelMesajGoster(this, "Başvurunuz Kabul Edilmemiştir.\n"
                    + "Lütfen Bilgilerinizi Kontrol Ediniz.");
        }

    }

    private String randomMusteriNoAl() {
        String musteriNo;
        do {
            musteriNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciEkleObject().musteriNoTablodaVarMi());
        return musteriNo;
    }

    private String randomSifreAl() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }
    private void cikisIkonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisIkonMouseClicked
        ActionAyarlari.SetVisible(this, new KullaniciEkrani());
    }//GEN-LAST:event_cikisIkonMouseClicked

    private void adSoyadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adSoyadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adSoyadTextActionPerformed

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
            java.util.logging.Logger.getLogger(KullanıcıEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanıcıEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanıcıEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanıcıEkleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullanıcıEkleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KullanıcıEKlePanel;
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JLabel cikisIkon;
    private javax.swing.JLabel guvenlikBilgilerLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JComboBox<String> guvenlikSorusu;
    private javax.swing.JButton kaydetButon;
    private javax.swing.JLabel kisiselBilgilerLabel1;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JLabel telNoLabel1;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables

}
