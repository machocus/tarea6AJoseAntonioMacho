/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author aguil
 */
public class Tigre extends Felinos {
    private boolean estaenZoo;

    public Tigre() {
        super();
        this.estaenZoo= false;
    }

    public Tigre(boolean estaenZoo, String clase, int edad, String nombre, int patas, boolean cola) {
        super(clase, edad, nombre, patas, cola);
        this.estaenZoo = estaenZoo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.estaenZoo ? 1 : 0);
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
        final Tigre other = (Tigre) obj;
        if (this.estaenZoo != other.estaenZoo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        super.toString();
        return "Tigre{" + "estaenZoo=" + estaenZoo + '}';
    }
    
}
