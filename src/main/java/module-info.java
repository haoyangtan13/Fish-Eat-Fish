module com.example.fisheatfish {
    requires javafx.controls;
    requires javafx.fxml;

    exports gui; //export gui to be accessible by javadx

    opens gui to javafx.fxml; //allow reflection for fxml loading

    opens com.example.fisheatfish2 to javafx.fxml;
    exports com.example.fisheatfish2;
}