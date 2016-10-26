/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runningbutton;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Justyna
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    public Button button;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
     
        
        Random r=new Random();
        button.setLayoutX(r.nextDouble()*300);
        button.setLayoutY(r.nextDouble()*300);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
