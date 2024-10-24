package Seccion_B.OCP_solution ;

public class IvaCalculator {
    
    public double calculateIva(Product p){
        return p.getPrice() * p.getIva() ;
    }
    
}
