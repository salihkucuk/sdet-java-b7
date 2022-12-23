package day51;

import java.io.File;
import java.io.IOException;

public class Review {
	public static void main(String[] args) {
		// File represents files and directories
		// - read meta about the file
		// - create new file or directory
		// - delete files and directories
		
		
		// absolute path is path from root directory
		File file = new File("/Users/beknazarsuranchiyev/Desktop/Day51_B7.pdf");
		System.out.println(file.exists());
		System.out.println("Size: " + file.length() + " Bytes");
		System.out.println("---");
		
		// relative path is a path from the place code is running
		File fileTwo = new File("src/day03/HelloClass.java");
		System.out.println(fileTwo.exists());
		System.out.println("Size: " + fileTwo.length() + " Bytes");
		System.out.println(fileTwo.getAbsolutePath());
		System.out.println("---");
		
		File newFile = new File("/Users/Salih/eclipse-workspace/sdet-java-b7/src/day51/notes.txt");
		try {
			if (!newFile.exists()) {
				boolean isCreated = newFile.createNewFile();
				System.out.println(isCreated);
			} else {
				System.out.println("it exists");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("---");
		
		File newDir = new File("/Users/Salih/Desktop/test");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("new dir is created");
		} else {
			System.out.println("dir exists");
		}
		
	}
}