package intbasics;

public class palindromeex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int r,sum=0,temp;    
			  int n=369;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder 
			   System.out.println(r);    

			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			 
	}


