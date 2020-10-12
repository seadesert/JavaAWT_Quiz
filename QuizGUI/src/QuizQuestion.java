

//This is test class simulating the quiz class the objects for the class for now declared static for testing

//class Quiz and class QuixQuestion are to be added to seperate claases as Quix holds global variables and QuizQuestion hold local variables for the specific question

public class QuizQuestion 
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
    
    
    
    
    //for class "QuizQuestion", holds the values specifics to that question that changes for every question
    
    //question no
    public static int question_count = 2;    
    //question string and options
    public static String question_string = "What is the capital of australia?";
    public static String options[] = {"Sydney", "Canberra", "Perth", "Brisbane"};
    
    // Holds the values inputted by the user
    public String answer_string;
    public int answer_option;
    // Holds the actual correct answer for the question     
    public static String correct_answer_string = "Canberra";
    public static int correct_answer_option = 2;
    
    //Time taken to answer the question, used to calculate the time left in each "next" or "previous" button clicks, its calculated as time_left = time_left - time_taken;
    public static int time_taken;

    
}
