import java.util.*;
import java.io.*;
class CopyThread extends Thread {
public static void main(String[] args) throws InterruptedException
{
	CopyThread thread=new CopyThread();
	thread.start();
}
@Override
public void run()
{
try
	{
		File file=new File("D:\\Examples\\shubham.txt");
        StringBuilder sb=new StringBuilder("");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String str = "";
        FileWriter fw=new FileWriter(new File("D:\\Examples\\target.txt"));
        while((str=br.readLine())!=null)
        {
        	sb.append(str);
        } 
        br.close();
        for (int i=0;i<sb.length() ;i++ ) 
        { 
        	if(i%10==0)
        	{
                System.out.println("\n Waiting for 5 seconds.... ");
                try
	               {
	               Thread.sleep(5000);
	               }
	            catch(InterruptedException ie)
	               {
                    System.out.println("Smone Interrupted me..... ");
	               }
        	}
        	fw.write(sb.charAt(i));
            fw.flush();
            //System.out.println("Contents from the file are : ");
            //System.out.print(sb.charAt(i)+"");   	
        }
        
        
        //System.out.println("Length of file is : "+ file.length());
	}
	catch(IOException e)
	{
		System.out.println("Can't read from the file currently... ");
	}
}
}