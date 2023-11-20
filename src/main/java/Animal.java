public abstract class Animal {
    private String nombreAnimal;
    private double pesoAnimal;
    private String sexoAnimal;

    public Animal(String nombreAnimal, double pesoAnimal, String sexoAnimal) {
        this.nombreAnimal = nombreAnimal;
        this.pesoAnimal = pesoAnimal;
        this.sexoAnimal = sexoAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Animal{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", pesoAnimal=" + pesoAnimal +
                ", sexoAnimal='" + sexoAnimal + '\'' +
                '}';
    }
}
