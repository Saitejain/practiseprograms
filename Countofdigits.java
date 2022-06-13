package intbasics;

public class Countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=125489;
           int count=0;
           while(num>0)
           {
        	   num=num/10;
        	   count++;
           }
           System.out.println("count:" +count);
	}

}
