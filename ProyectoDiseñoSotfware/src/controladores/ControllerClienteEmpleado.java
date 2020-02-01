/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Kioscos;
import modelo.Usuario;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.cambioEscena;
import static proyectodiseñosotfware.ProyectoDiseñoSotfware.stagePrincipal;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class ControllerClienteEmpleado implements Initializable {

    @FXML
    private TextField usuario_txtfield;

    @FXML
    private Button ingresarUsuario;

    @FXML
    private PasswordField contrasenia_txtfield;

    @FXML
    private Button retroceder_button_IniciarSecion;

    @FXML
    void retroceder(ActionEvent event) {
        stagePrincipal.setScene(cambioEscena("src\\vistas\\VistaPrincipal.fxml"));
    }

    @FXML
    void ingresar(ActionEvent event) {
        boolean val = true;
        boolean textoValidacion = usuario_txtfield.getText().length() != 0 && contrasenia_txtfield.getText().length() < 8;
        List<Usuario> users = Kioscos.usuarios;
        users.add(new Usuario("administrador", "administrador"));
        int i = 0;
        while (val && textoValidacion) {
            if (users.get(i).getUsuario().equals(usuario_txtfield.getText()) && users.get(i).getContraseña().equals(contrasenia_txtfield.getText())) {
                Usuario u = users.get(i);
                val = false;
            } else {
                i++;
            }
        }
        if (i == users.size() - 1) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Verifique que su contraseña y su usuario esten correctamente\n"
                    + "O Usted no esta registrado.");
            alert.setTitle("Cliente no encontrado");
            alert.setHeaderText("Debe registrarse");
            alert.show();
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
