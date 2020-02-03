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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import modelo.Cliente;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_VerCasas implements Initializable {
    public static Cliente cliente1;
    
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
