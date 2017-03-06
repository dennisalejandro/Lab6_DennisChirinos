/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Cliente extends Persona {
    int Ticket;
    double Dinero;
    ArrayList<String> Ordenes;

    public Cliente(int Ticket, double Dinero, int Edad, int ID, String Nacionalidad, String Nacimiento, String Nombre, Color Piel) {
        super(Edad, ID, Nacionalidad, Nacimiento, Nombre, Piel);
        this.Ticket = Ticket;
        this.Dinero = Dinero;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int Ticket) {
        this.Ticket = Ticket;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<String> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(ArrayList<String> Ordenes) {
        this.Ordenes = Ordenes;
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
