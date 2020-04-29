package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * This program reads names and grades froam a file and claculates the 
 * average, lowest and highest score and prints them
 * 
 * @author Nirdesh
 *
 */
public class Question1 {
	public static void main(String[] args) throws FileNotFoundException{
		File gradesFile = new File("C:\\Users\\sthan\\eclipse-workspace\\ProgLab5\\src\\lab5\\Grades.txt");
		
		Scanner scGrades = new Scanner(gradesFile);
		
		int grade, min = 100, max= 0, totalGrades= 0 , total = 0;
		String hName="", lName="";
		
		while (scGrades.hasNext()) {
			String name = scGrades.next() ;
			name = name.substring(0, name.length()-1);
			
			grade = scGrades.nextInt();
			total += grade;
			totalGrades++;
			//Seperates the maximum and minimum grades
			max = (max < grade) ? grade: max;
			min = (min > grade) ? grade: min; 
			//Seperates the name with maximum and minimum grades
			hName = (max == grade) ? name: hName;
			lName = (min == grade) ? name: lName;
		}
		int average = total/totalGrades;
		System.out.println(hName + " got the highest grade with:" + max);
		System.out.println(lName + " got the lowest grade with:" + min);
		System.out.println("The average grade is: "+ average);
		System.out.println("Total amount of grades processed: " + totalGrades);
	}
}
