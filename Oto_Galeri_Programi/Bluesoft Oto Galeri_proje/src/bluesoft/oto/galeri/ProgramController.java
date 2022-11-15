/*
Bismillahirrahmanirrahim. 
while(true)
    print("Huu. Rahman, Rahim, SübhanAllah, Ya Hayyü Ya Gayyum Çok şükür Allah'a hamd olsun.");
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluesoft.oto.galeri;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observer;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javafx.util.Duration;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.io.FileUtils;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ProgramController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Pane parentPane; // pane on which text is placed
    @FXML
    private Button araba_ekle, takfiltreett, alisRaporu, satisRaporu, cariRaporu, kasaReport, faturaReport;
    @FXML
    private Button arac_satis, kasaaraiptal;
    @FXML
    private Button kaydet, onizleme;
    @FXML
    private Button sil;
    @FXML
    private Button guncelle;
    @FXML
    private Button ilk;
    @FXML
    private Button geri;
    @FXML
    private Button ileri;
    @FXML
    private Button son;
    @FXML
    private Button temizle;
    @FXML
    private Button arama_but;
    @FXML
    private Button gozat, takaraet, takaraiptal, kasaraporara;
    @FXML
    private ComboBox<String> tur;
    @FXML
    private ComboBox<String> odeme;
    @FXML
    private ComboBox<String> cari_kodu;
    @FXML
    private ComboBox<String> column;
    ObservableList<String> depo;
    ObservableList<String> depo1;
    ObservableList<String> depo2;
    ObservableList<String> depo3, kasacomboob;
    ObservableList<SatisTak> sattableob;
    ObservableList<KasaRapor> kasatableob;
    @FXML
    private TextField renk, cariresimyol;
    @FXML
    private TextField marka, ccarikodu, cticariunvan, cadisoyadi, cililce, cvergidaire, cvergino, ctcno, ctelefon, cevtelefon, ctelefo;
    @FXML
    private TextField model, cfax, cemail;
    @FXML
    private TextField motor, evrakno, kasatutari;
    @FXML
    private TextField plaka;
    @FXML
    private DatePicker tarih, ustsinir, altsinir;
    @FXML
    private TextField alis_tutar;
    @FXML
    private TextField odenen_tutar;
    @FXML
    private TextField vadesi;
    @FXML
    private TextField aciklama;
    @FXML
    private TextField unvan;
    @FXML
    private TextField adi_soyadi;
    @FXML
    private TextField telefonu;
    @FXML
    private TextField toplam_tutar;
    @FXML
    private TextField toplam_odenen;
    @FXML
    private TextField toplam_kalan;
    @FXML
    private TextField res_yol;
    @FXML
    private ComboBox arama;
    @FXML
    private AnchorPane back;
    private Connection baglanti;
    private Statement durum;
    private ResultSet imlec;
    @FXML
    private ImageView resim, fataracgorunumu, profile;
    private String uzanti = "";
    private int didi = 1;
    @FXML
    private Hyperlink büyük, satbuyutcu,bilgiler;
    @FXML
    private TableView<Alis> table1;
    @FXML
    private TableView<SatisTak> sattable1;
    @FXML
    private ObservableList<Alis> observableList;
    @FXML
    private ObservableList<String> colonobservab, satmusteriob, satodemeturob, sataraplakaob, fatplakaob, fatcarikodob, fataracplakacomboob, takcomboob;
    @FXML
    private ObservableList<String> satplakaob, caricomboob, caripalakacomboob;
    @FXML
    private TableColumn<Alis, String> ID;
    @FXML
    private TableColumn<Alis, String> Tur;
    @FXML
    private TableColumn<Alis, String> Renk;
    @FXML
    private TableColumn<Alis, String> Marka;
    @FXML
    private TableColumn<Alis, String> Model;
    @FXML
    private TableColumn<Alis, String> Hacim;
    @FXML
    private TableColumn<Alis, String> Plaka;
    @FXML
    private TableColumn<Alis, String> Tarih;
    @FXML
    private TableColumn<Alis, String> Odeme_Turu;
    @FXML
    private TableColumn<Alis, String> Alis_Tutari;
    @FXML
    private TableColumn<Alis, String> Vadesi;
    @FXML
    private TableColumn<Alis, String> Aciklama;
    @FXML
    private TableColumn<Alis, String> Cari_Kodu;
    @FXML
    private TableColumn<Alis, String> Unvan;
    @FXML
    private TableColumn<Alis, String> Adi_Soyadi;
    @FXML
    private TableColumn<Alis, String> Telefonu;
    @FXML
    private TableColumn<Alis, String> Toplam_Tutar;
    @FXML
    private TableColumn<Alis, String> Toplam_Odenen;
    @FXML
    private TableColumn<Alis, String> Toplam_Kalan;
    @FXML
    private TableColumn<Alis, String> Odenen_Tutar;
    @FXML
    private TableColumn<Alis, String> Res_Yol;

    @FXML
    private TableColumn<Alis, String> Durum;
    @FXML
    private TextField alis_arama, alis_filtreleme;
    @FXML
    private Button alis_ara, alis_filtrele, alis_araiptal, fitrei, satilkti, sattemizle, fattophesapla, fatkayitbut, fatplakaara, fatyazdir;
    @FXML
    private ComboBox satplaka, satmusterikodu, satodemeturu, sataramaplaka, fatplaka, fatcarikod, fataracplakacombo, takcombo, caricombo, caripalakacombo, kasacombo;
    @FXML
    private TextField sattur, fatticariunvan, fatvergidairesi, fatvergidairesino, fatililce;
    @FXML
    private TextField fatadisoyadi;
    @FXML
    private TextArea fatadres, cadres, cnot, kasaaciklama;
    @FXML
    private TextField satrenk, fatno, fatsaati, takaratext, takfiltretext;
    @FXML
    private TextField satmarka;
    @FXML
    private TextField satmodel, fatresimyol;
    @FXML
    private TextField satresyol, satsatistutar, satodemetutar, satadi, sattelefonu, satemail, satunvan, fataracfiyati, fatarafiyat, fatkdv, fatiskonto, fattoplam;
    @FXML
    private ImageView satresimage, ccariresmin;
    @FXML
    private DatePicker satislemtar, notersattar, fattarihi, fatvadesi, kasatarihi;
    @FXML
    private Button satiskayit, satileri, satgeri, satson, sataramabut, satguncellebut, satsilbut, fatileri, fatgeri, fatson, fatilk, fatsil, fatguncelle, fattemizle;
    @FXML
    private Button carikaydet, carisil, cariguncelle, cariilk, carigeri, cariileri, carison, caritemizle, cariara;
    @FXML
    private Button tepesatis, tepesatistakip, tepecari, carigozat, tepekasa, kasakaydet, kasasil, kasaguncelle, kasailk, kasageri, kasaileri, kasason, kasatemizle, kasaara;
    private int satID = 1;
    private int fatID = 1;
    private int cariID = 1;
    @FXML
    CheckBox kdvcheck, iskontocheck;
    @FXML
    private ToggleButton toggleButton1;
    @FXML
    RadioButton kasagelir, kasagider;
    @FXML
    Label firmaDeger, profiledeger;

    private Timer timer;
    private TimerTask timerTask;
    static String fatyol = "";
    static InputStream inputStreamyol = null;

    @FXML
    private TableColumn<SatisTak, String> satIDx;
    @FXML
    private TableColumn<SatisTak, String> satPLAKAx;
    @FXML
    private TableColumn<SatisTak, String> satCARIKODUx;
    @FXML
    private TableColumn<SatisTak, String> satISLEMTARx;
    @FXML
    private TableColumn<SatisTak, String> satTUTARIx;
    @FXML
    private TableColumn<SatisTak, String> satODEMETUTx;
    @FXML
    private TableColumn<SatisTak, String> satODEMETURUx;
    @FXML
    private TableColumn<SatisTak, String> satNOTERTARx;
    @FXML
    Tab tab1;
    @FXML
    TabPane tabpane1;
    SingleSelectionModel<Tab> singleSelectionModel = null;
    ToggleGroup toggleGroup = new ToggleGroup();

    TranslateTransition transition = null;
    @FXML
    Text text1;
    @FXML
    Label kayanLabel, kasatoplam;

    @FXML
    private TableColumn<KasaRapor, String> evraknoo;
    @FXML
    private TableColumn<KasaRapor, String> islemtarr;
    @FXML
    private TableColumn<KasaRapor, String> tutarturuu;
    @FXML
    private TableColumn<KasaRapor, String> tutarii;
    @FXML
    private TableColumn<KasaRapor, String> aciklamaa;
    @FXML
    private TableView<KasaRapor> kasareporttable;

    @FXML
    Button hakkimizda;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /*timerTask1 = new TimerTask() {
            @Override
            public void run() {
                kayanLabel.setTranslateY(kayanSayi);
                kayanSayi--;
                System.out.println("yarak deger : "+kayanSayi);
                if(kayanSayi == -400)
                    kayanSayi = 500;
            }
        };
        timer1.schedule(timerTask1, 0, 10);*/
 /*text1.setText("abc \n abd \n cba \n");
        transition = TranslateTransitionBuilder.create()
                .duration(new Duration(10))
                .node(text1)
                .interpolator(Interpolator.EASE_IN)
                .cycleCount(1)
                .build();

        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rerunAnimation();
            }
        });

        rerunAnimation();*/
        try {
            //tab1.setContent(new Rectangle(200,200, Color.LIGHTSTEELBLUE));
            firmaBilgileri();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        singleSelectionModel = tabpane1.getSelectionModel();
        //tab1.setStyle("");
        kasagelir.setToggleGroup(toggleGroup);
        kasagider.setToggleGroup(toggleGroup);
        inputStreamyol = getClass().getResourceAsStream("fatura.jasper");
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Date date = new Date();
                        fatsaati.setText(String.valueOf(date.getHours()) + ":" + String.valueOf(date.getMinutes()) + ":" + String.valueOf(date.getSeconds()));
                    }
                });
            }
        };
        toggleButton1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    timer = new Timer();
                    timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    Date date = new Date();
                                    fatsaati.setText(String.valueOf(date.getHours()) + ":" + String.valueOf(date.getMinutes()) + ":" + String.valueOf(date.getSeconds()));
                                }
                            });
                        }
                    };

                    timer.schedule(timerTask, 0, 1000);
                    toggleButton1.setText("Saati Kapa");
                } else {
                    timer.cancel();
                    timerTask.cancel();
                    toggleButton1.setText("Saati Aç");
                }
            }
        });
        timer.schedule(timerTask, 0, 1000);
        //fattarihi.setValue(LocalDate.now());

        observableList = FXCollections.observableArrayList();
        try {
            tableFill();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        reindex();
        odenen_tutar.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                hesapla();
            }
        });

        depo = FXCollections.observableArrayList();
        depo.add("Otomobil (Binek)");
        depo.add("Ticari");
        depo.add("Arazi (SUV)");
        depo.add("Panelvan");
        depo.add("Kamyon");
        depo.add("Kamyonet");
        depo.add("Traktör");
        depo.add("Spor");
        tur.setItems(depo);

        depo1 = FXCollections.observableArrayList();
        depo1.add("Nakit");
        depo1.add("Kredi Kartı");
        depo1.add("Havale");
        depo1.add("Dekont");
        depo1.add("Çek");
        depo1.add("Senet");
        odeme.setItems(depo1);

        aramadoldurucu();

        colonobservab = FXCollections.observableArrayList();

        colonobservab.add("Tur");
        colonobservab.add("Renk");
        colonobservab.add("Marka");
        colonobservab.add("Model");
        colonobservab.add("Hacim");
        colonobservab.add("Plaka");
        colonobservab.add("Tarih");
        colonobservab.add("Odeme_Turu");
        colonobservab.add("Alis_Tutari");
        colonobservab.add("Vadesi");
        colonobservab.add("Aciklama");
        colonobservab.add("Cari_Kodu");
        colonobservab.add("Unvan");
        colonobservab.add("Adi_Soyadi");
        colonobservab.add("Telefonu");
        colonobservab.add("Toplam_Tutar");
        colonobservab.add("Toplam_Odenen");
        colonobservab.add("Toplam_Kalan");
        colonobservab.add("Odenen_Tutar");

        column.setItems(colonobservab);

        Image image = new Image(getClass().getResourceAsStream("car.png"));
        araba_ekle.setGraphic(new ImageView(image));
        araba_ekle.setContentDisplay(ContentDisplay.TOP);

        Image image1 = new Image(getClass().getResourceAsStream("car_sale.png"));
        arac_satis.setGraphic(new ImageView(image1));
        arac_satis.setContentDisplay(ContentDisplay.TOP);

        Image imagerr = new Image(getClass().getResourceAsStream("faturaReport.png"));
        faturaReport.setGraphic(new ImageView(imagerr));
        faturaReport.setContentDisplay(ContentDisplay.TOP);

        Image imager = new Image(getClass().getResourceAsStream("alisreport.png"));
        alisRaporu.setGraphic(new ImageView(imager));
        alisRaporu.setContentDisplay(ContentDisplay.TOP);

        Image imagef = new Image(getClass().getResourceAsStream("satisreport.png"));
        satisRaporu.setGraphic(new ImageView(imagef));
        satisRaporu.setContentDisplay(ContentDisplay.TOP);

        Image imaget = new Image(getClass().getResourceAsStream("carireport.png"));
        cariRaporu.setGraphic(new ImageView(imaget));
        cariRaporu.setContentDisplay(ContentDisplay.TOP);

        Image imageyy = new Image(getClass().getResourceAsStream("kasaReport.png"));
        kasaReport.setGraphic(new ImageView(imageyy));
        kasaReport.setContentDisplay(ContentDisplay.TOP);

        Image imagev = new Image(getClass().getResourceAsStream("satis.png"));
        tepesatis.setGraphic(new ImageView(imagev));
        tepesatis.setContentDisplay(ContentDisplay.TOP);

        Image imaged = new Image(getClass().getResourceAsStream("satistakip.png"));
        tepesatistakip.setGraphic(new ImageView(imaged));
        tepesatistakip.setContentDisplay(ContentDisplay.TOP);

        Image imageg = new Image(getClass().getResourceAsStream("kasa.png"));
        tepekasa.setGraphic(new ImageView(imageg));
        tepekasa.setContentDisplay(ContentDisplay.TOP);

        Image imageh = new Image(getClass().getResourceAsStream("about.png"));
        hakkimizda.setGraphic(new ImageView(imageh));
        hakkimizda.setContentDisplay(ContentDisplay.TOP);

        Image imagedd = new Image(getClass().getResourceAsStream("carikayit.png"));
        tepecari.setGraphic(new ImageView(imagedd));
        tepecari.setContentDisplay(ContentDisplay.TOP);

        Image image2 = new Image(getClass().getResourceAsStream("kaydet.png"));
        kaydet.setGraphic(new ImageView(image2));

        Image image2k = new Image(getClass().getResourceAsStream("kaydet.png"));
        kasakaydet.setGraphic(new ImageView(image2k));

        Image image2c = new Image(getClass().getResourceAsStream("kaydet.png"));
        carikaydet.setGraphic(new ImageView(image2c));

        Image image2x = new Image(getClass().getResourceAsStream("kaydet.png"));
        fatkayitbut.setGraphic(new ImageView(image2x));

        Image image2s = new Image(getClass().getResourceAsStream("kaydet.png"));
        satiskayit.setGraphic(new ImageView(image2));

        Image image3 = new Image(getClass().getResourceAsStream("sil.png"));
        sil.setGraphic(new ImageView(image3));

        Image image3k = new Image(getClass().getResourceAsStream("sil.png"));
        kasasil.setGraphic(new ImageView(image3k));

        Image image3c = new Image(getClass().getResourceAsStream("sil.png"));
        carisil.setGraphic(new ImageView(image3c));

        Image image3x = new Image(getClass().getResourceAsStream("sil.png"));
        fatsil.setGraphic(new ImageView(image3x));

        Image image3s = new Image(getClass().getResourceAsStream("sil.png"));
        satsilbut.setGraphic(new ImageView(image3));

        Image image4 = new Image(getClass().getResourceAsStream("guncelle.png"));
        guncelle.setGraphic(new ImageView(image4));

        Image image4k = new Image(getClass().getResourceAsStream("guncelle.png"));
        kasaguncelle.setGraphic(new ImageView(image4k));

        Image image4c = new Image(getClass().getResourceAsStream("guncelle.png"));
        cariguncelle.setGraphic(new ImageView(image4c));

        Image image4x = new Image(getClass().getResourceAsStream("guncelle.png"));
        fatguncelle.setGraphic(new ImageView(image4x));

        Image image4s = new Image(getClass().getResourceAsStream("guncelle.png"));
        satguncellebut.setGraphic(new ImageView(image4));

        Image image5 = new Image(getClass().getResourceAsStream("ilk.png"));
        ilk.setGraphic(new ImageView(image5));

        Image image5k = new Image(getClass().getResourceAsStream("ilk.png"));
        kasailk.setGraphic(new ImageView(image5k));

        Image image5c = new Image(getClass().getResourceAsStream("ilk.png"));
        cariilk.setGraphic(new ImageView(image5c));

        Image image5x = new Image(getClass().getResourceAsStream("ilk.png"));
        fatilk.setGraphic(new ImageView(image5x));

        Image image5s = new Image(getClass().getResourceAsStream("ilk.png"));
        satilkti.setGraphic(new ImageView(image5));

        Image image6 = new Image(getClass().getResourceAsStream("geri.png"));
        geri.setGraphic(new ImageView(image6));

        Image image6k = new Image(getClass().getResourceAsStream("geri.png"));
        kasageri.setGraphic(new ImageView(image6k));

        Image image6c = new Image(getClass().getResourceAsStream("geri.png"));
        carigeri.setGraphic(new ImageView(image6c));

        Image image6x = new Image(getClass().getResourceAsStream("geri.png"));
        fatgeri.setGraphic(new ImageView(image6x));

        Image image6s = new Image(getClass().getResourceAsStream("geri.png"));
        satgeri.setGraphic(new ImageView(image6));

        Image image7 = new Image(getClass().getResourceAsStream("ileri.png"));
        ileri.setGraphic(new ImageView(image7));

        Image image7c = new Image(getClass().getResourceAsStream("ileri.png"));
        cariileri.setGraphic(new ImageView(image7c));

        Image image7ck = new Image(getClass().getResourceAsStream("ileri.png"));
        kasaileri.setGraphic(new ImageView(image7ck));

        Image image7x = new Image(getClass().getResourceAsStream("ileri.png"));
        fatileri.setGraphic(new ImageView(image7x));

        Image image7s = new Image(getClass().getResourceAsStream("ileri.png"));
        satileri.setGraphic(new ImageView(image7));

        Image image8 = new Image(getClass().getResourceAsStream("son.png"));
        son.setGraphic(new ImageView(image8));

        Image image8k = new Image(getClass().getResourceAsStream("son.png"));
        kasason.setGraphic(new ImageView(image8k));

        Image image8c = new Image(getClass().getResourceAsStream("son.png"));
        carison.setGraphic(new ImageView(image8c));

        Image image8x = new Image(getClass().getResourceAsStream("son.png"));
        fatson.setGraphic(new ImageView(image8x));

        Image image8s = new Image(getClass().getResourceAsStream("son.png"));
        satson.setGraphic(new ImageView(image8));

        Image image9 = new Image(getClass().getResourceAsStream("temizle.png"));
        temizle.setGraphic(new ImageView(image9));

        Image image9k = new Image(getClass().getResourceAsStream("temizle.png"));
        kasatemizle.setGraphic(new ImageView(image9k));

        Image image9x = new Image(getClass().getResourceAsStream("temizle.png"));
        fattemizle.setGraphic(new ImageView(image9x));

        Image image9s = new Image(getClass().getResourceAsStream("temizle.png"));
        sattemizle.setGraphic(new ImageView(image9));

        Image image9sc = new Image(getClass().getResourceAsStream("temizle.png"));
        caritemizle.setGraphic(new ImageView(image9sc));

        Image imagez = new Image(getClass().getResourceAsStream("search.png"));
        arama_but.setGraphic(new ImageView(imagez));

        Image imagezk = new Image(getClass().getResourceAsStream("search.png"));
        kasaara.setGraphic(new ImageView(imagezk));

        Image imagezc = new Image(getClass().getResourceAsStream("search.png"));
        cariara.setGraphic(new ImageView(imagezc));

        Image imagezx = new Image(getClass().getResourceAsStream("search.png"));
        fatplakaara.setGraphic(new ImageView(imagezx));

        Image imagezs = new Image(getClass().getResourceAsStream("search.png"));
        sataramabut.setGraphic(new ImageView(imagez));

        //String images = getClass().getResource("C:\\Program Files\\Bluesoft Oto Galeri\\abc.png").toExternalForm();
        Image image10 = new Image(getClass().getResourceAsStream("abc.png"));
        BackgroundImage myBI = new BackgroundImage(image10, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        boolean buulean = false;
        try {
            //back.setBackground(new Background(myBI));
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = null;
                resultSet = statement.executeQuery("select * from main.alis");
                while (resultSet.next()) {
                    tur.setValue(resultSet.getString("TUR"));
                    renk.setText(resultSet.getString("Renk"));
                    marka.setText(resultSet.getString("Marka"));
                    model.setText(resultSet.getString("Model"));
                    motor.setText(resultSet.getString("Hacim"));
                    plaka.setText(resultSet.getString("Plaka"));
                    /*try{
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy",Locale.US);
                        tarih.setValue(LocalDate.parse(resultSet.getString("Tarih"), formatter)); 
                    }
                    catch(DateTimeParseException ex){
                        System.err.println(ex.getMessage());
                    }
                    catch(StringIndexOutOfBoundsException ex){
                        System.err.println(ex.getMessage());
                    }*/
                    String bar = resultSet.getString("Tarih");
                    String tar = "";
                    tar += bar.charAt(0);
                    tar += bar.charAt(1);
                    tar += bar.charAt(2);
                    tar += bar.charAt(3);
                    tar += ",";
                    tar += bar.charAt(5);
                    tar += bar.charAt(6);
                    tar += ",";
                    tar += bar.charAt(8);
                    tar += bar.charAt(9);

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tar, formatter));

                    odeme.setValue(resultSet.getString("Odeme_Turu"));
                    alis_tutar.setText("Alis_Tutari");
                    odenen_tutar.setText("Odenen_Tutar");
                    vadesi.setText(resultSet.getString("Vadesi"));
                    aciklama.setText(resultSet.getString("Aciklama"));
                    cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                    unvan.setText(resultSet.getString("Unvan"));
                    adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                    telefonu.setText(resultSet.getString("Telefonu"));
                    toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                    toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                    toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                    String resimyoluTastan = resultSet.getString("Res_Yol");
                    resim.setImage(new Image("file:///" + resimyoluTastan));
                    res_yol.setText(resimyoluTastan);
                    buulean = true;
                    break;
                }
                statement.close();
                connection.close();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        yenileBakalım();
        if (!buulean) {
            resim.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
        }
        try {
            satisCariDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        satPlakaYenile();
        satplaka.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                try {
                    satplakaData();
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException e) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        });

        satodemeturob = FXCollections.observableArrayList();
        satodemeturob.add("Nakit");
        satodemeturob.add("Kredi Kartı");
        satodemeturob.add("Havale");
        satodemeturob.add("Dekont");
        satodemeturob.add("Çek");
        satodemeturob.add("Senet");
        satodemeturu.setItems(satodemeturob);

        try {
            combola();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fatpalakadoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        fatplaka.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                try {
                    String resyol = "";
                    String str_kdv = "1.";
                    Connection baglanti;
                    try {
                        baglanti = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                        if (!baglanti.isClosed()) {
                            Statement statement = baglanti.createStatement();
                            ResultSet resultSet = statement.executeQuery("select * from main.alis where Plaka='" + fatplaka.getValue().toString() + "'");
                            while (resultSet.next()) {
                                fataracfiyati.setText(resultSet.getString("Alis_Tutari"));
                                resyol = resultSet.getString("Res_Yol");
                                fataracgorunumu.setImage(new Image("file:///" + resyol));
                                fatresimyol.setText(resyol);
                            }
                            resultSet.close();
                            statement.close();
                            baglanti.close();
                            fatarafiyat.setText(fataracfiyati.getText().toString());

                            fattoplam.setText(fataracfiyati.getText().toString());
                        } else {

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NullPointerException ex) {

                }
            }
        });
        kdvcheck.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    fatkdv.setEditable(true);
                    fatkdv.requestFocus();

                } else {
                    fatkdv.setEditable(false);
                    fatkdv.setText("0");
                }
            }
        });

        iskontocheck.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    fatiskonto.setEditable(true);
                    fatiskonto.requestFocus();
                } else {
                    fatiskonto.setEditable(false);
                    fatiskonto.setText("0");
                }
            }
        });
        try {
            fatvericek();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fataracplakacombodoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            takTableFill();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        takcombofill();
        caricomboob = FXCollections.observableArrayList();
        caricomboob.add("Araç sahibi");
        caricomboob.add("Alıcı (Müşteri)");
        caricombo.setItems(caricomboob);
        try {
            cariDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            cariaracombodoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            carikodudoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        cari_kodu.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                try {
                    cariKoduSec();
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        satmusterikodu.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                try {
                    satMusteriKoduSec();
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException e) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        });

        try {
            fatCariDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            kasaVeriCek();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            kasaComboDoldur();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }

        fatcarikod.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                try {
                    fatcarikodSelect();
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        try {
            kasaToplamYenile();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            kasaToplamYenile();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            satisGetir();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
        satPlakaYenile();
        try {
            fillKasaTablee();
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void veriKaydet() throws SQLException {
        int sonId = 0;
        Connection baglanti = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!baglanti.isClosed()) {
            Statement statement = baglanti.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.alis");
            while (resultSet.next()) {
                sonId = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            baglanti.close();
            sonId = sonId + 1;
        } else {

        }
        String resimYolu = res_yol.getText().toString();
        //uyari(resimYolu,"");
        try {
            String cari = cari_kodu.getValue().toString() + "i";
            String tar = tarih.getValue().toString();
            String turs = tur.getValue() + "i";
            String odemes = odeme.getValue() + "i";
            System.out.println(turs + " " + odemes);
            if (!cari.equals("nulli") && !turs.equals("nulli") && !odemes.equals("nulli") && !renk.getText().toString().equals("") && !marka.getText().toString().equals("") && !model.getText().toString().equals("") && !motor.getText().toString().equals("") && !plaka.getText().toString().equals("") && !alis_tutar.getText().toString().equals("") && !unvan.getText().toString().equals("") && !adi_soyadi.getText().toString().equals("") && !toplam_tutar.getText().toString().equals("") && !toplam_odenen.getText().toString().equals("") && !toplam_kalan.getText().toString().equals("") && !res_yol.getText().toString().equals("")) {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                if (connection.isClosed()) {
                    System.out.println("Veritabanı kapalı");
                } else {
                    System.out.println("Veritabanı açık");
                    System.out.println(
                            turs + " "
                            + renk.getText().toString() + " "
                            + marka.getText().toString() + " "
                            + model.getText().toString() + " "
                            + motor.getText().toString() + " "
                            + plaka.getText().toString() + " "
                            + tar + " "
                            + odemes + " "
                            + alis_tutar.getText().toString() + " "
                            + vadesi.getText().toString() + " "
                            + aciklama.getText().toString() + " "
                            + cari + " "
                            + unvan.getText().toString() + " "
                            + adi_soyadi.getText().toString() + " "
                            + telefonu.getText().toString() + " "
                            + toplam_tutar.getText().toString() + " "
                            + toplam_kalan.getText().toString() + " "
                            + toplam_odenen.getText().toString());

                    Statement statement = connection.createStatement();
                    boolean durum = statement.execute("insert into main.alis("
                            + "Tur,"
                            + "Renk,"
                            + "Marka,"
                            + "Model,"
                            + "Hacim,"
                            + "Plaka,"
                            + "Tarih,"
                            + "Odeme_Turu,"
                            + "Alis_Tutari,"
                            + "Vadesi,"
                            + "Aciklama,"
                            + "Cari_Kodu,"
                            + "Unvan,"
                            + "Adi_Soyadi,"
                            + "Telefonu,"
                            + "Toplam_Tutar,"
                            + "Toplam_Odenen,"
                            + "Toplam_Kalan,"
                            + "Odenen_Tutar,"
                            + "Res_Yol) "
                            + "values('" + turs + "',"
                            + "'" + renk.getText().toString() + "',"
                            + "'" + marka.getText().toString() + "',"
                            + "'" + model.getText().toString() + "',"
                            + "'" + motor.getText().toString() + "',"
                            + "'" + plaka.getText().toString() + "',"
                            + "'" + tar + "',"
                            + "'" + odemes + "',"
                            + "'" + alis_tutar.getText().toString() + "',"
                            + "'" + vadesi.getText().toString() + "',"
                            + "'" + aciklama.getText().toString() + "',"
                            + "'" + cari + "',"
                            + "'" + unvan.getText().toString() + "',"
                            + "'" + adi_soyadi.getText().toString() + "',"
                            + "'" + telefonu.getText().toString() + "',"
                            + "'" + toplam_tutar.getText().toString() + "',"
                            + "'" + toplam_odenen.getText().toString() + "',"
                            + "'" + toplam_kalan.getText().toString() + "',"
                            + "'" + odenen_tutar.getText().toString() + "',"
                            + "'C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + sonId + uzanti + "')");
                    FileUtils.copyFile(new File(res_yol.getText().toString()), new File("C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + sonId + uzanti));
                    plakaYerli();
                    if (durum) {

                    } else {
                        satPlakaYenile();
                        aramadoldurucu();
                        tableFill();
                        System.out.println("kayıt başarılı");
                        yenileBakalım();
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Bildiri");
                        alert.setHeaderText("Kayıt başarılı.");
                        alert.setContentText("Bluesoft Yazılım (-:");
                        alert.showAndWait().ifPresent(rs -> {
                            if (rs == ButtonType.OK) {
                                System.out.println("Pressed OK.");
                            }
                        });
                    }
                    statement.close();
                }
                connection.close();
            }
            System.err.println(tar);
        } catch (NullPointerException e) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Uyarı.!");
            alert.setHeaderText("Lütfen bütün alanları doldurunuz.! Veya Farklı bir plaka giriniz.");
            alert.setContentText("Bluesoft Yazılım (-:");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        } catch (Exception ex) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Uyarı.!");
            alert.setHeaderText("Lütfen bütün alanları doldurunuz.! Veya Farklı bir plaka giriniz.");
            alert.setContentText("Bluesoft Yazılım (-:");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
    }

    public void alisfitrele() throws SQLException {
        try {
            //System.out.println("Seri göt shiqishine devam @");
            if (!alis_filtrele.getText().toString().equals("")) {
                boolean aramaDurumu = false;
                //uyari("sex",alis_arama.getText().toString());
                observableList.clear();
                Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                if (!connections.isClosed()) {
                    Statement statement = connections.createStatement();
                    ResultSet resultSet = statement.executeQuery("select * from main.alis where " + column.getValue().toString() + " not like('%" + alis_filtreleme.getText().toString() + "%')");
                    while (resultSet.next()) {
                        aramaDurumu = true;
                        observableList.add(new Alis(resultSet.getString("ID"),
                                resultSet.getString("Tur"),
                                resultSet.getString("Renk"),
                                resultSet.getString("Marka"),
                                resultSet.getString("Model"),
                                resultSet.getString("Hacim"),
                                resultSet.getString("Plaka"),
                                resultSet.getString("Tarih"),
                                resultSet.getString("Odeme_Turu"),
                                resultSet.getString("Alis_Tutari"),
                                resultSet.getString("Vadesi"),
                                resultSet.getString("Aciklama"),
                                resultSet.getString("Cari_Kodu"),
                                resultSet.getString("Unvan"),
                                resultSet.getString("Adi_Soyadi"),
                                resultSet.getString("Telefonu"),
                                resultSet.getString("Toplam_Tutar"),
                                resultSet.getString("Toplam_Odenen"),
                                resultSet.getString("Toplam_Kalan"),
                                resultSet.getString("Odenen_Tutar"),
                                resultSet.getString("Res_Yol"),
                                resultSet.getString("Durum")));
                    }
                    if (aramaDurumu) {
                        ID.setCellValueFactory(new PropertyValueFactory<Alis, String>("ID"));
                        ID.setMinWidth(100);
                        Tur.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tur"));
                        Tur.setMinWidth(100);
                        Renk.setCellValueFactory(new PropertyValueFactory<Alis, String>("Renk"));
                        Renk.setMinWidth(100);
                        Marka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Marka"));
                        Marka.setMinWidth(100);
                        Model.setCellValueFactory(new PropertyValueFactory<Alis, String>("Model"));
                        Model.setMinWidth(100);
                        Hacim.setCellValueFactory(new PropertyValueFactory<Alis, String>("Hacim"));
                        Hacim.setMinWidth(100);
                        Plaka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Plaka"));
                        Plaka.setMinWidth(100);
                        Tarih.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tarih"));
                        Tarih.setMinWidth(100);
                        Odeme_Turu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odeme_Turu"));
                        Odeme_Turu.setMinWidth(100);
                        Alis_Tutari.setCellValueFactory(new PropertyValueFactory<Alis, String>("Alis_Tutari"));
                        Alis_Tutari.setMinWidth(100);
                        Vadesi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Vadesi"));
                        Vadesi.setMinWidth(100);
                        Aciklama.setCellValueFactory(new PropertyValueFactory<Alis, String>("Aciklama"));
                        Aciklama.setMinWidth(100);
                        Cari_Kodu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Cari_Kodu"));
                        Cari_Kodu.setMinWidth(100);
                        Unvan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Unvan"));
                        Unvan.setMinWidth(100);
                        Adi_Soyadi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Adi_Soyadi"));
                        Adi_Soyadi.setMinWidth(100);
                        Telefonu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Telefonu"));
                        Telefonu.setMinWidth(100);
                        Toplam_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Tutar"));
                        Toplam_Tutar.setMinWidth(100);
                        Toplam_Odenen.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Odenen"));
                        Toplam_Odenen.setMinWidth(100);
                        Toplam_Kalan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Kalan"));
                        Toplam_Kalan.setMinWidth(100);
                        Odenen_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odenen_Tutar"));
                        Odenen_Tutar.setMinWidth(100);
                        Res_Yol.setCellValueFactory(new PropertyValueFactory<Alis, String>("Res_Yol"));
                        Res_Yol.setMinWidth(100);
                        table1.setItems(observableList);
                    } else {
                        uyari("Aranan kelime yok.!", "Bluesoft Yazılım (-:");
                    }
                    resultSet.close();
                    resultSet.close();
                    connections.close();
                }
            } else {
                uyari("Filtreleme yapacağınız türü seçip kelimeyi girin.", "Bluesoft Yazılım (-:");
            }
        } catch (NullPointerException ex) {
            uyari("Filtreleme yapacağınız türü seçip kelimeyi girin.", "Bluesoft Yazılım (-:");
            tableFill();
        }
    }

    public void hesapla() {
        try {
            double alis_tutari = Double.valueOf(alis_tutar.getText().toString());
            double odenen_tutari = Double.valueOf(odenen_tutar.getText().toString());
            if (odenen_tutari > alis_tutari) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Uyarı.!");
                alert.setHeaderText("Ödenen tutar alış tutarından fazla olamaz.! Çok para veriyon hacım (:");
                alert.setContentText("Bluesoft Yazılım (-:");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                }
                );
                odenen_tutar.setText("0");
                return;
            }
            toplam_tutar.setText(String.valueOf(alis_tutari));
            toplam_odenen.setText(String.valueOf(odenen_tutari));
            double fark = alis_tutari - odenen_tutari;
            toplam_kalan.setText(String.valueOf(fark));
        } catch (Exception ex) {

        }
    }

    public void temizleHepsini() {
        tur.getSelectionModel().clearSelection();
        odeme.getSelectionModel().clearSelection();;
        cari_kodu.getSelectionModel().clearSelection();

        renk.setText("");
        marka.setText("");
        model.setText("");
        motor.setText("");
        plaka.setText("");
        tarih.getEditor().clear();
        alis_tutar.setText("");
        odenen_tutar.setText("");

        vadesi.setText("");
        aciklama.setText("");
        unvan.setText("");
        adi_soyadi.setText("");
        telefonu.setText("");
        toplam_tutar.setText("");
        toplam_odenen.setText("");
        toplam_kalan.setText("");
        resim.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
        res_yol.setText("");
    }

    public void kayıtSil() throws SQLException {
        if (!plaka.getText().toString().equals("")) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Uyarı.!");
            alert.setHeaderText("Silmek istediğinize eminmisiniz?");
            alert.setContentText("Bluesoft Yazılım (-:");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                        Statement statement = null;
                        statement = connection.createStatement();
                        boolean durum = statement.execute("update main.alis set Tur='', Renk='', Marka='',Model='',Hacim='',Plaka='',Tarih='',Odeme_Turu='',Alis_Tutari='',Vadesi='',Aciklama='',Cari_Kodu='',Unvan='',Adi_Soyadi='',Telefonu='',Toplam_Tutar='',Toplam_Odenen='',Toplam_Kalan='',Odenen_Tutar='' where ID=" + idIndex);
                        if (!durum) {
                            uyari(plaka.getText().toString() + " Plakalı araç" + "kaydı silindi.!", "Bluesoft Yazılım (-:");
                            temizleHepsini();
                            yenileBakalım();
                            resim.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
                            plakaYerli();
                            tableFill();
                            aramadoldurucu();
                        } else {

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        } else {
            uyari("Lütfen plaka kısmını boş bırakmayınız.", "Bluesoft Yazılım (-:");
        }
    }

    public void uyari(String deger1, String deger2) {
        Alert alert = new Alert(AlertType.INFORMATION);
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

    public void guncelleHepsini() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            String sql = "";
            sql = "update main.alis set Tur='" + tur.getValue().toString() + "',"
                    + "Renk='" + renk.getText().toString() + "',"
                    + "Marka='" + marka.getText().toString() + "',"
                    + "Model='" + model.getText().toString() + "',"
                    + "Hacim='" + motor.getText().toString() + "',"
                    + "Plaka='" + plaka.getText().toString() + "',"
                    + "Tarih='" + tarih.getValue().toString() + "',"
                    + "Odeme_Turu='" + odeme.getValue().toString() + "',"
                    + "Alis_Tutari='" + alis_tutar.getText().toString() + "',"
                    + "Odenen_Tutar='" + odenen_tutar.getText().toString() + "',"
                    + "Vadesi='" + vadesi.getText().toString() + "',"
                    + "Aciklama='" + aciklama.getText().toString() + "',"
                    + "Cari_Kodu='" + cari_kodu.getValue().toString() + "',"
                    + "Unvan='" + unvan.getText().toString() + "',"
                    + "Adi_Soyadi='" + adi_soyadi.getText().toString() + "',"
                    + "Telefonu='" + telefonu.getText().toString() + "',"
                    + "Toplam_Tutar='" + toplam_tutar.getText().toString() + "',"
                    + "Toplam_Odenen='" + toplam_odenen.getText().toString() + "',"
                    + "Toplam_Kalan='" + toplam_kalan.getText().toString() + "',Res_Yol='" + res_yol.getText().toString() + "' where Plaka='" + plaka.getText().toString() + "'";
            boolean durum = statement.execute(sql);
            if (durum) {
                uyari("Güncelleme başarısız oldu. Tüm alanların dolu olmasına dikkat edin.!", "Bluesoft Yazılım (-:");
            } else {
                uyari("Güncelleme başarılı oldu.", "Bluesoft Yazılım (-:");
                tableFill();
                yenileBakalım();
                verileriYenile();
                plakaYerli();
                aramadoldurucu();
            }
            statement.close();
            connection.close();
        } else {

        }
    }

    public void satguncelleHepsini() throws SQLException {
        try {
            if (!satmusterikodu.getValue().toString().equals("") && !satislemtar.getValue().toString().equals("") && !satsatistutar.getText().equals("") && !satodemetutar.getText().toString().equals("") && !satodemeturu.getValue().toString().equals("")) {
                {
                    Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                    if (!connection.isClosed()) {
                        Statement statement = connection.createStatement();
                        String sql = "";
                        sql = "update main.satis set Plaka='" + satplaka.getValue().toString() + "'"
                                + ",Cari_Kodu='" + satmusterikodu.getValue().toString() + "'"
                                + ",Islem_Tarihi='" + satislemtar.getValue().toString() + "',"
                                + "Satis_Tutari='" + satsatistutar.getText().toString() + "',"
                                + "Odeme_Tutari='" + satodemetutar.getText().toString() + "',"
                                + "Odeme_Turu='" + satodemeturu.getValue().toString() + "',"
                                + "Noter_Tar='" + notersattar.getValue().toString() + "' where ID=" + satID;
                        boolean durum = statement.execute(sql);
                        if (durum) {
                            uyari("Güncelleme başarısız oldu. Tüm alanların dolu olmasına dikkat edin.!", "Bluesoft Yazılım (-:");
                        } else {
                            uyari("Güncelleme başarılı oldu.", "Bluesoft Yazılım (-:");
                            yenileBakalım();
                            verileriYenile();
                            plakaYerli();
                            takTableFill();
                            fatCariDoldur();
                            combola();
                        }
                        statement.close();
                        connection.close();
                    } else {

                    }
                }
            } else {

            }
        } catch (NullPointerException ex) {

        }
    }

    private void verileriYenile() {
        try {
            //back.setBackground(new Background(myBI));
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = null;
                resultSet = statement.executeQuery("select * from main.alis where Plaka='" + plaka.getText().toString() + "'");
                while (resultSet.next()) {
                    tur.setValue(resultSet.getString("TUR"));
                    renk.setText(resultSet.getString("Renk"));
                    marka.setText(resultSet.getString("Marka"));
                    model.setText(resultSet.getString("Model"));
                    motor.setText(resultSet.getString("Hacim"));
                    plaka.setText(resultSet.getString("Plaka"));
                    String bar = resultSet.getString("Tarih");
                    String tar = "";
                    tar += bar.charAt(0);
                    tar += bar.charAt(1);
                    tar += bar.charAt(2);
                    tar += bar.charAt(3);
                    tar += ",";
                    tar += bar.charAt(5);
                    tar += bar.charAt(6);
                    tar += ",";
                    tar += bar.charAt(8);
                    tar += bar.charAt(9);

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tar, formatter));
                    odeme.setValue(resultSet.getString("Odeme_Turu"));
                    alis_tutar.setText("Alis_Tutari");
                    odenen_tutar.setText("Odenen_Tutar");
                    vadesi.setText(resultSet.getString("Vadesi"));
                    aciklama.setText(resultSet.getString("Aciklama"));
                    cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                    unvan.setText(resultSet.getString("Unvan"));
                    adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                    telefonu.setText(resultSet.getString("Telefonu"));
                    toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                    toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                    toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                    break;
                }
                statement.close();
                connection.close();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    List<String> depom = new ArrayList<>();
    int index = 0;
    int pindex = 0;
    int idIndex = 0;
    int kasaIndex = 1;

    public void ilk() throws SQLException {
        idIndex = 1;
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where ID=1");
            while (resultSet.next()) {
                System.out.println("kavuşmak");
                tur.setValue(resultSet.getString("Tur"));
                renk.setText(resultSet.getString("Renk"));
                marka.setText(resultSet.getString("Marka"));
                model.setText(resultSet.getString("Model"));
                motor.setText(resultSet.getString("Hacim"));
                plaka.setText(resultSet.getString("Plaka"));
                String bar = resultSet.getString("Tarih");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                odeme.setValue(resultSet.getString("Odeme_Turu"));
                alis_tutar.setText(resultSet.getString("Alis_Tutari"));
                odenen_tutar.setText(resultSet.getString("Odenen_Tutar"));
                vadesi.setText(resultSet.getString("Vadesi"));
                aciklama.setText(resultSet.getString("Aciklama"));
                cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                unvan.setText(resultSet.getString("Unvan"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Telefonu"));
                toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                String resimyoluTastan = resultSet.getString("Res_Yol");
                resim.setImage(new Image("file:///" + resimyoluTastan));
                res_yol.setText(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void son() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.alis");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        idIndex++;
        if (idIndex > fondex) {
            idIndex--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where ID=" + fondex);
            while (resultSet.next()) {
                System.out.println("kavuşmak");
                tur.setValue(resultSet.getString("Tur"));
                renk.setText(resultSet.getString("Renk"));
                marka.setText(resultSet.getString("Marka"));
                model.setText(resultSet.getString("Model"));
                motor.setText(resultSet.getString("Hacim"));
                plaka.setText(resultSet.getString("Plaka"));
                String bar = resultSet.getString("Tarih");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                odeme.setValue(resultSet.getString("Odeme_Turu"));
                alis_tutar.setText(resultSet.getString("Alis_Tutari"));
                odenen_tutar.setText(resultSet.getString("Odenen_Tutar"));
                vadesi.setText(resultSet.getString("Vadesi"));
                aciklama.setText(resultSet.getString("Aciklama"));
                cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                unvan.setText(resultSet.getString("Unvan"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Telefonu"));
                toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                String resimyoluTastan = resultSet.getString("Res_Yol");
                resim.setImage(new Image("file:///" + resimyoluTastan));
                res_yol.setText(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void ileri() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.alis");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        idIndex++;
        if (idIndex > fondex) {
            idIndex--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where ID=" + idIndex);
            while (resultSet.next()) {
                System.out.println("kavuşmak");
                tur.setValue(resultSet.getString("Tur"));
                renk.setText(resultSet.getString("Renk"));
                marka.setText(resultSet.getString("Marka"));
                model.setText(resultSet.getString("Model"));
                motor.setText(resultSet.getString("Hacim"));
                plaka.setText(resultSet.getString("Plaka"));
                String bar = resultSet.getString("Tarih");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                odeme.setValue(resultSet.getString("Odeme_Turu"));
                alis_tutar.setText(resultSet.getString("Alis_Tutari"));
                odenen_tutar.setText(resultSet.getString("Odenen_Tutar"));
                vadesi.setText(resultSet.getString("Vadesi"));
                aciklama.setText(resultSet.getString("Aciklama"));
                cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                unvan.setText(resultSet.getString("Unvan"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Telefonu"));
                toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                String resimyoluTastan = resultSet.getString("Res_Yol");
                resim.setImage(new Image("file:///" + resimyoluTastan));
                res_yol.setText(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void geri() throws SQLException {
        idIndex--;
        if (idIndex < 1) {
            idIndex = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where ID=" + idIndex);
            while (resultSet.next()) {
                System.out.println("kavuşmak");
                tur.setValue(resultSet.getString("Tur"));
                renk.setText(resultSet.getString("Renk"));
                marka.setText(resultSet.getString("Marka"));
                model.setText(resultSet.getString("Model"));
                motor.setText(resultSet.getString("Hacim"));
                plaka.setText(resultSet.getString("Plaka"));
                String bar = resultSet.getString("Tarih");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                odeme.setValue(resultSet.getString("Odeme_Turu"));
                alis_tutar.setText(resultSet.getString("Alis_Tutari"));
                odenen_tutar.setText(resultSet.getString("Odenen_Tutar"));
                vadesi.setText(resultSet.getString("Vadesi"));
                aciklama.setText(resultSet.getString("Aciklama"));
                cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                unvan.setText(resultSet.getString("Unvan"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Telefonu"));
                toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                String resimyoluTastan = resultSet.getString("Res_Yol");
                resim.setImage(new Image("file:///" + resimyoluTastan));
                res_yol.setText(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    private void yenileBakalım() {
        try {
            depom.clear();
            //back.setBackground(new Background(myBI));
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = null;
                resultSet = statement.executeQuery("select Tur,Renk,Marka,Model,Hacim,Plaka,Tarih,Odeme_Turu,Alis_Tutari,Vadesi,Aciklama,Cari_Kodu,Unvan,Adi_Soyadi,Telefonu,Toplam_Tutar,Toplam_Odenen,Toplam_Kalan,Odenen_Tutar from main.alis");
                while (resultSet.next()) {
                    System.err.println(resultSet.getString("Tur"));
                    System.err.println(resultSet.getString("Renk"));
                    System.err.println(resultSet.getString("Marka"));
                    System.err.println(resultSet.getString("Model"));
                    System.err.println(resultSet.getString("Hacim"));
                    System.err.println(resultSet.getString("Plaka"));
                    System.err.println(resultSet.getString("Tarih"));
                    System.err.println(resultSet.getString("Odeme_Turu"));
                    System.err.println(resultSet.getString("Alis_Tutari"));
                    System.err.println(resultSet.getString("Odenen_Tutar"));
                    System.err.println(resultSet.getString("Vadesi"));
                    System.err.println(resultSet.getString("Aciklama"));
                    System.err.println(resultSet.getString("Cari_Kodu"));
                    System.err.println(resultSet.getString("Unvan"));
                    System.err.println(resultSet.getString("Adi_Soyadi"));
                    System.err.println(resultSet.getString("Telefonu"));
                    System.err.println(resultSet.getString("Toplam_Tutar"));
                    System.err.println(resultSet.getString("Toplam_Odenen"));
                    System.err.println(resultSet.getString("Toplam_Kalan"));
                    System.err.println("---------------------------------");

                    depom.add(resultSet.getString("Tur"));
                    depom.add(resultSet.getString("Renk"));
                    depom.add(resultSet.getString("Marka"));
                    depom.add(resultSet.getString("Model"));
                    depom.add(resultSet.getString("Hacim"));
                    depom.add(resultSet.getString("Plaka"));
                    depom.add(resultSet.getString("Tarih"));
                    depom.add(resultSet.getString("Odeme_Turu"));
                    depom.add(resultSet.getString("Alis_Tutari"));
                    depom.add(resultSet.getString("Odenen_Tutar"));
                    depom.add(resultSet.getString("Vadesi"));
                    depom.add(resultSet.getString("Aciklama"));
                    depom.add(resultSet.getString("Cari_Kodu"));
                    depom.add(resultSet.getString("Unvan"));
                    depom.add(resultSet.getString("Adi_Soyadi"));
                    depom.add(resultSet.getString("Telefonu"));
                    depom.add(resultSet.getString("Toplam_Tutar"));
                    depom.add(resultSet.getString("Toplam_Odenen"));
                    depom.add(resultSet.getString("Toplam_Kalan"));
                    depom.add("-");
                }
                statement.close();
                connection.close();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void aramaYap() throws SQLException {
        boolean durums = false;
        String aramaMetni = arama.getValue().toString();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where Plaka='" + aramaMetni + "'");
            while (resultSet.next()) {
                durums = true;
                System.out.println("kavuşmak");
                tur.setValue(resultSet.getString("Tur"));
                renk.setText(resultSet.getString("Renk"));
                marka.setText(resultSet.getString("Marka"));
                model.setText(resultSet.getString("Model"));
                motor.setText(resultSet.getString("Hacim"));
                plaka.setText(resultSet.getString("Plaka"));
                String bar = resultSet.getString("Tarih");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                odeme.setValue(resultSet.getString("Odeme_Turu"));
                alis_tutar.setText(resultSet.getString("Alis_Tutari"));
                odenen_tutar.setText(resultSet.getString("Odenen_Tutar"));
                vadesi.setText(resultSet.getString("Vadesi"));
                aciklama.setText(resultSet.getString("Aciklama"));
                cari_kodu.setValue(resultSet.getString("Cari_Kodu"));
                unvan.setText(resultSet.getString("Unvan"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Telefonu"));
                toplam_tutar.setText(resultSet.getString("Toplam_Tutar"));
                toplam_odenen.setText(resultSet.getString("Toplam_Odenen"));
                toplam_kalan.setText(resultSet.getString("Toplam_Kalan"));
                String resimyoluTastan = resultSet.getString("Res_Yol");
                resim.setImage(new Image("file:///" + resimyoluTastan));
                res_yol.setText(resimyoluTastan);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
        if (durums == false) {
            uyari("Bu plakada kayıtlı araç yok.", "Bluesoft Yazılım (-:");
        }
    }

    public void gozlemci() throws IOException {
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
        File file = fileChooser.showOpenDialog(res_yol.getScene().getWindow());
        res_yol.setText(file.getAbsolutePath());

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

        FileUtils.copyFile(new File(res_yol.getText().toString()), new File("C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + idIndex + uzanti));
        resim.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + idIndex + uzanti));
        res_yol.setText("C:\\Program Files\\Bluesoft Oto Galeri\\images\\" + idIndex + uzanti);
    }

    private void reindex() {
        try {
            Connection connectionn = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connectionn.isClosed()) {
                Statement statement = connectionn.createStatement();
                ResultSet resultSet = statement.executeQuery("select ID from main.alis");
                List<String> ids = new ArrayList<>();
                ids.add("nall");
                while (resultSet.next()) {
                    ids.add(resultSet.getString("ID"));
                }
                for (int i = 1; i < ids.size(); i++) {
                    //boolean updateDurum = false;
                    try {
                        statement.execute("update main.alis set ID=" + i + " where ID=" + ids.get(i));
                    } catch (SQLException ex) {
                        System.err.println("--------------");
                    }
                }
                statement.close();
                connectionn.close();
            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void plakaYerli() {
        try {
            Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connections.isClosed()) {
                Statement statement = connections.createStatement();
                ResultSet resultSet = statement.executeQuery("select Plaka from main.alis");
                depo3.clear();
                while (resultSet.next()) {
                    depo3.add(resultSet.getString("Plaka"));
                }
                resultSet.close();
                statement.close();
                connections.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void büyült() throws IOException {
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("ResimBuyuk.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle(res_yol.getText().toString());
        stage.show();
    }

    public void satbuyut() throws IOException {
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("ResimBuyuk.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle(satresyol.getText().toString());
        stage.show();
    }

    public void fatresbuyut() throws IOException {
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("ResimBuyuk.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle(fatresimyol.getText().toString());
        stage.show();
    }

    public void alisaraiptal() throws SQLException {
        tableFill();
    }

    public void alisara() throws SQLException {
        boolean aramaDurumu = false;
        //uyari("sex",alis_arama.getText().toString());
        observableList.clear();
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connections.isClosed()) {
            Statement statement = connections.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis where Tur like('%" + alis_arama.getText().toString() + "%') or Renk like('%" + alis_arama.getText().toString() + "%') or Marka like('%" + alis_arama.getText().toString() + "%') or Model like('%" + alis_arama.getText().toString() + "%') or Hacim like('%" + alis_arama.getText().toString() + "%') or Plaka like('%" + alis_arama.getText().toString() + "%') or Tarih like('%" + alis_arama.getText().toString() + "%') or Odeme_Turu like('%" + alis_arama.getText().toString() + "%') or Alis_Tutari like('%" + alis_arama.getText().toString() + "%') or Vadesi like('%" + alis_arama.getText().toString() + "%') or Aciklama like('%" + alis_arama.getText().toString() + "%') or Cari_Kodu like('%" + alis_arama.getText().toString() + "%') or Unvan like('%" + alis_arama.getText().toString() + "%') or Adi_Soyadi like('%" + alis_arama.getText().toString() + "%') or Telefonu like('%" + alis_arama.getText().toString() + "%') or Toplam_Tutar like('%" + alis_arama.getText().toString() + "%') or Toplam_Odenen like('%" + alis_arama.getText().toString() + "%') or Toplam_Kalan like('%" + alis_arama.getText().toString() + "%') or Odenen_Tutar like('%" + alis_arama.getText().toString() + "%') or Res_Yol like('%" + alis_arama.getText().toString() + "%')");
            while (resultSet.next()) {
                aramaDurumu = true;
                observableList.add(new Alis(resultSet.getString("ID"),
                        resultSet.getString("Tur"),
                        resultSet.getString("Renk"),
                        resultSet.getString("Marka"),
                        resultSet.getString("Model"),
                        resultSet.getString("Hacim"),
                        resultSet.getString("Plaka"),
                        resultSet.getString("Tarih"),
                        resultSet.getString("Odeme_Turu"),
                        resultSet.getString("Alis_Tutari"),
                        resultSet.getString("Vadesi"),
                        resultSet.getString("Aciklama"),
                        resultSet.getString("Cari_Kodu"),
                        resultSet.getString("Unvan"),
                        resultSet.getString("Adi_Soyadi"),
                        resultSet.getString("Telefonu"),
                        resultSet.getString("Toplam_Tutar"),
                        resultSet.getString("Toplam_Odenen"),
                        resultSet.getString("Toplam_Kalan"),
                        resultSet.getString("Odenen_Tutar"),
                        resultSet.getString("Res_Yol"),
                        resultSet.getString("Durum")));
            }
            if (aramaDurumu) {
                ID.setCellValueFactory(new PropertyValueFactory<Alis, String>("ID"));
                ID.setMinWidth(100);
                Tur.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tur"));
                Tur.setMinWidth(100);
                Renk.setCellValueFactory(new PropertyValueFactory<Alis, String>("Renk"));
                Renk.setMinWidth(100);
                Marka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Marka"));
                Marka.setMinWidth(100);
                Model.setCellValueFactory(new PropertyValueFactory<Alis, String>("Model"));
                Model.setMinWidth(100);
                Hacim.setCellValueFactory(new PropertyValueFactory<Alis, String>("Hacim"));
                Hacim.setMinWidth(100);
                Plaka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Plaka"));
                Plaka.setMinWidth(100);
                Tarih.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tarih"));
                Tarih.setMinWidth(100);
                Odeme_Turu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odeme_Turu"));
                Odeme_Turu.setMinWidth(100);
                Alis_Tutari.setCellValueFactory(new PropertyValueFactory<Alis, String>("Alis_Tutari"));
                Alis_Tutari.setMinWidth(100);
                Vadesi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Vadesi"));
                Vadesi.setMinWidth(100);
                Aciklama.setCellValueFactory(new PropertyValueFactory<Alis, String>("Aciklama"));
                Aciklama.setMinWidth(100);
                Cari_Kodu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Cari_Kodu"));
                Cari_Kodu.setMinWidth(100);
                Unvan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Unvan"));
                Unvan.setMinWidth(100);
                Adi_Soyadi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Adi_Soyadi"));
                Adi_Soyadi.setMinWidth(100);
                Telefonu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Telefonu"));
                Telefonu.setMinWidth(100);
                Toplam_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Tutar"));
                Toplam_Tutar.setMinWidth(100);
                Toplam_Odenen.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Odenen"));
                Toplam_Odenen.setMinWidth(100);
                Toplam_Kalan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Kalan"));
                Toplam_Kalan.setMinWidth(100);
                Odenen_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odenen_Tutar"));
                Odenen_Tutar.setMinWidth(100);
                Res_Yol.setCellValueFactory(new PropertyValueFactory<Alis, String>("Res_Yol"));
                Res_Yol.setMinWidth(100);
                table1.setItems(observableList);
            } else {
                uyari("Aranan kelime yok.!", "Bluesoft Yazılım (-:");
            }
            resultSet.close();
            resultSet.close();
            connections.close();
        }
    }

    public void tableFill() throws SQLException {
        observableList.clear();
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connections.isClosed()) {
            Statement statement = connections.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis");
            while (resultSet.next()) {
                observableList.add(new Alis(resultSet.getString("ID"),
                        resultSet.getString("Tur"),
                        resultSet.getString("Renk"),
                        resultSet.getString("Marka"),
                        resultSet.getString("Model"),
                        resultSet.getString("Hacim"),
                        resultSet.getString("Plaka"),
                        resultSet.getString("Tarih"),
                        resultSet.getString("Odeme_Turu"),
                        resultSet.getString("Alis_Tutari"),
                        resultSet.getString("Vadesi"),
                        resultSet.getString("Aciklama"),
                        resultSet.getString("Cari_Kodu"),
                        resultSet.getString("Unvan"),
                        resultSet.getString("Adi_Soyadi"),
                        resultSet.getString("Telefonu"),
                        resultSet.getString("Toplam_Tutar"),
                        resultSet.getString("Toplam_Odenen"),
                        resultSet.getString("Toplam_Kalan"),
                        resultSet.getString("Odenen_Tutar"),
                        resultSet.getString("Res_Yol"),
                        resultSet.getString("Durum")));
            }
            resultSet.close();
            resultSet.close();
            connections.close();
        }
        ID.setCellValueFactory(new PropertyValueFactory<Alis, String>("ID"));
        ID.setMinWidth(100);
        Tur.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tur"));
        Tur.setMinWidth(100);
        Renk.setCellValueFactory(new PropertyValueFactory<Alis, String>("Renk"));
        Renk.setMinWidth(100);
        Marka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Marka"));
        Marka.setMinWidth(100);
        Model.setCellValueFactory(new PropertyValueFactory<Alis, String>("Model"));
        Model.setMinWidth(100);
        Hacim.setCellValueFactory(new PropertyValueFactory<Alis, String>("Hacim"));
        Hacim.setMinWidth(100);
        Plaka.setCellValueFactory(new PropertyValueFactory<Alis, String>("Plaka"));
        Plaka.setMinWidth(100);
        Tarih.setCellValueFactory(new PropertyValueFactory<Alis, String>("Tarih"));
        Tarih.setMinWidth(100);
        Odeme_Turu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odeme_Turu"));
        Odeme_Turu.setMinWidth(100);
        Alis_Tutari.setCellValueFactory(new PropertyValueFactory<Alis, String>("Alis_Tutari"));
        Alis_Tutari.setMinWidth(100);
        Vadesi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Vadesi"));
        Vadesi.setMinWidth(100);
        Aciklama.setCellValueFactory(new PropertyValueFactory<Alis, String>("Aciklama"));
        Aciklama.setMinWidth(100);
        Cari_Kodu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Cari_Kodu"));
        Cari_Kodu.setMinWidth(100);
        Unvan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Unvan"));
        Unvan.setMinWidth(100);
        Adi_Soyadi.setCellValueFactory(new PropertyValueFactory<Alis, String>("Adi_Soyadi"));
        Adi_Soyadi.setMinWidth(100);
        Telefonu.setCellValueFactory(new PropertyValueFactory<Alis, String>("Telefonu"));
        Telefonu.setMinWidth(100);
        Toplam_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Tutar"));
        Toplam_Tutar.setMinWidth(100);
        Toplam_Odenen.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Odenen"));
        Toplam_Odenen.setMinWidth(100);
        Toplam_Kalan.setCellValueFactory(new PropertyValueFactory<Alis, String>("Toplam_Kalan"));
        Toplam_Kalan.setMinWidth(100);
        Odenen_Tutar.setCellValueFactory(new PropertyValueFactory<Alis, String>("Odenen_Tutar"));
        Odenen_Tutar.setMinWidth(100);
        Res_Yol.setCellValueFactory(new PropertyValueFactory<Alis, String>("Res_Yol"));
        Res_Yol.setMinWidth(100);
        table1.setItems(observableList);

    }

    public void satplakaData() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from main.alis where Plaka='" + satplaka.getValue().toString() + "'");
                while (resultSet.next()) {
                    satmarka.setText(resultSet.getString("Marka"));
                    satmodel.setText(resultSet.getString("Model"));
                    satrenk.setText(resultSet.getString("Renk"));
                    sattur.setText(resultSet.getString("Tur"));
                    satresyol.setText(resultSet.getString("Res_Yol"));
                    String resimyoluTastan = resultSet.getString("Res_Yol");
                    satresimage.setImage(new Image("file:///" + resimyoluTastan));
                }
                resultSet.close();
                statement.close();
                connection.close();
            } else {

            }
        } catch (NullPointerException ex) {

        }
    }

    public void sataramaplakaData() throws SQLException {
        String Cari = "";
        String pilaka = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where Plaka='" + sataramaplaka.getValue().toString() + "'");
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                tarih.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    satislemtar.setValue(LocalDate.parse(tar, formatter));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void satisGetir() throws SQLException {
        String pilaka = "";
        String Cari = "";

        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID=1");
            while (resultSet.next()) {

                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                satislemtar.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tar, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void satisKaydet() throws SQLException {
//        uyari(satislemtar.getValue().toString()+" "+satsatistutar.getText().toString()+" " +satodemetutar.getText().toString()+" " + satodemeturu.getValue().toString()+" "+notersattar.getValue().toString(),"Bluesoft Yazılım (-:");
        try {
            if (!satmusterikodu.getValue().toString().equals("") && !satislemtar.getValue().toString().equals("") && !satsatistutar.getText().equals("") && !satodemetutar.getText().toString().equals("") && !satodemeturu.getValue().toString().equals("")) {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                if (!connection.isClosed()) {
                    Statement statement = connection.createStatement();
                    String sql = "insert into main.satis(Plaka,Cari_Kodu,Islem_Tarihi,Satis_Tutari,Odeme_Tutari,Odeme_Turu,Noter_Tar) values('" + satplaka.getValue().toString() + "',"
                            + "'" + satmusterikodu.getValue().toString() + "',"
                            + "'" + satislemtar.getValue().toString() + "',"
                            + "'" + satsatistutar.getText().toString() + "',"
                            + "'" + satodemetutar.getText().toString() + "',"
                            + "'" + satodemeturu.getValue().toString() + "',"
                            + "'" + notersattar.getValue().toString() + "')";
                    boolean kayitdurum = statement.execute(sql);
                    if (!kayitdurum) {
                        String tutar = satsatistutar.getText().toString();
                        String odenen = satodemetutar.getText().toString();
                        String fark = "";
                        fark = String.valueOf(Double.valueOf(tutar) - Double.valueOf(odenen));
                        uyari("Satış işlemi başarı ile gerçekleşti. Satış kaydı yapıldı. Hayırlı uğurlu olsun. Satış tutarı : "+tutar+" Ödenen Tutar : "+odenen+" Kalan borç : "+fark, "Bluesoft Yazılım (-:");
                        fatCariDoldur();
                        fatpalakadoldur();
                        satPlakaYenile();
                        takTableFill();
                        combola();
                        String sql1 = "update Alis set Durum='Satildi' where Plaka='" + satplaka.getValue().toString() + "'";
                        kayitdurum = statement.execute(sql1);
                        if (!kayitdurum) {
                            takTableFill();
                            combola();
                        }
                    } else {
                        uyari("Satış işlemi başarısız. Kayıt başarısız.", "Bluesoft Yazılım (-:");
                    }
                    statement.close();
                    connection.close();
                } else {

                }
            } else {
                uyari("Lütfen alanları boş geçmeyiniz.", "Bluesoft Yazılım (-:");
            }
        } catch (NullPointerException ex) {
            uyari("Lütfen alanları boş geçmeyiniz.", "Bluesoft Yazılım (-:");
        } catch (Exception ex) {
            uyari("Lütfen alanları boş geçmeyiniz.", "Bluesoft Yazılım (-:");
        }
    }

    public void satnext() throws SQLException {
        String pilaka = "";
        String Cari = "";
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.satis");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        satID++;
        if (satID > fondex) {
            satID--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID=" + satID);
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                satislemtar.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tar, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void satback() throws SQLException {
        String pilaka = "";
        String Cari = "";
        satID--;
        if (satID < 1) {
            satID = 1;
            uyari("Başa geldin hacım (: : " + satID, "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID=" + satID);
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                satislemtar.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tar, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void satilk() throws SQLException {
        satID = 1;
        String Cari = "";
        String pilaka = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID=" + satID);
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                satislemtar.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tar, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void satend() throws SQLException {
        String Cari = "";
        String pilaka = "";
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.satis");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        satID++;
        if (satID > fondex) {
            satID--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        satID = fondex;
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID=" + fondex);
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                String bar = resultSet.getString("Islem_Tarihi");
                String tar = "";
                tar += bar.charAt(0);
                tar += bar.charAt(1);
                tar += bar.charAt(2);
                tar += bar.charAt(3);
                tar += ",";
                tar += bar.charAt(5);
                tar += bar.charAt(6);
                tar += ",";
                tar += bar.charAt(8);
                tar += bar.charAt(9);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                satislemtar.setValue(LocalDate.parse(tar, formatter));
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tar, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void sattemizlet() {
        satplaka.setValue("");
        sattur.setText("");
        satrenk.setText("");
        satmarka.setText("");
        satmodel.setText("");
        satmusterikodu.setValue("");
        satadi.setText("");
        sattelefonu.setText("");
        satemail.setText("");
        satunvan.setText("");
        satislemtar.getEditor().clear();
        satsatistutar.setText("");
        satodemetutar.setText("");
        satodemeturu.setValue("");
        notersattar.getEditor().clear();
        satresimage.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
        satresyol.setText("");
    }

    public void combola() throws SQLException {
        satplakaob = FXCollections.observableArrayList();
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select Plaka from main.satis");
            while (resultSet.next()) {
                satplakaob.add(resultSet.getString("Plaka"));
            }
            resultSet.close();
            statement.close();
            connection1.close();
            sataramaplaka.setItems(satplakaob);
        } else {

        }
    }

    public void sataramayap() throws SQLException {
        sataramaplakaData();
        if (satsatistutar.getText().toString().equals("Boş")) {
            satrenk.setText("Boş");
            satmarka.setText("Boş");
            satmodel.setText("Boş");
            sattur.setText("Boş");
        }
    }

    public void baydiyenile() throws SQLException {
        String Cari = "";
        String pilaka = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis where ID='" + satID + "'");
            while (resultSet.next()) {
                satplaka.setValue(resultSet.getString("Plaka"));
                satmusterikodu.setValue(resultSet.getString("Cari_Kodu"));
                pilaka = satplaka.getValue().toString();
                Cari = satmusterikodu.getValue().toString();
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Islem_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    satislemtar.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                satsatistutar.setText(resultSet.getString("Satis_Tutari"));
                satodemetutar.setText(resultSet.getString("Odeme_Tutari"));
                satodemeturu.setValue(resultSet.getString("Odeme_Turu"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Noter_Tar");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    notersattar.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void satsilici() throws SQLException {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Uyarı.!");
        alert.setHeaderText("Silmek istediğinize eminmisiniz?");
        alert.setContentText("Bluesoft Yazılım (-:");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                Connection connection;
                try {
                    connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                    if (!connection.isClosed()) {
                        Statement statement = connection.createStatement();
                        String sql = "";
                        sql = "update main.satis set "
                                + "Cari_Kodu='Boş',"
                                + "Islem_Tarihi='Boş',"
                                + "Satis_Tutari='Boş',"
                                + "Odeme_Tutari='Boş',"
                                + "Odeme_Turu='Boş',"
                                + "Noter_Tar='Boş' where ID=" + satID;
                        boolean durum = statement.execute(sql);
                        if (durum) {
                            uyari("Silme başarısız oldu.", "Bluesoft Yazılım (-:");
                        } else {
                            uyari("Silme başarılı oldu.", "Bluesoft Yazılım (-:");
                            fatCariDoldur();
                            baydiyenile();
                            satrenk.setText("Boş");
                            satmarka.setText("Boş");
                            satmodel.setText("Boş");
                            sattur.setText("Boş");
                            yenileBakalım();
                            verileriYenile();
                            plakaYerli();
                            takTableFill();
                            combola();

                        }
                        try {
                            statement.close();
                            connection.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public void fatpalakadoldur() throws SQLException {
        fatplakaob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Plaka from main.satis");
            while (resultSet.next()) {
                fatplakaob.add(resultSet.getString("Plaka"));
            }
            resultSet.close();
            statement.close();
            connection.close();
            fatplaka.setItems(fatplakaob);
        } else {

        }
    }

    public void fattoplamhesapla() {
        double normalfiyat = 0;
        int kdv = 0;
        double kkdv = 0;
        double toplambaba = 0;
        String str_kdv = "1.";
        normalfiyat = Double.parseDouble(fataracfiyati.getText().toString());
        if (!fatkdv.getText().toString().equals("")) {
            kdv = Integer.valueOf(fatkdv.getText().toString());
            str_kdv += String.valueOf(kdv);
            //uyari("", str_kdv);
            kkdv = Double.parseDouble(str_kdv);
            toplambaba = (normalfiyat * kkdv);
        } else {
        }
        if (!fatiskonto.getText().toString().equals("")) {
            double kucuk = 0;
            double buyuk = toplambaba;
            double iskonntossomamamskrjkefjkvefk = 0;
            int iskontos = Integer.parseInt(fatiskonto.getText().toString());
            String is_kontos = "0.";
            is_kontos += String.valueOf(iskontos);
            iskonntossomamamskrjkefjkvefk = Double.parseDouble(is_kontos);
            kucuk = toplambaba * iskonntossomamamskrjkefjkvefk;
            toplambaba = buyuk - kucuk;
            //uyari(String.valueOf(buyuk), String.valueOf(kucuk));
        } else {
        }
        fattoplam.setText(String.valueOf(toplambaba));
    }

    public void fatkayitet() throws SQLException {
        if (!fatticariunvan.getText().toString().equals("") && !fatadisoyadi.getText().toString().equals("") && !fatvergidairesi.getText().toString().equals("") && !fatvergidairesino.getText().toString().equals("") && !fatadres.getText().toString().equals("") && !fatililce.getText().toString().equals("") && !fatno.getText().toString().equals("") && !fatsaati.getText().toString().equals("") && !fattarihi.getValue().toString().equals("") && !fatvadesi.getValue().toString().equals("") && !fatplaka.getValue().toString().equals("") && !fataracfiyati.getText().toString().equals("") && !fatarafiyat.getText().toString().equals("") && !fatkdv.getText().toString().equals("") && !fatiskonto.getText().toString().equals("") && !fattoplam.getText().toString().equals("")) {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                boolean durum = false;
                String sql = "";
                sql = "insert into main.fatura(Cari_Kodu,Fatura_No,Fatura_Saati,Fatura_Tarihi,Fatura_Vadesi,Arac_Plaka,KDV,Iskonto,Toplam) values("
                        + "'" + fatcarikod.getValue().toString() + "',"
                        + "'" + fatno.getText().toString() + "',"
                        + "'" + fatsaati.getText().toString() + "',"
                        + "'" + fattarihi.getValue().toString() + "',"
                        + "'" + fatvadesi.getValue().toString() + "',"
                        + "'" + fatplaka.getValue().toString() + "',"
                        + "'" + fatkdv.getText().toString() + "',"
                        + "'" + fatiskonto.getText().toString() + "',"
                        + "'" + fattoplam.getText().toString() + "')";
                durum = statement.execute(sql);
                if (!durum) {
                    uyari("Kayıt başarılı", "Bluesoft Yazılım (-:");
                    fataracplakacombodoldur();
                } else {
                    uyari("Kayıt başarısız", "Bluesoft Yazılım (-:");
                }
                statement.close();
                connection.close();
            } else {

            }
        } else {
            uyari("Lütfen bütün alanları doldurun", "Bluesoft Yazılım");
        }
    }

    public void fatvericek() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=1");
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    fattarihi.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Vadesi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    fatvadesi.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        fatcarikodSelect();
    }

    public void fatileriet() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.fatura");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        fatID++;
        if (fatID > fondex) {
            fatID--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=" + fatID);
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void fatgeriet() throws SQLException {
        fatID--;
        if (fatID < 1) {
            fatID = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=" + fatID);
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void fatsonet() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.fatura");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }

        fatID--;
        if (fatID < 1) {
            fatID = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=" + fondex);
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void fatilket() throws SQLException {
        fatID--;
        if (fatID < 1) {
            fatID = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=1");
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void fatsilet() {
        if (!plaka.getText().toString().equals("")) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Uyarı.!");
            alert.setHeaderText("Silmek istediğinize eminmisiniz?");
            alert.setContentText("Bluesoft Yazılım (-:");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                        Statement statement = null;
                        statement = connection.createStatement();
                        boolean durum = statement.execute("update main.fatura set Cari_Kodu='Boş',Fatura_No='Boş',Fatura_Saati='Boş',Fatura_Tarihi='Boş',Fatura_Vadesi='Boş',Arac_Plaka='Boş',KDV='0',Iskonto='0',Toplam='Boş' where ID=" + fatID);
                        if (!durum) {
                            uyari("Kayıt silindi.!", "Bluesoft Yazılım (-:");
                            //temizleHepsini();
                            fatyenile();
                            fataracplakacombodoldur();
                            //yenileBakalım();
                            fataracgorunumu.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
                            //plakaYerli();

                        } else {

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ProgramController.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        } else {
            uyari("Lütfen plaka kısmını boş bırakmayınız.", "Bluesoft Yazılım (-:");
        }
    }

    public void fatyenile() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where ID=" + fatID);
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void fatguncelleet() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            Statement statement = null;
            statement = connection.createStatement();
            boolean durum = statement.execute("update main.fatura set"
                    + " Cari_Kodu='" + fatcarikod.getValue().toString() + "',"
                    + "Fatura_No='" + fatno.getText().toString() + "',"
                    + "Fatura_Saati='" + fatsaati.getText().toString() + "',"
                    + "Fatura_Tarihi='" + fattarihi.getValue().toString() + "',"
                    + "Fatura_Vadesi='" + fatvadesi.getValue().toString() + "',"
                    + "Arac_Plaka='" + fatplaka.getValue().toString() + "',"
                    + "KDV='" + fatkdv.getText().toString() + "',"
                    + "Iskonto='" + fatiskonto.getText().toString() + "',"
                    + "Toplam='" + fattoplam.getText().toString() + "'"
                    + " where ID=" + fatID);
            if (!durum) {
                uyari("Kayıt Güncellendi.!", "Bluesoft Yazılım (-:");
                //temizleHepsini();
                fatyenile();
                fataracplakacombodoldur();
                //yenileBakalım();
                //fataracgorunumu.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
                //plakaYerli();

            } else {

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fattemizleet() {
        fatcarikod.setValue("");
        fatadisoyadi.setText("");
        fatticariunvan.setText("");
        fatvergidairesi.setText("");
        fatvergidairesino.setText("");
        fatadres.setText("");
        fatililce.setText("");
        fatno.setText("");
        fatsaati.setText("");
        fattarihi.getEditor().clear();
        fatvadesi.getEditor().clear();
        fatplaka.setValue("");
        fataracfiyati.setText("");
        fatarafiyat.setText("");
        fatkdv.setText("0");
        fatiskonto.setText("0");
        fattoplam.setText("0");
        fataracgorunumu.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
        fatresimyol.setText("");
    }

    public void fataracplakacombodoldur() throws SQLException {
        fataracplakacomboob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select Arac_Plaka from main.fatura");
        while (resultSet.next()) {
            fataracplakacomboob.add(resultSet.getString("Arac_Plaka"));
        }
        resultSet.close();
        statement.close();
        connection.close();
        fataracplakacombo.setItems(fataracplakacomboob);
    }

    public void fatplakaaraet() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Fatura where Arac_Plaka='" + fataracplakacombo.getValue().toString() + "'");
            while (resultSet.next()) {
                fatcarikod.setValue(resultSet.getString("Cari_Kodu"));
                fatno.setText(resultSet.getString("Fatura_No"));
                fatsaati.setText(resultSet.getString("Fatura_Saati"));
                try {
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    //LocalDateStringConverter date = new LocalDateStringConverter(FormatStyle.FULL);
                    String bars = resultSet.getString("Fatura_Tarihi");
                    String tars = "";
                    tars += bars.charAt(0);
                    tars += bars.charAt(1);
                    tars += bars.charAt(2);
                    tars += bars.charAt(3);
                    tars += ",";
                    tars += bars.charAt(5);
                    tars += bars.charAt(6);
                    tars += ",";
                    tars += bars.charAt(8);
                    tars += bars.charAt(9);

                    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                    tarih.setValue(LocalDate.parse(tars, formatters));
                } catch (DateTimeParseException ex) {
                    System.err.println(ex.getMessage());
                } catch (NumberFormatException ex) {
                    System.err.println(ex.getMessage());
                } catch (StringIndexOutOfBoundsException ex) {
                    System.err.println(ex.getMessage());
                }
                fatplaka.setValue(resultSet.getString("Arac_Plaka"));
                fatkdv.setText(resultSet.getString("KDV"));
                fatiskonto.setText(resultSet.getString("Iskonto"));
                fattoplam.setText(resultSet.getString("Toplam"));
                if (!fatkdv.getText().toString().equals("0")) {
                    kdvcheck.setSelected(true);
                }
                if (!fatiskonto.getText().toString().equals("0")) {
                    iskontocheck.setSelected(true);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }
    static String vergidairesi = "", vergino = "", tarihi = "", Irss_No = "", miktars = "", fiyyat = "", f_krs = "", tutari = "", t_krs = "", toplam = "", kdvv = "", gtoplam = "", fatadi = "";

    public void fatyazdiret() throws SQLException, IOException {
        vergidairesi = fatvergidairesi.getText().toString();
        vergino = fatvergidairesino.getText().toString();
        tarihi = fattarihi.getValue().toString();
        Irss_No = fatno.getText().toString();
        miktars = "1";
        fiyyat = fataracfiyati.getText().toString();
        f_krs = "0";
        tutari = fiyyat;
        t_krs = "0";
        toplam = fattoplam.getText().toString();
        kdvv = fatkdv.getText().toString();
        gtoplam = fattoplam.getText().toString();
        fatadi = fatadisoyadi.getText().toString();
        String aciklama = "";
        String yanliz = "";
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("AciklamaInput.fxml"));
        stage.setScene(new Scene(parent));
        stage.show();
        aciklama = stage.getTitle();
        //kapat();
        /*Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if(!connection.isClosed()){
            Statement statement = connection.createStatement();
            boolean durum = false;
            statement.execute("insert into main.gecici"
                    + "(Vergi_Dairesi,Vergi_No,Tarih,Irs_Tarihi,Irs_No,Aciklama,Miktar,Fiyat,F_Krs,Tutari,T_Krs,Toplam,KDV,GToplam,Yanliz)");
        }*/
        //uyari("",aciklama);
        System.out.println(aciklama);
    }
    static String acik = "", yas;

    public static void uygula(String aciklama, String yanliz) throws SQLException, JRException, IOException {
        acik = aciklama;
        yas = yanliz;
        System.out.println(aciklama + " - " + yanliz);
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            boolean durum = false;
            durum = statement.execute("insert into main.gecici"
                    + "(Vergi_Dairesi,Vergi_No,Tarih,Irs_Tarihi,Irs_No,Aciklama,Miktar,Fiyat,F_Krs,Tutari,T_Krs,Toplam,KDV,GToplam,Yanliz,Sayin) "
                    + "values('" + vergidairesi + "',"
                    + "'" + vergino + "',"
                    + "'" + tarihi + "',"
                    + "'" + tarihi + "',"
                    + "'" + Irss_No + "',"
                    + "'" + acik + "',"
                    + "'" + miktars + "',"
                    + "'" + fiyyat + "',"
                    + "'" + f_krs + "',"
                    + "'" + tutari + "',"
                    + "'" + t_krs + "',"
                    + "'" + toplam + "',"
                    + "'" + kdvv + "',"
                    + "'" + gtoplam + "',"
                    + "'" + yas + "',"
                    + "'" + fatadi + "')");

            statement.close();
            connection.close();
        }
        FaturaClass faturaClass = new FaturaClass();
        faturaClass.fatura();
    }

    public static void fesere() throws SQLException, JRException {

        inputStreamyol = ProgramController.class
                .getClass().getResourceAsStream("fatura.jasper");
    }

    public void takTableFill() throws SQLException {
        System.err.println("Merhaba ben hüseyin aydın.!");
        sattableob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis");
            while (resultSet.next()) {
                sattableob.add(new SatisTak(resultSet.getString("ID"),
                        resultSet.getString("Plaka"),
                        resultSet.getString("Cari_Kodu"),
                        resultSet.getString("Islem_Tarihi"),
                        resultSet.getString("Satis_Tutari"),
                        resultSet.getString("Odeme_Tutari"),
                        resultSet.getString("Odeme_Turu"),
                        resultSet.getString("Noter_Tar")));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        satIDx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satID"));
        satIDx.setMinWidth(100);

        satPLAKAx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satPLAKA"));
        satPLAKAx.setMinWidth(100);

        satCARIKODUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satCARIKODU"));
        satCARIKODUx.setMinWidth(100);

        satISLEMTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satISLEMTAR"));
        satISLEMTARx.setMinWidth(100);

        satTUTARIx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satTUTARI"));
        satTUTARIx.setMinWidth(100);

        satODEMETUTx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETUT"));
        satODEMETUTx.setMinWidth(100);

        satODEMETURUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETURU"));
        satODEMETURUx.setMinWidth(100);

        satNOTERTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satNOTERTAR"));
        satNOTERTARx.setMinWidth(100);
        sattable1.setItems(sattableob);
    }

    public void alisaraiptalet() throws SQLException {
        System.err.println("Merhaba ben hüseyin aydın.!");
        observableList = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.alis");
            System.out.print("Dedene atlarım");
            while (resultSet.next()) {
                System.out.print("babannene atlarım");
                observableList.add(new Alis(resultSet.getString("ID"),
                        resultSet.getString("Tur"),
                        resultSet.getString("Renk"),
                        resultSet.getString("Marka"),
                        resultSet.getString("Model"),
                        resultSet.getString("Hacim"),
                        resultSet.getString("Plaka"),
                        resultSet.getString("Tarih"),
                        resultSet.getString("Odeme_Turu"),
                        resultSet.getString("Alis_Tutari"),
                        resultSet.getString("Vadesi"),
                        resultSet.getString("Aciklama"),
                        resultSet.getString("Cari_Kodu"),
                        resultSet.getString("Unvan"),
                        resultSet.getString("Adi_Soyadi"),
                        resultSet.getString("Telefonu"),
                        resultSet.getString("Toplam_Tutar"),
                        resultSet.getString("Toplam_Odenen"),
                        resultSet.getString("Toplam_Kalan"),
                        resultSet.getString("Odenen_Tutar"),
                        resultSet.getString("Res_Yol"),
                        resultSet.getString("Durum")));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        satIDx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satID"));
        satIDx.setMinWidth(100);

        satPLAKAx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satPLAKA"));
        satPLAKAx.setMinWidth(100);

        satCARIKODUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satCARIKODU"));
        satCARIKODUx.setMinWidth(100);

        satISLEMTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satISLEMTAR"));
        satISLEMTARx.setMinWidth(100);

        satTUTARIx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satTUTARI"));
        satTUTARIx.setMinWidth(100);

        satODEMETUTx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETUT"));
        satODEMETUTx.setMinWidth(100);

        satODEMETURUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETURU"));
        satODEMETURUx.setMinWidth(100);

        satNOTERTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satNOTERTAR"));
        satNOTERTARx.setMinWidth(100);
        table1.setItems(observableList);
    }

    public void takaramayap() throws SQLException {
        if (!takaratext.getText().toString().equals("")) {
            sattableob = FXCollections.observableArrayList();
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from main.satis where Plaka like('%" + takaratext.getText().toString() + "%') or "
                        + "Cari_Kodu like('%" + takaratext.getText().toString() + "%') or "
                        + "Islem_Tarihi like('%" + takaratext.getText().toString() + "%') or "
                        + "Satis_Tutari like('%" + takaratext.getText().toString() + "%') or "
                        + "Odeme_Tutari like('%" + takaratext.getText().toString() + "%') or "
                        + "Odeme_Turu like('%" + takaratext.getText().toString() + "%') or "
                        + "Noter_Tar like('%" + takaratext.getText().toString() + "%')");
                while (resultSet.next()) {
                    sattableob.add(new SatisTak(resultSet.getString("ID"),
                            resultSet.getString("Plaka"),
                            resultSet.getString("Cari_Kodu"),
                            resultSet.getString("Islem_Tarihi"),
                            resultSet.getString("Satis_Tutari"),
                            resultSet.getString("Odeme_Tutari"),
                            resultSet.getString("Odeme_Turu"),
                            resultSet.getString("Noter_Tar")));
                }
                resultSet.close();
                statement.close();
                connection.close();
            } else {

            }
            satIDx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satID"));
            satIDx.setMinWidth(100);

            satPLAKAx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satPLAKA"));
            satPLAKAx.setMinWidth(100);

            satCARIKODUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satCARIKODU"));
            satCARIKODUx.setMinWidth(100);

            satISLEMTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satISLEMTAR"));
            satISLEMTARx.setMinWidth(100);

            satTUTARIx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satTUTARI"));
            satTUTARIx.setMinWidth(100);

            satODEMETUTx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETUT"));
            satODEMETUTx.setMinWidth(100);

            satODEMETURUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETURU"));
            satODEMETURUx.setMinWidth(100);

            satNOTERTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satNOTERTAR"));
            satNOTERTARx.setMinWidth(100);
            sattable1.setItems(sattableob);
        } else {
            uyari("Lütfen aranacak kelimeyi girin.", "Bluesoft Yazılım (-:");
        }
    }

    public void takfiltrelebakalim() throws SQLException {
        if (!takfiltretext.getText().toString().equals("")) {
            sattableob.clear();
            Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connections.isClosed()) {
                Statement statement = connections.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from main.satis where " + takcombo.getValue().toString() + " not like('%" + takfiltretext.getText().toString() + "%')");
                while (resultSet.next()) {
                    sattableob.add(new SatisTak(resultSet.getString("ID"),
                            resultSet.getString("Plaka"),
                            resultSet.getString("Cari_Kodu"),
                            resultSet.getString("Islem_Tarihi"),
                            resultSet.getString("Satis_Tutari"),
                            resultSet.getString("Odeme_Tutari"),
                            resultSet.getString("Odeme_Turu"),
                            resultSet.getString("Noter_Tar")));
                }
                resultSet.close();
                statement.close();
                connections.close();
            } else {

            }
            satIDx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satID"));
            satIDx.setMinWidth(100);

            satPLAKAx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satPLAKA"));
            satPLAKAx.setMinWidth(100);

            satCARIKODUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satCARIKODU"));
            satCARIKODUx.setMinWidth(100);

            satISLEMTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satISLEMTAR"));
            satISLEMTARx.setMinWidth(100);

            satTUTARIx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satTUTARI"));
            satTUTARIx.setMinWidth(100);

            satODEMETUTx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETUT"));
            satODEMETUTx.setMinWidth(100);

            satODEMETURUx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satODEMETURU"));
            satODEMETURUx.setMinWidth(100);

            satNOTERTARx.setCellValueFactory(new PropertyValueFactory<SatisTak, String>("satNOTERTAR"));
            satNOTERTARx.setMinWidth(100);
            sattable1.setItems(sattableob);
        } else {
            uyari("Lütfen aranacak kelimeyi girin.", "Bluesoft Yazılım (-:");

        }
    }

    public static class SatisTak {

        private SimpleStringProperty satID;
        private SimpleStringProperty satPLAKA;
        private SimpleStringProperty satCARIKODU;
        private SimpleStringProperty satISLEMTAR;
        private SimpleStringProperty satTUTARI;
        private SimpleStringProperty satODEMETUT;
        private SimpleStringProperty satODEMETURU;
        private SimpleStringProperty satNOTERTAR;

        public SatisTak(String satID, String satPLAKA, String satCARIKODU, String satISLEMTAR, String satTUTARI, String satODEMETUT, String satODEMETURU, String satNOTERTAR) {
            this.satID = new SimpleStringProperty(satID);
            this.satPLAKA = new SimpleStringProperty(satPLAKA);
            this.satCARIKODU = new SimpleStringProperty(satCARIKODU);
            this.satISLEMTAR = new SimpleStringProperty(satISLEMTAR);
            this.satTUTARI = new SimpleStringProperty(satTUTARI);
            this.satODEMETUT = new SimpleStringProperty(satODEMETUT);
            this.satODEMETURU = new SimpleStringProperty(satODEMETURU);
            this.satNOTERTAR = new SimpleStringProperty(satNOTERTAR);
        }

        public String getSatID() {
            return satID.get();
        }

        public void setSatID(String satID) {
            this.satID = new SimpleStringProperty(satID);
        }

        public String getSatPLAKA() {
            return satPLAKA.get();
        }

        public void setSatPLAKA(String satPLAKA) {
            this.satPLAKA = new SimpleStringProperty(satPLAKA);
        }

        public String getSatCARIKODU() {
            return satCARIKODU.get();
        }

        public void setSatCARIKODU(String satCARIKODU) {
            this.satCARIKODU = new SimpleStringProperty(satCARIKODU);
        }

        public String getSatISLEMTAR() {
            return satISLEMTAR.get();
        }

        public void setSatISLEMTAR(String satISLEMTAR) {
            this.satISLEMTAR = new SimpleStringProperty(satISLEMTAR);
        }

        public String getSatTUTARI() {
            return satTUTARI.get();
        }

        public void setSatTUTARI(String satTUTARI) {
            this.satTUTARI = new SimpleStringProperty(satTUTARI);
        }

        public String getSatODEMETUT() {
            return satODEMETUT.get();
        }

        public void setSatODEMETUT(String satODEMETUT) {
            this.satODEMETUT = new SimpleStringProperty(satODEMETUT);
        }

        public String getSatODEMETURU() {
            return satODEMETURU.get();
        }

        public void setSatODEMETURU(String satODEMETURU) {
            this.satODEMETURU = new SimpleStringProperty(satODEMETURU);
        }

        public String getSatNOTERTAR() {
            return satNOTERTAR.get();
        }

        public void setSatNOTERTAR(String satNOTERTAR) {
            this.satNOTERTAR = new SimpleStringProperty(satNOTERTAR);
        }
    }

    public void takcombofill() {
        takcomboob = FXCollections.observableArrayList();
        takcomboob.add("ID");
        takcomboob.add("Plaka");
        takcomboob.add("Cari_Kodu");
        takcomboob.add("Islem_Tarihi");
        takcomboob.add("Satis_Tutari");
        takcomboob.add("Odeme_Tutari");
        takcomboob.add("Odeme_Turu");
        takcomboob.add("Noter_Tar");
        takcombo.setItems(takcomboob);
    }

    public void carigozatet() {
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
        File file = fileChooser.showOpenDialog(cari_kodu.getScene().getWindow());
        cariresimyol.setText(file.getAbsolutePath().toString());
        ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));

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
    }

    public void carikaydetet() throws SQLException, IOException {
        int sonId = 0;
        Connection baglanti = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!baglanti.isClosed()) {
            Statement statement = baglanti.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.cari");
            while (resultSet.next()) {
                sonId = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            baglanti.close();
            sonId = sonId + 1;
        } else {

        }
        if (!ccarikodu.getText().toString().equals("") && !cticariunvan.getText().toString().equals("") && !cadisoyadi.getText().toString().equals("") && !cvergidaire.getText().toString().equals("") && !cvergino.getText().toString().equals("") && !cariresimyol.getText().toString().equals("")) {
            Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connections.isClosed()) {
                Statement statement = connections.createStatement();
                boolean durum = false;
                String name = cariresimyol.getText().toString();
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
                durum = statement.execute("insert into main.cari("
                        + "Cari_Grubu,"
                        + "Cari_Kodu,"
                        + "Ticari_Unvani,"
                        + "Adi_Soyadi,"
                        + "Adres,"
                        + "Il_Ilce,"
                        + "Vergi_Dairesi,"
                        + "Vergi_No,"
                        + "TC_No,"
                        + "Telefon,"
                        + "Ev_Telefonu,"
                        + "Cep_Telefonu,"
                        + "Fax,"
                        + "Email,"
                        + "Note,"
                        + "Resim_Yol) values('" + caricombo.getValue().toString() + "',"
                        + "'" + ccarikodu.getText().toString() + "',"
                        + "'" + cticariunvan.getText().toString() + "',"
                        + "'" + cadisoyadi.getText().toString() + "',"
                        + "'" + cadres.getText().toString() + "',"
                        + "'" + cililce.getText().toString() + "',"
                        + "'" + cvergidaire.getText().toString() + "',"
                        + "'" + cvergino.getText().toString() + "',"
                        + "'" + ctcno.getText().toString() + "',"
                        + "'" + ctelefon.getText().toString() + "',"
                        + "'" + cevtelefon.getText().toString() + "',"
                        + "'" + ctelefo.getText().toString() + "',"
                        + "'" + cfax.getText().toString() + "',"
                        + "'" + cemail.getText().toString() + "',"
                        + "'" + cnot.getText().toString() + "',"
                        + "'" + "C:\\Program Files\\Bluesoft Oto Galeri\\images\\c" + sonId + uzanti + "')");
                if (!durum) {
                    carikodudoldur();
                    satisCariDoldur();
                    cariaracombodoldur();
                    uyari("Kayıt başarılı", "Bluesoft Yazılım (-:");
                    FileUtils.copyFile(new File(cariresimyol.getText().toString()), new File("C:\\Program Files\\Bluesoft Oto Galeri\\images\\c" + sonId + uzanti));
                } else {
                    uyari("Kayıt başarısız", "Bluesoft Yazılım (-:");
                }
                statement.close();
                connections.close();
            } else {
                uyari("Lütfen bütün alanları doldurunuz.!", "Bluesoft Yazılım (-:");
            }
        }
    }

    public void cariDoldur() throws SQLException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connections.isClosed()) {
            Statement statement = connections.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=1");
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connections.close();
        } else {

        }
    }

    public void cariileri() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.cari");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        cariID++;
        if (cariID > fondex) {
            cariID--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=" + cariID);
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void carigeri() throws SQLException {
        cariID--;
        if (cariID < 1) {
            cariID = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=" + cariID);
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void cariilk() throws SQLException {
        idIndex = 1;
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=1");
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void cariyenile() throws SQLException {
        idIndex = 1;
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=" + cariID);
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void carison() throws SQLException {
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.cari");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        cariID++;
        if (cariID > fondex) {
            cariID--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where ID=" + fondex);
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void caritemizleet() {
        caricombo.setValue("");
        ccarikodu.setText("");
        cticariunvan.setText("");
        cadisoyadi.setText("");
        cadres.setText("");
        cililce.setText("");
        cvergidaire.setText("");
        cvergino.setText("");
        ctcno.setText("");
        ctelefon.setText("");
        cevtelefon.setText("");
        ctelefo.setText("");
        cfax.setText("");
        cemail.setText("");
        cnot.setText("");
        cariresimyol.setText("");
        ccariresmin.setImage(new Image("file:///C:\\Program Files\\Bluesoft Oto Galeri\\images\\instance.jpg"));
        cariresimyol.setText("");
    }

    public void cariaracombodoldur() throws SQLException {
        //uyari("ama girdi", "hincik");
        caripalakacomboob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            //uyari("ağıza girdi", "hincik");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari");
            while (resultSet.next()) {
                //uyari("göte girdi", "hincik");
                caripalakacomboob.add(resultSet.getString("Adi_Soyadi"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        caripalakacombo.setItems(caripalakacomboob);
    }

    public void cariaramaYap() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.cari where Adi_Soyadi='" + caripalakacombo.getValue().toString() + "'");
            while (resultSet.next()) {
                caricombo.setValue(resultSet.getString("Cari_Grubu"));
                ccarikodu.setText(resultSet.getString("Cari_Kodu"));
                cticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                cadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                cadres.setText(resultSet.getString("Adres"));
                cililce.setText(resultSet.getString("Il_Ilce"));
                cvergidaire.setText(resultSet.getString("Vergi_Dairesi"));
                cvergino.setText(resultSet.getString("Vergi_No"));
                ctcno.setText(resultSet.getString("TC_No"));
                ctelefon.setText(resultSet.getString("Telefon"));
                cevtelefon.setText(resultSet.getString("Telefon"));
                ctelefo.setText(resultSet.getString("Cep_Telefonu"));
                cfax.setText(resultSet.getString("Fax"));
                cemail.setText(resultSet.getString("Email"));
                cnot.setText(resultSet.getString("Note"));
                cariresimyol.setText(resultSet.getString("Resim_Yol"));
                ccariresmin.setImage(new Image("file:///" + cariresimyol.getText().toString()));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void carisilet() throws SQLException {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Uyarı.!");
        alert.setHeaderText("Lütfen bütün alanları doldurunuz.! Veya Farklı bir plaka giriniz.");
        alert.setContentText("Bluesoft Yazılım (-:");
        alert.showAndWait().ifPresent(new Consumer<ButtonType>() {
            @Override
            public void accept(ButtonType rs) {
                if (rs == ButtonType.OK) {
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                        if (!connection.isClosed()) {
                            Statement statement = connection.createStatement();
                            boolean durum = false;
                            durum = statement.execute("update main.cari set Cari_Grubu='Boş',"
                                    + "Cari_Kodu='Boş',"
                                    + "Ticari_Unvani='Boş',"
                                    + "Adi_Soyadi='Boş',"
                                    + "Adres='Boş',"
                                    + "Il_Ilce='Boş',"
                                    + "Vergi_Dairesi='Boş',"
                                    + "Vergi_No='Boş',"
                                    + "TC_No='Boş',"
                                    + "Telefon='Boş',"
                                    + "Ev_Telefonu='Boş',"
                                    + "Cep_Telefonu='Boş',"
                                    + "Fax='Boş',"
                                    + "Email='Boş',"
                                    + "Note='Boş',"
                                    + "Resim_Yol='Boş' where ID=" + cariID);
                            if (!durum) {
                                uyari("Silme Başarılı", "Bluesoft yazılım (-:");
                                carikodudoldur();
                                cariyenile();
                                satisCariDoldur();
                                cariaracombodoldur();
                            } else {
                                uyari("Silme Başarısız", "Bluesoft yazılım (-:");
                            }
                            statement.close();
                            connection.close();
                        } else {

                        }
                    } catch (Exception ex) {
                    };
                }
            }
        });
    }

    public void cariguncelleet() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                boolean durum = false;
                durum = statement.execute("update main.cari set Cari_Grubu='" + caricombo.getValue().toString() + "',"
                        + "Cari_Kodu='" + ccarikodu.getText().toString() + "',"
                        + "Ticari_Unvani='" + cticariunvan.getText().toString() + "',"
                        + "Adi_Soyadi='" + cadisoyadi.getText().toString() + "',"
                        + "Adres='" + cadres.getText().toString() + "',"
                        + "Il_Ilce='" + cililce.getText().toString() + "',"
                        + "Vergi_Dairesi='" + cvergidaire.getText().toString() + "',"
                        + "Vergi_No='" + cvergino.getText().toString() + "',"
                        + "TC_No='" + ctcno.getText().toString() + "',"
                        + "Telefon='" + ctelefon.getText().toString() + "',"
                        + "Ev_Telefonu='" + cevtelefon.getText().toString() + "',"
                        + "Cep_Telefonu='" + ctelefo.getText().toString() + "',"
                        + "Fax='" + cfax.getText().toString() + "',"
                        + "Email='" + cemail.getText().toString() + "',"
                        + "Note='" + cnot.getText().toString() + "',"
                        + "Resim_Yol='" + cariresimyol.getText().toString() + "' where ID=" + cariID);
                if (!durum) {
                    uyari("Güncelleme Başarılı", "Bluesoft yazılım (-:");
                    carikodudoldur();
                    cariyenile();
                    satisCariDoldur();
                    cariaracombodoldur();
                } else {
                    uyari("Güncelleme Başarısız", "Bluesoft yazılım (-:");
                }
                statement.close();
                connection.close();
            } else {

            }
        } catch (Exception ex) {
        };
    }

    public void carikodudoldur() throws SQLException {
        depo2 = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Cari_Kodu from main.cari where Cari_Grubu='Araç sahibi'");
            while (resultSet.next()) {
                depo2.add(resultSet.getString("Cari_Kodu"));
                //uyari("am göt yaraq", "sihikik");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        depo2.add("Şimdilik yok");
        cari_kodu.setItems(depo2);
    }

    public void cariKoduSec() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Ticari_Unvani,Adi_Soyadi,Cep_Telefonu from main.cari where Cari_Kodu='" + cari_kodu.getValue().toString() + "'");
            while (resultSet.next()) {
                unvan.setText(resultSet.getString("Ticari_Unvani"));
                adi_soyadi.setText(resultSet.getString("Adi_Soyadi"));
                telefonu.setText(resultSet.getString("Cep_Telefonu"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void satMusteriKoduSec() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select Email,Ticari_Unvani,Adi_Soyadi,Cep_Telefonu from main.cari where Cari_Kodu='" + satmusterikodu.getValue().toString() + "'");
                while (resultSet.next()) {
                    satunvan.setText(resultSet.getString("Ticari_Unvani"));
                    satadi.setText(resultSet.getString("Adi_Soyadi"));
                    sattelefonu.setText(resultSet.getString("Cep_Telefonu"));
                    satemail.setText(resultSet.getString("Email"));
                }
                resultSet.close();
                statement.close();
                connection.close();
            } else {

            }
        } catch (NullPointerException ex) {

        } catch (IndexOutOfBoundsException ee) {

        }
    }

    public void aramadoldurucu() {
        depo3 = FXCollections.observableArrayList();
        plakaYerli();
        arama.setItems(depo3);
    }

    public void arabaEkleTikla() {
        singleSelectionModel.select(0);
    }

    public void kasakaydetet() throws SQLException {
        boolean durums = false;
        double[] deger = kasaToplamDonder();
        double total = deger[0];
        double gelir = deger[1];
        double gider = deger[2];
        String tutarturu = "";
        if (kasagelir.isSelected()) {
            durums = true;
            tutarturu = "Gelir";
        } else if (kasagider.isSelected()) {
            durums = true;
            tutarturu = "Gider";
        }

        if ((Double.parseDouble(kasatutari.getText().toString()) > total) && tutarturu.equals("Gider")) {
            uyari("Gideri kasa toplamından büyük giremezsin sonra zarar edersin hacım.!", "Bluesoft Yazılım (-:");
            kasatutari.setText("0");
            kasatutari.requestFocus();
        } else {
            try {
                if (kasatarihi.getValue().toString().equals("")) {
                    return;
                }
            } catch (NullPointerException ex) {
                uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
            }

            if (!evrakno.getText().toString().equals("") && !kasatutari.getText().toString().equals("") && durums && !kasaaciklama.getText().toString().equals("")) {
                Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                if (!connection.isClosed()) {
                    Statement statement = connection.createStatement();
                    String sql = "";
                    boolean durum = false;
                    sql = "insert into main.kasa(Evrak_No,Islem_Tarihi,Tutar_Turu,Tutari,Aciklama)"
                            + " values('" + evrakno.getText().toString() + "',"
                            + "'" + kasatarihi.getValue().toString() + "',"
                            + "'" + tutarturu + "',"
                            + "'" + kasatutari.getText().toString() + "',"
                            + "'" + kasaaciklama.getText().toString() + "')";
                    if (!statement.execute(sql)) {
                        uyari("Kayıt başarılı.!", "Bluesoft Yazılım (-:");
                        kasaComboDoldur();
                        fillKasaTablee();

                    } else {
                        uyari("Kayıt başarısız.!", "Bluesoft Yazılım (-:");
                    }
                    statement.close();
                    connection.close();
                    kasaToplamYenile();
                } else {

                }
            } else {
                uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
            }
        }
    }

    public void kasaVeriCek() throws SQLException {
        String tar = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=1");
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void kasaIleriGit() throws SQLException {
        String tar = "";
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.kasa");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        kasaIndex++;
        if (kasaIndex > fondex) {
            kasaIndex--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=" + kasaIndex);
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void kasaGeriGit() throws SQLException {
        String tar = "";
        kasaIndex--;
        if (kasaIndex < 1) {
            kasaIndex = 1;
            uyari("Başa geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=" + kasaIndex);
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void kasaIlk() throws SQLException {
        String tar = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=1");
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void kasaSonaGit() throws SQLException {
        String tar = "";
        int fondex = 0;
        Connection connection1 = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection1.isClosed()) {
            Statement statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID from main.kasa");
            while (resultSet.next()) {
                fondex = resultSet.getInt("ID");
            }
            resultSet.close();
            statement.close();
            connection1.close();
        }
        kasaIndex++;
        if (kasaIndex > fondex) {
            kasaIndex--;
            uyari("Yolun sonuna geldin hacım (:", "Bluesoft Yazılım (-:");
        }
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=" + fondex);
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {
            uyari("", "derken");
        }
    }

    public void kasaTemizle() {
        evrakno.setText("");
        kasatarihi.getEditor().clear();
        kasagelir.setSelected(false);
        kasagider.setSelected(false);
        kasatutari.setText("");
        kasaaciklama.setText("");
    }

    public void kasaComboDoldur() throws SQLException {
        kasacomboob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Evrak_No from main.kasa");
            while (resultSet.next()) {
                kasacomboob.add(resultSet.getString("Evrak_No"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        kasacombo.setItems(kasacomboob);
    }

    public void kasaAramaYap() throws SQLException {
        String tar = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=" + kasacombo.getValue().toString());
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void kasaGuncellee() throws SQLException {
        try {
            if (kasatarihi.getValue().toString().equals("")) {
                return;
            }
        } catch (NullPointerException ex) {
            uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
        }
        boolean durums = false;

        String tutarturu = "";
        if (kasagelir.isSelected()) {
            durums = true;
            tutarturu = "Gelir";
        } else if (kasagider.isSelected()) {
            durums = true;
            tutarturu = "Gider";
        }

        if (!evrakno.getText().toString().equals("") && !kasatutari.getText().toString().equals("") && durums && !kasaaciklama.getText().toString().equals("")) {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                String sql = "";
                boolean durum = false;
                sql = "update main.kasa set Evrak_No='" + evrakno.getText().toString() + "',"
                        + "Islem_Tarihi='" + kasatarihi.getValue().toString() + "',"
                        + "Tutar_Turu='" + tutarturu + "',"
                        + "Tutari='" + kasatutari.getText().toString() + "',"
                        + "Aciklama='" + kasaaciklama.getText().toString() + "' where ID=" + kasaIndex;
                if (!statement.execute(sql)) {
                    uyari("Güncelleme başarılı.!", "Bluesoft Yazılım (-:");
                    kasaComboDoldur();
                    kasaToplamYenile();
                    fillKasaTablee();
                } else {
                    uyari("Güncelleme başarısız.!", "Bluesoft Yazılım (-:");
                }
                statement.close();
                connection.close();
            } else {

            }
        } else {
            uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
        }
    }

    public void kasaSill() throws SQLException {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Uyarı.!");
        alert.setHeaderText("Silmek istediğinize eminmisiniz?");
        alert.setContentText("Bluesoft Yazılım (-:");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                try {
                    if (kasatarihi.getValue().toString().equals("")) {
                        return;
                    }
                } catch (NullPointerException ex) {
                    uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
                }
                boolean durums = false;

                String tutarturu = "";
                if (kasagelir.isSelected()) {
                    durums = true;
                    tutarturu = "Gelir";
                } else if (kasagider.isSelected()) {
                    durums = true;
                    tutarturu = "Gider";
                }

                if (!evrakno.getText().toString().equals("") && !kasatutari.getText().toString().equals("") && durums && !kasaaciklama.getText().toString().equals("")) {
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
                        if (!connection.isClosed()) {
                            Statement statement = connection.createStatement();
                            String sql = "";
                            boolean durum = false;
                            sql = "update main.kasa set Evrak_No='Boş',"
                                    + "Islem_Tarihi='1994,11,09',"
                                    + "Tutar_Turu='Boş',"
                                    + "Tutari='Boş',"
                                    + "Aciklama='Boş' where ID=" + kasaIndex;
                            if (!statement.execute(sql)) {
                                uyari("Silme başarılı.!", "Bluesoft Yazılım (-:");
                                kasaComboDoldur();
                                kasaYenile();
                                kasaToplamYenile();
                                fillKasaTablee();
                            } else {
                                uyari("Silme başarısız.!", "Bluesoft Yazılım (-:");
                            }
                            statement.close();
                            connection.close();

                        } else {

                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ProgramController.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    uyari("Gerekli alanları boş geçmeyiniz.!", "Bluesoft yazılım (-:");
                }
            }
        });
    }

    public void kasaYenile() throws SQLException {
        String tar = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa where ID=" + kasaIndex);
            while (resultSet.next()) {
                evrakno.setText(resultSet.getString("Evrak_No"));
                String mal = resultSet.getString("Islem_Tarihi");
                tar += mal.charAt(0);
                tar += mal.charAt(1);
                tar += mal.charAt(2);
                tar += mal.charAt(3);
                tar += ",";
                tar += mal.charAt(5);
                tar += mal.charAt(6);
                tar += ",";
                tar += mal.charAt(8);
                tar += mal.charAt(9);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd", Locale.US);
                kasatarihi.setValue(LocalDate.parse(tar, formatter));
                String tur = "";
                tur = resultSet.getString("Tutar_Turu");
                if (tur.equals("Gelir")) {
                    kasagelir.setSelected(true);
                    kasagider.setSelected(false);
                } else {
                    kasagelir.setSelected(false);
                    kasagider.setSelected(true);
                }
                kasatutari.setText(resultSet.getString("Tutari"));
                kasaaciklama.setText(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
    }

    public void tepeKasaTikla() {
        singleSelectionModel.select(5);
    }

    public void cariKaydir() {
        singleSelectionModel.select(4);
    }

    public void satisKaydir() {
        singleSelectionModel.select(3);
    }

    public void satissKaydir() {
        singleSelectionModel.select(2);
    }

    public void alisTakipKaydir() {
        singleSelectionModel.select(1);
    }

    public void fatCariDoldur() throws SQLException {
        fatcarikodob = FXCollections.observableArrayList();
        fatcarikodob.add("Şimdilik yok");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.satis");
            while (resultSet.next()) {
                fatcarikodob.add(resultSet.getString("Cari_Kodu"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        fatcarikod.setItems(fatcarikodob);
    }

    public void fatcarikodSelect() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from main.cari where Cari_Kodu='" + fatcarikod.getValue().toString() + "'");
                while (resultSet.next()) {
                    fatticariunvan.setText(resultSet.getString("Ticari_Unvani"));
                    fatadisoyadi.setText(resultSet.getString("Adi_Soyadi"));
                    fatvergidairesi.setText(resultSet.getString("Vergi_Dairesi"));
                    fatvergidairesino.setText(resultSet.getString("Vergi_No"));
                    fatadres.setText(resultSet.getString("Note"));
                    fatililce.setText(resultSet.getString("Il_Ilce"));
                }
                resultSet.close();
                statement.close();
                connection.close();
            } else {

            }
        } catch (NullPointerException ex) {

        }
    }

    public void alisRaporuGoster() throws SQLException, JRException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("alisReport.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
    }

    public void satisRaporuGoster() throws SQLException, JRException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("satisReport.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
    }

    public void cariRaporuGoster() throws SQLException, JRException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("cariReport.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
    }

    public void kasaRaporuGoster() throws SQLException, JRException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("kasaReport.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
    }

    public void faturaRaporuGoster() throws SQLException, JRException {
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("faturaReport.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
    }
    @FXML
    ImageView firmaRes;

    public void firmaBilgileri() throws SQLException {
        String deger = "";
        String resYol = "";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.firma");
            while (resultSet.next()) {
                deger = "Firma : " + resultSet.getString("Adi") + " | Yetkili Kişi : " + resultSet.getString("Yetkili");
                resYol = resultSet.getString("Resim_Yol");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        firmaRes.setImage(new Image("file:///" + resYol));
        profile.setImage(new Image("file:///" + resYol));
        firmaDeger.setText(deger);
        profiledeger.setText(deger);
    }

    private void rerunAnimation() {
        transition.stop();
        // if needed set different text on "node"
        recalculateTransition();
        transition.playFromStart();
    }

    private void recalculateTransition() {
        transition.setToY(60.1);
        transition.setFromX(100);

        double distance = parentPane.widthProperty().get() + 2 * text1.getBoundsInLocal().getMaxX();
        transition.setDuration(new Duration(distance / 75));
    }

    public void hakkimizdaTikla() throws IOException {
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("Hakkimizda.fxml"));
        stage.setScene(new Scene(parent));
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                HakkimizdaController.timer1.cancel();
                HakkimizdaController.timerTask1.cancel();
            }
        });
    }

    public void satPlakaYenile() {
        satplakaob = FXCollections.observableArrayList();
        try {
            Connection plakacon = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!plakacon.isClosed()) {
                Statement statement = plakacon.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from main.alis where Durum='Satılmadı'");
                while (resultSet.next()) {
                    satplakaob.add(resultSet.getString("Plaka"));
                }
                resultSet.close();
                statement.close();
                plakacon.close();
                satplaka.getEditor().clear();
                satplaka.setItems(satplakaob);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgramController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kasaToplamYenile() throws SQLException {
        try {
            double gelir = 0;
            double gider = 0;
            double total = 0;
            Connection plakacon = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
            if (!plakacon.isClosed()) {
                Statement statement = plakacon.createStatement();
                //uyari("Göte","Girdi");
                ResultSet resultSet = statement.executeQuery("select sum(Tutari) as Tut from main.kasa where Tutar_Turu='Gelir'");
                while (resultSet.next()) {
                    try {
                        gelir = Double.parseDouble(resultSet.getString("Tut"));
                    } catch (NullPointerException ex) {

                    }
                    //uyari("while","1");
                }
                resultSet = statement.executeQuery("select sum(Tutari) as Tut from main.kasa where Tutar_Turu='Gider'");
                while (resultSet.next()) {
                    try {
                        gider = Double.parseDouble(resultSet.getString("Tut"));
                    } catch (NullPointerException ex) {

                    }
                }
                resultSet.close();
                statement.close();
                plakacon.close();
                satplaka.setItems(satplakaob);
            }
            total = gelir - gider;
            if (total == 0 || total == 0.0) {
                kasatoplam.setText("Toplam : " + total + " TL Kasada Var.! Çok para kazanman lazım hacım.!");
            } else {
                kasatoplam.setText("Toplam : " + total + " TL Kasada Var.!");
            }
            //uyari(String.valueOf(gelir) + " " , String.valueOf(gider));
        } catch (NullPointerException ex) {

        }
    }

    public double[] kasaToplamDonder() throws SQLException {

        double gelir = 0;
        double gider = 0;
        double total = 0;
        Connection plakacon = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!plakacon.isClosed()) {
            Statement statement = plakacon.createStatement();
            //uyari("Göte","Girdi");
            ResultSet resultSet = statement.executeQuery("select sum(Tutari) as Tut from main.kasa where Tutar_Turu='Gelir'");
            while (resultSet.next()) {
                try {
                    gelir = Double.parseDouble(resultSet.getString("Tut"));
                } catch (NullPointerException ex) {

                }
                //uyari("while","1");
            }
            resultSet = statement.executeQuery("select sum(Tutari) as Tut from main.kasa where Tutar_Turu='Gider'");
            while (resultSet.next()) {
                try {
                    gider = Double.parseDouble(resultSet.getString("Tut"));
                } catch (NullPointerException ex) {

                }
                //uyari("while","2");
            }
            resultSet.close();
            statement.close();
            plakacon.close();
            satplaka.setItems(satplakaob);
        }
        total = gelir - gider;
        kasatoplam.setText("Toplam : " + total + " TL Kasada Var.!");
        //uyari(String.valueOf(gelir) + " " , String.valueOf(gider));
        double[] dizi = {total, gelir, gider};
        return dizi;
    }

    public void satisCariDoldur() throws SQLException {
        satmusteriob = FXCollections.observableArrayList();
        satmusteriob.clear();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Cari_Kodu from main.cari where Cari_Grubu='Alıcı (Müşteri)'");
            while (resultSet.next()) {
                satmusteriob.add(resultSet.getString("Cari_Kodu"));
                System.out.println(resultSet.getString("Cari_Kodu"));
                //uyari(resultSet.getString("Cari_Kodu"), resultSet.getString("Cari_Kodu"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        satmusteriob.add("Şimdilik yok");
        satmusterikodu.setItems(satmusteriob);
    }

    public static class Alis {

        public SimpleStringProperty ID;
        private SimpleStringProperty Tur;
        private SimpleStringProperty Renk;
        private SimpleStringProperty Marka;
        private SimpleStringProperty Model;
        private SimpleStringProperty Hacim;
        private SimpleStringProperty Plaka;
        private SimpleStringProperty Tarih;
        private SimpleStringProperty Odeme_Turu;
        private SimpleStringProperty Alis_Tutari;
        private SimpleStringProperty Vadesi;
        private SimpleStringProperty Aciklama;
        private SimpleStringProperty Cari_Kodu;
        private SimpleStringProperty Unvan;
        private SimpleStringProperty Adi_Soyadi;
        private SimpleStringProperty Telefonu;
        private SimpleStringProperty Toplam_Tutar;
        private SimpleStringProperty Toplam_Odenen;
        private SimpleStringProperty Toplam_Kalan;
        private SimpleStringProperty Odenen_Tutar;
        private SimpleStringProperty Res_Yol;
        private SimpleStringProperty Durum;

        public Alis(String ID, String Tur, String Renk, String Marka, String Model, String Hacim, String Plaka, String Tarih, String Odeme_Turu, String Alis_Tutari, String Vadesi, String Aciklama, String Cari_Kodu, String Unvan, String Adi_Soyadi, String Telefonu, String Toplam_Tutar, String Toplam_Odenen, String Toplam_Kalan, String Odenen_Tutar, String Res_Yol, String Durum) {
            this.ID = new SimpleStringProperty(ID);
            this.Tur = new SimpleStringProperty(Tur);;
            this.Renk = new SimpleStringProperty(Renk);;
            this.Marka = new SimpleStringProperty(Marka);;
            this.Model = new SimpleStringProperty(Model);;
            this.Hacim = new SimpleStringProperty(Hacim);;
            this.Plaka = new SimpleStringProperty(Plaka);;
            this.Tarih = new SimpleStringProperty(Tarih);;
            this.Odeme_Turu = new SimpleStringProperty(Odeme_Turu);;
            this.Alis_Tutari = new SimpleStringProperty(Alis_Tutari);;
            this.Vadesi = new SimpleStringProperty(Vadesi);;
            this.Aciklama = new SimpleStringProperty(Aciklama);;
            this.Cari_Kodu = new SimpleStringProperty(Cari_Kodu);;
            this.Unvan = new SimpleStringProperty(Unvan);;
            this.Adi_Soyadi = new SimpleStringProperty(Adi_Soyadi);;
            this.Telefonu = new SimpleStringProperty(Telefonu);;
            this.Toplam_Tutar = new SimpleStringProperty(Toplam_Tutar);;
            this.Toplam_Odenen = new SimpleStringProperty(Toplam_Odenen);;
            this.Toplam_Kalan = new SimpleStringProperty(Toplam_Kalan);;
            this.Odenen_Tutar = new SimpleStringProperty(Toplam_Tutar);;
            this.Res_Yol = new SimpleStringProperty(Res_Yol);
            this.Durum = new SimpleStringProperty(Durum);
        }

        public String getID() {
            return ID.get();
        }

        public String getTur() {
            return Tur.get();
        }

        public String getRenk() {
            return Renk.get();
        }

        public String getMarka() {
            return Marka.get();
        }

        public String getModel() {
            return Model.get();
        }

        public String getHacim() {
            return Hacim.get();
        }

        public String getPlaka() {
            return Plaka.get();
        }

        public String getTarih() {
            return Tarih.get();
        }

        public String getOdeme_Turu() {
            return Odeme_Turu.get();
        }

        public String getAlis_Tutari() {
            return Alis_Tutari.get();
        }

        public String getVadesi() {
            return Vadesi.get();
        }

        public String getAciklama() {
            return Aciklama.get();
        }

        public String getCari_Kodu() {
            return Cari_Kodu.get();
        }

        public String getUnvan() {
            return Unvan.get();
        }

        public String getAdi_Soyadi() {
            return Adi_Soyadi.get();
        }

        public String getTelefonu() {
            return Telefonu.get();
        }

        public String getToplam_Tutar() {
            return Toplam_Tutar.get();
        }

        public String getToplam_Odenen() {
            return Toplam_Odenen.get();
        }

        public String getToplam_Kalan() {
            return Toplam_Kalan.get();
        }

        public String getOdenen_Tutar() {
            return Odenen_Tutar.get();
        }

        public String getRes_Yol() {
            return Res_Yol.get();
        }

        public void setID(String ID) {
            this.ID.set(ID);
        }

        public void setTur(String Tur) {
            this.Tur.set(Tur);
        }

        public void setRenk(String Renk) {
            this.Renk.set(Renk);
        }

        public void setMarka(String Marka) {
            this.Marka.set(Marka);
        }

        public void setModel(String Model) {
            this.Model.set(Model);
        }

        public void setHacim(String Hacim) {
            this.Hacim.set(Hacim);
        }

        public void setPlaka(String Plaka) {
            this.Plaka.set(Plaka);
        }

        public void setTarih(String Tarih) {
            this.Tarih.set(Tarih);
        }

        public void setOdeme_Turu(String Odeme_Turu) {
            this.Odeme_Turu.set(Odeme_Turu);
        }

        public void setAlis_Tutari(String Alis_Tutari) {
            this.Alis_Tutari.set(Alis_Tutari);
        }

        public void setVadesi(String Vadesi) {
            this.Vadesi.set(Vadesi);
        }

        public void setAciklama(String Aciklama) {
            this.Aciklama.set(Aciklama);
        }

        public void setCari_Kodu(String Cari_Kodu) {
            this.Cari_Kodu.set(Cari_Kodu);
        }

        public void setUnvan(String Unvan) {
            this.Unvan.set(Unvan);
        }

        public void setAdi_Soyadi(String Adi_Soyadi) {
            this.Adi_Soyadi.set(Adi_Soyadi);
        }

        public void setTelefonu(String Telefonu) {
            this.Telefonu.set(Telefonu);
        }

        public void setToplam_Tutar(String Toplam_Tutar) {
            this.Toplam_Tutar.set(Toplam_Tutar);
        }

        public void setToplam_Odenen(String Toplam_Odenen) {
            this.Toplam_Odenen.set(Toplam_Odenen);
        }

        public void setToplam_Kalan(String Toplam_Kalan) {
            this.Toplam_Kalan.set(Toplam_Kalan);
        }

        public void setOdenen_Tutar(String Odenen_Tutar) {
            this.Odenen_Tutar.set(Odenen_Tutar);
        }

        public void setRes_Yol(String Res_Yol) {
            this.Res_Yol.set(Res_Yol);
        }

        public String getDurum() {
            return Durum.get();
        }

        public void setDurum(String Durum) {
            this.Durum.set(Durum);
        }

    }

    public void fitreiptal() throws SQLException {
        tableFill();
    }

    public void kasaraporaraet() throws SQLException {
        String ust = ustsinir.getValue().toString();
        String alt = altsinir.getValue().toString();
        fillKasaTable(alt, ust);
        //uyari("Yarak", "asasas");
    }
    List<String> depomm = new ArrayList<>();

    public void fillKasaTable(String alt, String ust) throws SQLException {
        depomm.clear();
        kasatableob = FXCollections.observableArrayList();
        Date ustt = null, altt = null;
        String sql = "";
        sql = "select * from main.kasa";
        //uyari("üst : " + ust, " alt : " + alt);
        String tar1Ham[] = tarAyir(ust);
        String tar2Ham[] = tarAyir(alt);

        ustt = new Date(tar1Ham[0] + "/" + tar1Ham[1] + "/" + tar1Ham[2]);
        altt = new Date(tar2Ham[0] + "/" + tar2Ham[1] + "/" + tar2Ham[2]);

        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            String islemtarhi = "";
            while (resultSet.next()) {
                String tar3Ham[] = tarAyir(resultSet.getString("Islem_Tarihi"));
                String far = tar3Ham[0] + "/" + tar3Ham[1] + "/" + tar3Ham[2];
                //uyari(far,"far");
                islemtarhi = far;
                Date date = new Date(islemtarhi);
                //uyari("işlem tarhi "+ tar3Ham[2] + " üst sınır : "+tar1Ham[2],"alt sınır : "+tar2Ham[2]);

                if (Integer.parseInt(tar3Ham[0]) <= Integer.parseInt(tar1Ham[0]) && Integer.parseInt(tar3Ham[0]) >= Integer.parseInt(tar2Ham[0])) {
                    if (Integer.parseInt(tar3Ham[1]) <= Integer.parseInt(tar1Ham[1]) && Integer.parseInt(tar3Ham[1]) >= Integer.parseInt(tar2Ham[1])) {
                        if (Integer.parseInt(tar3Ham[2]) <= Integer.parseInt(tar1Ham[2]) && Integer.parseInt(tar3Ham[2]) >= Integer.parseInt(tar2Ham[2])) {
                            kasatableob.add(new KasaRapor(
                                    resultSet.getString("Evrak_No"),
                                    resultSet.getString("Islem_Tarihi"),
                                    resultSet.getString("Tutar_Turu"),
                                    resultSet.getString("Tutari"),
                                    resultSet.getString("Aciklama")));

                            depom.add(resultSet.getString("Evrak_No"));
                            depom.add(resultSet.getString("Islem_Tarihi"));
                            depom.add(resultSet.getString("Tutar_Turu"));
                            depom.add(resultSet.getString("Tutari"));
                            depom.add(resultSet.getString("Aciklama"));
                            //uyari("ife girdi", "asasas");
                        }
                    }
                }
                //uyari("veri girdi", "asasas");
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        evraknoo.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("evraknoo"));
        evraknoo.setMinWidth(100);

        islemtarr.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("islemtarr"));
        islemtarr.setMinWidth(100);

        tutarturuu.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("tutarturuu"));
        tutarturuu.setMinWidth(100);

        tutarii.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("tutarii"));
        tutarii.setMinWidth(100);

        aciklamaa.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("evraknoo"));
        aciklamaa.setMinWidth(100);

        kasareporttable.setItems(kasatableob);
    }

    public String[] tarAyir(String deger) {
        String malafat = "";
        malafat += deger.charAt(0);
        malafat += deger.charAt(1);
        malafat += deger.charAt(2);
        malafat += deger.charAt(3);

        System.err.println(malafat);

        String salafat = "";
        salafat += deger.charAt(5);
        salafat += deger.charAt(6);

        System.err.println(salafat);

        String galagat = "";
        galagat += deger.charAt(8);
        galagat += deger.charAt(9);

        System.err.println(galagat);

        String dizi[] = {malafat, salafat, galagat};
        return dizi;
    }

    public void fillKasaTablee() throws SQLException {
        depomm.clear();
        kasatableob = FXCollections.observableArrayList();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from main.kasa");
            while (resultSet.next()) {
                kasatableob.add(new KasaRapor(
                        resultSet.getString("Evrak_No"),
                        resultSet.getString("Islem_Tarihi"),
                        resultSet.getString("Tutar_Turu"),
                        resultSet.getString("Tutari"),
                        resultSet.getString("Aciklama")));
                depom.add(resultSet.getString("Evrak_No"));
                depom.add(resultSet.getString("Islem_Tarihi"));
                depom.add(resultSet.getString("Tutar_Turu"));
                depom.add(resultSet.getString("Tutari"));
                depom.add(resultSet.getString("Aciklama"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } else {

        }
        evraknoo.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("evraknoo"));
        evraknoo.setMinWidth(100);

        islemtarr.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("islemtarr"));
        islemtarr.setMinWidth(100);

        tutarturuu.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("tutarturuu"));
        tutarturuu.setMinWidth(100);

        tutarii.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("tutarii"));
        tutarii.setMinWidth(100);

        aciklamaa.setCellValueFactory(new PropertyValueFactory<KasaRapor, String>("evraknoo"));
        aciklamaa.setMinWidth(100);

        kasareporttable.setItems(kasatableob);
    }

    public void kasaaraiptalet() throws SQLException {
        fillKasaTablee();
    }
    
    public void duzenleBilgileri() throws IOException{
        Stage stage = new Stage();
        AnchorPane parent = (AnchorPane) FXMLLoader.load(getClass().getResource("Duzenle.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle(res_yol.getText().toString());
        stage.show();
    }
    
    public void onizlemeet() throws SQLException, JRException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        if (!connection.isClosed()) {
            Statement statement = connection.createStatement();
            for (int i = 0; i < kasatableob.size(); i++) {
                KasaRapor kasaRapor = kasatableob.get(i);
                statement.execute("insert into main.kasa_gecici(Evrak_No,"
                        + "Islem_Tarihi,"
                        + "Tutar_Turu,"
                        + "Tutari,"
                        + "Aciklama) values('"+kasaRapor.getEvraknoo()+"',"
                        + "'"+kasaRapor.getIslemtarr()+"',"
                        + "'"+kasaRapor.getTutarturuu()+"',"
                        + "'"+kasaRapor.getTutarii()+"',"
                        + "'"+kasaRapor.getAciklamaa()+"')");
            }
            statement.close();
            connection.close();
        }
        
        Connection connections = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        JasperPrint jasperPrint = JasperFillManager.fillReport(getClass().getResourceAsStream("kasaReportZaman.jasper"), null, connections);
        JasperViewer.viewReport(jasperPrint, false);
        connections.close();
        
        Connection connectionss = DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\Bluesoft Oto Galeri\\database\\bluesoft_oto_galeri.sqlite");
        Statement statements = connectionss.createStatement();
        statements.execute("delete from main.kasa_gecici");
        statements.close();
        connectionss.close();
    }

    public static class KasaRapor {

        private SimpleStringProperty evraknoo;
        private SimpleStringProperty islemtarr;
        private SimpleStringProperty tutarturuu;
        private SimpleStringProperty tutarii;
        private SimpleStringProperty aciklamaa;

        public KasaRapor(String evraknoo, String islemtarr, String tutarturuu, String tutarii, String aciklamaa) {
            this.evraknoo = new SimpleStringProperty(evraknoo);
            this.islemtarr = new SimpleStringProperty(islemtarr);
            this.tutarturuu = new SimpleStringProperty(tutarturuu);
            this.tutarii = new SimpleStringProperty(tutarii);
            this.aciklamaa = new SimpleStringProperty(aciklamaa);
        }

        public String getEvraknoo() {
            return evraknoo.get();
        }

        public void setEvraknoo(String evraknoo) {
            this.evraknoo.set(evraknoo);
        }

        public String getIslemtarr() {
            return islemtarr.get();
        }

        public void setIslemtarr(String islemtarr) {
            this.islemtarr.set(islemtarr);
        }

        public String getTutarturuu() {
            return tutarturuu.get();
        }

        public void setTutarturuu(String tutarturuu) {
            this.tutarturuu.set(tutarturuu);
        }

        public String getTutarii() {
            return tutarii.get();
        }

        public void setTutarii(String tutarii) {
            this.tutarii.set(tutarii);
        }

        public String getAciklamaa() {
            return aciklamaa.get();
        }

        public void setAciklamaa(String aciklamaa) {
            this.aciklamaa.set(aciklamaa);
        }

    }
}
