package day51;

import java.io.File;

public class DeleteFiles {
	public static void main(String[] args) {
		File file = new File("resources/testFile.txt");
		System.out.println("File exists: " + file.exists());
		
		boolean isDeleted = file.delete();
		System.out.println("Is deleted: " + isDeleted);
		System.out.println("---");
		
		// folder can be deleted if they are empty by using the same method
		File testFolder = new File("resources/test");
		System.out.println("Folder exists: " + testFolder.exists());
		
		// delete all files under this folder
		System.out.println("Delete all files under this folder");
		File[] filesUnderTestFolder = testFolder.listFiles();
		
		if (filesUnderTestFolder != null && filesUnderTestFolder.length > 0) {
			for (File eachFile :  filesUnderTestFolder) {
				boolean eachDeleted = eachFile.delete();
				System.out.println(eachFile + " : " + eachDeleted);
			}
		}
		
		// delete folder
		System.out.println("Delete folder");
		boolean isFolderDeleted = testFolder.delete();
		System.out.println("Is folder deleted: " + isFolderDeleted);
		
	}
}