import controllers.EmpleadoController;
import models.EmpleadoModel;
import views.EmpleadoView;

import javax.swing.*;

public class AppMain {

    public static void main(String[] args) {
        EmpleadoView empleadoView = new EmpleadoView();
        EmpleadoModel empleadoModel = new EmpleadoModel();
        EmpleadoController empleadoController = new EmpleadoController(empleadoView, empleadoModel);
        empleadoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

