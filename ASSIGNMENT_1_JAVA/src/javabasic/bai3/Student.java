package javabasic.bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	//tao thuoc tinh cho Student
	private String fullName;
	private String address;
	private Date dob;
	private String gender;
	private float finalGrade;
	
	//tao phuong thuc SET
	public void setFullName (String fullName) {
		this.fullName = fullName;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	public void setDob (String dob) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		Date date = formatter.parse(dob);
		this.dob = date;
	}
	public void setGender (String gender) {
		this.gender = gender;
	}
	public void setFinalGrade (String finalGrade) {
		float f = Float.parseFloat(finalGrade);
		this.finalGrade = f;
	}
	
	//tao phuong thuc GET
	public String getFullName() {
		return fullName;
	}
	public String getAddress() {
		return address;
	}
	public Date getDob() {
		return dob;
	}
	public String getGender() {
		return gender;
	}
	public float getFinalGrade() {
		return finalGrade;
	}
	
	@Override
	public String toString() {
		return ".FullName: " + fullName + "\n"+".Address: " + address +"\n"+ ".DOB: " + dob + "\n" + ".Gender: " + gender
				+ "\n" + ".FinalGrade: " + finalGrade + "\n";
	}
	
	

	
	
	
}
