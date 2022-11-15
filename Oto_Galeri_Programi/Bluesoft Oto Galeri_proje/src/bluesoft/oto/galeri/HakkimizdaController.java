/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class HakkimizdaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ImageView logo;
    public static Timer timer1 = null;
    public static TimerTask timerTask1;
    int kayanSayi = 450;
    @FXML
    Label kayanLabel;
    MediaPlayer mp = null;
    private Timer timerq = null;
    private TimerTask timerTaskq = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timer1 = new Timer();
        logo.setImage(new Image(getClass().getResourceAsStream("bobili.png")));
        timerTask1 = new TimerTask() {
            @Override
            public void run() {
                kayanLabel.setTranslateY(kayanSayi);
                kayanSayi--;
                System.out.println("yarak deger : " + kayanSayi);
                if (kayanSayi == -400) {
                    kayanSayi = 450;
                }
            }
        };
        timer1.schedule(timerTask1, 0, 30);
        String path = getClass().getResource("music.wav").toString();
        Media media = new Media(path);
        mp = new MediaPlayer(media);
        mp.setVolume(100);
        mp.play();

        timerq = new Timer();
        timerTaskq = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Stage node = (Stage) logo.getScene().getWindow();
                        node.resizableProperty().setValue(Boolean.FALSE);
                        node.setOnCloseRequest(new EventHandler<WindowEvent>() {
                            @Override
                            public void handle(WindowEvent event) {
                                mp.stop();
                            }
                        });
                    }
                });
            }
        };
        timerq.scheduleAtFixedRate(timerTaskq, 10, 1000);

    }

}
