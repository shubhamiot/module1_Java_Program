package lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Number_Character {
	public static void main(String args[]) throws IOException
	{
		int lines=0, chars=0, words=0;
		int init=0;
		try {
			FileInputStream fs=new FileInputStream("D:\\source.txt");
			while(fs.available()!=0)
			{
				init=fs.read();
				if(init!=10)
				{
					chars++;
				}
				if(init==32)
				{
					words++;
				}
				if(init==10)
				{
					lines++;
					words++;
				}
				System.out.println("number of character"+chars);
				System.out.println("number of words"+words);
				System.out.println("number of lines"+(lines+1));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
