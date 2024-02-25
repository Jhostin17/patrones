package model;
import java.util.ArrayList;

public class Modelo {
    ArrayList<Persona> Registro = new ArrayList<>();

    public void addPersona(Persona persona){
        Registro.add(persona);
    }

    public ArrayList<Persona> getPersonas(){
        return Registro;
    }
}
