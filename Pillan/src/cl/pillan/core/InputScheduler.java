package cl.pillan.core;

import java.util.concurrent.*;

public class InputScheduler implements Runnable 
{
	
	public LinkedBlockingDeque<InputMessage> inputQueue = null;
	
	public InputScheduler()
	{
		this.inputQueue = new LinkedBlockingDeque<InputMessage>();
	}
	
	public LinkedBlockingDeque<InputMessage> getInputQueue() {
		return inputQueue;
	}

	public void run()
	{
		for(;;)
		{
			try
			{
				InputMessage im = this.inputQueue.take();
				process(im);
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

	private void process(InputMessage im) 
	{
		EventProcessor ev = new EventProcessor(im);
		new Thread(ev, "im-" + im.myCodAnaTsk).start();
	}
	

}
