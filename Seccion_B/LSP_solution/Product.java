package Seccion_B.LSP_solution ;

public class Product {
    protected String name ;
    protected double price ;
    protected String type ;
    
    public Product(String name , double price , String type){
        this.name = name ;
        this.price = price ;
        this.type = type ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
