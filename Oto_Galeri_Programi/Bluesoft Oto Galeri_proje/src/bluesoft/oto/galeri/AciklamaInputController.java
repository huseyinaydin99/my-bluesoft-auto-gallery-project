/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JRException;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class AciklamaInputController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private Button tamam;
    @FXML private TextArea aciklama,yanliz;
    private Timer timer;
    private TimerTask timerTask;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timer = new Timer();
    }  
    
    public void tamamet() throws IOException, SQLException, JRException{
        String a="",y="";
        System.out.println("yourrock.!");
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane)FXMLLoader.load(getClass().getResource("AciklamaInput.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle(aciklama.getText().toString());
        a = aciklama.getText().toString();
        y = yanliz.getText().toString();
        ProgramController.uygula(a, y);
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                kapat();
                            } catch (SQLException ex) {
                                Logger.getLogger(AciklamaInputController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                });
            }
        };
        timer.schedule(timerTask, 0,3000);
    }
    public void kapat() throws SQLException{
        sil();
        Stage node = (Stage)aciklama.getScene().getWindow();
        node.close();
    }
    public void sil() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if(!connection.isClosed()){
            Statement statement = connection.createStatement();
            boolean durum = false;
            durum = statement.execute("delete from main.gecici");
            statement.close();
            connection.close();
        }
    }
}
