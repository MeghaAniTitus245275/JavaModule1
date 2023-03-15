package producerconsumer;

public class Test {

	public static void main(String[] args) {
		
		Holder holder = new   Holder();

		
		Producer producer = new Producer(holder);
		Consumer consumer = new Consumer(holder);
		
		producer.start();
		consumer.start();
	}

}
