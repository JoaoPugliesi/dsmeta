package io.github.joaopugliesi.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.joaopugliesi.dsmeta.entity.Sale;
import io.github.joaopugliesi.dsmeta.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale>findSales() {
		return repository.findAll();
	}
}
