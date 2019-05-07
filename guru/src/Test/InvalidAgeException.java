package Test;

public class InvalidAgeException extends Exception {

	private String string2;

	public InvalidAgeException(String s, NumberFormatException m) {
		// TODO Auto-generated constructor stub
		super (s);
	}

	public InvalidAgeException(String s, Exception m,
			String string2) {
		// TODO Auto-generated constructor stub
		super(s, m );
		this.string2= string2;
		System.out.println(string2);
	}
	
	public String getString2(){
		return this.string2;
	}
}
