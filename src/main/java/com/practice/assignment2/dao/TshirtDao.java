package com.practice.assignment2.dao;

import java.util.ArrayList;
import java.util.List;

import com.practice.assignment2.entity.Tshirt;

public interface TshirtDao {
	public void insertData(ArrayList<Tshirt> tshirts);
	public List<Tshirt> fetchFromDb(Tshirt userData);
}
