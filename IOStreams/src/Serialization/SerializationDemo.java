package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("/Users/rutvi/OneDrive/Desktop/Emp.ser");
			oos=new ObjectOutputStream(fos);
			Employee emp=new Employee(1,25000,"Rutvik",12334);
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
