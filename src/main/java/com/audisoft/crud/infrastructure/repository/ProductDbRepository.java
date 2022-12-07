package com.audisoft.crud.infrastructure.repository;


import com.audisoft.crud.infrastructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductDbRepository extends JpaRepository<ProductEntity,Long> {
	
	
}
