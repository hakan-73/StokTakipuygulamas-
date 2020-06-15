/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Hakan
 */
public class ButonAyarları {
    /*
    *Arka Plan Ve Yazı Rengi Ayarları
    */
    private static Color originalBgColor,originalFgColor ;
    
    public static void setBgFg(JButton button,Color bgColor,Color fgColor){
        originalBgColor=button.getBackground();
        originalFgColor=button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        
    }
    public static void setOriginalBgFg(JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalFgColor);
        
}
    /*
    *
    */

}
