package com.consulta.precio.aplicable.model;

import java.time.LocalDateTime;

public class PriceInRequest {
	public LocalDateTime date;
	public int productId;
	public int brandId;
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	
	public PriceInRequest(LocalDateTime date, int productId, int brandId) {
		super();
		this.date = date;
		this.productId = productId;
		this.brandId = brandId;
	}
	
	
	
}
