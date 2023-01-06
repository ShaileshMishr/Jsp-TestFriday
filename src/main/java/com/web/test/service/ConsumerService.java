package com.web.test.service;

import java.util.List;

import com.web.test.model.Electric;


public interface ConsumerService {

	boolean isValidId(int meterId);

	List<Electric> getData();
}
