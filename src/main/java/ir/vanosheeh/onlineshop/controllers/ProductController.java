package ir.vanosheeh.onlineshop.controllers;

import ir.vanosheeh.onlineshop.models.Product;
import ir.vanosheeh.onlineshop.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getProducts() {

        return productService.getAll();
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody @Valid Product product, BindingResult result)
    {
        if (result.hasErrors())
        {
            return result.toString();
        }
        productService.addProduct(product);
        return "OK!";
    }
}
