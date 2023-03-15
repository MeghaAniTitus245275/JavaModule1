package producerconsumer;

public class Holder {
	private int data;
	private boolean flag =false;
	
	public synchronized void put(int data)
	{
		if(flag==true)									//there are chances of producer getting called again in order to avoid it we use this.
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("producing"+data);//producer
		notify();
		flag=true;
	}
	
	public synchronized int get()
	{
		if(flag==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consuming"+data);
		notify();
		flag = false;
		return data;
	}

}
