import controlador.Controlador;
import vista.Vista;
import model.Modelo;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Controlador controller = new Controlador();
        Vista vista = new Vista(controller);
        controller.setModel(modelo);
        controller.setVista(vista);
    }
}
