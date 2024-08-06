package com.aurionpro.queue.test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class POCArrayDeque {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.addFirst(10);
		arrayDeque.addFirst(5);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(6);
		
		System.out.println(arrayDeque);
		
		arrayDeque.addFirst(12);
		arrayDeque.addLast(34);
		
		System.out.println(arrayDeque);
		
		arrayDeque.removeFirst();
		arrayDeque.removeLast();
		
		System.out.println(arrayDeque);
		
		
	}

}
