package com.rays.io;

import java.io.File;
import java.io.FileWriter;

public class FileWri {
	public static void main(String[] args) throws Exception{
		
		FileWriter w = new FileWriter("C:/Users/aasti/Desktop/rays.txt",true);
		
		char[] cArray= {'h','i'};
		w.write(cArray);                  //write a char
		w.write(',');
		w.write("Sunil Os");
		
		
		String s = "aastik";             //write in String
		w.write(s);
		w.close();
	}

}