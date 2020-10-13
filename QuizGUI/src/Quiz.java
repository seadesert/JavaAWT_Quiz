//class Quiz and class QuixQuestion are to be added to seperate clases as Quiz holds global variables and QuizQuestion hold local variables for the specific question

public class Quiz
{
     //for "class Quiz", holds the values that like global variaable and do not change for the a quix 
    public static int last_count = 5;
    //Time left is calcualted in each question form as time_left - time_taken( refer below )
    public static int time_left = 10;
    public static int score = 13;
    //state_review is boolean that stores the state whether the user is review the question (after the result), while reviewing the correct answer is shown, default its false, after result is shown it is set to true
    public boolean state_review = false;
    //store the current position (question) in the quiz
    public int current_count;
}