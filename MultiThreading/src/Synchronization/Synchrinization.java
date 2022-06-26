package Synchronization;

public class Synchrinization extends Thread{

	public static void main(String[] args) {
		DisplayDemo dm=new DisplayDemo();
		MyThread t1=new MyThread(dm,"Rutvik");
		MyThread t2=new MyThread(dm,"MOM");
		
		t1.start();
		t2.start();
	}

}
