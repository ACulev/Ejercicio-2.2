module com.mycompany.figura {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.figura to javafx.fxml;
    exports com.mycompany.figura;
}
