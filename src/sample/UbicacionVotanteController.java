package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UbicacionVotanteController implements Initializable {

    @FXML private ComboBox Departamento;
    @FXML private ComboBox Municipio;
    @FXML private Button aceptar;

    protected ArrayList<String> mun=new ArrayList<>();
    protected ArrayList <String> depto=new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MostrarDepartamentos();

    }

    public void accion4(){

    }

    //Agregar a los arraylist datos de municipios y departamentos
    public void arreglosMunicipios(){

        mun.clear();
        String nombre="Departamentos\\"+Departamento.getValue().toString()+".txt";
        File datos=new File(nombre);
        try {
            Scanner entrada=new Scanner(datos);
            while(entrada.hasNextLine()){
                String informacion=entrada.nextLine();
                mun.add(informacion);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void arreglosDepartamentos(){
        String nombre="Departamentos\\"+"DepartamentosHonduras.txt";
        File datos=new File(nombre);
        try {
            Scanner entrada=new Scanner(datos);
            while(entrada.hasNextLine()){
                String informacion=entrada.nextLine();
                depto.add(informacion);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Mostrar en combobox las listas
    public void MostrarDepartamentos() {

        arreglosDepartamentos();
        ObservableList<String> listd = FXCollections.observableArrayList(depto);
        Departamento.setItems(listd);
        System.out.println("Activado");

        if (Departamento.getValue() == null) {
            System.out.println("Vacio");
        } else {
            arreglosMunicipios();
            ObservableList<String> list3 = FXCollections.observableArrayList(mun);
            Municipio.setItems(list3);
        }

    }

}
