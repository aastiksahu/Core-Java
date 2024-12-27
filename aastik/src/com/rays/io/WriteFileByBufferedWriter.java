package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileByBufferedWriter {
	
	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("C:/Users/aasti/Desktop/aastik.docx");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		char[] charArray = {'h','i'};
		
		bw.write(charArray);
		bw.write(',');
		bw.write("SunRays");
		
		System.out.println("Successfully");
		
		bw.close();
		
	}

}
