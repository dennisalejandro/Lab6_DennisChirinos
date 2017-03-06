/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.awt.Color;
import java.sql.Time;

/**
 *
 * @author denni
 */
public class Empleado extends Persona{
    String Trabajo;
    Time Entrada;
    Time Salida;
    double Sueldo;
    String Estado;
    boolean Jefe;

    public Empleado(String Trabajo, Time Entrada, Time Salida, double Sueldo, String Estado, int Edad, int ID, String Nacionalidad, String Nacimiento, String Nombre, Color Piel) {
        super(Edad, ID, Nacionalidad, Nacimiento, Nombre, Piel);
        this.Trabajo = Trabajo;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Sueldo = Sueldo;
        this.Estado = Estado;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public Time getEntrada() {
        return Entrada;
    }

    public void setEntrada(Time Entrada) {
        this.Entrada = Entrada;
    }

    public Time getSalida() {
        return Salida;
    }

    public void setSalida(Time Salida) {
        this.Salida = Salida;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
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

    public boolean isJefe() {
        return Jefe;
    }

    public void setJefe(boolean Jefe) {
        this.Jefe = Jefe;
    }
    
    

    
    
}
