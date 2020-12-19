package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CandidatosDiputadosController {

    //funcion para generar la ventana de seleccion de candidatos a presidentes
    public void generarSelecPresidentes() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CandidatosPresidentes.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Candidaturas a la Presidencia");
            regiStage.setScene(new Scene(root));
            regiStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

