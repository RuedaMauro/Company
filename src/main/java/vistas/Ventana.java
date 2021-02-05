package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JLabel etiq1, etiq2, etiq3;
    JTextField txtNombre, txtApellido;
    JButton boton1, boton2;
    JPanel panel;

    Ventana() {

        setTitle("ALTA EMPLEADOS");

        etiq1 = new JLabel("Ingrese el nombre y apellido del empleado");
        etiq1.setBounds(20, 30, 2000, 20);

        etiq2 = new JLabel("Nombre");
        etiq2.setBounds(40, 80, 180, 20);

        etiq3 = new JLabel("Apellido");
        etiq3.setBounds(40, 120, 180, 20);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 80, 180, 20);

        txtApellido = new JTextField();
        txtApellido.setBounds(100, 120, 180, 20);

        boton1 = new JButton("aceptar");
        boton1.setBounds(200, 180, 100, 20);

        boton2 = new JButton("cancelar");
        boton2.setBounds(300, 180, 100, 20);

        panel = new JPanel();
        panel.setLayout(null);

        panel.add(etiq1);
        panel.add(etiq2);
        panel.add(etiq3);
        panel.add(txtNombre);
        panel.add(txtApellido);
        panel.add(boton1);
        panel.add(boton2);

        add(panel);
        setSize(800,600);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ventana nuevaVentana = new Ventana();
        nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
