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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Cliente;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class Vista_listaClientes_VendedorController implements Initializable {

    @FXML
    private TableView<Cliente> tabla;

    void llenarTabla() {
        TableColumn<Cliente, String> columinf = new TableColumn<>("Noombes Y Apellidos");

        TableColumn<Cliente, String> colunanombre = new TableColumn<>("Nombre");
        colunanombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Cliente, String> colunaapellidos = new TableColumn<>("Apellidos");
        colunaapellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));

        TableColumn<Cliente, Integer> colunaedad = new TableColumn<>("Edad");
        colunaedad.setCellValueFactory(new PropertyValueFactory<>("edad"));

        columinf.getColumns().addAll(colunaapellidos, colunanombre);

        tabla.getColumns().addAll(columinf, colunaedad);
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
