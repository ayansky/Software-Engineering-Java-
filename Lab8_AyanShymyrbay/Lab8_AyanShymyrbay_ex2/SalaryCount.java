import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalaryCount {

	public static void main(String[] args) throws Exception{
		//defining and initializing Number of professors
		int NoOfAssistant = 0;
		int NoOfAssociate = 0;
		int NoOfFull = 0;
		int NoOfAllFaculties = 0;
		
		//defining and initializing Salary of professors
		double salaryOfAssistant = 0.0;
		double salaryOfAssociate = 0.0;
		double salaryOfFull = 0.0;
		double salaryOfAllFaculties = 0.0;
		
		//Creating File object
		File file = new File("Salary.txt");
		//Reading from a file
		Scanner scan = new Scanner(file);
		
		
		
		while(scan.hasNextLine()){
			//Reading a line and splitting it by whitespace
			String line = scan.nextLine();
			String[] lineArr = line.split("\\s");
			
			//Searching for a macth 
			if(Pattern.matches("assistant", lineArr[2])){
				NoOfAssistant++;
				salaryOfAssistant +=Double.parseDouble(lineArr[3]);
			}
			
			else if(Pattern.matches("associate", lineArr[2])){
				NoOfAssociate++;
				salaryOfAssociate +=Double.parseDouble(lineArr[3]);
			}
			
			else if(Pattern.matches("full", lineArr[2])){
				NoOfFull++;
				salaryOfFull +=Double.parseDouble(lineArr[3]);
			}
			else {
				System.out.println("Invalid name/data");
			}
			
		}
		//Total Number and Salaries
		NoOfAllFaculties = NoOfAssistant + NoOfAssociate + NoOfFull;
		salaryOfAllFaculties = salaryOfAssistant + salaryOfAssociate + salaryOfFull;
		
		//Printing out Salaries
		System.out.println("Total Salaries ");
		System.out.println("..................");
		System.out.println("Assistant\tAssociate\tFull\t\tTotal");
		System.out.printf("%.2f\t",salaryOfAssistant);
		System.out.printf("%.2f\t",salaryOfAssociate);
		System.out.printf("%.2f\t",salaryOfFull);
		System.out.printf("%.2f\n",salaryOfAllFaculties);
		System.out.println("----------------------------------------------------------");
		System.out.println("Average Salaries ");
		System.out.println("..................");
		System.out.println("Assistant\tAssociate\tFull\t\tTotal");
		System.out.printf("%.2f\t",salaryOfAssistant/NoOfAssistant);
		System.out.printf("%.2f\t",salaryOfAssociate/NoOfAssociate);
		System.out.printf("%.2f\t",salaryOfFull/NoOfFull);
		System.out.printf("%.2f",salaryOfAllFaculties/NoOfAllFaculties);
	}
}
