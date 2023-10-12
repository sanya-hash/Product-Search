package com.practice.assignment2.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.practice.assignment2.dao.TshirtDao;
import com.practice.assignment2.daoImpl.TshirtDaoImpl;
import com.practice.assignment2.entity.Tshirt;
import com.practice.assignment2.service.SearchService;

public class SearchServiceImpl implements SearchService {
	public List<Tshirt> searchInDb(Tshirt itshirt) {
		List<Tshirt> tshirts= new ArrayList<Tshirt>();
		TshirtDao td= new TshirtDaoImpl();
		tshirts=td.fetchFromDb(itshirt);
		return tshirts;
	}
}
