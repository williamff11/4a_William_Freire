/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 84570695272
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField lbResultado;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnDividir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void mult(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }
    
}
