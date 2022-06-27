package com.timber.system.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timber.system.entity.Berco;
import com.timber.system.repositories.BercoRepository;
import com.timber.system.vos.BercoVO;

@Service
public class BercoService {

	@Autowired
	private BercoRepository bercoRepository;
	
	public Berco updateBerco(BercoVO bercoVO) {
		Berco berco = new Berco();
		berco = bercoRepository.findById(bercoVO.getId()).get();
		
		BigDecimal pesoFinal = berco.getPesoAtual().add(bercoVO.getPeso());
		berco.setPesoAtual(pesoFinal);
		berco = bercoRepository.save(berco);
		
		return berco;
	}
}
