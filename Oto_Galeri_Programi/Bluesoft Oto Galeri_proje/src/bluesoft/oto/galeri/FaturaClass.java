/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrator
 */
public class FaturaClass {
    public void fatura() throws SQLException, JRException{
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("fatura.jasper"), null,connections);
        JasperViewer.viewReport(jasperPrint,false);
        connections.close();
    }
}
