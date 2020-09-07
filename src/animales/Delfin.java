package animales;

import Interfaz.INadable;

public class Delfin extends Animal implements INadable {

    public Delfin(String nombre, String claseAnimal, boolean capacidadNadar) {
        super(nombre, claseAnimal, capacidadNadar);
    }

    @Override
    public String show() {
        return "Me lamo "+this.getNombre() + " y soy un " +this.getClaseAnimal();
    }

    @Override
    public String showNadador() {
        return this.getNombre()+" de la especie "+this.getClaseAnimal() + " puede entrar al acuario porque sabe nadar";
    }
}
