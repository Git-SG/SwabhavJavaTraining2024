package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.NewCallableTask;

public class CallableExecutorDemo {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
//		Future<Integer> future = service.submit(new NewCallableTask());
		
		List<NewCallableTask> tasks = new ArrayList<NewCallableTask>();
		tasks.add(new NewCallableTask());
		tasks.add(new NewCallableTask());
		tasks.add(new NewCallableTask());
		tasks.add(new NewCallableTask());
		tasks.add(new NewCallableTask());

		try {
//			System.out.println(future.get());
			
//			service.invokeAny(tasks);
			
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future<Integer> future: futures)
				System.out.println(future.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
