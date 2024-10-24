package Seccion_B.LSP_solution ;

public class PhysicalProduct extends Product{
    private double weight ;
    
    public PhysicalProduct(String name , double price , String type , double weight){
        super(name, price, type);
        this.weight = weight ;
    }
    
}
