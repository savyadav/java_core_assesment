package com.candiate;

import java.util.Scanner;

public class AgeMain {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		System.out.print("Enter ur education :: ");
		  String education = s.next();
		Candiate candiate=new Candiate();
		candiate.validateAge(age);
		candiate.validateEducation(education);

		  
		 
		 }
		}