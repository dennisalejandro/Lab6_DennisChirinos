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
public class Gato {
    double Peso;
    double Altura;

    public Gato(double Peso, double Altura) {
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Gato:" + "Peso:" + Peso + ", Altura:" + Altura;
    }
    
}
