package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private Button startGameButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button signUpButton;

    @FXML
    private Button exitButton;

    // Handle the "Start Game" button click
    @FXML
    private void onStartGame() {
        System.out.println("Start Game clicked");
        // Transition to the game screen
    }

    // Handle the "Login" button click
    @FXML
    private void onLogin() {
        System.out.println("Login clicked");
        // Transition to the login screen
    }

    // Handle the "Sign Up" button click
    @FXML
    private void onSignUp() {
        System.out.println("Sign Up clicked");
        // Transition to the sign-up screen
    }

    // Handle the "Exit" button click
    @FXML
    private void onExit() {
        System.out.println("Exit clicked");
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close(); // Close the application
    }
}
