package intbasics;

import java.util.*;

public class Swappingwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int x,y;
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the numbers of x & y");
             x=sc.nextInt();
             y=sc.nextInt();
             System.out.println("Before Swapping\nx = " +x+"\ny = "+y);
             x=x+y;
             y=x-y;
             x=x-y;
             System.out.println("After Swapping\nx ="+x+"\ny = "+y);
	}

}
