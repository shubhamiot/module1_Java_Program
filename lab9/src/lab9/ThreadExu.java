package lab9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExu {
	public static void main(String args[])
	{
		Runnable r=new Runnable()
				{

					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+"is running");
						
					}
			
				};
				ExecutorService ex=Executors.newFixedThreadPool(5);
				for(int i=0;i<20;i++)
				{
					ex.execute(r);
				}
	}
}
