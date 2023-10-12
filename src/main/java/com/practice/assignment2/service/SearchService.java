package com.practice.assignment2.service;



import java.util.List;

import com.practice.assignment2.entity.Tshirt;

public interface SearchService {
	public List<Tshirt> searchInDb(Tshirt itTshirt);
}
