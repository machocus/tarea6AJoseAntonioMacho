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
public class Animales {
    private String nombre;
    private int patas;
    private boolean cola;

    public Animales() {
    }

    public Animales(String nombre, int patas, boolean cola) {
        this.nombre = nombre;
        this.patas = patas;
        this.cola = cola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", patas=" + patas + ", cola=" + cola + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + this.patas;
        hash = 31 * hash + (this.cola ? 1 : 0);
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
        final Animales other = (Animales) obj;
        if (this.patas != other.patas) {
            return false;
        }
        if (this.cola != other.cola) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
