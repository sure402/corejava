package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



interface BankImp{
	
	 public HashMap<Integer, Float> createAccount(Map<Integer, Float> map, int amount);
	 public  float deposit(float amount, float balance);
	 public float  withDraw(float amount, float balance);
	 public float checkBalance(float amount);
	 public HashMap<Integer, Float>closeAccount(HashMap<Integer, Float> accountNo);
	 
	
	   
}


 class CreateBankAccount implements BankImp{
	 static float balance = 0;
	 static float depositedAmount1;
	 static float withDrawAmount;
		static float amount ;
		static int customerChoice;
		static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws MyException {

		CreateBankAccount ba = new CreateBankAccount();
		Scanner sc = new Scanner(System.in);
	
		String opt;
		
		
		System.out.println("Are you an existing customer with bank?");
		 opt = sc.next();
//		 List<Integer> list = new ArrayList<Integer>();
//		 do {
		if(opt.equalsIgnoreCase("Y")) {
			
			System.out.println("Welcome to stuartpuram bank.Please enter account no:");
			Map<Integer, Float> map = new HashMap<Integer, Float>();
			 List<Integer> list = new ArrayList<Integer>();
				map.put(123456789, (float) 100);
				map.put(12345678, (float) 10);
				map.put(1234567, (float) 1);
			int no = sc.nextInt();
			int temp=0;
			 for(int acno : map.keySet()) {
				 float value = map.get(acno);
				 
//		            System.out.println("key: " + acno);
			 temp=acno;
			 if(acno==no) {
				 ba.actions(no, value);
			 }
				else {
					 System.out.println("account not existing");
//					 break;
				}
			 }
//			 for(int values : m()) 
//			 for (Entry<Integer, Float> entry : map.entrySet()) {
////			        System.out.println(entry.getKey() + " - " + entry.getValue());
//			        list.add(entry.getKey());
//			        
//			    }
//			 for(int i=0; i<list.size(); i++) {
//					
//					int key = list.get(i);
//					
//					
//				if (key == no) {
////					ba.actions(no, 1);
//
//			}
//				
//				else {
//				 System.out.println("account not existing");
////				 break;
//			}
//				
//			 }
//			 System.out.println("account not existing");
	
		}
		
		else if(opt.equalsIgnoreCase("N")){
			 Map<Integer, Float> map = new HashMap<Integer, Float>();
			System.out.println("DO you want to create account?");
			opt = sc.next();
			if(opt.equalsIgnoreCase("y")) {
				
			Random rand = new Random();
			int  n = rand.nextInt(123456789) + 2;
		
//			map.put(n, (float) 100);
			System.out.println("maplen"+ map);
			System.out.println("hoola Account is created");
			System.out.println("Do you want to continue?");
			opt = sc.next();
			if(opt.equalsIgnoreCase("y")) {
				System.out.println("enter amount to open the account");
				float scn = sc.nextFloat();
				ba.actions(n, scn);
				
			}
			}
			
		}
//		}
//		while(!opt.equalsIgnoreCase("Y") || !opt.equalsIgnoreCase("N"));
	}

	private static class MyException extends Exception {
	    // You exception details
	    public MyException(String message) {
	        super(message);
	    }
	}

	 public HashMap<Integer, Float>createAccount(Map<Integer, Float> map, int amount){
		 Map<Integer, Float> bankAccs = map;
		 
		 bankAccs.put(1234567890, (float) amount);
		 return (HashMap<Integer, Float>) bankAccs;
	 }
	 public float deposit(float amount, float balance) {
	
		 float balance1 = amount+ balance;
		 return balance1;
	 }
	 public float  withDraw(float amount, float balance) {
		 float balance1 =  balance-amount;
		 return balance1;
	 }
	 public float checkBalance(float amount) {
		
		 return amount;
	 }
	 public HashMap<Integer, Float>closeAccount(HashMap<Integer, Float> accountNo){
		 
		 return accountNo;
	 }
	 public void actions(int acn, float amount) throws MyException {
		
//		 if(userType == "existing") {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("enter no");
//		  int no = sc.nextInt();
//		 }
//		Scanner sc = new Scanner(System.in);
		int no1 = acn;
//		int no = sc.nextInt();
		BankImp ba = new CreateBankAccount();
		 Map<Integer, Float> map = new HashMap<Integer, Float>();
		 List<Integer> list = new ArrayList<Integer>();
			map.put(123456789, (float) 100);
			map.put(12345678, (float) 10);
			map.put(1234567, (float) 1);
			map.put(acn, amount);
		 for(int acno : map.keySet()) 
	            System.out.println("key: " + acno);
		 for (Entry<Integer, Float> entry : map.entrySet()) {
//		        System.out.println(entry.getKey() + " - " + entry.getValue());
		        list.add(entry.getKey());
		        
		    }
		Set<Integer> keySet = map.keySet();
		for(int i=0; i<list.size();i++) {
		Float value = map.get(list.get(i));
		
		System.out.println("values:"+ value);
		}

		for(int i=0; i<list.size(); i++) {
			
			int key = list.get(i);
			
		if( key ==no1){
     	float value1 = map.get(key);
     	System.out.println("Select one of the Option");	
			System.out.println("1. Deposit Money");
			System.out.println("2. WithDraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
		 
     
			do {
				System.out.println("Enter Choice");
				 customerChoice = sc.nextInt();	
			switch(customerChoice){
			case 1:
//				float amount;
				System.out.println("Enter Deposit Amount");
				try{
				amount = sc.nextFloat();
				
				if(amount>0){
				  float depositedAmount = ba.deposit(amount, map.get(key));
				 System.out.println("Total Amount added for the account"+" " + list.get(i)+ "."+" After Deposit total amount is:"+ " "+ depositedAmount);
				 
				map.put(key, depositedAmount);
				System.out.println("sizem"+map.size());
				}else{
					
					 System.out.println("not allowed Negative amount");
				}
				}catch(InputMismatchException e){
					 throw new MyException("Enter correct amount");
					
				}
				
				 break;
				
			case 2:
				
				System.out.println("Enter WithDraw Amount");
				try{
				amount = sc.nextFloat();
				if(amount>0) {
				if(map.get(key) >= amount){
					System.out.println("Valuew"+ map.get(key));
				float withDrawAmount =  ba.withDraw(amount, map.get(key));
				map.put(key, withDrawAmount);
				System.out.println("sizem"+map.size());
				 System.out.println("After WithDraw Remaining Amount:"+ " "+ withDrawAmount);
				}else{
					System.out.println("Insufficient funds");
					} }
				else {
					System.out.println("not allowed Negative amount");
				}
				}catch(InputMismatchException e){
					throw new MyException("Enter correct WithDrawAmount");
				}
				 break;
				
			case 3:
			
				System.out.println(" Current Amount "+ " "+ ba.checkBalance(map.get(key)) );
				break;
			 
			case 4:
				
				 System.out.println(" LogOut"); 
			 
				 break;
			}
			} while(customerChoice!= 4);
			break;
	 }
	 }


	 
	 }
}
