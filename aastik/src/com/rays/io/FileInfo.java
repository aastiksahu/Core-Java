package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {

		File f = new File("C:/Users/aasti/Desktop/aastik.docx");

		if (f.exists()) {

			System.out.println("Name:" + f.getName());

			System.out.println("Path:" + f.getAbsolutePath());

			System.out.println("Access Permision");

			System.out.println("Writable:" + f.canWrite());

			System.out.println("Readable:" + f.canRead());

			// Check if it is a Directory or file.
			System.out.println("IS File:" + f.isFile());

			System.out.println("Is Dir:" + f.isDirectory());

			// Last Modified Date of file/Directory
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified:" + d);

			// Length of file
			long length = f.length();
			System.out.println("Length:" + length + " bytes");
		} else {
			System.out.println("File does not exist");
		}

	}

}
