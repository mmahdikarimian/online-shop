package ir.vanosheeh.onlineshop.repositories;

import ir.vanosheeh.onlineshop.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
