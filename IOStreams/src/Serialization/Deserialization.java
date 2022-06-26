package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("/Users/rutvi/OneDrive/Desktop/Emp.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Object obj=ois.readObject();
			Employee emp=(Employee)obj;
			
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.Salaray);
			System.out.println(emp.ssn);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
