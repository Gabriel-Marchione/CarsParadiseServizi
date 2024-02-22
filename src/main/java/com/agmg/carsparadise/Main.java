package com.agmg.carsparadise;

import com.agmg.carsparadise.Servizi.Control.GestoreServizi;
import com.agmg.carsparadise.Servizi.Control.GestoreStipendi;
import com.agmg.carsparadise.Servizi.Control.GestoreTurniTrimestre;
import com.agmg.carsparadise.Util.ServerMail;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        /*

        */
        /*
          GestoreStipendi gestoreStipendi = new GestoreStipendi();
        gestoreStipendi.start();


              GestoreServizi gestoreServizi = new GestoreServizi();
        gestoreServizi.start();
        */
        GestoreTurniTrimestre gestoreTurniTrimestre = new GestoreTurniTrimestre();
        gestoreTurniTrimestre.start();
    }
}
