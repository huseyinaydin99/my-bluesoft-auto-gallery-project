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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class GirisController implements Initializable {

    /**
     * Initializes the controller class.
     */
    int hak = 3;
    @FXML
    private ImageView image;
    @FXML
    private Button gir;
    @FXML
    private TextField kul;
    @FXML
    private TextField sif;
    @FXML
    private Label bildirim;

    private Timer timer;
    private TimerTask timerTask;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image.setImage(new Image(getClass().getResourceAsStream("lock.png")));
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Stage node = (Stage) sif.getScene().getWindow();
                        node.resizableProperty().setValue(Boolean.FALSE);

                    }
                });
            }
        };
        timer.scheduleAtFixedRate(timerTask, 10, 1000);
        sif.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                try {
                    if (event.getCode().equals(KeyCode.ENTER)) {
                        if (event.getCode().equals(KeyCode.ENTER) && (hak != 0)) {
                            giris_yap();
                        } else {
                            if (hak == 0) {
                                bildirim.setText("Hakkınız bitti.!");
                                gir.setDisable(true);
                            }else
                            bildirim.setText("Kullanıcı adı veya şifre yanlış Kalan Hak : " + hak);
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void giris_yap() throws SQLException, IOException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (connection.isClosed()) {

        } else {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Firma where ID=1");
            String kullanici = "";
            String sifre = "";
            while (resultSet.next()) {
                kullanici = resultSet.getString("Kullanici");
                sifre = resultSet.getString("Sifre");
            }
            resultSet.close();
            statement.close();
            connection.close();
            if (kullanici.toString().equals(kul.getText().toString()) && sifre.toString().equals(sif.getText().toString())) {
                Stage stage = new Stage();
                AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("Program.fxml"));
                stage.setScene(new Scene(parent));
                stage.show();
                kapat();
            } else {
                hak--;
                if (hak == 0) {
                    bildirim.setText("Hakkınız bitti.!");
                    gir.setDisable(true);
                } else {
                    bildirim.setText("Kullanıcı adı veya şifre yanlış Kalan Hak : " + hak);
                }
            }
        }
    }

    public void kapat() {
        Stage node = (Stage) sif.getScene().getWindow();
        node.close();
    }

}
