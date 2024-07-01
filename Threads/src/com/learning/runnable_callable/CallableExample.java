package com.learning.runnable_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "Thread is running with Callable interface";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(new CallableExample());
		String result = future.get();
		System.out.println(result);
		executorService.shutdown();
	}
}
