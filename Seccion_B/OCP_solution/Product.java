package Seccion_B.OCP_solution ;

public class Product {
    protected double iva ;
    protected double price ;
    
    public Product(double i , double p){
        iva = i ;
        price = p ;
    }

    public double getIva() {
        return iva;
    }

    public double getPrice() {
        return price;
    }
    
    
}
