package com.timber.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timber.system.service.BercoService;
import com.timber.system.vos.BercoVO;

@RestController
@RequestMapping("/rest/berco")
public class BercoController {

	@Autowired
	private BercoService bercoService;
	
	@PostMapping(value="/update")
	public ResponseEntity<?> updateBerco(@RequestBody BercoVO bercoVO) {
		
		return new ResponseEntity<>(bercoService.updateBerco(bercoVO), HttpStatus.OK);
		
	}
}
