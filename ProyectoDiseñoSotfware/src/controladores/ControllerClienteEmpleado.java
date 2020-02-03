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
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Cliente;
import modelo.EstadoCivil;
import modelo.Kioscos;
import modelo.Usuario;
import modelo.Vendedor;
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
        stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_principal.fxml"));
    }

    @FXML
    void ingresar(ActionEvent event) {
        boolean val = true;
        boolean textoValidacion = usuario_txtfield.getText().length() != 0 && contrasenia_txtfield.getText().length() >= 8;
        List<Usuario> users = Kioscos.usuarios;
        Cliente c = new Cliente("henry12", "henry", "siavichay", "cedula", "gmmail", "14 y 4", "0914589236", EstadoCivil.Casado, 0, "s","ss", true, "12345678");
        
        users.add(c);
        users.add(new Vendedor("vendedor", "vendedor"));
        users.add(new Usuario("administrador", "administrador"));
        int i = 0;
        while (val && textoValidacion) {
            if (users.get(i).getUsuario().equals(usuario_txtfield.getText()) && users.get(i).getContraseña().equals(contrasenia_txtfield.getText())) {
                Usuario u = users.get(i);
                ventanaUsuario(u);
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

    void ventanaUsuario(Usuario user) {
        if (user instanceof Cliente) {
            try {
                Controller_VerCasas.cliente1 = (Cliente) user;
                File file = new File("src\\vistas\\VistaVerCasas.fxml");
                Parent root = FXMLLoader.load(file.toURI().toURL());
                //root.getChildrenUnmodifiable().add(new Button("WS"));
                Stage stage = new Stage();
                Scene sc = new Scene(root);
                stage.setScene(sc);
                stage.show();
                stagePrincipal.setScene(cambioEscena("src\\vistas\\vista_DecoradoraCasa.fxml"));
                stagePrincipal.setResizable(false);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ControllerClienteEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ControllerClienteEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (user instanceof Vendedor) {
            stagePrincipal.setScene(cambioEscena("src\\vistas\\Vista_Vendedor.fxml"));
            stagePrincipal.setResizable(false);
        } else {
            stagePrincipal.setScene(cambioEscena("src\\vistas\\vista_DecoradoraCasa.fxml"));
            stagePrincipal.setResizable(false);
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
        // TODO
    }

}
