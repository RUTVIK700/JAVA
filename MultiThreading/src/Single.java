
public class Single {

	public static void main(String[] args) {
		Single st=new Single();
		st.p();
		for(int i=0;i<200;i++) {
			System.out.print("i: "+i + "\t");
		}
	}

	void p() {
		for(int j=0;j<200;j++) {
			System.out.print("j: "+j + "\t");
		}
	}
}
