package components;

import animales.Animal;

public class ZooComponent {

    //Al hacer un objeto estático,no necesitamos instanciarlo más.
    public static AcuarioComponent acuario = new AcuarioComponent();

    public static void doShow(Animal animal){
        System.out.println(animal.show());
    }


}
