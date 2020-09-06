package animales;

public class Ballena extends Animal{
    public Ballena(String nombre, String claseAnimal, boolean capacidadNadar) {
        super(nombre, claseAnimal, capacidadNadar);
    }

    @Override
    public String show() {
        return "Me lamo "+this.getNombre() + " y soy un " +this.getClaseAnimal();
    }
}
