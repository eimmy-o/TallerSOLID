package Seccion_C ;

public class Factura {
    private double iva ;
    private double monto ;
    
    public Factura(double iva , double m){
        this.iva = iva ;
        monto = m ;
    }
    
    public double calcularIvaFactura(){
        return iva*monto ;
    }
    
    public void generarFactura(){
        System.out.println("Generando factura");
    }
    
}
