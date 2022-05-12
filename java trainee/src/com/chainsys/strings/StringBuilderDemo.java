package com.chainsys.strings;;
/** @ author chainsys Aravind
 * created on 28/03/2022
 */
public class StringBuilderDemo {
	public static void testA()
	{
		String firstString="Hello how are you today.Is the weather hot or Cold";
	StringBuilder stringbuilder = new StringBuilder();
	stringbuilder.ensureCapacity(250);//
	System.out.println("Length ="+stringbuilder.length());
	System.out.println("Capacity ="+stringbuilder.capacity());
	stringbuilder.append(firstString);
	System.out.println("Buffer ="+stringbuilder);
	System.out.println("Length ="+stringbuilder.length());
	System.out.println("capacity ="+stringbuilder.capacity());
	
	firstString="Wish it rains this week";
	stringbuilder.append(firstString);
	System.out.println("Buffer ="+stringbuilder);
	System.out.println("Length ="+stringbuilder.length());
	System.out.println("capacity ="+stringbuilder.capacity());
	
	// reduce capacity to length
	stringbuilder.trimToSize();
	System.out.println("\tLength ="+stringbuilder.length());
	System.out.println("\tcapacity ="+stringbuilder.capacity());
	
	//replace
	stringbuilder.replace(3, 8," -this is a TEST");
	System.out.println("Replace ="+stringbuilder);
	
	//insert
	stringbuilder.insert(10,"-This is August");
	System.out.println("INSERT ="+stringbuilder);
	System.out.println("\tLength ="+stringbuilder.length());
	System.out.println("\tcapacity ="+stringbuilder.capacity());
	
	//delete
	
	stringbuilder.delete(5, 20);
	System.out.println("After Delete ="+stringbuilder);
	System.out.println("\tLength ="+stringbuilder.length());
	System.out.println("\tcapacity ="+stringbuilder.capacity());
	
	//reverse
	System.out.println("Before reverse ="+stringbuilder);
	stringbuilder.reverse();
	System.out.println("After reverse ="+stringbuilder);
	}

}
