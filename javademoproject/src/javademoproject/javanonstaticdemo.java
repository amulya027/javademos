package javademoproject;

public class javanonstaticdemo {
	private javanonstaticdemo() {}
	static {
		System.out.println("from ststic block");
	}
	{
		System.out.println("from non-static-block1");
	}
 public static void main(String[] args) {
	 System.out.println("from main method");
	 javanonstaticdemo jnsd1=new  javanonstaticdemo();
	 javanonstaticdemo jnsd2= new  javanonstaticdemo();
	 
	 car mycar=new car();
	 System.out.println(mycar.numofwheels);
	 System.out.println(car.manufacturer);
 }
}
