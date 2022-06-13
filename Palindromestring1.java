package intbasics;

import java.util.Scanner;

public class Palindromestring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		String orgstr=str;
		String rev="";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		 //System.out.println(rev);
		//if(orgstr.equals(rev))
		if(orgstr.equalsIgnoreCase(rev))
		{
			System.out.println(orgstr+" "+"It is palindrome");
		}
		else
		{
			System.out.println(orgstr+" "+"It is not palindrome");
		}
	}

}
