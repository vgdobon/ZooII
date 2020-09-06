package animales;

public abstract class Animal {

    protected boolean capacidadNadar;



    protected String claseAnimal;
    protected String nombre;

    public Animal(String nombre,String claseAnimal,boolean capacidadNadar){

        this.nombre = nombre;
        this.claseAnimal = claseAnimal;
        this.capacidadNadar = capacidadNadar;
    }

    public abstract String show();




    //GETTER AND SETTER

    public boolean isCapacidadNadar() {
        return capacidadNadar;
    }

    public void setCapacidadNadar(boolean capacidadNadar) {
        this.capacidadNadar = capacidadNadar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaseAnimal() {
        return claseAnimal;
    }

    public void setClaseAnimal(String claseAnimal) {
        this.claseAnimal = claseAnimal;
    }
}