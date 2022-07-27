package com.niketshah;
enum Subjects {
		DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}

public class Books {
		public static void main(String[] args) {
			Subjects[] s = Subjects.values();
			for (Subjects subjects : s) {
				System.out.println("Value of enum " + subjects.name() + " Index of value " + subjects.ordinal());
			}
		}
}
