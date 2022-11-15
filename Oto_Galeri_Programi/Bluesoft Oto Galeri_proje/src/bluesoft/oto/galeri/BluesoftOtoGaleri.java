/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import org.joda.time.DateTime;

/**
 *
 * @author hsyn
 */
public class BluesoftOtoGaleri extends Application {

    private static final int shadowSize = 0;

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Girdi eve");
        String licence = "a";
        if (Advapi32Util.registryKeyExists(WinReg.HKEY_CURRENT_USER, "Software\\huso")) {
            if (!Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\huso", "Licence").toString().equals("")) {
                licence += Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\huso", "Licence");
            }
        }
        System.out.println("li : ");

        if (licence.toString().equals("aXXX") || licence.toString().equals("aDEMO")) {
            //System.out.println("Girdi ama");
        } else {
            stop();
            Platform.exit();
            System.exit(0);
        }

        stage.initStyle(StageStyle.TRANSPARENT);

        Parent root = FXMLLoader.load(getClass().getResource("Splash.fxml"));
        root.setStyle(
                "-fx-background-color: transparent;"
                + "-fx-background-insets: " + shadowSize + ";"
        );
        Scene scene = new Scene(root, 400, 500);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent t) {
                System.out.println("ebeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeen");
                Platform.exit();
                System.exit(0);
            }

        });

    }

    @Override
    public void stop() throws Exception {
        super.stop(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Girdi eve");
        String licence = "a";

        if (Advapi32Util.registryKeyExists(WinReg.HKEY_CURRENT_USER, "Software\\huso")) {
            if (!Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\huso", "Licence").toString().equals("")) {
                licence += Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, "Software\\huso", "Licence");
            }
        }
        System.out.println("li : ");

        if (licence.toString().equals("aDEMO")) {
            //System.out.println("Girdi ama");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                statement.execute("delete from main.alis");
                statement.execute("delete from main.cari");
                statement.execute("delete from main.fatura");
                statement.execute("delete from main.firma");
                statement.execute("delete from main.gecici");
                statement.execute("delete from main.kasa");
                statement.execute("delete from main.kasa_gecici");
                statement.execute("delete from main.sex");
                statement.execute("delete from main.satis");
                statement.execute("delete from main.asdf");
                statement.close();
                connection.close();
            }
        } else {
            //stop();
            Platform.exit();
            System.exit(0);
        }

        System.out.println("ebeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeen");
        Platform.exit();
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Pane createShadowPane() {
        Pane shadowPane = new Pane();
        // a "real" app would do this in a CSS stylesheet.
        shadowPane.setStyle(
                "-fx-background-color: transparent;"
                + "-fx-effect: dropshadow(gaussian, transparent, " + shadowSize + ", 0, 0, 0);"
                + "-fx-background-insets: " + shadowSize + ";"
        );
        return shadowPane;
    }
}
