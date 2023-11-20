public class Perro  extends Animal{

    public Perro(String nombreAnimal, double pesoAnimal, String sexoAnimal, String raza) {
        super(nombreAnimal, pesoAnimal, sexoAnimal);
    }

    public void hacerSonido(){
        System.out.println("Guau");
    }
}

