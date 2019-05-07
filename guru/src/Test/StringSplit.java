package Test;

import java.io.File;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "sureshnaveenharishramesh";
		
		String [] temp = name.split("n");
		String temp0 = temp[0];
		String temp1 = temp[1];
		String temp2 = temp[2];
		
		String temp01[] = temp2.split("i");
		String temp3 = temp01[0];
		String temp4 = temp01[1];
		String temp5 = "n"+temp1+"n"+temp3;
		
		
		System.out.println("temp0"+ temp0);
		
		System.out.println("temp1"+ temp1);
		System.out.println("temp2"+ temp2);
		System.out.println("temp3"+ temp3);
		System.out.println("temp4"+ temp4);
		System.out.println("temp5"+ temp5);
		
		
		int i = Integer.parseInt(name);
		System.out.println(i);
		
			
	}
}
