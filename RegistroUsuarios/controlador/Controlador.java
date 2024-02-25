package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;
import model.Modelo;
import model.Persona;

public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;

    public void setModel(Modelo model){
        this.modelo = model;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String nombre = vista.nombre.getText();
        String apellido = vista.apellido.getText();
        int id = Integer.parseInt(vista.id.getText());
        String genero = vista.genero.getText();

        modelo.addPersona(new Persona(nombre, apellido, id, genero));
        vista.getPanel().pintarUsuarios(modelo.getPersonas());
        vista.limpiarCajasTexto();
    }

    public void setVista(Vista vista){
        this.vista = vista;
    }

}
