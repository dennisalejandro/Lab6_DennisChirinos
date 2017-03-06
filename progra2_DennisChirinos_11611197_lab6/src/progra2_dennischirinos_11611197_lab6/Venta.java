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
public class Venta {
    String Cliente;
    String Empleado;
    int Cantidad;
    double Total;
    Date Fecha;
    SimpleDateFormat SDF = new SimpleDateFormat("yy:mm:dd");

    public Venta(String Cliente, String Empleado, int Cantidad, double Total) {
        this.Cliente = Cliente;
        this.Empleado = Empleado;
        this.Cantidad = Cantidad;
        this.Total = Total;
        this.Fecha = new Date();
        SDF.format(Fecha);
        System.out.println(SDF.format(Fecha));
    }
    public Venta(String Cliente, String Empleado, int Cantidad, double Total, Date Fecha) {
        this.Cliente = Cliente;
        this.Empleado = Empleado;
        this.Cantidad = Cantidad;
        this.Total = Total;
        this.Fecha = Fecha;
        SDF.format(Fecha);
        System.out.println(SDF.format(Fecha));
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getSDF() {
        return SDF.format(Fecha);
    }

    public void setSDF(SimpleDateFormat SDF) {
        this.SDF = SDF;
    }
    
    
    
}
