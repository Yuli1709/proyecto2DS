/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiseñosotfware;

import java.io.File;
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

    @Override
    public void start(Stage stage) throws Exception {
        File file = new File("src\\vistas\\VistaVerCasa.fxml");
        Parent root = FXMLLoader.load(file.toURI().toURL());

        Scene scene = new Scene(root);

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
