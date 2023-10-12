package com.practice.assignment2.serviceImpl;

import java.util.Scanner;

import com.practice.assignment2.entity.Tshirt;
import com.practice.assignment2.service.InputService;
 
public class InputServiceImpl implements InputService{
	 public Tshirt receiveInput() {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the color of tshirt");
		 String color=sc.nextLine();
		
		 System.out.println("Enter the size of tshirt");
		 String size= sc.nextLine();
		 
		 System.out.println("Enter the gender recommendation:(Male[M]/Female[F]/Unisex[U])");
		 String gender=sc.nextLine();
		 
		 System.out.println("Enter the output preference");
		 String out_pref= sc.nextLine();
		 
		 return new Tshirt(color,gender,size,out_pref);
	 }
	 }
