package Class;



//This is test class simulating the quiz class, TODO: remove keyword static
//QuizQuestion hold local variables for the specific question

public class QuizQuestion 
{   
    //Holds question_type out of possible values = {single-word, true-false, number, single-option, multiple-option}
    public String question_type = "";
    
    //Holds question no
    public int question_count = 0; 
    
    //Holds marks allocated for correct answer for the quiz
    public int question_marks = 0;
    
    //Holds question string and options
    public String question_string = "";
    public String options[] = {"", "", "", ""};
  
    //Holds the values inputted by the user (Note all values are intialized to null or -1
    public String answer_string = null;
    
    //Holds the number value inputted by the user
    public float answer_number = -1;
    
    //Holds the value selected by the user for single answer mcq
    public int answer_option = -1;
    
    //Holds the value selected by the user for true or false question
    public Boolean answer_tf = null;
    
    //Holds the values selected by the user for multiple answer mcq
    public int answer_option1 = -1;
    public int answer_option2 = -1;
    public int answer_option3 = -1;
    public int answer_option4 = -1; 
    
    // Holds the actual correct answer for the question     
    public String correct_answer_string = "";
    public int correct_answer_number = 0;
    
    //In case of single option
    public int correct_answer_option = -1;
    
    //In case of true or false question
    public Boolean correct_answer = null;
    
    //In case of multiple correct option
    public int correct_answer_option1 = -1;
    public int correct_answer_option2 = -1;
    public int correct_answer_option3 = -1;
    public int correct_answer_option4 = -1;  
    
    //Time taken to answer the question, used to calculate the time left in each "next" or "previous" button clicks, its calculated as time_left = time_left - time_taken;
    public static int time_taken;
}
