package org.amuji;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.amuji.product.Application;
import org.amuji.product.Product;
import org.amuji.product.ProductController;
import org.amuji.product.ProductRepo;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 * Xiangrong Yang
 * 04/10/2017
 */
@Ignore
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class HelloBase {
    @Autowired
    WebApplicationContext wac;

    @MockBean
    ProductRepo repo;

    @Before
    public void setup() {
        BDDMockito.given(this.repo.get(2L)).willReturn(new Product().setId(2L).setName("Dummy Product"));
        RestAssuredMockMvc.webAppContextSetup(wac);
    }
}
