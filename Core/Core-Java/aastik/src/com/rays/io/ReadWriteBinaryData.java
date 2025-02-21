package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {

	public static void main(String[] args) throws Exception {

		String source = "C:/Users/aasti/Desktop/test/test1/test.jpg";
		String target = "C:/Users/aasti/Desktop/test/test.jpg";

		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));

		int i = bi.read();

		while (i != -1) {

			System.out.println(i);

			bo.write(i);

			i = bi.read();

		}

		System.out.println("copy successfully------------");

		bi.close();
		bo.close();
	}

}
