package com.practice;

class A{
	void Area(int side) {
		System.out.println("Area of square" + side* side);
	}
	void Area(int length,int breadth) {
		System.out.println("Area of Rectangle" + length* breadth);
	}
}
public class compiletime {
	public static void main(String [] args) {
		A obj = new A();
		obj.Area(5);
		obj.Area(3,5);
	}

}
