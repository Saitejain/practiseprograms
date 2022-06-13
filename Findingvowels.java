package intbasics;

public class Findingvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "presentation";
		int count = 0;
		
		
		for(int i=0;i<st.length();i++)
		{
		  if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || 
				  st.charAt(i)=='u') {
			  System.out.println(" " + st.charAt(i));
			  count++;
		}
		}
			  
			  System.out.println("Total No Of Vowels is :" + count);
		  
		
	}

}
