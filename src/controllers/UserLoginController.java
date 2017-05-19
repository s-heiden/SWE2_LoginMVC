
package controllers;

import models.UserLoginModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class UserLoginController implements Initializable {
    
    @FXML
    private Text outputText;
    
    @FXML
    private TextField userTextField;
    
    @FXML
    private TextField passwordTextField;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void handleLoginButtonAction(ActionEvent event) {
        UserLoginModel u = new UserLoginModel(userTextField.getText(), passwordTextField.getText());
        outputText.setText(u.validate() ? "Success!" : "Try Again!");
    }
   
    
    
}
