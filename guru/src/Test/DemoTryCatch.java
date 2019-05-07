package Test;

import java.io.IOException;

public class DemoTryCatch extends Exception {

	
	
	public DemoTryCatch(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	int a = 2;
	int b = 3;
	
	
	try{
		
		int c = Integer.valueOf(null);
		System.out.println("add"+c);
	}catch(Exception e){
//	throw new Exception("somthomg", EbayException.class);
		// write a program to create exception super class and handle null pointer, numberformat exception display.
		
		e.printStackTrace();
		
	}
		
	}
	
	

}
