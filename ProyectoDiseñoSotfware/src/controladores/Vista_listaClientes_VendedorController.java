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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.Casa;
import modelo.Cliente;
import modelo.EstadoCivil;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Vista_listaClientes_VendedorController implements Initializable {

    @FXML
    private TableView<Cliente> tabla;

    @FXML
    private Button seleccion;

    @FXML
    void seleccionar(ActionEvent event) throws MalformedURLException, IOException {
        Controller_VerCasas.cliente1 = tabla.getSelectionModel().getSelectedItem();
        File file = new File("src\\vistas\\VistaVerCasas.fxml");
        Parent root = FXMLLoader.load(file.toURI().toURL());
        Stage stage = new Stage();
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.show();
    }

    void llenarTabla() {
        Cliente c = new Cliente("henry12", "henry", "siavichay", "cedula", "gmmail", "14 y 4", "0914589236", EstadoCivil.Casado, 0, "s","ss", true, "ss");
        c.getCasaDiseñada().add(new Casa());
        ObservableList<Cliente> llenos = FXCollections.observableArrayList(
                c
        );

        TableColumn<Cliente, String> colunaUsuario = new TableColumn<>("Usuario");
        colunaUsuario.setCellValueFactory(new PropertyValueFactory<>("usuario"));

        TableColumn<Cliente, String> columinf = new TableColumn<>("Noombes Y Apellidos");

        TableColumn<Cliente, String> colunanombre = new TableColumn<>("Nombre");
        colunanombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Cliente, String> colunaapellidos = new TableColumn<>("Apellidos");
        colunaapellidos.setCellValueFactory(new PropertyValueFactory<>("apellido"));

        TableColumn<Cliente, String> colunaCedula = new TableColumn<>("Cedula");
        colunaCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));

        TableColumn<Cliente, String> colunaCorreo = new TableColumn<>("Correo");
        colunaCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));

        TableColumn<Cliente, String> colunaDireccion = new TableColumn<>("Direccion");
        colunaDireccion.setCellValueFactory(new PropertyValueFactory<>("domicilio"));

        TableColumn<Cliente, String> colunaTelefono = new TableColumn<>("Telefono trabajo");
        colunaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefonoTrabajo"));

        tabla.getColumns().addAll(colunaUsuario,colunanombre, colunaapellidos, colunaCedula, colunaCorreo, colunaDireccion, colunaTelefono);
        tabla.setItems(llenos);
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        llenarTabla();
    }

}
