package intbasics;
import java.io.CharConversionException;
import java.util.ArrayList;


public class Stringmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="ashiok";
		System.out.println(s.charAt(3));//o
		//System.out.println(s.charAt(100));// RE : StringIndexOutOfBoundsException*/
		
		/*String s="ashok";
		s=s.concat("software");
		//s=s+"software";
		//s+="software";
		System.out.println(s);//ashoksoftware*/
		
		/*String s="java";
		System.out.println(s.equals("JAVA"));//false
		System.out.println(s.equalsIgnoreCase("JAVA"));//true*/
		
		/*String s="ashoksoft";
		System.out.println(s.substring(6));//soft*/
		
		/*String s="ashoksoft";
		System.out.println(s.substring(7));//soft
		System.out.println(s.substring(1,3));//okso*/
		
		/*String s="jobs4timesfdgdfgdfgdfgdf";
		System.out.println(s.length());//10*/
		
		/*String s="bujjigadu";
		System.out.println(s.replace('b','g'));//gajjigadu
		//System.out.println(s.replace('u', 'a'));*/
		
		/*String s="BUJJIGADU";
		System.out.println(s.toLowerCase());//*/
		
		/*String s="bujjigadu";
		System.out.println(s.toUpperCase());//*/
		
		/*String s="  sai charan  ";
		System.out.println(s.trim());*/
		
		/*String s="saicharan";
		System.out.println(s.indexOf('c'));  // 3
		System.out.println(s.indexOf('z'));*/
		
		/*String s="saicharan";
		System.out.println(s.lastIndexOf('a'));  //
		System.out.println(s.lastIndexOf('z'));*/
		
		
		
		 
		
		 
	
		        String inputString = "My name is Guarav Kukade!";
		 
		        printDuplicates(inputString);
		    }
		 
		    public static void printDuplicates(String inputString) {
		        // count
		        int count = 0;
		 
		        // a temp list of ch for which we have already printed the count
		        ArrayList<Character> charList = new ArrayList<>();
		 
		        for (int i = 0; i < inputString.length(); i++) {
		 
		            char ch = inputString.charAt(i);
		 
		            // count the number of occurrences of the char ch in inputString
		            for (int j = 0; j < inputString.length(); j++) {
		                if (inputString.charAt(j) != ch) {
		                    continue;
		                }
		                count++;
		 
		            }
		 
		            // check if we have already printed for ch
		            if (!charList.contains(ch)) {
		                // check if count is more than 1 i.e. duplicate and char should not be space
		                if (count > 1 && ch != ' ') {
		 
		                    System.out.println("Char: " + ch + ", Count: " + count + " times.");
		                    charList.add(ch);
		                }
		            }
		 
		            // set counter to zero for next ch
		            count = 0;
		        }
		    }
		 
		

		
		
		
		}
	


