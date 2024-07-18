module org.example.asteroidgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.asteroidgame to javafx.fxml;
    exports org.example.asteroidgame;
}