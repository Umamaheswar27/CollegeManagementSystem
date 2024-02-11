package com;

public class Student
{
	private String name;
	private int age;
	private String fatherName;
	private int rollNo;
	private String gender;
	private String collegeName;
	private int rank;
	private int collegeFee;
	
	
	/*----------------------------------------------Creating empty constructor---------------------------------------*/
	public Student()
	{
		
	}
	
	/*---------------------Initialize the non static variables using constructor-------------------------------------*/
	
	public Student(String name, int age, String fatherName, int rollNo, String gender,String collegeName, int rank, int collegeFee)
	{
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.gender = gender;
		this.collegeName = collegeName;
		this.rank = rank;
		this.collegeFee = collegeFee;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}


	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}


	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}


	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}


	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}


	/**
	 * @return the collegeFee
	 */
	public int getCollegeFee() {
		return collegeFee;
	}


	/**
	 * @param collegeFee the collegeFee to set
	 */
	public void setCollegeFee(int collegeFee) {
		this.collegeFee = collegeFee;
	}

	
	/*-------------------------------------------------Displaying student Details-----------------------------------*/
	
	public void studentInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Father name: "+fatherName);
		System.out.println("Rollno: "+rollNo);
		System.out.println("Gender: "+gender);
		System.out.println("College : "+collegeName);
		System.out.println("Rank: "+rank);
		System.out.println("Fee: "+collegeFee);
		
	}
	
}
