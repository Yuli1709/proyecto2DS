/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Vista_vendedorController implements Initializable {
    
     @FXML
    private ImageView diseniarCasa_buton;

    @FXML
    private ImageView clientes;

    @FXML
    void diseniar_nuevaCasa(Event event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\VistaVerCasa.fxml"));
    }

    @FXML
    void ver_clientes(Event event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_listaClientes_Vendedor.fxml"));
    }
    
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
