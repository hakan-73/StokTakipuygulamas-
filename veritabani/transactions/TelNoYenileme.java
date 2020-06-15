/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani.transactions;

import gui.ayarlar.TextAyarlari;
import gui.veritabani.IBilgiKontrol;
import gui.veritabani.VeriTabaniBaglanti;

/**
 *
 * @author Hakan
 */
public class TelNoYenileme extends VeriTabaniBaglanti implements IBilgiKontrol{
    
    private String telNo=null;
    @Override
    public boolean bilgilerGecerliMi() {
    return !(this.telNo==null
            || TextAyarlari.uzunlukAyari(11, telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
    
}
