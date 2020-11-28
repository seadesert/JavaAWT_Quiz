package Class;


public class QuizQuestion 
{   
    //Holds question_type out of possible values = {single-word, true-false, number, single-option, multiple-option}
    public String question_type = "";
    
    //Holds question no
    public int question_count = 0; 
    
    //Holds marks allocated for correct answer for the quiz
    public int question_marks = 0;
    
    //Holds question string and options
    public String question_string = "null";
    public String options[] = {"null", "null", "null", "null"};
  
    //Holds the answers inputted by the user 
    public String answer_string = null;
    
    public Float answer_number = null;

    public Boolean answer_tf = null;
    
    public int[] answer_options = new int[]{0, 0, 0, 0};
 
    // Holds the correct answers for the question     
    public String correct_answer_string = null;
    
    public Float correct_answer_number = null;
        
    public Boolean correct_tf = null;

    public int[] correct_answer_options = new int[4];

    public static int time_taken;
}
