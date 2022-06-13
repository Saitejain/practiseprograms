package intbasics;

import java.util.Scanner;

public class Palindromeex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int orgnum=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev)
		{
			System.out.println(orgnum+ "It is a Palindrome Number");
		}
		else
		{
			System.out.println(orgnum+ "It is not a Palindrome Number");
		}
	}

}
