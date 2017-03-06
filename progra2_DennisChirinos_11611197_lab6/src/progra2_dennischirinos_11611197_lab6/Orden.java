/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author denni
 */
public class Orden {
    Empleado empleado;
    Cliente cliente;
    int Cantidad;
    double Precio;
    Date fecha;

    public Orden(Empleado empleado, Cliente cliente, int Cantidad, double Precio) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.fecha = new Date();
        SimpleDateFormat SDF = new SimpleDateFormat("yy/mm/dd");
        System.out.println(SDF.format(fecha));
    }
    
}
