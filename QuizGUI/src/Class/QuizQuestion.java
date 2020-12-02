package Class;


public class QuizQuestion 
{   
    //Holds question_type out of possible values = {single-word, true-false, number, single-option, multiple-option}
    public String question_type;
    
    //Holds question no
    public int question_count;
    
    //Holds marks allocated for correct answer for the quiz
    public int question_marks;
    
    //Holds question string and options
    public String question_string;
    
    public String options[];
  
    //Holds the answers inputted by the user 
    public String answer_string;
    
    public Float answer_number;

    public Boolean answer_tf;
    
    public int[] answer_options;
 
    // Holds the correct answers for the question     
    public String correct_answer_string;
    
    public Float correct_answer_number;
        
    public Boolean correct_tf;

    public int[] correct_answer_options;

    public int time_taken;

    public QuizQuestion() 
    {
        
        this.question_type = "";
        this.question_count = 0; 
        this.question_marks = 0;
        this.question_string = "null";
        this.options = new String[]{"null", "null", "null", "null"};
        this.answer_string = "";
        this.answer_number = null;
        this.answer_tf = null;
        this.answer_options = new int[]{0, 0, 0, 0};
        this.correct_answer_string = null;
        this.correct_answer_number = null;
        this.correct_tf = null;
        this.correct_answer_options = new int[4];
        this.time_taken = 0;
        
    }
    
    public String getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public int getQuestion_count() {
        return question_count;
    }

    public void setQuestion_count(int question_count) {
        this.question_count = question_count;
    }

    public int getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(int time_taken) {
        this.time_taken = time_taken;
    }
    
    



}
