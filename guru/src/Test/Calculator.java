package Test;

import java.util.Scanner;

 class Calculator {
	 static double input1;
	 static double input2;
 Calculator(){
		System.out.println("default constructor"); 
	 }
 Calculator(double input1, double input2){
	 this.input1 = input1;
	 this.input2 = input2;
		System.out.println("default constructor"); 
	 }
	public static void main(String[] args) {
		
	  Calculator cal = new  Calculator(2.5, 3.5);
			 
	mathdemo math = new mathdemo();
	

	
	
	double addition;
	 Double d = new Double(2.5);
	 
		addition = math.add1(2.5, 2.5);
	double addition1 = math.add(math.setInputA(2.5), 1.5, 2.5);
		System.out.println("Addition:"+" "+ addition);
		System.out.println("Addition:"+" "+ addition1);
		
//		double mul = math.multiply(2.5, 2.5);
		double mul = math.multiply(input1, input2);
		System.out.println("multiplication:"+" "+ mul);
	}
}


class maths{
	private double inputA; 
	public double getInputA() {
		return inputA;
	}

	public double setInputA(double inputA) {
		return this.inputA = inputA;
	}

	public double getInputB() {
		return inputB;
	}

	public void setInputB(double inputB) {
		this.inputB = inputB;
	}

	private double inputB;
	
	 double add(double a, double b, double c) {
	        double answer = a+b+c;
	        return answer;          
	    }

	    double subtract(double a, double b) {
	        double answer = a-b;
	        return answer;          
	    }

	    double multiply(double a, double b) {
	        double answer = a*b;
	        return answer;          
	    }

	    double divide(double a, double b) {
	        double answer = a/b;
	        return answer;          
	    }

	    double power(double a, double b){
	        double answer =a;

	        for (int x=2; x<=b; x++){
	            answer *= a;
	        }

	        return answer;
	    }
	    
	
}
class mathdemo extends maths{
	
	double add1(double a, double b) {
        double answer = a+b;
        return answer;          
    }
	double add(double a, double b) {
        double answer = a+b;
        return answer;          
    }
}
