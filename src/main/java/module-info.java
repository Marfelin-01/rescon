module com.marfelin.rescon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.marfelin.rescon to javafx.fxml;
    exports com.marfelin.rescon;
}
