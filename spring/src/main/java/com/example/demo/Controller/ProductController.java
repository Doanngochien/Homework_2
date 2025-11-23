package com.example.demo.Controller;

import com.example.demo.Model.Products;
import com.example.demo.Service.ProductService;
import com.example.demo.dto.ProductCreateRequest;
import com.example.demo.dto.ProductUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    // bai1
    @GetMapping
    public List<Products> getAllProducts() {

        return productService.getAllProducts();
    }
    //bai2
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id) {
        Products p = productService.getProductById(id);
        if (p == null) return ResponseEntity.badRequest().body("Product not found!");
        return ResponseEntity.ok(p);
    }
    //bai3
    @GetMapping("/search")
    public List<Products> searchProducts(@RequestParam String name) {
        return productService.searchProducts(name);
    }
    //bai4
    @PostMapping
    public Products createProduct(@RequestBody ProductCreateRequest req) {
        return productService.createProduct(req);
    }
    //bai5
    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable int id, @RequestBody ProductUpdateRequest req){
        return productService.updateProduct(id,req);
    }
    //bai6
    @DeleteMapping("/{id}")
    public Boolean deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }


}
