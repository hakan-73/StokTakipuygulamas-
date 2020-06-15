/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hakan
 */
public class VeriTabaniBaglanti {
    private final String HOST="localhost";
    private final String PORT="3306";
    private final String VERİTABANI_ISMI="stok_takip";
    private final String USER="root";
    private final String PASSWORD="";
    
    protected Connection connection=null;
    protected Statement statement=null;

    public VeriTabaniBaglanti() {
        String url="jdbc:mysql://"+this.HOST+":"+this.PORT+"/"+this.VERİTABANI_ISMI;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeriTabaniBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Bağlantı Başarılı.");
            this.connection=DriverManager.getConnection(url, this.USER, this.PASSWORD);
                    } catch (SQLException ex) {
                        System.out.println("Bağlantı Başarısız.");
            Logger.getLogger(VeriTabaniBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
