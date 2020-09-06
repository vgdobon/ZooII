package animales;

public class Zoo {
    public static void doShow(Animal animal){
        System.out.println(animal.show());
    }

    public static void entrarAcuario(Animal animal) {
        if (animal.isCapacidadNadar()) {
            System.out.println(animal.getNombre()+" de la especie "+animal.getClaseAnimal() + " puede entrar al acuario porque sabe nada");
        } else {
            System.out.println(animal.getNombre()+" de la especie "+animal.getClaseAnimal() + " no sabe nadar. No puede entrar al acuario");
        }
    }
}
