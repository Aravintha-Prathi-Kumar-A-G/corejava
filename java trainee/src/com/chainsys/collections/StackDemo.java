package com.chainsys.collections;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> st =new Stack<Integer>();
		System.out.println("stack : "+st.size());
		st.push(42);
		st.push(66);
		st.push(99);
		System.out.println("Stack : "+st.size());
		Iterator<Integer> int_itr= st.iterator();
		while(int_itr.hasNext())
		{
			System.out.println(int_itr.next()+ " ");
		}
System.out.println();
//Integer a =st.peek();
Integer a =st.pop();
System.out.println(a);
System.out.println("After pop Stack : "+st.size());
//System.out.println("After peek Stack : "+st.size());
//a=st.peek();
a=st.pop();
System.out.println(a);
System.out.println("After pop Stack : "+st.size());
//System.out.println("After peek Stack : "+st.size());
//a=st.peek();
a=st.pop();
System.out.println(a);
System.out.println("After pop Stack : "+st.size());
//System.out.println("After peek Stack : "+st.size());
try
{
	a=st.pop();
	System.out.println(a);
}
catch (EmptyStackException e)
{
	System.out.println("empty stack "+e.getMessage());
}
	}

}
