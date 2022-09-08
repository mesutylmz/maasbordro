package com.eb.maasbordro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eb.maasbordro.model.Mudurluk;

@Repository
public interface MudurlukRepository extends JpaRepository<Mudurluk, Integer> {

}
