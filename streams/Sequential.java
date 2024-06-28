package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sequential {
	
	public static void main(String[] args) {
		
		List<Integer> preOpen = IntStream.range(0, 1000000).boxed().collect(Collectors.toList());
				long startTime = System.nanoTime();
				List<Integer> postOpen = preOpen.stream().map(e->e+e).sorted().filter(e->e%2==0).collect(Collectors.toList());
				long endTime = System.nanoTime();
				System.out.println("Processing time of Sequential Streams : "+ (endTime-startTime));
	}

}
