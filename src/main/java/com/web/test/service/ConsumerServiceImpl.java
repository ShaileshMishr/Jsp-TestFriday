package com.web.test.service;

import java.util.List;


import com.web.test.dao.ConsumerDao;
import com.web.test.dao.ConsumerDaoImpl;
import com.web.test.model.Electric;

public class ConsumerServiceImpl implements ConsumerService{

	ConsumerDao dao = new ConsumerDaoImpl();
	@Override
	public boolean isValidId(int meterId) {

		boolean isValid = false;
		List<Electric> elecList = dao.getData();
		
		for(Electric elec:elecList) {
			if(elec.getMeterId()==meterId) {
				isValid = true;
			}
		}
		
		return isValid;
	}

	@Override
	public List<Electric> getData() {
		List<Electric> elecList = dao.getData();
		return elecList;
	}



}
