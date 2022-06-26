package Interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		Interrupt i=new Interrupt();
		i.start();
		i.interrupt();
		System.out.println("In main method");
	}

}
