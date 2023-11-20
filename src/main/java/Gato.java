public class Gato extends Animal {

    public Gato(String nombreAnimal, double pesoAnimal, String sexoAnimal, String raza) {
        super(nombreAnimal, pesoAnimal, sexoAnimal);
    }

    public void hacerSonido(){
        System.out.println("Miau");
    }
}