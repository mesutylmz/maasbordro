package com.eb.maasbordro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.maasbordro.model.Bordro;
import com.eb.maasbordro.model.Personel;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	
	List<Personel> findBytcNoAndSifre(String tcNo,String sifre);

}
