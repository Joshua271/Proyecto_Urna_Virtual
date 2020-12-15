package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuAdminController {

    //funcion para generar la ventana de registro de candidatos
    public void generarRegistro(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("registro.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Opciones del administrador");
            regiStage.setScene(new Scene(root));
            regiStage.show();
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    //funcion para generar la ventana de registro de partidos politicos
    public void registroPartidos(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InscripcionPartido.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Opciones del administrador");
            regiStage.setScene(new Scene(root));
            regiStage.show();
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void VentanaPrincipal(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginVotante.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Urna Virtual 2020");
            regiStage.setScene(new Scene(root));
            regiStage.show();
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
