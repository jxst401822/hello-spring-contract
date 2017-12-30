package org.amuji.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    ProductRepo repo;

    @GetMapping("{id}")
    public Product get(@PathVariable Long id) {
        return repo.get(id);
    }

    @GetMapping
    public ResponseEntity<?> getAll(@RequestParam String c1) {
        List<Product> products = Arrays.asList(
                new Product(4L, "Haha"),
                new Product(5L, "Lala")
        );

        Map<String, Object> result = new HashMap<>();
        result.put("content", products);
        result.put("total", 2);
        if (c1 != null) {
            result.put("c1", c1);
        }
        return ResponseEntity.ok(result);
    }

    public ProductController setRepo(ProductRepo repo) {
        this.repo = repo;
        return this;
    }
}
