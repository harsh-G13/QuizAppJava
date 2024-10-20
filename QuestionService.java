import java.util.Scanner;

public class QuestionService {
    static Question[] questions = new Question[5];
    static String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Question 1 is good ", "op1", "op2", "op3", "op4", "Yeah! this is the answer");
        questions[1] = new Question(1, "Question 1 is good ", "op1", "op2", "op3", "op4", "Yeah! this is the answer");
        questions[2] = new Question(1, "Question 1 is good ", "op1", "op2", "op3", "op4", "Yeah! this is the answer");
        questions[3] = new Question(1, "Question 1 is good ", "op1", "op2", "op3", "op4", "Yeah! this is the answer");
        questions[4] = new Question(1, "Question 1 is good ", "op1", "op2", "op3", "op4", "Yeah! this is the answer");
    }

    public static void playQuiz() {
        for (int i=0;i<questions.length;i++) {
            Question q = questions[i];
            System.out.println("Question " + q.getId() + " :");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in); // making a scanner for user input
           selections[i] =  sc.nextLine(); // Takes the string as input

        }
    }
    public void printScore(){
        int score = 0;
        for(int i =0;i<questions.length;i++){
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String selectionAnswer = selections[i];
            if(actualAnswer.equals(selectionAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }

}
