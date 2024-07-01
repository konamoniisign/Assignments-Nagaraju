package com.defaultAndStaticMethods;

public interface A {
	
	static void display() {
		System.out.println("Staic Method calling in Interface A ");
	}
	
	default void show() {
		System.out.println("Default Method calling from  Interface A ");
	}

}
