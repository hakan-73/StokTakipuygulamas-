/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani.transactions;

import gui.veritabani.DbVeriMerkezi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hakan
 */
public class HesapBilgileri extends DbVeriMerkezi {
    //singleton
    private static HesapBilgileri hesapBilgileri=null;
    public static HesapBilgileri getInstance(){
        if (hesapBilgileri==null) {
            hesapBilgileri=new HesapBilgileri();
        }
        return hesapBilgileri;
}
    public void girisYap(String musteriKimlik){
    this.kullaniciyiAl(musteriKimlik);
    }
    private void kullaniciyiAl(String musteriKimlik){
    String query ="SELECT * FROM kullanicilar WHERE"
            +"tc_no='"+musteriKimlik+"'"
            +"OR"
            +"musteri_no='"+musteriKimlik+"'";
        try {
            super.statement=super.connection.createStatement();
            ResultSet rs= statement.executeQuery(query);
            while(rs.next()){
            super.kullaniciId=rs.getInt("kullanici_id");
            super.adSoyad=rs.getNString("ad_soyad");
            super.tcNo=rs.getNString("tc_no");
            super.telNo=rs.getNString("tel_no");
            super.musteriNo=rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
