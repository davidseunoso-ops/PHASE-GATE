import java.util.Scanner;

public class StudentGradingSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of student in class: ");
		int studentNumber = scanner.nextInt();
		
		System.out.print("Enter the number of subject offered: ");
		int subjectsOffered = scanner.nextInt();
		
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		
		int[][] scores = new int[studentNumber][subjectsOffered];
		
		for (int index = 0; index < scores.length; index++) {
			System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("    Entering scores for Student " + (index + 1));
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			for (int count = 0; count < scores[index].length; count++) {
			
				int inputScore;
				while(true) {
					System.out.print("Enter score for subject " + (count + 1) + ": ");
					inputScore = scanner.nextInt();
					
					if (inputScore >= 0 && inputScore <= 100) {
						break;
					}
						else {
							System.out.println("Invalid score input. Try again!");
						}
				}
				scores[index][count] = inputScore;
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully");
			}
		}
		
		int[] total = new int[studentNumber];
		
		for (int count = 0; count < studentNumber; count++) {
			int sum = 0;
			
			for (int index = 0; index < subjectsOffered; index++) {
				sum += scores[count][index];
			}
			total[count] = sum;
		}
		
		int[] studentClassPosition = new int[studentNumber];
		
		for (int count = 0; count < studentNumber; count++) {
			studentClassPosition[count] = 1;
			
			for (int index = 0; index < studentNumber; index++) {
				if (total[index] > total[count]) {
					studentClassPosition[count]++;
				}
			}
		}
		
		System.out.println("\n==============================================================");
		System.out.println("		     STUDENT GRADING RESULT");
		
		System.out.printf("%12s", "STUDENT");
		for (int index = 0; index < subjectsOffered; index++) {
			System.out.printf("%8s", "SUB" + (index + 1));
		}
		
		System.out.printf("%10s%10s%10s%n", "TOTAL", "AVERAGE", "POSITION");
		System.out.println("==============================================================");
		
		for (int count = 0; count < studentNumber; count++) {
			double average = (double) total[count] / subjectsOffered;
			System.out.printf("%12s", "STUDENT " + (count + 1));
			
			for (int index = 0; index < subjectsOffered; index++) {
				System.out.printf("%8d", scores[count][index]);
			} 
			System.out.printf("%10d%10.2f%10d%n", total[count],average,studentClassPosition[count]);
		}
		System.out.println("==============================================================");
	
	}
}
