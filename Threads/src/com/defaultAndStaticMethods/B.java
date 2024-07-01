package com.defaultAndStaticMethods;

public interface B {
	
	default void show() {
         System.out.println("This is Mahesh Konamoni ");
         System.out.println("default method calling from Interface B");
	}
	
	static void display() {
		System.out.println(" static display method calling from Interface B");
	}

}
