package com.brainelixir.ecomm.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "orders")
public class Order {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String zip;
    private String status;
    private String comment;
    private Number totalPrice;
    private String type;
    private LocalDate created;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonBackReference
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
//    @JsonBackReference(value = "product_reference")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    public GroupVariant getGroupVariant() {
        return groupVariant;
    }

    public void setGroupVariant(GroupVariant groupVariant) {
        this.groupVariant = groupVariant;
    }

}
