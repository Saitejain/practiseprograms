package intbasics;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int x,y,temp;
          System.out.println("Enter the numbers of x and y");
          Scanner sc = new Scanner(System.in);
          x=sc.nextInt();
          y=sc.nextInt();
          System.out.println("Before Swapping" + x + y);
          temp = x;
          x = y;
          y=temp;
          System.out.println("After Swapping" + x + y);
	}

}
