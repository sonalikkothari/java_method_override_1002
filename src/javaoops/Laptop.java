package javaoops;

public class Laptop {
		
		String color;
		String manufacturer ;
		String memory;
		String operatingsystem;
		String processor;
		int productid ;
		
		public Laptop(String color, String memory,String operatingsystem,String processor,String manufacturer, int productid) {
			this.color = color;
			this.memory = memory;
			this.operatingsystem = operatingsystem;
			this.processor = processor;
			this.manufacturer = manufacturer;
			this.productid = productid;
		}
		
		public void getcolor() {
			System.out.println("The laptop color is: " + this.color);
		}
		
		public void getmemory() {
			System.out.println("The laptop Memory is: " + this.memory);
		}
		
		public void getoperatingsystem() {
			System.out.println("The laptop OS is: " + this.operatingsystem);
		}
		
		public void getprocessor() {
			System.out.println("The laptop processor is: " + this.processor);
		}

		public void getmanufacturer() {
			System.out.println("The laptop manufacturer is: " + this.manufacturer);
		}
		
		public void getproductid() {
			System.out.println("The laptop productid is: " +  this.productid);
		}


}

