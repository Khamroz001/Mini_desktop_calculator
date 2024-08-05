package uz.kh.mini_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label resultLabel;
    private String currentInput = "";
    private String operator = "";
    private int result = 0;

    @FXML
    void handleClear(ActionEvent event) {
        currentInput = "";
        operator = "";
        result = 0;
        resultLabel.setText("0");
    }

    @FXML
    void handleEquals(ActionEvent event) {
        calculate();
        operator = "";
        currentInput = "";
    }

    @FXML
    void handleNumber(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        currentInput += value;
        resultLabel.setText(currentInput);
    }

    @FXML
    void handleOperator(ActionEvent event) {
        String op = ((Button)event.getSource()).getText();
        if (!currentInput.isEmpty() || result != 0) {
            calculate();
            operator = op;
            currentInput = "";
        }
    }

    @FXML
    void initialize() {
        assert resultLabel != null : "fx:id=\"resultLabel\" was not injected: check your FXML file 'calculator.fxml'.";

    }
    private void calculate() {
        if (!currentInput.isEmpty()) {
            int secondOperand = Integer.parseInt(currentInput);
            switch (operator) {
                case "+":
                    result += secondOperand;

                    break;
                case "-":
                    result -= secondOperand;

                    break;
                case "×":
                    result *= secondOperand;

                    break;
                case "÷":
                    if (secondOperand != 0) {
                        result /= secondOperand;

                    } else {
                        resultLabel.setText("Error");
                        return;
                    }
                    break;
                default:
                    result = secondOperand;
            }
            resultLabel.setText(String.valueOf(result));
        }
    }
}