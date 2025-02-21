package com.rays.io;

import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) throws Exception {
		
		//Specify the file to write to
		PrintWriter pw =new PrintWriter("C:/Users/aasti/Desktop/test/test1/PrintWriter.txt");
		
		//write data to the file
		pw.println("Welcome to java Programing");
		pw.println("this is an example of Printwriter");
		pw.println("it allows writing formatted text to file easily");
		
		//close the PrintWriter
		pw.close();
		
		System.out.println("Data written Successfully to the file.");

	}

}
