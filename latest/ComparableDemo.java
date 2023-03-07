package com.latest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student s) {
		
		return age>s.age?1:-1;
	}
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> student =new ArrayList<>();
		student.add(new Student(101, "JOMON", 10));
		student.add(new Student(103, "ANU", 8));
		student.add(new Student(102, "JOBY", 9));
		student.add(new Student(105, "AMAL", 5));
		
		Collections.sort(student);
		
		for(Student s:student) {
			System.out.println(s);
		}

	}

}
