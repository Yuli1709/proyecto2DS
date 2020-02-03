/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_Vista_DecoradoraCasa implements Initializable {
    
    @FXML
    private RadioButton nacional_piso;

    @FXML
    private AnchorPane casa;

    @FXML
    private RadioButton estandarGriferia;

    @FXML
    private CheckBox baniosInsonorizados;

    @FXML
    private RadioButton tradicional_iluminacion;

    @FXML
    private RadioButton led_iluminacion;

    @FXML
    private Button verPrecio;

    @FXML
    private RadioButton importado_piso;

    @FXML
    private RadioButton italianaGriferia;

    @FXML
    private CheckBox aislanteTermico;
    
    @FXML
    private Button retrocede;
    
    @FXML
    void retroceder(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_principal.fxml"));
    }


    @FXML
    void verPrecioGuardar(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src\\vistas\\Vista_casaIndividual.fxml");
        try {
            Parent root = FXMLLoader.load(file.toURI().toURL());
            casa.getChildren().add(root);
        } catch (Exception ex) {
        } 
    }    
    
}
