package com.learning.threadLocal;

public class Service1 {
	public void process() {
		User user = User.getUser();
		System.out.println("Set the user values to the ThreadLocal in Service ");
		UserContextholder.holder.set(user);
	}
}
