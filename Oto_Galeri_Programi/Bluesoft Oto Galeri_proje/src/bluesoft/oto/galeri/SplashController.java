/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.xml.transform.Source;

/**
 *
 * @author hsyn
 */
public class SplashController implements Initializable {
    
    @FXML
    private ImageView imageView;
    
    private Timer timer;
    private TimerTask timerTask;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        try {uygula();} catch (IOException ex) {Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);} catch (SQLException ex) {
                            Logger.getLogger(SplashController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        timer.cancel();
                        timerTask.cancel();
                    }
                });
            }
        };
        timer.scheduleAtFixedRate(timerTask, 3000, 3000);
        imageView.setImage(new Image(getClass().getResourceAsStream("bluesoft.png")));
    }   
    
    public void uygula() throws IOException, SQLException{
        boolean durum = false;
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if(connection.isClosed()){
            
        }
        else{
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Firma");
            while(resultSet.next()){
                durum = true;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        if(durum==false){
            Stage stage = new Stage();
            AnchorPane parent = (AnchorPane)FXMLLoader.load(getClass().getResource("Firma.fxml"));
            stage.setScene(new Scene(parent));
            stage.show();
            kapat();
        }
        else{
            Stage stage = new Stage();
            AnchorPane parent = (AnchorPane)FXMLLoader.load(getClass().getResource("Giris.fxml"));
            stage.setScene(new Scene(parent));
            stage.show();
            kapat();
        }
            
    }
    
    public void kapat(){
        Stage node = (Stage)imageView.getScene().getWindow();
        node.close();
    }
    
}
