module com.example.frantarpg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.example.frantarpg to javafx.fxml;
    exports com.example.frantarpg;
    exports com.example.frantarpg.entity;
    opens com.example.frantarpg.entity to javafx.fxml;
}