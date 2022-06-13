package intbasics;

public class Splitwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "Java,selenium,maven,testng,automation";
		String[] sp = st.split(",");
		for(String s1:sp) {
			System.out.println(s1);
		}
	}

}
