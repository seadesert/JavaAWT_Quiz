package Class;


public class Quiz
{
    //for "class Quiz", holds the values that like global variaable and do not change for the a quix  
    public static String Quiz_Name = "null";
    
    //last_count holds the total number of question in the quiz
    public static int last_count = 0;
    
    //holds total time allocated to the quiz in seconds
    public static int total_time = 0;
    
    //holds total time allocated to the quiz in seconds
    public static int time_taken = 0;
    
    //Time left is calcualted in each question form as time_left - time_taken( refer below )
    public static int time_left = 0;
    
    //Holds the current score held by the user
    public static int score = 0;
    
    //Holds total score possible in the quiz
    public static int score_max = 0;
    
    //store the current position (question) in the quiz
    public static int current_count = 0;
}
