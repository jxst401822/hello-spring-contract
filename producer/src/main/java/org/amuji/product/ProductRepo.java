package org.amuji.product;

import org.springframework.stereotype.Component;

/**
 * Xiangrong Yang
 * 11/10/2017
 */
@Component
public class ProductRepo {
    public Product get(Long id) {
        return new Product().setId(id).setName("Dummy Product 1");
    }
}
