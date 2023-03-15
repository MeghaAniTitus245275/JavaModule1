package producerconsumer;

public class Producer extends Thread {
	
	
	private Holder holder;
	
	
	public Producer(Holder holder) {
		super();
		this.holder = holder;
	}


	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			holder.put(i);
		}
	}

}
