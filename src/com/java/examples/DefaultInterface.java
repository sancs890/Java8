package com.java.examples;

interface Phone{
	void call();
	default void message() {
		System.out.println("Messaging");
	}
	
	default void mail() {
		System.out.println("Mailing");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling");
	}
	
}

public class DefaultInterface {
	
	public static void main(String []args) {
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.call();
		androidPhone.message();
		androidPhone.mail();
	}

}
