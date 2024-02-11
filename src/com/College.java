package com;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class College 
{
	Student studentObject;
	 

	
	/**
	 * @return the studentObject
	 */
	public Student getStudentObject() {
		return studentObject;
	}

	/**
	 * @param studentObject the studentObject to set
	 */
	public void setStudentObject(Student studentObject) {
		this.studentObject = studentObject;
	}


	Scanner sc=new Scanner(System.in);
	ArrayList<Student> studentArrayObject=new ArrayList();
	
	/*------------------------------------------------Adding a student----------------------------------------------*/
	
	public void addStudent(Student studentObject)
	{
		studentArrayObject.add(studentObject);
		System.out.println("Student added succssfully.");
		
	}
	
	/*------------------------------------------Displaying student Information-------------------------------------*/
	
	public void displayDetails()
	{
		if(studentArrayObject.isEmpty())
		{
			throw new NoStudentFoundException();
		}
		else
		{
			for(Student student:studentArrayObject)
			{
				student.studentInfo();
				System.out.println();
			}
		}
		
	}
	
	
	/*------------------------------------Display particular student information-----------------------------------*/
	public void particulurStudent(int rollNo)
	{
		ListIterator<Student> listIteratorCursor=studentArrayObject.listIterator();
		boolean isFound=false;
		if(studentArrayObject.isEmpty())
		{
			throw new NoStudentFoundException();
		}
		else
		{
			for(Student student:studentArrayObject)
			{
				if(student.getRollNo()==rollNo)
				{
					System.out.println("Student found successfully");
					student.studentInfo();
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new NoSuchRollNoFoundException();
			
		}
	}
	
	
	/*------------------------------------------Update student Information---------------------------------------*/
	
	public void updateRollNO(int rollNo)
	{
		ListIterator<Student> listIteratorCursor=studentArrayObject.listIterator();
		boolean isFound=false;
		if(studentArrayObject.isEmpty())
		{
			throw new NoStudentFoundException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Student student=listIteratorCursor.next();
				if(student.getRollNo()==rollNo)
				{
					System.out.println("Enter the new roll number: ");
					int newRollNo=sc.nextInt();
					student.setRollNo(newRollNo);
					System.out.println("Roll number changed successfully..:)");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new NoSuchRollNoFoundException();
			
		}
	}
	
	
	/*--------------------------------------Cancel Student Admission---------------------------------------------*/
	
	public void cancelAdmission(int rollNo)
	{
		ListIterator<Student> listIteratorCursor=studentArrayObject.listIterator();
		boolean isCancel=false;
		if(studentArrayObject.isEmpty())
		{
			throw new NoStudentFoundException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Student student=listIteratorCursor.next();
				if(student.getRollNo()==rollNo)
				{
					listIteratorCursor.remove();
					System.out.println("Admission cancelled successfully");
					isCancel=true;
				}
			}
		}
		if(isCancel==false)
		{
			throw new NoSuchRollNoFoundException();
		}
	}
	

	
}
