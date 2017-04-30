package cl.pillan.core;

import java.util.concurrent.*;

public class DispatcherHub implements Runnable 
{
	
	public LinkedBlockingDeque<OutputMessage> outputQueue = null;
	
	public DispatcherHub()
	{
		this.outputQueue = new LinkedBlockingDeque<OutputMessage>();
	}
	
	public void run()
	{
		for(;;)
		{
			try
			{
				OutputMessage im = this.outputQueue.take();
				dispatch(im);
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

	private void dispatch(OutputMessage im) 
	{
		Dispatcher ev = new Dispatcher(im);
		new Thread(ev, "im-" + im.myCodAnaTsk).start();
	}
	

}
