package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
//Learning from suresh dada
//write a program to sum agiven eg 123456: 12345 = 15
// write a progr to remove duplicate strings eg: asgadhgdfhdfhdfhsfagrhsfasgershsdgdsfh;
// Write a prog , l1=["A","B","c","D","E","F","G"],l2=[0,3,6]
//remove objects from l1 using l2 objects , print output of l1
// install mySql and drivers
public class CodeTest {
	
	
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		int no;
		int count = 0;
		int temp;
		
		System.out.println("Enter value:");
		 no= sc.nextInt();
		System.out.println("no"+ no);
		//for(int i=0; i<n)//
		while(no>0){
			temp = no%10;
			System.out.println("temp"+temp);
			count = count+temp;
			System.out.println("count"+ count);
			no = no/10;
			System.out.println("no"+no);
		}
		System.out.println(count);
		
		// pgm2:
	 String value = "aasrqkggrotrevamtabvmeowmzhotmc";
	 char s[]= value.toCharArray();
	 Set<Character> set = new LinkedHashSet<Character>();
	 for(char val:s){
		 
		set.add(val);
	 }
	 System.out.println(set);
		StringBuilder sb = new StringBuilder();
		for(Character temp1:set){
			sb.append(temp1);
		}
		System.out.println(sb.toString());
		String output = "";
	for(int i=0; i<value.length();i++){
		if(!output.contains(String.valueOf(value.charAt(i)))){
			output += String.valueOf(value.charAt(i));
		}
	}
	System.out.println(output);
	
	
	String []l1={"A","B","c","D","E","F","G"};
	int []l2={0,3,6};
	
	List<String> list = new ArrayList<String>(Arrays.asList(l1));

	System.out.println(list.size());

	Iterator it = list.iterator();
	int count1 =0;
	while(it.hasNext())
	{
		String b = (String) it.next();
		for(int j =0;j<l2.length;j++)
		{
			if(count1==l2[j])
			it.remove();
		}
		count1++;
		
	}
	
		System.out.println(list);
		
 List<Integer> lis = new ArrayList<Integer>();
 lis.add(1);
 lis.add(2);
 
 
 
	
 List li = new ArrayList(); 
 li.add(10.10);
 li.add("suresh");
 
 lis.addAll(li);
 System.out.println(lis.size());
System.out.println(lis);
	}
	



	

	
	
}


