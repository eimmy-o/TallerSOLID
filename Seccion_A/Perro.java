package Seccion_A ;

public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los perros no pueden volar.");
    }

}
