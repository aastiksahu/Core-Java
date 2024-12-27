package com.rays.io;

import java.io.FileReader;

public class FileRed {

	public static void main(String[] args) throws Exception {
		// open file
		FileReader reader = new FileReader("C:/Users/aasti/Desktop/aastik sahu.txt");

		// Read a char as ASCII or Unicode.
		int ch = reader.read();

		char chr;

		// ch is -1 if no more char is left in file

		while (ch != -1) {

			chr = (char) ch; // type cast to char

			System.out.print(chr);
			
			ch = reader.read(); // read next character
		}

		reader.close();

	}

}
