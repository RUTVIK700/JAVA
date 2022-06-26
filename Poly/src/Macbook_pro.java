
public class Macbook_pro implements Apple {


	@Override
	public
	void start() {
		System.out.println("Inside Macbook_pro");
	}
	
	@Override
	public
	void stop() {
		System.out.println("Inside macbook_pro");
		
	}
	
	
	public void pose() {
		System.out.println("INsIDE DOWNCASTING  PRO");
	}
}
