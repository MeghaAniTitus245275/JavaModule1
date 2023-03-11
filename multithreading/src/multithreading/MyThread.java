package multithreading;

public class MyThread extends Thread {

	 private String name;
	 public MyThread()
	 {
		 
	 }
	public MyThread(String name) {
		super();
		this.name = name;
	}
	 public void run()
	 {
		 for(int i=0;i<6;i++)
		 {
			 System.out.println(name + "=" +i);
		 }
	 }
}
