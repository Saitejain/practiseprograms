package intbasics;

public class Countnoofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num=8975465656546451259L;
		long count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No of Digits :" +count);
	}

}
