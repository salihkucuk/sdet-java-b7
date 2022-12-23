package day51;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) {
		// copyFile("resources/TernaryOperator.mp4", "resources/copy/copyTOwihtBuffer.mp4");
		copyWithBuffer("resources/TernaryOperator.mp4", "resources/copy/copyTOwihtBuiltInBuffer.mp4");
	}
	
	public static void copyFile(String source, String target) {
		File sourceFile = new File(source);
		File targetFile = new File(target);
		
		System.out.println("Copy source: " + sourceFile);
		System.out.println("Into target: " + targetFile);
		
		try (InputStream input = new FileInputStream(sourceFile);
			 OutputStream output = new FileOutputStream(targetFile)) {
			// with buffer we can specify how many bytes to read at the time
			byte[] buffer = new byte[1024];
			
			int b;
			while ((b = input.read(buffer)) != -1) {
				output.write(buffer, 0, b);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("Copy is done");
	}
	
	public static void copyWithBuffer(String source, String target) {
		System.out.println("copy with buffer");
		System.out.println("source: " + source);
		System.out.println("target: " + target);
		
		try (BufferedInputStream bInput = new BufferedInputStream(new FileInputStream(source));
			 BufferedOutputStream bOutput = new BufferedOutputStream(new FileOutputStream(target))) {
			
			int b;
			while ((b = bInput.read()) != -1) {
				bOutput.write(b);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}