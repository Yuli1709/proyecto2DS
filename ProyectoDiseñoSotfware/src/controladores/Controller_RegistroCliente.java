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
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import modelo.Cliente;
import modelo.EstadoCivil;
import modelo.Kioscos;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

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
    private TextField contrasenia_texField;

    @FXML
    private TextField verificacionContrasenia_txtField;

    @FXML
    private Button retroceder_button_Registro;

    @FXML
    void retroceder(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_principal.fxml"));
    }

    @FXML
    void funcion_comboBox(Event event) {

    }

    void llenarComboBox() {
        estadocivil_ComboBox.getItems().addAll(Arrays.asList(EstadoCivil.values()));
    }

    @FXML
    void registrar(ActionEvent event) {
        boolean validacionNombre = nombre_txtField.getText() != null && apellidos_txtField.getText() != null;
        boolean cedulaValidacion = cedula_txtField.getText().length() == 9;
        boolean correoDireccionvalidacion = direccion_txtField.getText() != null && correo_txtField.getText() != null;
        boolean contraseniaValidacion = contrasenia_texField.getText().length() == 8 && contrasenia_texField.getText().equals(verificacionContrasenia_txtField.getText());
        if (validacionNombre && cedulaValidacion && correoDireccionvalidacion && contraseniaValidacion) {
            Cliente cliente = new Cliente(direccionTrabajo_txtField.getText(), empresaTrabajo_txtField.getText(), "dd", contrasenia_texField.getText(), nombre_txtField.getText(), apellidos_txtField.getText(), cedula_txtField.getText(), correo_txtField.getText(), direccionTrabajo_txtField.getText(), celular_txtField.getText(), estadocivil_ComboBox.getValue(), 0);
            Kioscos.usuarios.add(cliente);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Llene los campos");
            alert.setTitle("Campos imcompletos");
            alert.setHeaderText("debe llenar los campos");
            alert.show();

        }
        System.out.println(Kioscos.usuarios.size());
    }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarComboBox();
    }

}
