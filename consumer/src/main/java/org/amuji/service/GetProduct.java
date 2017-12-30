package org.amuji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
@Service
public class GetProduct {
    @Autowired
    private RestTemplate rest;

    public String getProduct() {
        ResponseEntity<String> entity = rest.getForEntity("http://localhost:6565/products/2", String.class);
        return entity.getBody();
    }
}
