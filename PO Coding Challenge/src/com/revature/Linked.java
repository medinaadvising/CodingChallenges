package com.revature;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		
		LinkedList<Integer> A = new LinkedList<Integer>();
		LinkedList<Integer> B = new LinkedList<Integer>();
		
		A.add(3);
		A.add(7);
		A.add(8);
		A.add(10);
		
		B.add(99);
		B.add(1);
		B.add(8);
		B.add(10);
		
		System.out.println(A);
		System.out.println(B);
		
		for(int Intersect : A) {
			
			if(B.contains(Intersect)) {
				
				System.out.println("The LinkedList first intersect at value " + Intersect);
				
				return;
			}
		}
		
		

	}

}
