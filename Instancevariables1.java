package intbasics;

public class Instancevariables1 {

	String name;
	String city;
	static String state = "Bangalore";
	
	
	
	public Instancevariables1(String name, String city) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.city = city;
		
	}

	 public void getcity() {
		 System.out.println(city+" "+state);
	 }
	 public static void getstate()
	 {
		 System.out.println(state);
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevariables1 In = new Instancevariables1("Raj","KGF");
		Instancevariables1 In2 = new Instancevariables1("rocky","kgf2");
		In.getcity();
		In2.getcity();
		Instancevariables1.getstate();
	}

}
