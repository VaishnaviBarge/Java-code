package quiz;

import java.util.Scanner;

public class QuestionInfo {
	
	public Question[] createQuestions() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of questions you want : ");
		int n=sc.nextInt();
		sc.nextLine();
		Question[] questions=new Question[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the question no "+(i+1));
			String quest=sc.nextLine();
			
			System.out.println("Enter 4 options for the Question ");
			String opt1=sc.nextLine();
			String opt2=sc.nextLine();
			String opt3=sc.nextLine();
			String opt4=sc.nextLine();
			System.out.println("Enter the correct Answer for the same ");
			String ans=sc.nextLine();
			Question questionObj=new Question(i, quest, opt1, opt2, opt3, opt4, ans);
			questions[i]=questionObj;
		}
		return questions;
	}
	public void displayQuestions(Question[] questions) {
		int score = 0;
		for(Question q:questions) {
			 System.out.println("Q"+q.getId()+". "+q.getQuestion());
			 System.out.println("1. "+q.getOpt1()+" 2. "+q.getOpt2()+" 3. "+q.getOpt3()+" 4. "+q.getOpt4());
			 System.out.println("Enter your Answer");
			 Scanner sc=new Scanner(System.in);
			 String a=sc.nextLine();
			 String ans=q.getAns();
			 if(a.equals(ans)){
//				 System.out.println("Correct Choice");
				 score ++;
			 }
//			 else {
//				 System.out.println("Your Wrong ");
//			 }
//			 System.out.println("the correct answer is "+q.getAns());
			 System.out.println();
		}
		System.out.println("the total score is :"+score );
		
	}
	public static void ArmstrongNumber() {
		
	}
}
