module io.github.vhorvath2010.javafxprep {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens io.github.vhorvath2010.javafxprep to javafx.fxml;
    exports io.github.vhorvath2010.javafxprep;
}