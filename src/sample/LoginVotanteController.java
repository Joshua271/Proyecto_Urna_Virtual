package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class LoginVotanteController implements Initializable {

    @FXML
    private ImageView logoImage;

    @FXML
    Hyperlink adminLink;

    public void initialize(URL url, ResourceBundle resourceBundle){

        Image image = new Image("/Imagenes/tse.png");
        logoImage.setImage(image);

    }

    public void adminLinkAccion() {
        generarRegistro();


    }

    public void generarRegistro(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoginAdministrador.fxml"));
            Stage regiStage = new Stage();
            regiStage.setTitle("Opciones del administrador");
            regiStage.setScene(new Scene(root));
            regiStage.show();

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
