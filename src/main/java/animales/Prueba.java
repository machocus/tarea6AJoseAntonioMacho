/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.ArrayList;

/**
 *
 * @author aguil
 */
public class Prueba {

    public static void main(String[] args) {
        Animales animal1 = new Animales("animales1", 4, true);
        Animales animal2 = new Animales("animal2", 2, false);

        Felinos felino1 = new Felinos("Tigre", 5, "Firulais", 4, false);
        Felinos felino2 = new Felinos("Gato", 8, "Misi", 3, true);

        Gato gato1 = new Gato(false, "gato", 2, "Sape", 4, false);
        Gato gato2 = new Gato(true, "gato", 8, "Misifai", 1, true);
        
        Tigre tigre1 = new Tigre(true,"Tigre", 2, "Tigito", 4, false);
        Tigre tigre2 = new Tigre(true,"Tigre", 4, "Tigreza", 1, true);
        ArrayList<Animales> lista = new ArrayList<>();
        lista.add(animal1);
        lista.add(animal2);
        lista.add(felino1);
        lista.add(felino2);
        lista.add(gato1);
        lista.add(gato2);
        lista.add(tigre1);
        lista.add(tigre2);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("¡Tiene cola?");
            lista.get(i).tieneCola();
        }
    }
}
