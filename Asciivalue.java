package org.sample;

public class Asciivalue {

	public static void main(String[] args) {
		String s1 ="ABCD";
		String s2 ="Abcd";
		String s3 ="AB";
		
		int i=s1.compareTo(s2);
		System.out.println(i);
		
		int j=s1.compareTo(s3);
		System.out.println(j);
	}
	
	
}
