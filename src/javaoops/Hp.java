package javaoops;

public class Hp extends Laptop {
       
	
	
	//public Hp(String manufact,int prid) {
	public Hp() {
	super("Black","8GB","Windows","Intel","Laptop",1);	
	
	//manufacturer = manufact;
	//productid = prid;
	}
	
	@Override
	public void getmanufacturer() {			//Method Overriding
		super.getmanufacturer();
		manufacturer = "HP";
		System.out.println("The laptop manufacturer is: " + manufacturer);
	}

	@Override
	public void getproductid() {			//Method Overriding
		super.getproductid();
		productid = 2222;
		System.out.println("The laptop productid is: " +  productid);
	}
}
