package com.github.mc_new.web0.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.service.DatatypeService;

@RestController
public class Controller0 {

	private static final Logger LOGGER = Logger.getLogger(Controller0.class.getName());

	@Autowired
	private DatatypeService service;

	@GetMapping(path = "/controller")
	public ResponseEntity<List<Datatype>> list() {
		LOGGER.info(service.getClass().getName());
		return ResponseEntity.ok(service.getList());
	}

}
