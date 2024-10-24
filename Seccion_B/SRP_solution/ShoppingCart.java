package Seccion_B.SRP_solution;

import java.util.List;
import Seccion_B.LSP_solution.Product;

public class ShoppingCart {
    private List<Product> products ;
    
    public void addProduct(Product product){
        products.add(product) ;
    }
    
    public void romoveProduct(Product product){
        products.remove(product) ;
    }
    
    
}
