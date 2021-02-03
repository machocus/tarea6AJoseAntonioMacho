/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.Objects;

/**
 *
 * @author aguil
 */
public class Felinos extends Animales {

    private String clase;
    private int edad;

    public Felinos() {
        super();
        this.clase = "";
        this.edad = 0;
    }

    public Felinos(String clase, int edad, String nombre, int patas, boolean cola) {
        super(nombre, patas, cola);
        this.clase = clase;
        this.edad = edad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Felinos{" + "clase=" + clase + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.clase);
        hash = 53 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Felinos other = (Felinos) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        return true;
    }

}
