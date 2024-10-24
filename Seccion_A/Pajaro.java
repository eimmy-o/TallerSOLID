package Seccion_A ;

public class Pajaro implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Pío!");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}
