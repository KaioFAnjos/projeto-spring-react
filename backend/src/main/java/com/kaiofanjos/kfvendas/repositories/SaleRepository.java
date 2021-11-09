package com.kaiofanjos.kfvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.kfvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
