/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ResimBuyukController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private ImageView buyukresim;
    private Timer timer;
    private TimerTask timerTask;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Stage stage = (Stage) buyukresim.getScene().getWindow();
                String title = stage.getTitle();
                buyukresim.setImage(new Image("file:///"+title));
                buyukresim.setFitHeight(768);
            }
        };
        timer.scheduleAtFixedRate(timerTask, 10, 1000);
    }    
    
}
