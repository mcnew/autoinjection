package com.github.mc_new.jar2.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.dao.DatatypeDao;

@Service
public class DatatypeDao2 implements DatatypeDao {

	private static final List<Datatype> LIST = Arrays.asList(new Datatype(true, "one", "US"),
			new Datatype(false, "two", "US"),
			new Datatype(true, "three", "US"));

	public List<Datatype> list() {
		return LIST;
	}

}
