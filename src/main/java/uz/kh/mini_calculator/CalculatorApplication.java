package uz.kh.mini_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/calculator-view.fxml"));
        primaryStage.setTitle("Calculator");
        Image logo = new Image(getClass().getResourceAsStream("/icons/logo.png"));
        primaryStage.getIcons().add(logo);
        primaryStage.setScene(new Scene(root, 236, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}