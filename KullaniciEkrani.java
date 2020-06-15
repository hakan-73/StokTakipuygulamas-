/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.veritabani.IBilgiKontrol;
import gui.veritabani.transactions.HesapBilgileri;
import javax.swing.JFrame;

/**
 *
 * @author Hakan
 */
public class KullaniciEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiKontrol{

    /**
     * Creates new form KullaniciEkrani
     */
    public KullaniciEkrani() {
        initComponents();
        getEdits();
        System.out.println(getHesapBilgileri().getAdSoyad());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        cikisIkon = new javax.swing.JLabel();
        ayarlarIkon = new javax.swing.JLabel();
        kullaniciEkleButon = new javax.swing.JButton();
        stokEkleButon = new javax.swing.JButton();
        sifreDegistirButon = new javax.swing.JButton();
        kullaniciBilgiDegistirButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Ekranı");

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 204));

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("HOŞGELDİNİZ");

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");

        cikisIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoCikis.png"))); // NOI18N
        cikisIkon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisIkonMouseClicked(evt);
            }
        });

        ayarlarIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/İconlar/logoAyarlar.png"))); // NOI18N

        kullaniciEkleButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullaniciEkleButon.setText("KULLANICI EKLE");
        kullaniciEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciEkleButonActionPerformed(evt);
            }
        });

        stokEkleButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stokEkleButon.setText("STOK EKLE");
        stokEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokEkleButonActionPerformed(evt);
            }
        });

        sifreDegistirButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sifreDegistirButon.setText("ŞİFRE DEĞİŞTİR");
        sifreDegistirButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirButonMouseClicked(evt);
            }
        });
        sifreDegistirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreDegistirButonActionPerformed(evt);
            }
        });

        kullaniciBilgiDegistirButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullaniciBilgiDegistirButon.setText("KULLANICI BİLGİLERİ GÜNCELLE");
        kullaniciBilgiDegistirButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciBilgiDegistirButonMouseClicked(evt);
            }
        });
        kullaniciBilgiDegistirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciBilgiDegistirButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hesapEkraniPanelLayout = new javax.swing.GroupLayout(hesapEkraniPanel);
        hesapEkraniPanel.setLayout(hesapEkraniPanelLayout);
        hesapEkraniPanelLayout.setHorizontalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cikisIkon)
                .addGap(123, 123, 123)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hosgeldinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(ayarlarIkon)
                .addGap(50, 50, 50))
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciBilgiDegistirButon)
                    .addComponent(sifreDegistirButon, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hosgeldinLabel, kullaniciAdSoyadLabel});

        hesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kullaniciBilgiDegistirButon, kullaniciEkleButon, sifreDegistirButon, stokEkleButon});

        hesapEkraniPanelLayout.setVerticalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ayarlarIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addComponent(hosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdSoyadLabel)))
                .addGap(50, 50, 50)
                .addComponent(kullaniciEkleButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stokEkleButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreDegistirButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciBilgiDegistirButon)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        hesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hosgeldinLabel, kullaniciAdSoyadLabel});

        hesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kullaniciBilgiDegistirButon, kullaniciEkleButon, sifreDegistirButon, stokEkleButon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciEkleButonActionPerformed
        ActionAyarlari.SetVisible(this,new KullanıcıEkleEkrani());
    }//GEN-LAST:event_kullaniciEkleButonActionPerformed

    private void stokEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokEkleButonActionPerformed
        ActionAyarlari.SetVisible(this, new StokEkleEkrani());
    }//GEN-LAST:event_stokEkleButonActionPerformed

    private void sifreDegistirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreDegistirButonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreDegistirButonActionPerformed

    private void cikisIkonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisIkonMouseClicked
        ActionAyarlari.SetVisible(this, new GirisEkrani());
    }//GEN-LAST:event_cikisIkonMouseClicked

    private void kullaniciBilgiDegistirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciBilgiDegistirButonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciBilgiDegistirButonActionPerformed

    private void sifreDegistirButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirButonMouseClicked
        ActionAyarlari.SetVisible(this, new SifreGuncellemeEkrani());
    }//GEN-LAST:event_sifreDegistirButonMouseClicked

    private void kullaniciBilgiDegistirButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciBilgiDegistirButonMouseClicked
        ActionAyarlari.SetVisible(this, new KullaniciBilgiGuncelle());
    }//GEN-LAST:event_kullaniciBilgiDegistirButonMouseClicked

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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayarlarIkon;
    private javax.swing.JLabel cikisIkon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JButton kullaniciBilgiDegistirButon;
    private javax.swing.JButton kullaniciEkleButon;
    private javax.swing.JButton sifreDegistirButon;
    private javax.swing.JButton stokEkleButon;
    // End of variables declaration//GEN-END:variables

    private JFrame KullanıcıEkleEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JFrame StokEkleEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
        this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
       
    }

    @Override
    public boolean bilgilerGecerliMi() {
       
        
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
}
