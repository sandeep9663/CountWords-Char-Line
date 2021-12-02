package com.deep.iofile;
//import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filereader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int numWords=0;
		int numLines=0;
		int numChars=0;
		Scanner myfile=null;
		try 
	{
		
			File fi=new File("E:/abc.txt");
		
			Scanner sc= new Scanner(fi);
			myfile=sc;
	}
		catch(FileNotFoundException e)
		{
			System.out.println("yr file is does not exit..");
		}
		
			while(myfile.hasNextLine())
			{
				String line=myfile.nextLine();
				int size= line.length();
				boolean foundSpace= true;
				boolean foundChar=false;
				
					
			
			
				for(int i=0; i<size; i++)
				{
					if(line.charAt(i)==' ')
					{
						 foundSpace= true;
						 foundChar=false;
					}
					else
					{
						foundChar=true;
						numChars++;
					}
						
						if(foundChar && foundSpace)
						{
							numWords++;
							foundSpace=false;
							
						}
						
						
					}
				numLines++;
				
			}	
			myfile.close();
			System.out.println("TOTAL WORDS ="+ numWords);
			System.out.println("TOTAL Line ="+ numLines);
			System.out.println("TOTAL Characters ="+ numChars);
	}		
}

  

