package Yeild;

public class YeildDemo {

	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
		for (int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
