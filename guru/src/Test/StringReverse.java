package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s ="suresh";
	String rev ="";
	int len = s.length();
	String s1 ="";
	System.out.println(len);
	StringBuilder s11 = new StringBuilder(len);
	for(int i=len-1; i>=0; i--){
		
		char c =s.charAt(i);
	
		 s1 =s11.append(c).toString();
		System.out.println(s1);
		 
	}
		
	List<String> li = new ArrayList<String>();
	List<String> revli = new ArrayList<String>();
	li.add("suresh");
	li.add("naveen");
	li.add("kishore");
//	Iterator it = li.iterator();
//	while(it.hasNext()){
//		
//		String n = (String) it.next();
//		System.out.println(n);
//		
//		
//	}
	System.out.println(li);
	
	
	    for (int i = li.size() - 1; i >= 0; i--) {
	        revli.add(li.get(i));
	    }
	    System.out.println(revli);
	   
	
	
	}
	
	
		

}
