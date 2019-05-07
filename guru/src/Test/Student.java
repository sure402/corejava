package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

 interface Demo1 {

	void average(float sub1, float sub2, float sub3) throws Exception;
	String name(String name) ;
	
}

 class Student implements Demo1{
	
	

	public void average(float sub1, float sub2, float sub3) throws Exception  {
		// TODO Auto-generated method stub
		 

	try{
		float sum = sub1+sub2+sub3;
		System.out.println("Total subject marks:"+ " "+ sum);
		int avg = (int) (sum/3);
		System.out.println("Average :"+" "+avg);
	if(avg>50){
		System.out.println("passed");
	
	}else{
		throw new MyException("failed", "F");
	}
	}catch(InputMismatchException e){
		
		throw new MyException("failed", "F");
		} 
	
				
	}	
		
	
	public String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
	public static void main(String args[]) throws Exception{  
		try{
			Student obj = new Student();  
		
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter sub1:");
		 float sub1 = scan.nextFloat();
		 System.out.println("Enter sub2:");
		 float sub2 = scan.nextFloat();
		 System.out.println("Enter sub3:");
		 float sub3 = scan.nextFloat();
		obj.average(sub1, sub2, sub3); 
		String name = obj.name("suresh");
		System.out.println("name"+ name);
		  
		 }catch(Exception e){
			 e.printStackTrace();
			 throw new MyException("Enter correct input", "Enter correct float no");
		 }
		}
	private static class MyException extends Exception {
	    // You exception details
	    public MyException(String message, String msg) {
	        super(message);
	    }
	}
 }
 

	

 
