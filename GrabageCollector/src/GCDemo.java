
public class GCDemo {
	int obj1;
	GCDemo(int obj1){
		this.obj1=obj1;
		System.out.println(this+" Created");
	}
	public static void main(String[] args) {
		for (int i=0;i<500000;i++) {
			new GCDemo(i);
		}

	}
	@Override											//GC doesn't get called all the time//
	protected void finalize() {
		System.out.println(this+" Destroyed");
	}
}
