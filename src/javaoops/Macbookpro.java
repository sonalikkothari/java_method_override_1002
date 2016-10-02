package javaoops;

public class Macbookpro extends Laptop {
	
		public Macbookpro() {
		super("Black","8GB","Windows","Intel","Laptop",1);	
		}
		
		@Override
		public void getmanufacturer() {			//Method Overriding
			super.getmanufacturer();
			manufacturer = "APPLE";
			System.out.println("The laptop manufacturer is: " + manufacturer);
		}

		@Override
		public void getproductid() {             //Method Overriding
			super.getproductid();
			productid = 100;
			System.out.println("The laptop productid is: " +  productid);
		}
		
		@Override
		public void getcolor() {				//Method Overriding
			super.getcolor();
			color = "Silver";
			System.out.println("The laptop color is: " + color);
		}
 
		@Override
		public void getoperatingsystem() {			//Method Overriding
			super.getoperatingsystem();
			operatingsystem = "OS X";
			System.out.println("The laptop OS is: " + operatingsystem);
		}


}
