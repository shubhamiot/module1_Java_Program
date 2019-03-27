package lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
	public static void main(String args[])
	{
		 String line = null;
	     int line_count=1;
	        try
	        {
	        	FileReader fileReader = new FileReader("D:\\source.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            while((line = bufferedReader.readLine()) != null)
	            {	      
	            	System.out.println("Line number:"+line_count);
	                System.out.println(line);
                line_count++;
	            }
	            bufferedReader.close();
	        }
	        catch(IOException e)
	        {
	            System.out.println("Error reading file named "+e);
	        }
	}
}
