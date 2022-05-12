package com.chainsys.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		

		ArrayDeque<String> arraydeque =new ArrayDeque<String>();
		//Use an ArrayDeque like a Stack
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X"); //DUPLICATE VALUES
		arraydeque.push("Z"); //DUPLICATE VALUES
		arraydeque.push("E");
		arraydeque.push("F");
	/**	System.out.println("Before popping the stack : "+arraydeque.size());
		while(arraydeque.peek() !=null)
		{
			System.out.print(arraydeque.pop() + " ");
		}
		System.out.println(" After popping the stack : "+arraydeque.size());  **/
		
		Iterator<String> iterator = arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+iterator.next());
		}
		System.out.println("-------------------------");
		
		// descending
		
		Iterator<String> striterator = arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.println(" \t"+striterator.next());
		}
		
		System.out.println("-------------------------");
		
		arraydeque.addFirst("H");
		arraydeque.addFirst("I");
		 iterator = arraydeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println("\t"+iterator.next());
		}
		
		System.out.println("-------------------------");
		
		/**
		 * poll First
		 * Retrieves and removes the first element of this deque,or
		 * returns null if this deque is empty 
		 */
		
		System.out.println("***************PollFirst :  "+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("***************PollLast :  "+arraydeque.pollLast());
		System.out.println(arraydeque);
		
		System.out.println("----------------------------------------------------------");
		
		/**
		 * peek First
		 * Retrieves and does not remove the first element of this deque,or
		 * returns null if this deque is empty 
		 */
		System.out.println("***************PeekFirst :  "+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("***************PeekLast :  "+arraydeque.peekLast());
		System.out.println(arraydeque);
		
		System.out.println("----------------------------------------------------------");
		
		/**
		 * remove First
		 * Retrieves and  removes the first element of this deque.
		 * this method differs from Pollfirst only in that it throws an exception
		 *  if this deque is empty 
		 */
		System.out.println("***************RemoveFirst :  "+arraydeque.removeFirst());
		System.out.println(arraydeque);
		System.out.println("***************RemoveLast :  "+arraydeque.removeLast());
		System.out.println(arraydeque);
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("*RemoveFirstOccurrence :  "+arraydeque.removeFirstOccurrence("X"));
		System.out.println(arraydeque);
		System.out.println("*RemoveLasttOccurrence :  "+arraydeque.removeLastOccurrence("Z"));
		System.out.println(arraydeque);
		
		
	}

}
