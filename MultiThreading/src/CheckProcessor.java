
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed checked");
	}
	
	public static void main(String[] args) {
		CheckProcessor f=new CheckProcessor();
		Thread st=new Thread(f);
		st.start();
	}

}
