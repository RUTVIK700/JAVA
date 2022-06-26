

public class Macbook {
	private Apple a2;
	public Macbook(Apple a2) {
		this.a2=a2;
	}
	public void start1() {
		a2.start();
		a2.stop();
	}
}
