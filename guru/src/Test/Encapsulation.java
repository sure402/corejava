package Test;

 class EncapsulationDemo {

	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Encapsulation{
	public static void main(String args[]){
		EncapsulationDemo demo = new EncapsulationDemo();
		demo.setName("Suresh");
		System.out.println("Name:=="+demo.getName());
		demo.setName("Bandaru");
		System.out.println("Name:=="+demo.getName());
	}
}