/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_11611197_lab6;

import java.util.ArrayList;

/**
 *
 * @author denni
 */

public class Baleada {
    ArrayList<String> Ingredientes = new ArrayList<>();
    public void addIngrediente (String ingrediente) {
        Ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        String Str = "";
        for (int i = 0;i<Ingredientes.size();i++) {
        Str+=Ingredientes.get(i)+" ";
        }
        return "Baleada con "+Str+"";
    }
    
}
