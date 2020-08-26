/* Elina Nourmand Assignment #1
 * This program will read in the last names 
 * and exam grades of 10 students for n exams.
 * It will calculate each student's average and letter grade.
 * The highest and lowest grades will be printed along with the student's name.
 */
import java.util.Scanner;
public class Assignment1 {
	public static void main (String [] args) {
		
		Scanner input= new Scanner (System.in);
		
		String[] names= new String [10];
		double [] sum= new double [10];
		
		//prompt to enter the number of exams the students took
		System.out.println("Enter the number of exams the "
				           + "students took");
		int n= input.nextInt();
		
		System.out.println();
		
		//prompt to enter every student's last name
	    System.out.println("Enter every student's last name");
	    //for loop to read in every student's last name
		for(int i=0;i<sum.length;i++) { 
		    sum[i]= 0;
		    names[i]= input.next();
		}
		
		System.out.println();
		
		//for loop to read in every student's grade for each exam
		for (int i=1; i<=n; i++) {
			//prompt to enter every student's grade for each exam
			System.out.println("Enter every student's grade "
					          + "for exam #"+ i);
			//for loop to add up each student's n exam grades
			for (int j=0; j<sum.length; j++) {
				sum [j]+= input.nextDouble();
			}
			System.out.println();
		}
		
		//for loop to print each student's name, 
		//average, and letter grade
		for (int j=0; j<sum.length; j++) {
			System.out.print (names [j]+ "'s average is "
		                      + (double) sum [j]/n);
			if ((double) (sum [j]/n) > 89)
				System.out.println(":A");
			else if ((double) (sum [j]/n) > 79)
				System.out.println(":B");
			else if ((double) (sum [j]/n) > 69)
				System.out.println(":C");
			else if ((double) (sum [j]/n) > 59)
				System.out.println(":D");
			else
				System.out.println(":F");
		}
		
		System.out.println();
		
		double highestGrade= sum[0]/n;
		String highestName= names [0];
		double lowestGrade= sum [0]/n;
		String lowestName= names [0];
		
		//for loop to find the highest and lowest grade along
		//with the student's name
		for (int k=0;k<sum.length;k++) {
			if ((double)sum[k]/n> highestGrade) {
				highestGrade= sum[k]/n;
				highestName= names [k];
			}
			if ((double)sum[k]/n< lowestGrade) {
				lowestGrade= sum[k]/n;
				lowestName= names [k];
			}
		}
		
		System.out.println(highestName+" received the "
				           + "highest grade: "+ highestGrade);
		System.out.println(lowestName+" received the "
				           + "lowest grade: "+ lowestGrade);

		input.close();
	}

}



