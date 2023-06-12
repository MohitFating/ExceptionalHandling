public class MultipleThreading implements Runnable {
	
     Thread t;
	String ThreadName;
	
	MultipleThreading(String name){
		
		ThreadName = name;
		System.out.println("Creating"+ThreadName);
	}
	public void run()
	{
		System.out.println("Running...."+ThreadName);
		try {
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread : "+ThreadName+" , "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Thread"+ThreadName+"********");
		}
	}
	public void start() {
		System.out.println("Starting"+ThreadName);
		if(t==null)
		{
			t = new Thread(this,ThreadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleThreading t1 = new MultipleThreading("Thread -1");
		t1.start();
		MultipleThreading t2 = new MultipleThreading("Thread -2");
		t2.start();
		MultipleThreading t3 = new MultipleThreading("Thread -3");
		t3.start();

	}

}
