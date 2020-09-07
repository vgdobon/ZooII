import animales.*;
import components.ZooComponent;

public class Main {

    public static void main(String[] args) {

        Aguila aguila = new Aguila("Feroz" ,"Aquila chrysaetos",false);
        Ballena ballena = new Ballena("Moby dick","Balaenoptera physalus", true);
        Delfin delfin = new Delfin("Winter", "Delphinidae",true);
        Gato gato = new Gato ("Nika","Felis catus",false);
        Leon leon = new Leon("Simba","Panthera leo",false);
        Papagallo papagallo = new Papagallo("Clothilde","Psittacidae",false);
        Tortuga tortuga = new Tortuga("Pepa","Testudines",true);

        ZooComponent.doShow(aguila);
        ZooComponent.doShow(ballena);
        ZooComponent.doShow(delfin);
        ZooComponent.doShow(gato);
        ZooComponent.doShow(leon);
        ZooComponent.doShow(papagallo);
        ZooComponent.doShow(tortuga);
        System.out.println();

//      AcuarioComponent.entrarAcuario(aguila);
//      AcuarioComponent.entrarAcuario(gato);
//      AcuarioComponent.entrarAcuario(leon);
//      AcuarioComponent.entrarAcuario(papagallo);


        System.out.println("Componentes zoo y acuario");

        ZooComponent.acuario.entrarAcuario(ballena);
        ZooComponent.acuario.entrarAcuario(tortuga);
        ZooComponent.acuario.entrarAcuario(delfin);


    }
}
