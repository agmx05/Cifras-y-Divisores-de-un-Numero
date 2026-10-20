module com.mycompany.divisonesdeunnum {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.divisonesdeunnum to javafx.fxml;
    exports com.mycompany.divisonesdeunnum;
}
