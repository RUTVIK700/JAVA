import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {
		JoinDemo j = new JoinDemo();
		Thread currentThread=Thread.currentThread();
		System.out.println("the name is "+currentThread.getName());
		long h = System.currentTimeMillis();
		/*
		System.out.println("Enter Sum of numbers you want");
		Scanner s = new Scanner(System.in);
		JoinDemo.n = s.nextInt();*/
		j.start();
		/*
		try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the sum is " + JoinDemo.sum);
		long e = System.currentTimeMillis();
		System.out.println("the time taken " + (e - h) / 1000 + " Seconds.");*/
	}

	public void run() {
		
		Thread currentThread=Thread.currentThread();
		currentThread.setName("HELLO");
		System.out.println("the name is "+currentThread.getName());
		/*
		for (int i = 0; i < JoinDemo.n; i++) {
			JoinDemo.sum += i;
		}*/
	}
}
