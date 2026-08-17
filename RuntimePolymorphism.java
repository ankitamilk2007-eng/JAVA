package com.practice;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
		}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat meows");
	}
}
public class RuntimePolymorphism {
	public static void mai(String [] args){
		Animal obj;
		obj = new Dog();
		obj.sound();
		obj = new Cat();
		obj.sound();
	}
}
