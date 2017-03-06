/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

/**
 *
 * @author denni
 */
import java.awt.Color;
import java.util.ArrayList;
public class Familiar extends Persona{
    Familiar Padre;
    ArrayList<Familiar> Hijos = new ArrayList();

    public Familiar(Familiar Padre, int Edad, int ID, String Nacionalidad, String Nacimiento, String Nombre, Color Piel) {
        super(Edad, ID, Nacionalidad, Nacimiento, Nombre, Piel);
        this.Padre = Padre;
    }
    public Familiar getPadre() {
        return Padre;
    }
    public void setPadre(Familiar Padre) {
        this.Padre = Padre;
    }
    public ArrayList<Familiar> getHijos() {
        return Hijos;
    }
    public void setHijos(ArrayList<Familiar> Hijos) {
        this.Hijos = Hijos;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Color getPiel() {
        return Piel;
    }

    public void setPiel(Color Piel) {
        this.Piel = Piel;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
