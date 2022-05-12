package com.chainsys.streams;

import java.io.File;

public abstract class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirname ="d:/agatemp";
		File file =new File (dirname);
		String listoffilenamesindirectory[]=null;
		if(file.isDirectory())
		{
     System.out.println(dirname+"is a Directory");
     listoffilenamesindirectory =file.list();
     for (int i=0; i<  listoffilenamesindirectory.length; i++)
     {
    	 File f =new File(dirname +"/" + listoffilenamesindirectory[i]);
    	 if(f.isDirectory())
    	 {
    		 System.out.println("\t"+f.getName() + "> is a sub Directory");
    	 }
    	 else
    	 {
    		 System.out.println("\t"+f.getName() + "is a file");
    	 }
     }
		}

	}

}
