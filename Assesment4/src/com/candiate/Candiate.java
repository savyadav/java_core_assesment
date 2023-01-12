package com.candiate;

public class Candiate{
	 String Name;
	 int age;
	 String education;
	public void validateAge(int age)
	{
	     try {
	   if(age < 21) 
	    throw new AgeException("Invalid under age");
	   else if(age>60)
	    throw new AgeException("Invalid over age");
	  }
	  catch (AgeException a) {
	   System.out.println(a);
	  }
	}


	public void validateEducation(String education)
	{
	     try {
	   if(education=="Btech") 
	    System.out.println("Valid edcuation");
	   else
	    throw new EducationException("Invalid Education");
	  }
	  catch (EducationException a) {
	   System.out.println(a);
	  }
	}
	}