package intbasics;

public class Countnoofdigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=656884898;
		int count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No of Digits :" +count);
	}

}
