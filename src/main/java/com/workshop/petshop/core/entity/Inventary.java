package com.workshop.petshop.core.entity;

import java.util.Objects;

public class Inventary {

    private String id;
    private Product product;
    private Integer amount;
    private Integer price;
    private Boolean available;

    public Inventary() {
    }

    public Inventary(String id, Product product, Integer amount, Integer price, Boolean available) {
        this.id = id;
        this.product = product;
        this.amount = amount;
        this.price = price;
        this.available = available;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean isAvailable() {
        return this.available;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Inventary id(String id) {
        setId(id);
        return this;
    }

    public Inventary product(Product product) {
        setProduct(product);
        return this;
    }

    public Inventary amount(Integer amount) {
        setAmount(amount);
        return this;
    }

    public Inventary price(Integer price) {
        setPrice(price);
        return this;
    }

    public Inventary available(Boolean available) {
        setAvailable(available);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Inventary)) {
            return false;
        }
        Inventary inventary = (Inventary) o;
        return Objects.equals(id, inventary.id) && Objects.equals(product, inventary.product) && Objects.equals(amount, inventary.amount) && Objects.equals(price, inventary.price) && Objects.equals(available, inventary.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, amount, price, available);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", product='" + getProduct() + "'" +
            ", amount='" + getAmount() + "'" +
            ", price='" + getPrice() + "'" +
            ", available='" + isAvailable() + "'" +
            "}";
    }
    
}
