package animales;

public class Delfin extends Animal {

    public Delfin(String nombre, String claseAnimal, boolean capacidadNadar) {
        super(nombre, claseAnimal, capacidadNadar);
    }

    @Override
    public String show() {
        return "Me lamo "+this.getNombre() + " y soy un " +this.getClaseAnimal();
    }
}
