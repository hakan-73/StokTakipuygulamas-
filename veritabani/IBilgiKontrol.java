/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani;

import gui.veritabani.transactions.HesapBilgileri;

/**
 *
 * @author Hakan
 */

public interface IBilgiKontrol {
    public boolean bilgilerGecerliMi();
    public HesapBilgileri getHesapBilgileri();
}
