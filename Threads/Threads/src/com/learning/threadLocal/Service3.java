package com.learning.threadLocal;

public class Service3 {
	public void process() {
		UserContextholder.holder.remove();
		System.out.println("Removing the user values in Service3 ");

		UserContextholder.holder.get();
	}
}
