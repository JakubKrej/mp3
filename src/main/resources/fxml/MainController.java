
package pl.java.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class MainController {

      @FXML
      private ContentPaneController contentPaneController;

      @FXML
      private ControlPaneController controlPaneController;

      @FXML
      private MenuPaneController menuPaneController;


       public void initialize(){
           System.out.println("Main controller created.");
               System.out.println(contentPaneController);
               System.out.println(controlPaneController);
               System.out.println(menuPaneController);
       }


    }


