package day49;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeyword {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/day49/notes.txt"));
			String line = br.readLine();
			System.out.println(line);
			
			// throw new IOException("test");
			// throw new RuntimeException("test");
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			
		} finally {
			// finally block always runs
			try {
				br.close(); // close file
				System.out.println("File is closed");
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("File read is done");
		}
		
	}
