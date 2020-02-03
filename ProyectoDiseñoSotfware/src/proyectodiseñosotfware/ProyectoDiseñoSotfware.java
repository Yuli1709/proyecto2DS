/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiseñosotfware;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Henry
 */
public class ProyectoDiseñoSotfware extends Application {

    public static Stage stagePrincipal = new Stage();
    
    public static Scene cambioEscena(String ruta) {
        Parent root = null;
        try {
            root = FXMLLoader.load(new File(ruta).toURI().toURL());
        } catch (IOException ex) {
        }
        return new Scene(root);
    }

    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("src\\vistas\\Vista_Principal.fxml");
        Parent root = FXMLLoader.load(file.toURI().toURL());

        Scene scene = new Scene(root);
        stagePrincipal.setResizable(false);
        stagePrincipal.setScene(scene);       
        stagePrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
