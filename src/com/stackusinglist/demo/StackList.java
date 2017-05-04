package com.stackusinglist.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Stack{
	
	public void push(int p);
	public void display();
	public int pop();
	public boolean isEmpty();
	
}


public class StackList implements Stack{

	public List list = new ArrayList();
	
	public void push(int p){
		list.add(p);
	}


	@Override
	public void display() {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}


	@Override
	public int pop() {
		
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		StackList s = new StackList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
	}
}
