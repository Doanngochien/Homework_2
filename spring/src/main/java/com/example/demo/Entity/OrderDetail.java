package com.example.demo.Entity;

import com.example.demo.Model.Products;
import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer quantity;

    // MANY OrderDetail → ONE Order
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)   // FK vào bảng orders
    private Order order;

    // MANY OrderDetail → ONE Product
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false) // FK vào bảng products
    private Products product;

    public OrderDetail() {}

    public OrderDetail(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

}
