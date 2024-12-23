module prak6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens prak6 to javafx.fxml;
    exports prak6;
}
