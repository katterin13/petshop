package com.workshop.petshop.dataprovider.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;


@Entity(name = "INVENTARY")
public class MInventary {

    @Id
    private String id;

    @ManyToOne
    private MProduct product;

    @Column
    private Integer amount;

    @Column
    private Integer price;

    @Column
    private Boolean available;


    public MInventary() {
    }

    public MInventary(String id, MProduct product, Integer amount, Integer price, Boolean available) {
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

    public MProduct getProduct() {
        return this.product;
    }

    public void setProduct(MProduct product) {
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

    public MInventary id(String id) {
        setId(id);
        return this;
    }

    public MInventary product(MProduct product) {
        setProduct(product);
        return this;
    }

    public MInventary amount(Integer amount) {
        setAmount(amount);
        return this;
    }

    public MInventary price(Integer price) {
        setPrice(price);
        return this;
    }

    public MInventary available(Boolean available) {
        setAvailable(available);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MInventary)) {
            return false;
        }
        MInventary inventary = (MInventary) o;
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
