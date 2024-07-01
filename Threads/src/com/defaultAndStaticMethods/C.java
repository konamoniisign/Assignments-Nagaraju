package com.defaultAndStaticMethods;

public interface C extends B ,A {
	
	default void show() {
		System.out.println(" defaout calling from Interface C");
		A.super.show();
		B.super.show();
	}
	
	static void dispaly() {
		System.out.println(" static calling from Interface C");
//		A.display();
//		B.display();
	}

}
