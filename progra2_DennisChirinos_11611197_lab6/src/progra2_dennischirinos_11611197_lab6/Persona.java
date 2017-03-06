/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.awt.Color;

/**
 *
 * @author denni
 */
public class Persona {

    int Edad;
    int ID;
    String Nacionalidad;
    String Nacimiento;
    String Nombre;
    Color Piel;

    public Persona(int Edad, int ID, String Nacionalidad, String Nacimiento, String Nombre, Color Piel) {
        this.Edad = Edad;
        this.ID = ID;
        this.Nacionalidad = Nacionalidad;
        this.Nacimiento = Nacimiento;
        this.Nombre = Nombre;
        this.Piel = Piel;
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
    
    
}
