package intbasics;

public class Strmeth3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String inp = "program";
		  System.out.println(inp.equals("pro"));
		  System.out.println(inp.equalsIgnoreCase("program"));
		  substring();
	}

	public static void substring() {
		String sb = "working continuously";
		System.out.println(sb.substring(8));
	}
	
	
}
