package javaoops;

public class Testlaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Laptop tstlaptop = new Laptop("Black","8GB","Windows","Intel");
		//System.out.println(tstlaptop.color + "    " + tstlaptop.memory +  "    " + tstlaptop.operatingsystem +  "    " + tstlaptop.processor);
		
		//Hp hplaptop = new Hp("HP",1234);
		Hp hplaptop = new Hp();
		hplaptop.getcolor();                 //  Inherited
		hplaptop.getmemory();				 //  Inherited
		hplaptop.getoperatingsystem();       //  Inherited
		hplaptop.getprocessor();			 //  Inherited
		hplaptop.getmanufacturer();			 //  Override
		hplaptop.getproductid();			 //  Override
	
	
		System.out.println("**********************************");
		
		Macbookpro  maclaptop = new Macbookpro();
		maclaptop.getcolor();							//       Override
		maclaptop.getmemory();							//  Inherited
		maclaptop.getoperatingsystem();					//  Inherited
		maclaptop.getprocessor();						//  Inherited
		maclaptop.getmanufacturer();					//        Override
		maclaptop.getproductid();						//        Override
	}

}
