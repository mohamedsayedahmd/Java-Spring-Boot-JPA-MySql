package com.javatechie.springbootcrudexample.controller;

import com.javatechie.springbootcrudexample.entity.Product;
import com.javatechie.springbootcrudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @PostMapping("/add-products")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return  productService.getProducts();
    }
    @GetMapping("/product-by-id/{id}") // if not exist you will get 404 (that why to use pathvariable rather than using Request Parameters)
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @GetMapping("/product-by-name/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
