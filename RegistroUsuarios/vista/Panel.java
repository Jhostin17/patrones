package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.Persona;

public class Panel extends JPanel {
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JScrollPane scrollPane;

    public Panel() {
        String[] columnas = {"ID", "Nombre", "Apellido", "Género"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(250, 50, 400, 200);

        this.setLayout(null); 
        this.add(scrollPane);
    }

    public void pintarUsuarios(ArrayList<Persona> personas) {
        modeloTabla.setRowCount(0);

        for (Persona persona : personas) {
            Object[] fila = new Object[4]; 
            fila[0] = persona.getId();
            fila[1] = persona.getNombre();
            fila[2] = persona.getApellido();
            fila[3] = persona.getGenero();
            modeloTabla.addRow(fila);
        }
    }

    public JScrollPane getTable() {
        return this.scrollPane;
    }
}
