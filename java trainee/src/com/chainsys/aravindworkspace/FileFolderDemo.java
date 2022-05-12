package com.chainsys.aravindworkspace;

import java.io.File;

public class FileFolderDemo {

	public static void main (String [] args)
	{
		File file =new File("D:\\Aravindpk\\Filesinjava\\SuperHeros.txt");
		boolean present = file.exists();
		System.out.println("Folder Present : "+present);
	if(present==false)
		file.mkdir();
	present =file.exists();
	}
}  
