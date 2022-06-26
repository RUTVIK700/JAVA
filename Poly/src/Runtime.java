
public class Runtime {
	
	public static void main(String[] args) {
	Apple m1= new Mackbook_air();//object up casting
	Apple m2=new Macbook_pro();//object up casting
	m1.start();
	m1.stop();
	
	
	m2.start();
	m2.stop();
	
	
	Mackbook_air m3=(Mackbook_air)m1; //DOWNCASTING
	Macbook_pro m4=(Macbook_pro)m2;  //DOWNCASTING
	
	m3.pose();
	m4.pose();
	
	}
}
