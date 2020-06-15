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
import gui.veritabani.VeriTabaniBaglanti;
import gui.veritabani.transactions.HesapBilgileri;
import gui.veritabani.transactions.KullaniciGiris;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Hakan
 */
public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiKontrol {
    private KullaniciGiris kullaniciGirisObject=null;
    private final String kimlikText_ORIGINAL = "Kullanıcı Kodunu Giriniz";
    private final String sifreText_ORIGINAL = "*********";

    public GirisEkrani() {
        initComponents();
        Component Null = null;
        getEdits();
        VeriTabaniBaglanti veriTabaniBaglanti = new VeriTabaniBaglanti();
    }

    
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinMesaj = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();
        kullaniciIcon = new javax.swing.JLabel();
        sifreIcon = new javax.swing.JLabel();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Giriş Ekranı");

        girisEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

        hosgeldinMesaj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hosgeldinMesaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinMesaj.setText("Stok Takip Otomasyonuna Hoş Geldiniz");

        kimlikText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(153, 153, 153));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sifreText.setForeground(new java.awt.Color(153, 153, 153));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });
        sifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTextActionPerformed(evt);
            }
        });

        girisButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        girisButon.setText("Giriş");
        girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisButonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButonMouseExited(evt);
            }
        });
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        kullaniciIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoKullanici.png"))); // NOI18N

        sifreIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logosifre.png"))); // NOI18N

        sifremiUnuttumLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sifremiUnuttumLabel.setForeground(new java.awt.Color(51, 102, 255));
        sifremiUnuttumLabel.setText("Şifremi Unuttum!");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sifreIcon)
                            .addComponent(kullaniciIcon))
                        .addGap(24, 24, 24)
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sifremiUnuttumLabel)
                .addGap(204, 204, 204))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikText, sifreText});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addComponent(hosgeldinMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sifreIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(girisButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifremiUnuttumLabel)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPanel.setFocusable(true);
        kimlikText.setText(kimlikText_ORIGINAL);
        sifreText.setText(sifreText_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);
    }

    @Override
    public boolean bilgilerGecerliMi() {
      return !(this.kimlikText.getText().equals(this.kimlikText_ORIGINAL))
              || String.valueOf(this.sifreText.getPassword()).equals(this.sifreText_ORIGINAL);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if (this.kullaniciGirisObject==null) {
            kullaniciGirisObject=new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }

    
    
    private void sifreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreTextActionPerformed

    private Color OriginalBgColor;
    /*
    *Buton Renklendirmeleri
    */
    private void girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseEntered
        ButonAyarları.setBgFg(girisButon, Color.darkGray, Color.BLACK);
    }//GEN-LAST:event_girisButonMouseEntered

    private void girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseExited
        ButonAyarları.setOriginalBgFg(girisButon);
    }//GEN-LAST:event_girisButonMouseExited
    /*
    *Buton Actions
    */
    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            String musteriKimlik=this.kimlikText.getText().trim();
            String sifre=String.valueOf(this.sifreText.getPassword());
            try {
                this.girisYap(musteriKimlik,sifre);
            } catch (SQLException ex) {
                Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Mesaj.bosOlamazMesaji(this);
        }
    }//GEN-LAST:event_girisButonActionPerformed
   
    private void girisYap(String musteriKimlik,String sifre) throws SQLException{
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);
        if (getKullaniciGirisObject().girisBilgilerDogruMu()) {
            ActionAyarlari.SetVisible(this, new KullaniciEkrani());
        }else{
            Mesaj.ozelMesajGoster(this, "Giriş Bilgileri Doğru Değildir.");
        }
    }
    
    /*
    *Text Odaklanmaları
    */
    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
       TextAyarlari.checkTheTextFocusGained(kimlikText, kimlikText_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
       TextAyarlari.CheckTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.checkTheTextFocusGained(sifreText, sifreText_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.CheckTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    private void girisButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseClicked
        ActionAyarlari.SetVisible(this, new KullaniciEkrani());
    }//GEN-LAST:event_girisButonMouseClicked

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumLabelMouseClicked
      SifreGuncellemeEkrani sifreGuncellemeEkrani=new SifreGuncellemeEkrani();
      ActionAyarlari.SetVisible(this, sifreGuncellemeEkrani);
      sifreGuncellemeEkrani.getEskiSifreText().setEnabled(false);
    }//GEN-LAST:event_sifremiUnuttumLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisButon;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinMesaj;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JLabel kullaniciIcon;
    private javax.swing.JLabel sifreIcon;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifremiUnuttumLabel;
    // End of variables declaration//GEN-END:variables

    private JFrame SifreGuncellmeEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class SifreGuncellmeEkrani {

        public SifreGuncellmeEkrani() {
        }
    }

    
}
