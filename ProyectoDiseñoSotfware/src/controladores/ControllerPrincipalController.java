/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import builderModular.CasaDirector;
import builderModular.Cielo_Builder;
import builderModular.Oasis_Builder;
import builderModular.Paraiso_Builder;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_ClienteEmpleado.fxml"));
        stagePrincipal.setResizable(false);
    }

    @FXML
    void diseniarCasaCielo(Event event) {
        CasaDirector casaCielo = new CasaDirector(new Cielo_Builder());
        casaCielo.construirCasa();
        Vista_casaIndividualController.casa = casaCielo.getCasa();
        stagePrincipal.setScene(cambioEscena("src\\vistas\\vista_DecoradoraCasa.fxml"));
        stagePrincipal.setResizable(false);
    }

    @FXML
    void diseniarCasaOasis(Event event) {
        CasaDirector casaOasis = new CasaDirector(new Oasis_Builder());
        casaOasis.construirCasa();
        Vista_casaIndividualController.casa = casaOasis.getCasa();
        stagePrincipal.setScene(cambioEscena("src\\vistas\\vista_DecoradoraCasa.fxml"));
        stagePrincipal.setResizable(false);
        
    }

    @FXML
    void diseniarCasaParaiso(Event event) {
        CasaDirector casaParaiso = new CasaDirector(new Paraiso_Builder());
        casaParaiso.construirCasa();
        Vista_casaIndividualController.casa = casaParaiso.getCasa();
        stagePrincipal.setScene(cambioEscena("src\\vistas\\vista_DecoradoraCasa.fxml"));
        stagePrincipal.setResizable(false);
    }

    @FXML
    void diseniarNuevaCasa(Event event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\VistaVerCasa.fxml"));
        stagePrincipal.setResizable(false);
    }


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
