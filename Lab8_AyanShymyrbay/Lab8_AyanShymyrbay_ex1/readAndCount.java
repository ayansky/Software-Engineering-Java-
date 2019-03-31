import java.io.File;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readAndCount {

	public static void main(String[] args) throws Exception{
		//initializing number of characters words lines
		int NoOfChar = 0;
		int NoOfWords = 0;
		int NoOfLines = 0;
		
		System.out.println("Reading file testCircle2D.java and counting the number of "
				+"characters, words and lines... ");
		//creating file objects
		File file = new File("testCircle2D.java");
		//Scanning file
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()){
			//reading a line
			String line = scan.nextLine();
			NoOfChar += line.length();
			//splitting a line into non word characters
			String[] lineArr = line.split("\\W+");
			for(int i=0; i<(lineArr.length); i++){
				//Finding a match of word a-z A-Z 0-9
				if(Pattern.matches(("\\w+"), lineArr[i])){
					NoOfWords++;
				}
			}
			NoOfLines++;
		}
		//new line characters adding
		NoOfChar+=NoOfLines;
		System.out.println("Characters:  " +NoOfChar);
		System.out.println("Words:  " +NoOfWords);
		System.out.println("Lines:  " +NoOfLines);
		
	}
}
