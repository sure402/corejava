package Test;

 class InheritanceDemoClass {
	
	public String abc(String name){
		return name;
	
		
	}
	
}

class Inheritance extends InheritanceDemoClass{ 

	public String xyz(String name){
		return name;
	
		
	}
		
	
}

class InheritanceDemo {
	public static void main(String args[]){
		Inheritance demo = new Inheritance();
		System.out.println("@@@"+ demo.abc("suresh"));
		System.out.println("@@@"+ demo.xyz("Naveen"));
		
		
		
	}
	
	
	
}