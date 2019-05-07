package Test;

 class DemoInterface  {
	
	

	public static void main(String args[]) throws InvalidAgeException { 
	      //try {
	    	  formatInt("a");
	      
	         
	     // } catch(Exception e)
	     	   
	   }

	private static void formatInt(String string) throws InvalidAgeException {
		 try{
		int a = Integer.valueOf("a");
		 }
		 catch(Exception m){
			 throw new InvalidAgeException("This is not a valid number", m, "12345");
		 }
	}
	

}
