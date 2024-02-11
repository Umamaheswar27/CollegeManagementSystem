package com;

import java.util.Scanner;

public class CollegeDriverClass 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		College collegeObject=new College();
		boolean status=true;
		while(status)
		{
			System.out.println();
			System.out.println("-----------------------------------------------WELCOME TO COLLEGE MANAGEMENT SYSTEM---------------------------------------");
			System.out.println("Enter your choice: \n 1: Add student \n 2: Display Student Information \n 3: Display particular student information \n 4: Update Student Rollno \n 5: Cancel Student Admission \n 6: Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
				
					System.out.println("Name: ");
					String name=sc.next();
					System.out.println("Age: ");
					int age=sc.nextInt();
					System.out.println("Father name: ");
					String fatherName=sc.next();
					System.out.println("Rollno: ");
					int rollNo=sc.nextInt();
					System.out.println("Gender: ");
					String gender=sc.next();
					System.out.println("College : ");
					String collegeName=sc.next();
					System.out.println("Rank: ");
					int rank=sc.nextInt();
					System.out.println("Fee: ");
					int collegeFee=sc.nextInt();
					
					collegeObject.addStudent(new Student(name, age, fatherName, rollNo, gender, collegeName, rank, collegeFee));
					System.out.println();
				}
			break;
			
			case 2:
				{
					collegeObject.displayDetails();
					System.out.println();
				}
			break;
			
			case 3:
			{
				System.out.println("Enter student roll number: ");
				int rollNO=sc.nextInt();
				collegeObject.particulurStudent(rollNO);
				System.out.println();
			}
			break;
			
			case 4:
				{
					System.out.println("Enter student roll number: ");
					int rollNO=sc.nextInt();
					collegeObject.updateRollNO(rollNO);
					System.out.println();
				}
			break;
			
			case 5:
				{
					System.out.println("Enter student roll number: ");
					int rollNO=sc.nextInt();
					collegeObject.cancelAdmission(rollNO);
					System.out.println();
				}
			break;
			
			case 6:
				{
					System.out.println(" THANK YOU..:) ");
				}
			break;
			
			default:
				{
				System.out.println("Enter correct choice: ");
				}
			}
		}
			
	}

}
