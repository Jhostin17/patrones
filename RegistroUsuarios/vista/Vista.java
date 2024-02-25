package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controlador.Controlador;


public class Vista extends JFrame{
    
    //JText
    public JTextField nombre = new JTextField();
    public JTextField apellido = new JTextField();
    public JTextField id = new JTextField();
    public JTextField genero = new JTextField();

    //Jlabel
    public JLabel Cnombre = new JLabel("Nombre");
    public JLabel Capellido = new JLabel("Apellido");
    public JLabel Cid = new JLabel("ID");
    public JLabel Cgenero = new JLabel("Genero");

    //JButton
    public JButton register = new JButton();

    //Controlador
    private Controlador controller;

    //Panel
    private Panel panel = new Panel();

    public Vista(Controlador controller){
        this.controller = controller;
        init();
        //JText Bounds
        nombre.setBounds(85,50,150,20);
        apellido.setBounds(85,100,150,20);
        id.setBounds(85,150,150,20);
        genero.setBounds(85,200,150,20);
        
        //JLabel Bounds
        Cnombre.setBounds(30,50,150,20);
        Capellido.setBounds(30,100,150,20);
        Cid.setBounds(30,150,150,20);
        Cgenero.setBounds(30,200,150,20);

        //JButton Bounds
        register.setBounds(38,250,150,20);
        register.setText("Registrarse");
        register.addActionListener(controller);

        this.add(nombre);
        this.add(apellido);
        this.add(id);
        this.add(genero);
        this.add(Cnombre);
        this.add(Capellido);
        this.add(Cid);
        this.add(Cgenero);
        this.add(register);
        this.add(panel.getTable());
        this.setVisible(true);
    }
    
    public void limpiarCajasTexto() {
        nombre.setText("");
        apellido.setText("");
        id.setText("");
        genero.setText("");
    }

    public void init(){
        this.setSize(700,400);
        this.setLayout(null);
    }

    public Controlador getController() {
        return controller;
    }

    public void setController(Controlador controller) {
        this.controller = controller;
    }

    public Panel getPanel() {
        return panel;
    }

}
