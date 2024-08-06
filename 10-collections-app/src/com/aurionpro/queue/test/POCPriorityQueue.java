package com.aurionpro.queue.test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class POCPriorityQueue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(10);
		priorityQueue.add(5);
		priorityQueue.add(15);
		priorityQueue.add(20);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		
	}
}
