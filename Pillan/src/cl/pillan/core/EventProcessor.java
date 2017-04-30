package cl.pillan.core;

public class EventProcessor implements Runnable 
{
   
	InputMessage im = null;
	 
	public EventProcessor(InputMessage im)
	{
		this.im = im;
	}
	
	public void run()
	{
		
	}
}
