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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.apache.commons.io.FileUtils;

/**
 * FXML Controller class
 *
 * @author Hüseyin AYDIN
 */
public class DuzenleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField dfirmaadi, dyetkilikisi, dunvan, dadres, dweb, dtelefon, dceptelefonu, dil, dilce, demail, dkul, dsif, dresyol;
    @FXML
    ImageView dres;
    @FXML
    Button dgozat, dguncelleet;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            veriCek();
        } catch (SQLException ex) {
            Logger.getLogger(DuzenleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dgozatet() throws IOException {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter
                = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png");
        FileChooser.ExtensionFilter extFilter1
                = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilter2
                = new FileChooser.ExtensionFilter("JPEG files (*.jpeg)", "*.jpeg");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.getExtensionFilters().add(extFilter1);
        fileChooser.getExtensionFilters().add(extFilter2);
        File file = fileChooser.showOpenDialog(dresyol.getScene().getWindow());
        dresyol.setText(file.getAbsolutePath());
        String uzanti = "";
        String name = file.getName().toString();
        if (name.contains(".png")) {
            uzanti = ".png";
        } else if (name.contains(".jpg")) {
            uzanti = ".jpg";
        } else if (name.contains(".jpeg")) {
            uzanti = ".jpeg";
        } else if (name.contains(".JPEG")) {
            uzanti = ".JPEG";
        } else if (name.contains(".JPG")) {
            uzanti = ".JPG";
        } else if (name.contains(".PNG")) {
            uzanti = ".PNG";
        }

        FileUtils.copyFile(new File(dresyol.getText().toString()), new File("C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + "logo" + uzanti));
        dres.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + "logo" + uzanti));
        dresyol.setText("C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + "logo" + uzanti);
    }

    public void dguncelleet() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            boolean durum = false;
            durum = statement.execute("update main.firma set Adi='" + dfirmaadi.getText().toString() + "',"
                    + "Yetkili='" + dyetkilikisi.getText().toString() + "',"
                    + "Unvani='" + dunvan.getText().toString() + "',"
                    + "Adres='" + dadres.getText().toString() + "',"
                    + "Web='" + dweb.getText().toString() + "',"
                    + "Telefon='" + dtelefon.getText().toString() + "',"
                    + "Cep='" + dceptelefonu.getText().toString() + "',"
                    + "Il='" + dil.getText().toString() + "',"
                    + "Ilce='" + dilce.getText().toString() + "',"
                    + "Email='" + demail.getText().toString() + "',"
                    + "Kullanici='" + dkul.getText().toString() + "',"
                    + "Sifre='" + dsif.getText().toString() + "',"
                    + "Resim_Yol='" + dresyol.getText().toString() + "' where ID=1");
            if (!durum) {
                uyari("Güncelleme başarılı. Program kapatılıyor. Lütfen tekrar açınız. (-:", "Bluesoft Yazılım (-:");
                Platform.exit();
                System.exit(0);
            } else {
                uyari("Güncelleme başarısız.", "Bluesoft Yazılım (-:");
            }
            statement.close();
            connection.close();
        }
    }

    public void veriCek() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.firma");
            while (resultSet.next()) {
                dfirmaadi.setText(resultSet.getString("Adi"));
                dyetkilikisi.setText(resultSet.getString("Yetkili"));
                dunvan.setText(resultSet.getString("Unvani"));
                dadres.setText(resultSet.getString("Adres"));
                dweb.setText(resultSet.getString("Web"));
                dtelefon.setText(resultSet.getString("Telefon"));
                dceptelefonu.setText(resultSet.getString("Cep"));
                dil.setText(resultSet.getString("Il"));
                dilce.setText(resultSet.getString("Ilce"));
                demail.setText(resultSet.getString("Email"));
                dkul.setText(resultSet.getString("Kullanici"));
                dsif.setText(resultSet.getString("Sifre"));
                dresyol.setText(resultSet.getString("Resim_Yol"));
                String resimyoluTastan = resultSet.getString("Resim_Yol");
                dres.setImage(new Image("file:///" + "C:\\Program Files\\Bluesoft Oto Galeri\\images\\logo.png"));
                System.out.println(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
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

}
