package org.sample;

public class Dataladder {
public static void main(String[] args) {
	int a=20,b=40,c=30;
	//20>40 f
	if (a>b&& a>c ) {
		System.out.println("a is greater");
	}
	//40>20 t 40>30t
	else if (b>a && b>c) {
		System.out.println("b is greater");
	}
	else {
		System.out.println("c is greater");
	}
	
	
}
}
