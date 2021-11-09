package com.kaiofanjos.kfvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.kfvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
