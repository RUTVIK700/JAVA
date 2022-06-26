package com.rutvik.add;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class add {

	public static void main(String[] args) {
	out.println("Enter two numbers");
	Scanner a=new Scanner(in);
	int b=parseInt(a.next());
	int c=parseInt(a.next());
	int result=b+c;
	System.out.println("the result is "+result);
	int f=(int) sqrt(result);
	System.out.println(f);
	}

}
