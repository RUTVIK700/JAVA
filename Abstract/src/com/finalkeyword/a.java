package com.finalkeyword;

public  class a {
	final float f;
	a(){
		f=22.3f;
	}
	public final void dis() {
		System.out.println("Inside a");
	}
	public static void main(String[] args) {
		final a v=new a();
		// v=new a();
		//v.f=22.22f;
	}
}