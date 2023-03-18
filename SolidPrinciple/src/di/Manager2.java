package di;

public class Manager2 {
	class Manager{
		IWorker worker;
		public void setWorker(IWorker w)
		{
			worker = w;
		}
		public void manage()
		{
			worker.work();
		}

}
}
