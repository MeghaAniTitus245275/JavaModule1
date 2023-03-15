package producerconsumer;

public class Consumer extends Thread {
	
	private Holder holder;
	
	
	public Consumer(Holder holder) {
		super();
		this.holder = holder;
	}


	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			holder.get();
		}
		
	}
}
