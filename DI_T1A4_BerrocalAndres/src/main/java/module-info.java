module ieslosmontecillos.ejercicio4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ieslosmontecillos.ejercicio4 to javafx.fxml;
    exports ieslosmontecillos.ejercicio4;
}