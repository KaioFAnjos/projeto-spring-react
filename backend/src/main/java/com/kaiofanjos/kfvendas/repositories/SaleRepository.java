package com.kaiofanjos.kfvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kaiofanjos.kfvendas.dto.SaleSuccessDTO;
import com.kaiofanjos.kfvendas.dto.SaleSumDTO;
import com.kaiofanjos.kfvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.kaiofanjos.kfvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySaller();
	
	@Query("SELECT new com.kaiofanjos.kfvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySaller();
}
