package online_shop.repositories;

import org.springframework.stereotype.Component;
import online_shop.entities.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productsList;

    @PostConstruct
    public void init(List<Product> productsList) {
        this.productsList = new ArrayList<>();
        productsList.add(new Product(1, "Calendar", 200));
        productsList.add(new Product(2, "JAVA book", 1500));
        productsList.add(new Product(3, "Pencil", 15));
    }

    public Product findProductById(int id) {
        for (Product product : productsList) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product> findAll(){
        return productsList;
    }

    public Product addProduct(Product product){
        productsList.add(product);
        return product;
    }
}
