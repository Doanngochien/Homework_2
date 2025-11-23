package com.example.demo.Service;

import com.example.demo.Model.Products;
import com.example.demo.dto.ProductCreateRequest;
import com.example.demo.dto.ProductUpdateRequest;

import java.util.List;

public interface ProductService {

    List<Products> getAllProducts();

    Products getProductById(int id);

    List<Products> searchProducts(String name);

    Products createProduct(ProductCreateRequest req);

    Products updateProduct(int id, ProductUpdateRequest req);

    Boolean deleteProduct(int id);
}
