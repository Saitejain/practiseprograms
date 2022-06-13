package intbasics;

public class reversestring {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Saiteja";
        String str3 = " is a good boy";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2.append(str3);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
        }
	
}
