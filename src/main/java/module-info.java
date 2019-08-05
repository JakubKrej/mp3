module mp3player {
        requires javafx.graphics;
        requires javafx.controls;
        requires javafx.fxml;

        exports pl.java.mp3player.main to javafx.graphics;
        opens pl.java.mp3player.controller to javafx.fxml;
        }