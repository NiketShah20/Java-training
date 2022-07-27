package com.niketshah;
// b) If while accessing the enums I pass an argument or say
//value which is not present in the enum then what kind of exception will be thrown?

import java.util.Scanner;

enum Subjects2 {
	DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}

public class Books2 {
	static void bookUpdate(Subjects2 s) {
		switch(s){
		case DBMS:System.out.println("Database Management System by Mcc Graw Hill");
		break;
		case DSA:System.out.println("Data Structures and Algorithms by Thomas H Cormen");
		break;
		case NETWORKING:System.out.println("Networking by Technical");
		break;
		case OPERATING_SYSTEMS:System.out.println("Operating system by Silberschatz, Galvin and Gagne");
		break;
		}
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String subject=sc.next();
		Subjects2 s1=Subjects2.valueOf(subject);
		bookUpdate(s1);
	}


}
