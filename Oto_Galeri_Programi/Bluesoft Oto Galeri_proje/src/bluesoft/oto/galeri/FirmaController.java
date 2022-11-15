/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.awt.Button;
import java.awt.TextField;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;

/**
 * FXML Controller class
 *
 * @author hsyn
 */
public class FirmaController implements Initializable {

    @FXML private ImageView imageview;
    @FXML private javafx.scene.control.TextField resim_yolu;
    @FXML private javafx.scene.control.Button button;
    @FXML private javafx.scene.control.Button kaydet;
    @FXML private javafx.scene.control.TextField adi;
    @FXML private javafx.scene.control.TextField kisi;
    @FXML private javafx.scene.control.TextField unvan;
    @FXML private javafx.scene.control.TextField adres;
    @FXML private javafx.scene.control.TextField site;
    @FXML private javafx.scene.control.TextField tel;
    @FXML private javafx.scene.control.TextField cep;
    @FXML private javafx.scene.control.TextField il;
    @FXML private javafx.scene.control.TextField ilce;
    @FXML private javafx.scene.control.TextField email;
    @FXML private javafx.scene.control.TextField kullanici;
    @FXML private javafx.scene.control.TextField sifre;
    @FXML private CheckBox onay;
    @FXML Label uyari;
    
    public void tikla() throws URISyntaxException, IOException{
        //System.err.println("Mello");
        File file = null;
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Lütfen bir logo seçiniz.");
        FileChooser.ExtensionFilter extFilter = 
                        new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png");
        FileChooser.ExtensionFilter extFilter1 = 
                        new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
        
        FileChooser.ExtensionFilter extFilter2 = 
                        new FileChooser.ExtensionFilter("JPEG files (*.jpeg)", "*.jpeg");
        chooser.getExtensionFilters().add(extFilter);
        chooser.getExtensionFilters().add(extFilter1);
        chooser.getExtensionFilters().add(extFilter2);
        
        file = chooser.showOpenDialog(button.getScene().getWindow());
        System.out.println(file.getAbsoluteFile());
        String path = file.getAbsoluteFile().toString();
        File file1 = new File(FirmaController.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        String bellek = "";
        for(int i = file1.getAbsolutePath().toString().length()-1; i>=0; i--){
            if(file1.getAbsolutePath().toString().charAt(i) == '\\'){
                for(int j = i; j>=0; j--){
                    bellek += file1.getAbsolutePath().toString().charAt(j);
                }
                break;
            }
        }
        String duzBellek = "";
        for(int i = bellek.length()-1; i>=0; i--){
            duzBellek += bellek.charAt(i);
        }
        //System.out.println(file1.getAbsolutePath());
        System.out.println("Düz Bellek : "+duzBellek);
        //uyari(duzBellek,"yaraq");
        System.out.println(bellek);
        
        //String okunan = dosyaOku(file);
        /*if(dosyaYaz(file, "C:\\Documents and Settings\\Administrator\\My Documents\\Bluesoft Oto Galeri\\logo.png"))
            System.out.println("Dosya Yazıldı");
        else
            System.out.println("Dosya Yazılamadı");*/
        FileUtils.copyFile(file, new File(duzBellek+"\\logo.png"));
        File file_logo = new File(duzBellek+"\\logo.png");
        imageview.setImage(new Image(file_logo.toURI().toString()));
        imageview.setFitHeight(250);
        resim_yolu.setText(duzBellek+"\\logo.png");
    }
    
    public void uyari(String deger1, String deger2) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Uyarı.!");
        alert.setHeaderText(deger1);
        alert.setContentText(deger2);
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Pressed OK.");
            }
        }
        );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imageview.setImage(new Image(getClass().getResourceAsStream("ornek.png")));
    }   
    
    /*private String dosyaOku(File kaynak) throws FileNotFoundException, IOException{
        FileReader fileReader = new FileReader(kaynak);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String okunan = "";
        String okunan2 = "";
        while((okunan = bufferedReader.readLine())!=null){
            okunan2 += okunan;
        }
        okunan = "";
        System.out.println(okunan2);
        bufferedReader.close();
        fileReader.close();
        return okunan2;
    }*/
    
    private boolean dosyaYaz(File kaynak,String hedef){
        //String hedeff = "C:\\Documents and Settings\\Administrator\\My Documents\\Bluesoft Oto Galeri\\dosya.png";
        boolean durum = false;
        try{
            FileInputStream fileInputStream = new FileInputStream(kaynak);
            FileOutputStream fileOutputStream = new FileOutputStream(hedef);
            int okunan = 0;
            while((okunan = fileInputStream.read(new byte[1024]))>0){
                fileOutputStream.write(new byte[1024], 0, okunan);
            }
            fileOutputStream.close();
            fileInputStream.close();
            durum = true;
        }
        catch(Exception ex){
            durum = false;
            System.out.println(ex.getMessage().toString());
        }
        return durum;
    }
    
    public void kaydet() throws SQLException, IOException{
        System.out.println(adi.getText()+" " + kisi.getText()+" "+unvan.getText()+" "+adres.getText()+" "+site.getText()+" "+tel.getText()+" "+cep.getText()+" "+il.getText()+" "+ilce.getText()+" "+email.getText()+" "+kullanici.getText()+" "+sifre.getText());
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if(connection.isClosed()){
            
        }
        else{
            if(onay.isSelected()==false)
                uyari.setText("Lütfen onaylayın");
            System.out.println("Bağlantı Başarılı");
            if(onay.isSelected() && !adi.getText().toString().equals("") && !kisi.getText().toString().equals("") && !unvan.getText().toString().equals("") && !adres.getText().toString().equals("") && !site.getText().toString().equals("") && !tel.getText().toString().equals("") && !cep.getText().toString().equals("") && !il.getText().toString().equals("") && !ilce.getText().toString().equals("") && !email.getText().toString().equals("") && !kullanici.getText().toString().equals("") && !sifre.getText().toString().equals("") && !resim_yolu.getText().toString().equals("")){
                Statement statement = connection.createStatement();
                if(statement.execute("insert into main.firma(ID,Adi,Yetkili,Unvani,Adres,Web,Telefon,Cep,Il,Ilce,Email,Kullanici,Sifre,Resim_Yol) values(1,'"+adi.getText()+"','"+kisi.getText()+"','"+unvan.getText()+"','"+adres.getText()+"','"+site.getText()+"','"+tel.getText()+"','"+cep.getText()+"','"+il.getText()+"','"+ilce.getText()+"','"+email.getText()+"','"+kullanici.getText()+"','"+sifre.getText()+"','C:\\Program Files\\Bluesoft Oto Galeri\\logo.png')")){
                    uyari.setText("Kayıt Başarısız");
                }
                else{
                    uyari.setText("Kayıt Başarılı");
                    Stage stage = new Stage();
                AnchorPane parent = (AnchorPane)FXMLLoader.load(getClass().getResource("Giris.fxml"));
                stage.setScene(new Scene(parent));
                stage.show();
                kapat();
                }
                statement.close();
            }
            else
                uyari.setText("Gerekli Alanları Doldurun");
        }
        connection.close();
    }
    public void kapat(){
        Stage node = (Stage)resim_yolu.getScene().getWindow();
        node.close();
    }
}

