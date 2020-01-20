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
    
    @Override
    public void start(Stage stage) throws Exception {
        File f = new File("src\\vistas\\VistaPrincipal.fxml");
        Parent root = FXMLLoader.load(f.toURI().toURL());
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
