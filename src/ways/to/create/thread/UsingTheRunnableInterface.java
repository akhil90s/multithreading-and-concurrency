package ways.to.create.thread;

public class UsingTheRunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new UsingTheRunnableInterface());
		t1.start();

	}

	@Override
	public void run() {
		
		System.out.println("Using Runnable");
		
	}

}
