package com.eb.maasbordro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.maasbordro.model.Donemler;

@Repository
public interface DonemlerRepository extends JpaRepository<Donemler, Integer> {

}
