package com.chainsys.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		InputStreamReader isr=new 	InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);
		String str;
		System.out.println("Enter lines of text");
		System.out.println("Enter 'stop' to quit :");
		do
		{
			str=br.readLine();
			System.out.println(str);
			System.out.println("Enter Next lines of text");
		}while(!str.equals("stop"));
	}

}
