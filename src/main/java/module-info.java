module org.example.canteen2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.canteen2 to javafx.fxml;
    exports org.example.canteen2;
}