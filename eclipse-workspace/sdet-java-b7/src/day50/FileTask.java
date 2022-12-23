package day50;

import java.io.File;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) {
		// sdet (no need to create this one)
		//    pom.xml (file)
		//    src (dir)
		//       hello.txt (file)
		//       oop.txt (file)
		//    target (dir)
		//       test.xlsx (file)
		
		// mkdir();
		// createNewFile();
		
		File sdet = new File("src/day50/sdet");
		
		File src = new File(sdet.getAbsolutePath() + "/src");
		src.mkdir();
		
		File target = new File(sdet.getAbsolutePath() + "/target");
		target.mkdir();
		
		try {
			File f1 = new File(src.getAbsolutePath() + "/hello.txt");
			f1.createNewFile();
			
			File f2 = new File(src.getAbsolutePath() + "/oop.txt");
			f2.createNewFile();
			
			File f3 = new File(target.getAbsolutePath() + "/test.xlsx");
			f3.createNewFile();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("All done!");
	}
}