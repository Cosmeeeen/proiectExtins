module com.example.proiectextins {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.proiectextins to javafx.fxml;
    exports com.example.proiectextins;
}