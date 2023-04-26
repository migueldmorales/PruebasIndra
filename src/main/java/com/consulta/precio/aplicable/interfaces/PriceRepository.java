package com.consulta.precio.aplicable.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consulta.precio.aplicable.entity.Prices;



@Repository
public interface PriceRepository extends JpaRepository<Prices, Integer>{

	
//	public interface RegistroRepository extends JpaRepository<Registro, Long> {
//	    @Query("SELECT p.PRODUCT_ID, p.BRAND_ID, p.PRICE_LIST, p.START_DATE, p.END_DATE FROM PRICE p WHERE :fechaBusqueda BETWEEN r.startDate AND r.endDate")
//	    List<Registro> buscarPorFecha(@Param("fechaBusqueda") LocalDate fechaBusqueda);
	    
}
