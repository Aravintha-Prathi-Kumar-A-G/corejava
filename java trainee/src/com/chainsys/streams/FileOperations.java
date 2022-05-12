package com.chainsys.streams;
/**
 * 
 * @author arav3116 Chainsys
 * Created on : 28-04-2022
 * Assignment on FILE OPERATIONS
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;




public class FileOperations {

	public static void main(String args[]) throws IOException 
	{
		//createNewFile();
		//renameFile();
		//appendDataToFile();
		 //modifyDataInFile();
		//readDataFromFile();
		//copyFile();
		//moveFile();
		deleteFile();
		
	}
	
	public static void  createNewFile() throws IOException
	{
		 java.util.Scanner scanner=new java.util.Scanner (System.in);
		    String filename="";
		    String source = "";
		    try {
		    System.out.println("Enter FileName with full path"); 
		    filename = scanner.nextLine();
		    System.out.println("Enter Datas in the file");
		    source = scanner.nextLine();
		   
		    } 
		    finally 
		    {
		    scanner.close();
		    }
		    char buffer[] = new char [source.length ()]; 
		    source.getChars (0, source.length(), buffer, 0); 
		    FileWriter fw =null;
		   
		    try
		    {
		    fw = new FileWriter (filename);
		    for (int i=0; i < buffer.length; i++) {
		        
		        fw.write(buffer[i]);
		        }
		        System.out.println("Datas Saved in the file");
		        } catch (Exception err)
		        {
		        err.printStackTrace();
		        }
		        finally
		        {
		        fw.close();
		        }
	}
		   
	public static void renameFile() throws FileNotFoundException
		    {
		    	
		     File file =new File("D:\\Aravindpk\\Filesinjava\\SuperHeros.txt");
			boolean present = file.exists();
			System.out.println("Folder is  Present : "+present);
			
			if(present==true)
			{
				File rename = new File ("D:\\Aravindpk\\Filesinjava\\DCSuperHeros.txt");
			boolean renameStatus =file.renameTo(rename);
			System.out.println("RENAME STATUS "+ renameStatus);
			System.out.println("FIlE NAME : "+rename.getName());
			}	
		if(present==false)
		{
			System.out.println("File Not found   : "+file.getName());
		}
		   }
		    
	public static void appendDataToFile()
	{
		/* String path ="d:\\Aravindpk\\Filesinjava\\SuperHeros.txt";
		String texttojoin = " \n How did Batman become Batman?\r\n"
				+ " \n Just then, a bat crashed through the study window,"
				+ " \n  giving Bruce the inspiration he needed."
				+ "  \n Establishing a secret headquarters in the caves beneath his mansion,"
				+ "  \n Bruce became Batman,a Dark Knight to protect Gotham "
				+ " \n and its citizens from vice and villainy.";
	
	try
	{
		Files.write(Paths.get(path), texttojoin.getBytes(),StandardOpenOption.APPEND);
		System.out.println("-----Append Successful-----");
	
	}
	catch (IOException err)
	{
		System.out.println(err);
	} */
	
		String path="d:\\Aravindpk\\Filesinjava\\SuperHeros.txt";
				
		String texttojoin =" \n Why is Superman so strong?\r \n"
			    + " \n Superman is so powerful due to the fact he (along with other Kryptonians) "
				+ " \n have a metagene that is activated under yellow sunlight (and other colors)  \n which grants him his powers."
				+ " \n  This is normal for all Kryptonians.";
	
		try 
		{
			FileWriter writedata = new FileWriter(path,true);
			writedata.write(texttojoin);
			writedata.close();
			System.out.println("-----Append Successful-----");
		}
	catch (IOException err)
		{
		System.out.println(err);
		} 
	} 
		
	public static void  modifyDataInFile() throws IOException
	{
		  String file="d:\\Aravindpk\\Filesinjava\\SuperHeros.txt";
	      java.util.Scanner ag=new java.util.Scanner(new File(file));
	      StringBuffer buffer =new StringBuffer();
	      while(ag.hasNextLine()) {
	          buffer.append(ag.nextLine()+System.lineSeparator());
	      }
	      String Datasinthefile =buffer.toString();
	      System.out.println(" DATAs in the file: "+Datasinthefile);
	      ag.close();
	      String existingWord="Batman";
	      String newWord="Aravind(I am the Bataman)";
	      Datasinthefile =Datasinthefile.replace(existingWord, newWord);
	      FileWriter writer=new FileWriter(file);
	      System.out.println("");
	      System.out.println("After Modifying the file (Datas changed) :"+Datasinthefile);
	      writer.append(Datasinthefile);
	      writer.flush();
	  
		
	}
	
	public static void readDataFromFile() throws IOException
	{
		  File file =new File("D:\\Aravindpk\\Filesinjava\\SuperHeros.txt");
	        FileReader fileReader = new FileReader(file);
	      int output =fileReader.read();
	      while(output !=-1)
	      {
	    	  System.out.print((char)output);
	    	  try {
				output =fileReader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	}
	
    public static void copyFile() throws IOException
    {
    	
        FileInputStream fis =null ;
        FileOutputStream fos = null;
        try {
           fis = new FileInputStream("d:\\Aravindpk\\Filesinjava\\SuperHeros.txt");
            fos = new FileOutputStream("d:\\Aravindpk\\Filesinjava\\SuperHeroscopy.txt"); 
            int c;
            while ((c = fis.read()) != -1) 
            {
                fos.write(c);
            }
 
            System.out.println("--------copy the file successfully Excecuted---------");
        }
 
        finally {
           if (fis != null) 
            {
                fis.close();
            }
            if (fos != null) 
            {
                fos.close();
            }
        }  
        }
    
    public static void moveFile() throws IOException

    {
    	
        {
            Path temp = Files.move
            (Paths.get("d:\\Aravindpk\\Filesinjava\\SuperHeroscopy.txt"),
                        Paths.get("d:\\Aravindpk\\DCComics\\SuperHeros.txt"));
     
            if(temp != null)
            {
                System.out.println("File renamed and moved successfully to DC Comics Folder");
            }
            else
            {
                System.out.println("Failed to move the file");
            }
        }
    }
     
    public static void deleteFile()
    {
    	  
    	try  
    	{         
    	File f= new File("D:\\Aravindpk\\DCComics\\SuperHeros.txt");        
    	if(f.delete())                     
    	{  
    	System.out.println(f.getName() + " ---THE FIlE IS DELETED---");    
    	}  
    	else  
    	{  
    	System.out.println("---FAILED TO DELETE THE FILE---");  
    	}  
    	}  
    	catch(Exception err)  
    	{  
    	err.printStackTrace();  
    	}  
    	}  
    

}
	

	

		