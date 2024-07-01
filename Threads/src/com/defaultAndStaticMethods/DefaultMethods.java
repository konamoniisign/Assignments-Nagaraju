package com.defaultAndStaticMethods;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethods {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

      
        System.out.println("Original List:");
        numbers.forEach(System.out::println);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("  default removeIf Method");
        numbers.forEach(System.out::println);

    
        numbers.replaceAll(n -> n * n);
        System.out.println(" default replaceAll Method");
        numbers.forEach(System.out::println);

        
        numbers.sort(Integer::compareTo);
        System.out.println("  default sort method");
        numbers.forEach(System.out::println);
    }
	
	

}
