package com.practice.assignment2.serviceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.practice.assignment2.dao.TshirtDao;
import com.practice.assignment2.daoImpl.TshirtDaoImpl;
import com.practice.assignment2.entity.Tshirt;
import com.practice.assignment2.service.ReaderService;



public class ReaderServiceImpl implements ReaderService{
	public static final String delimiter = "\\|";
	ArrayList<Tshirt> data = new ArrayList<Tshirt>();
	   public void read() {
		 
	      readFile("C:/Users/hp/Desktop/Assigment Links/Adidas.csv");
	      readFile("C:/Users/hp/Desktop/Assigment Links/Nike.csv");
	      readFile("C:/Users/hp/Desktop/Assigment Links/Puma.csv");
	      //call dao method
	      
	  
	      TshirtDao tdao= new TshirtDaoImpl();
	      tdao.insertData(data);
//	      return data;
	      
	   }
	   public void readFile(String filePath) {
		   try {
		         File file = new File(filePath);
		         FileReader fr = new FileReader(file);
		         BufferedReader br = new BufferedReader(fr);
		         String line = "";
		         String[] tempArr;
		         int counter = 1;
		         while((line = br.readLine()) != null) {
		            if(counter>1) {
		            	tempArr = line.split(delimiter);
			            Tshirt ts= new Tshirt(tempArr[0],tempArr[1],tempArr[2],tempArr[3],
			            		tempArr[4],Double.parseDouble(tempArr[5]),
			            		Double.parseDouble(tempArr[6]),tempArr[7]);
			            data.add(ts);
		            }
		            counter++;
		         }
		    
		         br.close();
		         } catch(IOException ioe) {
		            ioe.printStackTrace();
		         }
	   }
}
