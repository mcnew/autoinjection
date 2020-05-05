package com.github.mc_new.web0.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.service.DatatypeService;

@RestController
public class Controller1 {

	@Autowired
	DatatypeService service;

	@GetMapping(path = "/controller")
	public ResponseEntity<List<Datatype>> list() {
		return ResponseEntity.ok(service.getList());
	}

}
