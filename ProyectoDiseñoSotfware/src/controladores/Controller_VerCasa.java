/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import modelo.Orientacion;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_VerCasa implements Initializable {

    @FXML
    private RadioButton nacional_piso;

    @FXML
    private RadioButton estandarGriferia;

    @FXML
    private ComboBox<Orientacion> orientacion;

    @FXML
    private RadioButton italianaGriferia;

    @FXML
    private ComboBox<String> patioGrande;

    @FXML
    private ComboBox<Integer> plantas;

    @FXML
    private CheckBox baniosInsonorizados;

    @FXML
    private ComboBox<Integer> habitaciones_num;

    @FXML
    private ComboBox<String> esquinera;

    @FXML
    private RadioButton tradicional_iluminacion;

    @FXML
    private RadioButton led_iluminacion;

    @FXML
    private RadioButton importado_piso;

    @FXML
    private TextField metros_llenar;

    @FXML
    private CheckBox aislanteTermico;

    @FXML
    private ComboBox<Integer> num_banios;

    @FXML
    private Button guardarVerPrecio;

    @FXML
    private Button retrocede;

    @FXML
    void guardarGenerarPrecio(ActionEvent event) {

    }

    @FXML
    void retroceder(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_principal.fxml"));
        stagePrincipal.setResizable(false);
    }

    void llenarComboBox() {
        for (int i = 0; i <= 10; i++) {
            num_banios.getItems().add(i);
            habitaciones_num.getItems().add(i + 1);
        }
        plantas.getItems().addAll(1, 2, 3);
        esquinera.getItems().addAll("Si", "No");
        patioGrande.getItems().addAll("Si", "No");
        orientacion.getItems().addAll(Arrays.asList(Orientacion.values()));

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarComboBox();
    }

}
