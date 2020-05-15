package com.github.mc_new.jar2.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.dao.DatatypeDao;
import com.github.mc_new.jar0.service.DatatypeService;

@Primary
@Service
public class DatatypeService2 implements DatatypeService {

	private static final Logger LOGGER = Logger.getLogger(DatatypeService2.class.getName());

	@Autowired
	private DatatypeDao dao;

	@Override
	public List<Datatype> getList() {
		LOGGER.info("llamando sericio especial");
		List<Datatype> source = dao.list();
		List<Datatype> target = new LinkedList<>();
		for (Datatype bean : source) {
			if (bean.isRequired()) {
				target.add(bean);
			}
		}
		return target;
	}

}
