import java.util.*;
class TimerClass extends Thread{
public static void main(String[] args) throws InterruptedException
{/*{
	TimerClass th = new TimerClass();
	th.start();
	
}*/
/*@Override
public void run(){*/
	for(int i=0;;i++)
	{
		System.out.print(i+"\r");
		Thread.sleep(1000);
			/*try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}*/
		//System.out.println(" ");
	}
     //  System.out.println(Thread.currentThread().getName() + "-...Running..._");
}	
	
	//System.out.println("");
}