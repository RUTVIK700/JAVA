package threadgroup;

public class DemoThread  {

	public static void main(String[] args) {
		ThreadGroup mtg=new ThreadGroup("THREADGROUP");
		CustomThread t1=new CustomThread(mtg,"thread1");
		t1.start();
		mtg.list();
		System.out.println(mtg.activeCount());
	}

}
