package day49;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/day49/notes.txt"));
			String line = br.readLine();
			System.out.println(line);
			
			br.close();
			System.out.println("File read is done");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}