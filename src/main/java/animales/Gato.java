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
public class Gato extends Felinos {
    private boolean duenio;

    public Gato() {
        super();
        this.duenio = duenio;
    }

    public Gato(boolean duenio, String clase, int edad, String nombre, int patas, boolean cola) {
        super(clase, edad, nombre, patas, cola);
        this.duenio = duenio;
    }

    public boolean isDuenio() {
        return duenio;
    }

    public void setDuenio(boolean duenio) {
        this.duenio = duenio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.duenio ? 1 : 0);
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
        final Gato other = (Gato) obj;
        if (this.duenio != other.duenio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        super.toString();
        return "Gato{" + "duenio=" + duenio + '}';
    }
    
      public void tieneCola (){
        boolean tener;
        if (this.isCola()==true){
            System.out.println("El gato tiene cola");
        } else {
            System.out.println("El gato no tiene cola");
        }
    }

       public String  raza(String raza){
           String razita = raza;
           return razita;
       }
       
     @Override
    public void situacion() {
        System.out.println("Cazar");
    }

}
