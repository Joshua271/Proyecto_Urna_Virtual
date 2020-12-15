package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InscripcionPartidoController {


    public void mostrarMenuAdmin(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MenuAdmin.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Administrador");
            regiStage.setScene(new Scene(root));
            regiStage.show();
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
