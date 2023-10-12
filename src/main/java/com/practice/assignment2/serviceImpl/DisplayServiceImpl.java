package com.practice.assignment2.serviceImpl;

import java.util.List;

import com.practice.assignment2.entity.Tshirt;
import com.practice.assignment2.service.DisplayService;

public class DisplayServiceImpl implements DisplayService{
	public void display(List<Tshirt> tshirt) {
		for(Tshirt t :tshirt) {
			System.out.println(t);
		}

	}

}
