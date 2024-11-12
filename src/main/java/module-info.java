module com.example.sktriqueza.sktriqueza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sktriqueza.sktriqueza to javafx.fxml;
    exports com.example.sktriqueza.sktriqueza;
}