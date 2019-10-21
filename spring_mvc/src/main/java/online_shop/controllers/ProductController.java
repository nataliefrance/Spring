package online_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import online_shop.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8189/app/products/all
    @GetMapping("/all")
    public String showAllProducts(Model model) {
        //достанем все продукты из сервиса и закинем на страничку под ключом "products" и увидим "product-list"
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }


}
