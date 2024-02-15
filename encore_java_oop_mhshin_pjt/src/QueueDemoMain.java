
/*
 * Queue
 * FIFO : First In First Out(Enqueue, Dequeue)
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoMain {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10); queue.offer(20); queue.offer(30); queue.offer(40);
		System.out.println("peek : " + queue.peek());
		System.out.println("size : " + queue.size());
		System.out.println("poll : " + queue.poll());
		System.out.println("size : " + queue.size());
		System.out.println("remove : " + queue.remove());
		System.out.println("size : " + queue.size());
		System.out.println("clear : ");
		queue.clear();
		System.out.println("size : " + queue.size());
		
		System.out.println("main end");

	}

}
