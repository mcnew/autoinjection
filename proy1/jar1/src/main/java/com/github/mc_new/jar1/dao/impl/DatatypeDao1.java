package com.github.mc_new.jar1.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.dao.DatatypeDao;

@Service
public class DatatypeDao1 implements DatatypeDao {

	private static final List<Datatype> LIST = Arrays.asList(new Datatype(true, "alpha", "SPAIN"),
			new Datatype(true, "beta", "SPAIN"), new Datatype(false, "iota", "SPAIN"),
			new Datatype(true, "gama", "SPAIN"));

	public List<Datatype> list() {
		return LIST;
	}

}
