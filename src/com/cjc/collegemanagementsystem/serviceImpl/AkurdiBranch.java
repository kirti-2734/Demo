package com.cjc.collegemanagementsystem.serviceImpl;

//import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.collegemanagementsystem.model.Batch;
import com.cjc.collegemanagementsystem.model.Course;
import com.cjc.collegemanagementsystem.model.Faculty;
import com.cjc.collegemanagementsystem.model.Student;
import com.cjc.collegemanagementsystem.service.CJC;

public class AkurdiBranch implements CJC {

	List<Course> clist = new ArrayList<>();

	List<Faculty> flist = new ArrayList<>();

	List<Batch> blist = new ArrayList<>();

	List<Student> slist = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {

		Course c1 = new Course();
		System.out.println("Enter Course Id Here");
		c1.setCid(sc.nextInt());
		System.out.println("Enter Course name Here");
		c1.setCname(sc.next() + sc.nextLine());
		System.out.println("Enter Course Duration here ");
		c1.setCduration(sc.next() + sc.nextLine());
		System.out.println("Enter Course Feess Here");
		c1.setCfees(sc.nextDouble());
		


		clist.add(c1);

		System.out.println("Course Added SuccessFully.....!");

	}

	@Override
	public void viewCourse() {

		System.out.println("Enter Course Id Here To View Course Details");
		int ucid = sc.nextInt();

		for (Course cou : clist) {

			if (ucid == cou.getCid()) {
				System.out.println("****************Course Information***********");
				System.out.println("Course Id :" + cou.getCid());
				System.out.println("Course Name :" + cou.getCname());
				System.out.println("Course Duration:" + cou.getCduration());
				System.out.println("Course Fees:" + cou.getCfees());
				System.out.println("******************************************");
			}

		}

	}

	@Override
	public void addFaculty() {

		Faculty faculty = new Faculty();
		System.out.println("Enter Facutly Id Here");
		faculty.setFid(sc.nextInt());
		System.out.println("Enter Facult Name Here");
		faculty.setFname(sc.next() + sc.nextLine());
		System.out.println("Enter Facult Address Here");
		faculty.setAddress(sc.next() + sc.nextLine());
		System.out.println("Enter Faculty MobileNo Here");
		faculty.setMobileNo(sc.nextLong());

		System.out.println("Enter Course Id Here To Assign the Faculty");
		int ucid = sc.nextInt();

		for (Course cou : clist) {
			if (ucid == cou.getCid()) {
				faculty.setCourse(cou);

				flist.add(faculty);

			}

		}
		System.out.println("Faculty Added SuccessFully.....!");

	}

	@Override
	public void viewFaculty() {

		System.out.println("Enter Faculty Id Here To view Details");
		int ufid = sc.nextInt();

		for (Faculty faculty : flist) {
			if (ufid == faculty.getFid()) {
				System.out.println("*********Faculty Information*******");
				System.out.println("Faculty Id :" + faculty.getFid());
				System.out.println("faculyt Name :" + faculty.getFname());
				System.out.println("Faculty Address :" + faculty.getAddress());
				System.out.println("Faculty MobileNo :" + faculty.getMobileNo());

				Course cou = faculty.getCourse();
				System.out.println("Course Id :" + cou.getCid());
				System.out.println("Couse Name :" + cou.getCname());
				System.out.println("Course Duration :" + cou.getCduration());
				System.out.println("Course Fees :" + cou.getCfees());

			}
		}

	}

	@Override
	public void addBatch() {
		Batch pp = new Batch();
		System.out.println("Enter Batch Id");
		int b1 = sc.nextInt();
		pp.setBid(b1);
		System.out.println("Enter Batch Name");
		String  b2 = sc.next()+sc.nextLine();
		pp.setBname(b2);
		System.out.println("Enter total Student");
		int b3 = sc.nextInt();
		pp.setTot_stu(b3);
		System.out.println("Enter faculty Id");
		int fid = sc.nextInt();
		for(Faculty dd: flist)
		{
			if(fid==dd.getFid())
			{
				pp.setFaculty(dd);
				
			}
		}
		blist.add(pp);
		System.out.println("Batch Added SuccessFully.....!");
	}

	@Override
	public void viewBatch() {
		System.out.println("Enter Batch id:");
		int bid = sc.nextInt();
		for(Batch b1:blist)
		{
			if(bid==b1.getBid())
			{
				System.out.println("Batch ID: "+b1.getBid());
				System.out.println("Batch Name: "+b1.getBname());
				System.out.println("Batch Student: "+b1.getTot_stu());
				Faculty t1 = b1.getFaculty();
				System.out.println("Faculty ID: "+t1.getFid());
				System.out.println("Faculty Name: "+t1.getFname());
				System.out.println("Faculty Address: "+t1.getAddress());
				System.out.println("Faculty Mobile No.: "+t1.getMobileNo());
				System.out.println("Cource: "+t1.getCourse());
			}
		}

	}

	@Override
	public void addStudent() {
		Student s1 = new Student();
		System.out.println("Enter Student ID: ");
		int st1 = sc.nextInt();
		s1.setSid(st1);
		System.out.println("Enter Student name: ");
		String st2 = sc.next()+sc.nextLine();
		s1.setSname(st2);
		System.out.println("Enter Student Address: ");
		String st3 = sc.next()+sc.nextLine();
		s1.setAddress(st3);
		System.out.println("Enter Student Mobile No.:");
		long st4 = sc.nextLong();
		s1.setMobileNo(st4);
		System.out.println("Enter Batch Id");
		int id4 = sc.nextInt();
		for(Batch ba:blist)
		{
			if(id4==ba.getBid())
			{
				s1.setBatch(ba);
			}
			
		}
		slist.add(s1);

	}

	@Override
	public void viewStudent() {
		System.out.println("Enter Student Id");
		int sid= sc.nextInt();
		for(Student k1:slist)
		{
			if(sid==k1.getSid())
			{
				System.out.println("Student ID: "+k1.getSid());
				System.out.println("Student name: "+k1.getSname());
				System.out.println("Student Address: "+k1.getAddress());
				System.out.println("Student Mobile No.: "+k1.getMobileNo());
				
				Batch jj = k1.getBatch();
				System.out.println("Batch ID: "+jj.getBid());
				System.out.println("Batch Name: "+jj.getBname());
				System.out.println("Batch Student: "+jj.getTot_stu());
				
						
			}

	}

	}
}
	