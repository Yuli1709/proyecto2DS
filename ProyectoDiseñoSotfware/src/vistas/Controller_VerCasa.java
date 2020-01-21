/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Controller_VerCasa implements Initializable {
    
    @FXML
    private Label plantas_llenar;

    @FXML
    private Label esquinera_llenar;
    
    @FXML
    private Label patio_llenar;

    @FXML
    private TextArea adicionales_llenar;

    @FXML
    private Label banios_llenar;

    @FXML
    private Label orientacion_llenar;

    @FXML
    private Label metros_llenar;

    @FXML
    private Label habitaciones_llenar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
