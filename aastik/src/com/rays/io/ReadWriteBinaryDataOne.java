package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryDataOne {

	public static void main(String[] args) throws Exception {

		String source = "C:/Users/aasti/Desktop/test/test1/test.jpg";
		String target = "C:/Users/aasti/Desktop/test/test.jpg";

		FileInputStream fi = new FileInputStream(source);
		FileOutputStream fo = new FileOutputStream(target);

		BufferedInputStream bi = new BufferedInputStream(fi);
		BufferedOutputStream bo = new BufferedOutputStream(fo);

		int i = bi.read();

		while (i != -1) {

			System.out.println(i);

			bo.write(i);

			i = fi.read();

		}

		System.out.println("copy sucessfully-----------");
		fi.close();
		fo.close();

	}

}
