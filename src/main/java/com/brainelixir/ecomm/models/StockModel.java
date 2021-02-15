package com.brainelixir.ecomm.models;

public class StockModel {

    public String product_name = "";
    public String variant_name = "";
    public Integer stock = 0;

    public StockModel(String product_name, String variant_name, Integer stock) {
        this.product_name = product_name;
        this.variant_name = variant_name;
        this.stock = stock;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getVariant_name() {
        return variant_name;
    }

    public void setVariant_name(String variant_name) {
        this.variant_name = variant_name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
