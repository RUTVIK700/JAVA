package threadgroup;

public class ThreadGroupsDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup parent=new ThreadGroup("PPAARENTS");
		System.out.println(parent.getName());
		ThreadGroup child=new ThreadGroup(parent,"Childrens");
		System.out.println(child.getParent().getName());
		
		
		child.setMaxPriority(3);
		Thread t1=new Thread(child,"Thread1");
		Thread t2=new Thread(child,"Thread2");
		System.out.println(t1.getThreadGroup().getName());
		t1.setPriority(1);
		System.out.println(t1.getPriority());
		
	}
}
