package org.gyt.aaric;

public class Dog{
	
	void call(){
		System.out.println("dog call");
	}
	void noCall(char a){
		
		System.out.println(a+"is a dog no call");
	}
	public static void main(String[] args){
		Dog dog=new Dog();
		dog.call();
		dog.noCall("A");
	}
}
