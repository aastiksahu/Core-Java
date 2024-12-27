package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

//queue can not contain null value
//queue contain multiple duplicate values
//order of queue is natural order

public class TestQueue {
	public static void main(String[] args) {
		// FIFO = first in first out
		Queue qu = new ArrayDeque();
		qu.offer(5);
		qu.offer(3);
		qu.offer(1);
		qu.offer(4);
		qu.offer(2);
		qu.offer(2);
		qu.offer(2);

		System.out.println("Queue: " + qu);

		qu.remove(2);
		System.out.println("Queue: " + qu);

		// peek method take the first element from the queue
		System.out.println("peek method get first e: " + qu.peek());

		// poll method remove element from first
		while (!qu.isEmpty()) {

			System.out.println("Queue poll : " + qu.poll());

		}

		System.out.println("queue: " + qu);
	}

}
