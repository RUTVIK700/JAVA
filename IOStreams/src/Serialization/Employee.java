package Serialization;
import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	double Salaray;
	String name;
	transient int ssn;
	
	public Employee(int id,double Salaray,String name,int ssn) {
		this.id=id;
		this.Salaray=Salaray;
		this.name=name;
		this.ssn=ssn;
		}

	public static void main(String[] args) {

	}

}
