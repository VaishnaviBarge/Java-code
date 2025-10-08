package quiz;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionInfo qInfo=new QuestionInfo();
		Question[] q=qInfo.createQuestions();
		qInfo.displayQuestions(q);
		
		
	}

}
