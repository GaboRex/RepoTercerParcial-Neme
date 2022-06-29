module com.example.repotercerparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repotercerparcial to javafx.fxml;
    exports com.example.repotercerparcial;
}