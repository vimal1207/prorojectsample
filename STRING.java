package org.sample;

public class STRING {

public static void main(String[] args) {
	
	String s="application 123";
	// to find the length  of the string
	
	
	int i=s.length();
	
	System.out.println("length of the string:"+1);
	
	//to convert all letters into caps
	String up=s.toUpperCase();
	System.out.println(up);
	
	//to convert all letters into small letter
	System.out.println(s.toLowerCase());
	
	//to check wether my string starts with the same sequence or nnot
	Boolean b= s.startsWith("app");
	System.out.println(b);
	
	//to check whether my string ends with the same seq or not

	Boolean c= s.endsWith("n 123");
	System.out.println(c);
	
	//to check my string is having the same seq or not
	Boolean d=s.contains("cat");
	System.out.println(d);
	
	//to find index position
	int j= s.indexOf('i');
	System.out.println(j);
	
	int k= s.indexOf('z');
	System.out.println(k);
	
	
	//to fetch a letter
	
	Character e= s.charAt(10);
	System.out.println(e);
	
	char f=s.charAt(20);
	System.out.println(f);
	
	//to change a letter in string
	String sa = s.replace('i', '@');
	System.out.println(sa);
	
	//to change seq in a string

   String t = s.replaceAll('cat','java987');
	System.out.println(t);
	
	
	Boolean f=s.isEmpty()
	System.out.println(f);
	
	
	String s1="";
	Boolean g= s1.isEmpty()
	System.out.println();
	
	
	
}


	}
	
	
	
	