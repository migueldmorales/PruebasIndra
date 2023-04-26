package com.consulta.precio.aplicable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.precio.aplicable.entity.Prices;
import com.consulta.precio.aplicable.model.PriceInRequest;
import com.consulta.precio.aplicable.service.PricesService;

@RestController
public class PricesController {

	
	@Autowired
	PricesService pricesService;
	
	
//	@GetMapping("/")
//	public ResponseEntity<Prices> findByIdsAndDate(@RequestBody PriceInRequest prices) {
//		return pricesService.findByIdsAndDate(prices);
//	}
	
    @GetMapping("/list")
    public List<Prices> getAllProducts() {
        return pricesService.findAll();
    }
}
