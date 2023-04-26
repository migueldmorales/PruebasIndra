package com.consulta.precio.aplicable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.consulta.precio.aplicable.entity.Prices;
import com.consulta.precio.aplicable.interfaces.PriceRepository;
import com.consulta.precio.aplicable.model.PriceInRequest;



@Service
public class PricesService {

	@Autowired
	private PriceRepository priceRepository;

//	public ResponseEntity<Prices> findByIdsAndDate(PriceInRequest prices) {
//		return priceRepository.findByIdAndDate(prices);
//	}

	public List<Prices> findAll() {
		return priceRepository.findAll();
	}

	
}
