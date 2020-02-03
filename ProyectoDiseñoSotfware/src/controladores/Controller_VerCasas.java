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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import modelo.Casa;
import modelo.Cliente;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_VerCasas implements Initializable {

    public static Cliente cliente1 = null;

    @FXML
    private AnchorPane cliente;

    @FXML
    private Label cedula;

    @FXML
    private Label apellido;

    @FXML
    private Label correo;

    @FXML
    private FlowPane casas;

    @FXML
    private Label usuario;

    @FXML
    private Label nombre;

    void datosClientes() {

    }

    void llenarCasas() {

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cedula.setText(cliente1.getCedula());
        apellido.setText(cliente1.getApellido());
        correo.setText(cliente1.getCorreo());
        nombre.setText(cliente1.getNombre());
        usuario.setText(cliente1.getUsuario());
        if (!cliente1.getCasaDiseñada().isEmpty()) {
            for (Casa c : cliente1.getCasaDiseñada()) {
                Vista_casaIndividualController.casa = c;
                File file = new File("src\\vistas\\Vista_VerCasas.fxml");
                try {
                    Parent root = FXMLLoader.load(file.toURI().toURL());
                    casas.getChildren().add(root);
                } catch (Exception ex) {
                }
            }
        }
    }

}
