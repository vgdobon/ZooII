package components;

import Interfaz.INadable;
import animales.Animal;

public class AcuarioComponent{

    public void entrarAcuario(INadable animal) {
//        if (animal.isCapacidadNadar()) {
//            System.out.println(animal.getNombre()+" de la especie "+animal.getClaseAnimal() + " puede entrar al acuario porque sabe nada");
//        } else {
//            System.out.println(animal.getNombre()+" de la especie "+animal.getClaseAnimal() + " no sabe nadar. No puede entrar al acuario");
//        }


        System.out.println(animal.showNadador());
    }

}
