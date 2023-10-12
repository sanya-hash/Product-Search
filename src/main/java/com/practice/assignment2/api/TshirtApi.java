package com.practice.assignment2.api;




import java.util.ArrayList;
import java.util.List;

import com.practice.assignment2.entity.Tshirt;
import com.practice.assignment2.service.DisplayService;
import com.practice.assignment2.service.InputService;
import com.practice.assignment2.service.ReaderService;
import com.practice.assignment2.service.SearchService;
import com.practice.assignment2.serviceImpl.DisplayServiceImpl;
import com.practice.assignment2.serviceImpl.InputServiceImpl;
import com.practice.assignment2.serviceImpl.ReaderServiceImpl;
import com.practice.assignment2.serviceImpl.SearchServiceImpl;



public class TshirtApi {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ReaderService rs= new ReaderServiceImpl();
		 rs.read();
		 
		 InputService is= new InputServiceImpl();
			Tshirt itshirt;
			itshirt=is.receiveInput();
			
			SearchService ss= new SearchServiceImpl();
			List<Tshirt> dataList= new ArrayList<Tshirt>();
			dataList=ss.searchInDb(itshirt);

			DisplayService ds= new DisplayServiceImpl();
			ds.display(dataList);
			
			
			
	}

}
