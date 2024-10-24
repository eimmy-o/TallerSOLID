package Seccion_A ;

public class Impresora {
    private String modelo;
    private boolean conectada;

    public Impresora(String modelo) {
        this.modelo = modelo;
        this.conectada = false;
    }

    public void imprimir(String documento) {
        if (conectada) {
            System.out.println("Imprimiendo: " + documento);
        } else {
            System.out.println("Error: La impresora no está conectada.");
        }
    }

    public void conectar() {
        conectada = true;
        System.out.println("Impresora " + modelo + " conectada.");
    }

    public void desconectar() {
        // Lógica para desconectar la impresora
        conectada = false;
        System.out.println("Impresora " + modelo + " desconectada.");
    }

}

