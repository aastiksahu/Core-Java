package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyVaildEmail {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("C:/Users/aasti/Desktop/OldEmail.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/aasti/Desktop/NewEmail.txt"));

		String email;

		while ((email = br.readLine()) != null) {

			if (email.endsWith("@gmail.com")) {

				System.out.println(email);
				bw.write(email);
				bw.newLine();

			}

		}
		bw.close();
		br.close();
	}

}
