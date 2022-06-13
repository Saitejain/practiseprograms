package intbasics;

import java.util.ArrayList;

public class Forloops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sc="adda at thhe bidda";
		printDuplicates(sc);
	}
		public static void printDuplicates(String sc) {
			int count=0;
			ArrayList<Character> cList = new ArrayList<>();
			
			for(int i=0;i<sc.length();i++) {
				char ch = sc.charAt(i);
				for(int j=0;j<sc.length();j++) {
					if(sc.charAt(j)!=ch) {
				continue;	
					}
					count++;
				}
				
				if(!cList.contains(ch)) {
					if(count>1 && ch !=' ') {
						System.out.println("Char: "+ ch + ",Count: " + count + "times.");
						cList.add(ch);
					}
				}
				count =0;
			}
			
				
			
			
			
		}
		
		
		
		
		
	}
