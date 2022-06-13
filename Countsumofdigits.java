package intbasics;

public class Countsumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int num=95537754;
              int sum =0;
              while(num>0)
              {
            	  sum=sum+num%10;
            	  num=num/10;
              }
		System.out.println("count of digits in a number:" +sum);
	}

}
