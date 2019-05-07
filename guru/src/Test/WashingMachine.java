package Test;

// create a washing machine class with methods as switchOn, acceptClothes, acceptDetergent, switchOff
// acceptClothes accept the no of clothes as argument & returns the no of clothes.
public class WashingMachine {
	
	private int noofClothes;
	public int getNoofClothes() {
		return noofClothes;
	}
	public void setNoofClothes(int noofClothes) {
		this.noofClothes = noofClothes;
	}
	public String switchOn(){
		
		System.out.println("SwitchOn");
		return "SwitchOn";
	}
public String acceptClothes(int noofClothes ){
		
		System.out.println("acceptClothes"+ noofClothes );
		return "noofClothes";
	}
public String acceptDetergent(){
	
	System.out.println("acceptDetergent");
	return "acceptDetergent";
}
public String switchOff(){
	
	System.out.println("switchOff");
	return "switchOff";
}

public static void main(String[] args){
	
	WashingMachine wm = new WashingMachine();
//	wm.setNoofClothes(2);
	wm.acceptClothes(2);
	wm.acceptDetergent();
	wm.switchOn();
	wm.switchOff();
}



}
