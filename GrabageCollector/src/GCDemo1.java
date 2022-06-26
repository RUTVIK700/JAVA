
public class GCDemo1 {


	int obj1;
	GCDemo1(int obj1){
		this.obj1=obj1;
		System.out.println(this+" Created");
	}
	public static void main(String[] args) {
		new GCDemo1(1);
		new GCDemo1(2);
		for (int i=0;i<100;i++) {
			System.gc();
		}

	}
	@Override											//GC doesn't get called all the time//
	protected void finalize() {
		System.out.println(this+" Destroyed");
	}
}


