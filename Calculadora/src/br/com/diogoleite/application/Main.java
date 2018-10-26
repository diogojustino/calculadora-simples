/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author diogo_leite
 */
public class Main extends Application{ 
    @Override
    public void start(Stage stage){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/br/com/diogoleite/view/FXMLCalculadora.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}
