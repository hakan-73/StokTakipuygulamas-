/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Hakan
 */
public class IkonAyarlari {
    private static Icon originalIcon;
    public static void ikonDegistir(JLabel Label,String fileName){
        originalIcon=Label.getIcon();
        Label.setIcon(new ImageIcon(Package.getPackages().getClass().getResource("/gui/İconlar/"+fileName+".png")));
}

    

    public static void setOriginalIkon(JLabel Label) {
      Label.setIcon(originalIcon);
    }
    
}
