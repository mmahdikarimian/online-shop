package ir.vanosheeh.onlineshop.services;

import ir.vanosheeh.onlineshop.models.Product;
import ir.vanosheeh.onlineshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }


    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    public List<Product> getAll()
    {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(product -> productList.add(product));
        return productList;
    }
}