package com.timber.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timber.system.entity.Berco;

@Repository
public interface BercoRepository extends JpaRepository<Berco, Integer> {

}
