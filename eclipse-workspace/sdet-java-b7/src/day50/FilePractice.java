
package day50;

import java.io.File;
import java.io.IOException;

public class FilePractice {
	public static void main(String[] args) {
		// File object represents files and directories in Java
		// - it can read information about the file/directory
		// - it can create files and directories
		// - it can delete files and directories
		
		File myNotes = new File("/Users/Salih/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
		
		System.out.println("Files exists: " + myNotes.exists());
		System.out.println("File name: " + myNotes.getName());
		System.out.println("Full path: " + myNotes.getAbsolutePath());
		
		System.out.println("Is file: " + myNotes.isFile());
		System.out.println("Is directory: " + myNotes.isDirectory());
		
		System.out.println(myNotes.length() + "Bytes"); // Bytes
		
		// last modified date will be epoch format
		System.out.println(myNotes.lastModified()); // 1670373524259
		
		System.out.println("------");
		
		File myNewFile = new File("/Users/Salih/eclipse-workspace/sdet-java-b7/src/day50/nameList.txt");
		
		
		
	}
}