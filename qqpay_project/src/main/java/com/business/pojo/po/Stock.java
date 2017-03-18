package com.business.pojo.po;

public class Stock {
    private String id;

    private String product_Id;

    private Integer stock_Number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductId() {
        return product_Id;
    }

    public void setProductId(String productId) {
        this.product_Id = productId == null ? null : productId.trim();
    }

    public Integer getStockNumber() {
        return stock_Number;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stock_Number = stockNumber;
    }
}