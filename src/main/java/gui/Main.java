package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //load fxml file for main menu
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainMenu.fxml"));
        Scene scene = new Scene(loader.load());

        //set scene and title
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fish Eat Fish Game");

        //set default window size
        primaryStage.setWidth(1024);
        primaryStage.setHeight(768);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
