
public class ArraysDemo {

	public static void main(String[] args) {
		//int arr[]= {10,20,30,40};
		int ar[]=new int[5];
		ar[0]=1;
		ar[1]=new Integer(20); //autoboxing
		//ar[2]=30.45;
		ar[2]=40;
		for(int i:ar) {
			System.out.println(i);
		}
	}

}
