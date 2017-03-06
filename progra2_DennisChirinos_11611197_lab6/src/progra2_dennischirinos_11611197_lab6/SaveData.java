/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.awt.Color;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author denni_000
 */
public class SaveData {

    File fileEmpleados;
    File fileClientes;
    File fileVentas;
    Frame frame;

    public SaveData(Frame frame) {

        fileEmpleados = new File("./Empleados.txt");
        fileClientes = new File("./Clientes.txt");
        fileVentas = new File("./Ventas.txt");
        this.frame = frame;
    }

    public void Save() {

        try {
            FileWriter fw = new FileWriter(fileEmpleados);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaEmpleados.size(); i++) {
                bw.write(frame.ListaEmpleados.get(i).getTrabajo() + ":");
                System.out.println(frame.ListaEmpleados.get(i).getTrabajo());
                bw.write(frame.ListaEmpleados.get(i).getEntrada() + ":");
                bw.write(frame.ListaEmpleados.get(i).getSalida() + ":");
                bw.write(frame.ListaEmpleados.get(i).getSueldo() + ":");
                bw.write(frame.ListaEmpleados.get(i).getEstado() + ":");
                bw.write(frame.ListaEmpleados.get(i).getEdad() + ":");
                bw.write(frame.ListaEmpleados.get(i).getID() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNacionalidad() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNacimiento() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNombre() + ":");
                bw.write(frame.ListaEmpleados.get(i).getPiel().getRGB() + ":");
                if(frame.ListaEmpleados.get(i).isJefe()) {
                bw.write("1");
                } else {
                bw.write("0");
                }
            }
            bw.flush();
            bw.close();
            fw.close();
            fw = new FileWriter(fileClientes);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaClientes.size(); i++) {
                bw.write(frame.ListaClientes.get(i).getTicket() + ":");
                bw.write(frame.ListaClientes.get(i).getDinero() + ":");
                bw.write(frame.ListaClientes.get(i).getEdad() + ":");
                bw.write(frame.ListaClientes.get(i).getID() + ":");
                bw.write(frame.ListaClientes.get(i).getNacionalidad() + ":");
                bw.write(frame.ListaClientes.get(i).getNacimiento() + ":");
                bw.write(frame.ListaClientes.get(i).getNombre() + ":");
                bw.write(frame.ListaClientes.get(i).getPiel().getRGB() + ":");
            }
            bw.flush();
            bw.close();
            fw.close();
            fw = new FileWriter(fileVentas);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaVentas.size(); i++) {
                bw.write(frame.ListaVentas.get(i).getCliente() + ":");
                bw.write(frame.ListaVentas.get(i).getEmpleado() + ":");
                bw.write(frame.ListaVentas.get(i).getCantidad() + ":");
                bw.write(frame.ListaVentas.get(i).getTotal() + ":");
                bw.write(frame.ListaVentas.get(i).getSDF() + ":");
                System.out.println(frame.ListaVentas.get(i).getSDF());
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }

    }

    public void SaveAs() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showSaveDialog(frame);
        File f = chooser.getSelectedFile();
        File Dir = new File(f.getAbsolutePath() + "\\Guardado");
        Dir.mkdir();
        fileEmpleados = new File(Dir.getAbsolutePath() + "\\Empleados.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileEmpleados);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaEmpleados.size(); i++) {
                bw.write(frame.ListaEmpleados.get(i).getTrabajo() + ":");
                System.out.println(frame.ListaEmpleados.get(i).getTrabajo());
                bw.write(frame.ListaEmpleados.get(i).getEntrada() + ":");
                bw.write(frame.ListaEmpleados.get(i).getSalida() + ":");
                bw.write(frame.ListaEmpleados.get(i).getSueldo() + ":");
                bw.write(frame.ListaEmpleados.get(i).getEstado() + ":");
                bw.write(frame.ListaEmpleados.get(i).getEdad() + ":");
                bw.write(frame.ListaEmpleados.get(i).getID() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNacionalidad() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNacimiento() + ":");
                bw.write(frame.ListaEmpleados.get(i).getNombre() + ":");
                bw.write(frame.ListaEmpleados.get(i).getPiel().getRGB() + ":");
                if(frame.ListaEmpleados.get(i).isJefe()) {
                bw.write("1");
                } else {
                bw.write("0");
                }

            }
            bw.flush();
            bw.close();
            fw.close();
            //
            fileClientes = new File(Dir.getAbsolutePath() + "\\Clientes.txt");
            fw = new FileWriter(fileClientes);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaClientes.size(); i++) {
                bw.write(frame.ListaClientes.get(i).getTicket() + ":");
                bw.write(frame.ListaClientes.get(i).getDinero() + ":");
                bw.write(frame.ListaClientes.get(i).getEdad() + ":");
                bw.write(frame.ListaClientes.get(i).getID() + ":");
                bw.write(frame.ListaClientes.get(i).getNacionalidad() + ":");
                bw.write(frame.ListaClientes.get(i).getNacimiento() + ":");
                bw.write(frame.ListaClientes.get(i).getNombre() + ":");
                bw.write(frame.ListaClientes.get(i).getPiel().getRGB() + ":");
            }
            bw.flush();
            fw.close();
            bw.close();
            //
            System.out.println("Ventas!!!");
            fileVentas = new File(Dir.getAbsolutePath() + "//Ventas.txt");
            fw = new FileWriter(fileVentas);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < frame.ListaVentas.size(); i++) {
                bw.write(frame.ListaVentas.get(i).getCliente() + ":");
                bw.write(frame.ListaVentas.get(i).getEmpleado() + ":");
                bw.write(frame.ListaVentas.get(i).getCantidad() + ":");
                bw.write(frame.ListaVentas.get(i).getTotal() + ":");
                bw.write(frame.ListaVentas.get(i).getSDF() + ":");
                System.out.println(frame.ListaVentas.get(i).getSDF());
            }
            bw.flush();
            bw.close();
            fw.close();
            //
        } catch (Exception ex) {
            Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Empleado> LoadEmpleados() {
        ArrayList<Empleado> list = new ArrayList();

        try {
            Scanner sc = new Scanner(fileEmpleados);
            while (sc.hasNext()) {
                sc.useDelimiter(":");
                String Trabajo = sc.next();
                Time Entrada = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
                Time Salida = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
                double Sueldo = sc.nextDouble();
                String Estado = sc.next();
                int Edad = sc.nextInt();
                int ID = sc.nextInt();
                String Nacionalidad = sc.next();
                String Nacimiento = sc.next();
                String Nombre = sc.next();
                int color = sc.nextInt();
                Color c = new Color(color);
                Empleado emp = new Empleado(Trabajo, Entrada, Salida, Sueldo, Estado, Edad, ID, Nacionalidad, Nacimiento, Nombre, c);
                if (sc.nextInt()==1) {
                emp.setJefe(true);
                }
                System.out.println(emp.toString());
                list.add(emp);
                System.out.println("Cargado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Cliente> LoadClientes() {
        ArrayList<Cliente> list = new ArrayList();
        try {
            Scanner sc = new Scanner(fileClientes);
            sc.useDelimiter(":");
            while (sc.hasNext()) {
                int Ticket = sc.nextInt();
                double Dinero = sc.nextDouble();
                int Edad = sc.nextInt();
                int ID = sc.nextInt();
                String Nacionalidad = sc.next();
                String Nacimiento = sc.next();
                String Nombre = sc.next();
                Color Piel = new Color(sc.nextInt());
                Cliente cli = new Cliente(Ticket, Dinero, Edad, ID, Nacionalidad, Nacimiento, Nombre, Piel);
                list.add(cli);
            }
            System.out.println("Cliente Cargados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Venta> LoadVentas() {
        ArrayList<Venta> list = new ArrayList();
        try {
            Scanner sc = new Scanner(fileVentas);
            sc.useDelimiter(":");
            while (sc.hasNext()) {
                String Cliente = sc.next();
                String Empleado = sc.next();
                int Cantidad = sc.nextInt();
                double Total = sc.nextDouble();
                Date Fecha = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
                Venta v = new Venta(Cliente, Empleado, Cantidad, Total, Fecha);
                list.add(v);
            }
            System.out.println("Venta Cargados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void LoadAs() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(frame);
        File f = chooser.getSelectedFile();
        File Dir = new File(f.getAbsolutePath());
        fileEmpleados = new File(Dir.getAbsolutePath() + "\\Empleados.txt");
        System.out.println(fileEmpleados.getAbsolutePath());
        fileClientes = new File(Dir.getAbsolutePath() + "\\Clientes.txt");
        System.out.println(fileEmpleados.getAbsolutePath());
        fileVentas = new File(Dir.getAbsolutePath() + "\\Ventas.txt");
        System.out.println(fileEmpleados.getAbsolutePath());
    }
}
