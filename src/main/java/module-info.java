module uz.kh.mini_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens uz.kh.mini_calculator to javafx.fxml;
    exports uz.kh.mini_calculator;
}