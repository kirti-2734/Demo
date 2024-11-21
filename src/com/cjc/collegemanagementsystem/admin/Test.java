package com.cjc.collegemanagementsystem.admin;

import java.util.Scanner;

import com.cjc.collegemanagementsystem.service.CJC;
import com.cjc.collegemanagementsystem.serviceImpl.AkurdiBranch;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CJC cjc = new AkurdiBranch();

		while(true)
		{

			System.out.println("*****Welcome To The CJC Akurdi Branch******");
			System.out.println("Enter 1 For Add Course");
			System.out.println("Enter 2 For View Course Details");
			System.out.println("Enter 3 For Add Faculty");
			System.out.println("Enter 4 For Faculty Details");
			System.out.println("Enter 5 For Add Batch");
			System.out.println("Enter 6 For View Batch Details");
			System.out.println("Enter 7 For Add  Student");
			System.out.println("Enter 8 For View Student Details");
			System.out.println("Enter 9 For Exit From The Application");
			System.out.println("*****************************************");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				cjc.addCourse();
				break;
			case 2:
				cjc.viewCourse();
				break;
			case 3:
				cjc.addFaculty();
				break;
			case 4:
				cjc.viewFaculty();
				break;
			case 5:
				cjc.addBatch();
				break;
			case 6:
				cjc.viewBatch();
				break;
			case 7:
				cjc.addStudent();
				break;
			case 8:
				cjc.viewStudent();
				break;
			case 9:
				System.out.println("***********Thank You************");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Option Selected....!");
				break;
			}
			
		}
		

		
	}

}
