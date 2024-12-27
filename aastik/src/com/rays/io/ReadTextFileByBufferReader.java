package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFileByBufferReader {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("C:/Users/aasti/Desktop/rays.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		while (str != null) {
			
			System.out.println(str);
			
			str = br.readLine();
						
		}
		
		fr.close();
		
		
	}

}
