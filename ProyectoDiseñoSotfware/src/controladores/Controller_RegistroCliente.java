/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import modelo.EstadoCivil;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_RegistroCliente implements Initializable {

    @FXML
    private TextField cedula_txtField;

    @FXML
    private TextField correo_txtField;

    @FXML
    private TextField apellidos_txtField;

    @FXML
    private TextField direccion_txtField;

    @FXML
    private TextField nombre_txtField;

    @FXML
    private TextField numeroHijos_txtField;

    @FXML
    private TextField celular_txtField;

    @FXML
    private ComboBox<EstadoCivil> estadocivil_ComboBox;

    @FXML
    private Parent cargo_txtField1;

    @FXML
    private TextField empresaTrabajo_txtField;

    @FXML
    private TextField direccionTrabajo_txtField;
    
    @FXML
    private Button registrar_boton;

    @FXML
    void funcion_comboBox(ActionEvent event) {
        
    }
    
    @FXML
    void registrar(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (EstadoCivil e: EstadoCivil.values() ) {
            estadocivil_ComboBox.getItems().add(e);
        }
    }

}
