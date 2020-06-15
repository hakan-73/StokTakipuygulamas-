/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani.transactions;

import gui.veritabani.IBilgiKontrol;
import gui.veritabani.VeriTabaniBaglanti;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Hakan
 */
public class KullaniciGiris extends VeriTabaniBaglanti implements IBilgiKontrol{
    private String musteriKimlik=null;
    private String sifre=null;
    
    public boolean girisBilgilerDogruMu() throws SQLException {
        if (bilgilerGecerliMi()) {
            if (girisBasariliMi()) {
                this.getHesapBilgileri().girisYap(musteriKimlik);
                return true;
            }
            else{
            return false;
            }
        }else{
        return false;
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.musteriKimlik==null || this.sifre==null);
    }

     private boolean girisBasariliMi() {
        String query = "SELECT tc_no,musteri_no,sifre FROM kullanicilar"
                + " WHERE "
                + "(tc_no = '" + this.musteriKimlik + "'"
                + " OR "
                + "musteri_no = '" + this.musteriKimlik + "')"
                + " AND "
                + "sifre = '" + this.sifre + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
}
