package com.chainsys.collections;
/**
 * @author arav3116 chain-sys
 * created on 21-04-2022
 * sub : Collections-Array list
 */

import java.util.ArrayList;

public class ArrayListDemo1 {
	
	public static void usingStringArrayList()
	{
		ArrayList<String> stringArrayList = new ArrayList<String>();
		System.out.println("Initial size of StringArrayList: "+stringArrayList.size());
try
{
	stringArrayList.add("car");
	stringArrayList.add("Auto");
	stringArrayList.add("Egg");
	stringArrayList.add("Box");
	stringArrayList.add("Doll");
	stringArrayList.add("Fan");
	//will insert a new value,
	//pushing the current value of index 1 to the next index
	
	stringArrayList.add(1,  "Animal");
	stringArrayList.add("Girl");
	stringArrayList.add("Fan");
	System.out.println("Size of stringArrayList after additions : "+stringArrayList.size());
	System.out.println("contents of stringArrayList : "+stringArrayList);
	//will replace the value in index 2
	stringArrayList.set(2, "xenas");
	System.out.println("After set(2) : "+stringArrayList);
	System.out.println("Last Index of : 'Fan' "+stringArrayList.lastIndexOf("Fan"));
	//remove the first instance of 'Fan'
	stringArrayList.remove("Fan");
	stringArrayList.remove(2);
	System.out.println("Size after remove(2) : "+stringArrayList.size());
	System.out.println("Contents of StringArrayList : "+stringArrayList);
	//will reduce the capacity
	stringArrayList.trimToSize();
}
catch (Exception err)
{
	System.out.println(err.getMessage());
}
}
}
