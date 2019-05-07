package Test;

public class TestCustomException1 {
	  static void div(int no)throws InvalidAgeException{  
	//	       int c = no/0;
	//	      throw new InvalidAgeException("not valid" );  
		      
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		      div(13);  
		      }catch(Exception m){System.out.println("Exception occured: "+m);}  
		  
		      System.out.println("rest of the code...");  
		  } 

}
