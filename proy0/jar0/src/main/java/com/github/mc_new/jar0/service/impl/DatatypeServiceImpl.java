package com.github.mc_new.jar0.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.mc_new.jar0.bean.Datatype;
import com.github.mc_new.jar0.dao.DatatypeDao;
import com.github.mc_new.jar0.service.DatatypeService;

@Service
public class DatatypeServiceImpl implements DatatypeService {

	@Autowired
	private DatatypeDao dao;

	@Override
	public List<Datatype> getList() {
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
