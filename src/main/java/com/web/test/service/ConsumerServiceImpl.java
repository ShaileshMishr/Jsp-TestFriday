package com.web.test.service;

import java.util.List;

import com.web.test.dao.ConsumerDao;
import com.web.test.dao.ConsumerDaoImpl;
import com.web.test.model.Electric;

public class ConsumerServiceImpl implements ConsumerService{

	

	public boolean isValidId(int meterId) {
		ConsumerDao dao = new ConsumerDaoImpl();
		boolean isValid = false;
		List<Electric> elecList1 = dao.getData();
		
		for(Electric elec:elecList1) {
			if(elec.getMeterId()== meterId) {
				isValid = true;
			}
		}
		
		return isValid;
	}

}
