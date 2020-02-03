/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import modelo.Casa;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Vista_casaIndividualController implements Initializable {

    public static Casa casa = null;

    @FXML
    private Label esquinera_label;

    @FXML
    private Label patio_label;

    @FXML
    private Label orientacion_label;

    @FXML
    private Label plantas_label;

    @FXML
    private Label casa_label;

    @FXML
    private Label banios_label;

    @FXML
    private Label numeroHabitaciones_Label;

    @FXML
    private Label metros;

    public void llenarDatos() {
        metros.setText(String.valueOf(casa.getMetrosCuadrados()));
        casa_label.setText(String.valueOf("Casa diseñada"));
        banios_label.setText(String.valueOf(casa.getNumeroBaños()));
        orientacion_label.setText(String.valueOf(casa.getOrientacion()));
        plantas_label.setText(String.valueOf(casa.getNumeroPlantas()));
        numeroHabitaciones_Label.setText(String.valueOf(casa.getNumeroHabitacion()));
        patio_label.setText(String.valueOf(cadena(casa.isPatioGrande())));
        esquinera_label.setText(String.valueOf(cadena(casa.isEsquinera())));
    }

    String cadena(boolean valor) {
        if (valor) {
            return "SI";
        } else {
            return "NO";
        }
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarDatos();
    }

}
