package com.example.demo.Service;


import com.example.demo.Model.Products;
import com.example.demo.dto.ProductCreateRequest;
import com.example.demo.dto.ProductUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServicelmpl implements ProductService {
    private final List<Products> productList = new ArrayList<>();
    public void ProductServiceImpl() {
        productList.add(new Products(1, "iPhone 14", 20000));
        productList.add(new Products(2, "Samsung Galaxy S23", 18000));
        productList.add(new Products(3, "Xiaomi Redmi Note 12", 6000));
    }

    @Override
    public List<Products> getAllProducts() {

        return productList;
    }

    @Override
    public Products getProductById(int id) {
        return productList.stream().filter(n -> n.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Products> searchProducts(String name) {
        return productList.stream().filter(p -> p.getName().equals(name)).toList();
    }

    @Override
    public Products createProduct(ProductCreateRequest req) {
        Products product = new Products (
                (productList.size()+1),
                req.getName(),
                req.getPrice()
                );

                productList.add(product);
                return product;


    }

    @Override
    public Products updateProduct(int id, ProductUpdateRequest req) {
        for (Products product : productList) {
            if (product.getId()==(id)) {
                product.setName(req.getName());
                product.setPrice(req.getPrice());
                return product;
            }
        }
        return null;

    }

    @Override
    public Boolean deleteProduct(int id) {
        return productList.removeIf(a -> a.getId()==(id));
    }

}
