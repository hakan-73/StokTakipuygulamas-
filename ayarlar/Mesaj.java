/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hakan
 */
public class Mesaj {
    public static void bosOlamazMesaji(JFrame frame){
        JOptionPane.showMessageDialog(frame , "Tüm Alanlar Dolu Olmalıdır.");
}
    public static void ozelMesajGoster(JFrame frame,String mesaj){
        JOptionPane.showMessageDialog(frame, mesaj);
    }
    
}
