package controllers;

import models.EmpleadoModel;
import views.EmpleadoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoController {

    private EmpleadoView empleadoView;
    private EmpleadoModel empleadoModel;

    public EmpleadoController(EmpleadoView empleadoView, EmpleadoModel empleadoModel){
        this.empleadoView = empleadoView;
        this.empleadoModel = empleadoModel;
        this.empleadoView.botonAceptar.addActionListener(new AceptarListener());
    }

    private class AceptarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = empleadoView.txtNombre.getText();
            String surname = empleadoView.txtApellido.getText();
            empleadoModel.setNombre(name);
            empleadoModel.setApellido(surname);
            empleadoModel.create();
        }
    }
}



