package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws Exception {

		Student s = new Student(1, "Rays");

		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:/Users/aasti/Desktop/test/test1/Student.txt"));

		out.writeObject(s);
		out.close();

		// Deserilization
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:/Users/aasti/Desktop/test/test1/Student.txt"));

		s = (Student) in.readObject();

		System.out.println(s);

		in.close();

	}

}
