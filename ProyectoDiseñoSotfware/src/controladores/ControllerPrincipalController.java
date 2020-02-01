/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class ControllerPrincipalController implements Initializable {

    @FXML
    private ImageView oasis;

    @FXML
    private ImageView paraiso;

    @FXML
    private ImageView cielo;

    @FXML
    private Button registrarse;

    @FXML
    private Button iniciarSesion;

    @FXML
    private ImageView nuevoDisenio;

    @FXML
    void registrar(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\VistaRegistroCliente.fxml"));
        stagePrincipal.setResizable(false);
    }

    @FXML
    void iniciarSesionPrincipal(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\VistaClienteEmpleado.fxml"));
        stagePrincipal.setResizable(false);
    }

    @FXML
    void diseniarCasaCielo(Event event) {

    }

    @FXML
    void diseniarCasaOasis(Event event) {

    }

    @FXML
    void diseniarCasaParaiso(Event event) {
    }

    @FXML
    void diseniarNuevaCasa(Event event) {
    }


    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
