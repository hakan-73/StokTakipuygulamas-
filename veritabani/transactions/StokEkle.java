/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani.transactions;


import gui.veritabani.IBilgiKontrol;
import gui.veritabani.VeriTabaniBaglanti;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hakan
 */
public class StokEkle extends VeriTabaniBaglanti implements IBilgiKontrol{

    //Stok Bilgileri
    private String stokKodu=null,stokAdı=null,stokModeli=null,stokAdedi=null,stokTarihi=null,stokKayitYapan=null,alisFiyati=null,satisFiyati=null;
    public boolean stokOnaylandiMi;
   
    public boolean stokOnaylandiMi(){
        if (this.bilgilerGecerliMi()) {
            if (this.stokKoduVarMi()) {
                return false;
            }
            else{
                this.stokOnayla();
            return true;}
        }
        else{
            
        return false;
        }
    
    }
     private boolean stokKoduVarMi(){
        String query="SELECT stok_kodu FROM stok WHERE stok_kodu= '"+ this.stokKodu + "'";
        try {
            super.statement=super.connection.createStatement();
         ResultSet rs=  statement.executeQuery(query);
         while(rs.next()){// tabloda varsa true dönecek
         return true;
         }
        } catch (SQLException ex) {
            Logger.getLogger(StokEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private void stokOnayla(){
    String query="INSERT INTO stok(stok_kodu,stok_adi,stok_modeli,stok_adedi,stok_tarihi,stok_kayit_yapan,alis_fiyati,satis_fiyati)"+
            "VALUES("
            +"'" + this.stokKodu + "',"
            +"'" + this.stokAdı + "',"
            +"'" + this.stokModeli + "',"
            +"'" + this.stokAdedi + "',"
            +"'" + this.stokTarihi + "',"
            +"'" +this.stokKayitYapan + "',"
            +"'" +this.alisFiyati + "',"
            +"'" +this.satisFiyati + "'"
            +")";
        try {
            super.statement=super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(StokEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.stokKodu==null
                || this.stokAdı==null
                || this.stokModeli==null
                || this.stokAdedi==null
                || this.stokTarihi==null
                || this.stokKayitYapan==null
                || this.alisFiyati==null
                || this.satisFiyati==null
                );
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStokKodu() {
        return stokKodu;
    }

    public void setStokKodu(String stokKodu) {
        this.stokKodu = stokKodu;
    }

    public String getStokAdı() {
        return stokAdı;
    }

    public void setStokAdı(String stokAdı) {
        this.stokAdı = stokAdı;
    }

    public String getStokModeli() {
        return stokModeli;
    }

    public void setStokModeli(String stokModeli) {
        this.stokModeli = stokModeli;
    }

    public String getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(String stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public String getStokTarihi() {
        return stokTarihi;
    }

    public void setStokTarihi(String stokTarihi) {
        this.stokTarihi = stokTarihi;
    }

    public String getStokKayitYapan() {
        return stokKayitYapan;
    }

    public void setStokKayitYapan(String stokKayitYapan) {
        this.stokKayitYapan = stokKayitYapan;
    }

    public String getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(String alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public String getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(String satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    
    }
   

