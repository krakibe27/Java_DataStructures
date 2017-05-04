package com.stack.demo;


class Stack {
	private int top = -1;
	
	private int array[];
	
	
	public Stack(int maxSize){
		array = new int[maxSize];
	}
	
	
	public void push(int s){
		array[++top] = s;
	}
	
	public void displayStack(){
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i]+" ,");
		}
	}
	
	public boolean isEmpty(){
		if(top == -1)
			return true;
		else{
			return false;
		}
	}
	
	public void peek(){
		System.out.println(array[top]);
	}
	public int pop(){
		return array[top--];
	}
	
	public void displayTop(){
		System.out.println(array[top]);
	}
}

public class MyStack {

	public static void main(String[] args) {
		
		Stack s1 = new Stack(4);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.displayStack();
		
		System.out.println("After pop");
	
	
		s1.displayStack();
		
		System.out.println(s1.isEmpty());
		s1.peek();
	}
	
	
	
}
