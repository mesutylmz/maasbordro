package com.eb.maasbordro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.maasbordro.model.Bordro;

@Repository
public interface BordroRepository extends JpaRepository<Bordro, Integer> {
	
	List<Bordro> findByPindAndDind(Integer pind,Integer dind);

}
