package altaqor.assignments.assignment23;

import java.util.ArrayList;

//Write a program to declare and initialize a List of integers and print its contents.

public class listQuestion1 {

	public static void main(String[] args) {
	ArrayList < Integer> num  = new ArrayList<Integer>();
	num.add(1);
	num.add(4);
	num.add(10);
	num.add(90);
	for(int data: num) {
		System.out.println("Elements :"  + data);
	}
	System.out.println("Elements of List:" + num);
	

	}

}
