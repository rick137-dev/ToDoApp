module com.project.todoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.project.todoapp to javafx.fxml;
    exports com.project.todoapp;
}