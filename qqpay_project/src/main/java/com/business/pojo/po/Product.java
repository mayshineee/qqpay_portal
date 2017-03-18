package com.business.pojo.po;

public class Product {
    private String product_Id;

    private String product_Name;

    private Float product_Price;
    
    private Stock stock;

    public String getProductId() {
        return product_Id;
    }

    public void setProductId(String productId) {
        this.product_Id = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return product_Name;
    }

    public void setProductName(String productName) {
        this.product_Name = productName == null ? null : productName.trim();
    }

    public Float getProductPrice() {
        return product_Price;
    }

    public void setProductPrice(Float productPrice) {
        this.product_Price = productPrice;
    }

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
    
    
}