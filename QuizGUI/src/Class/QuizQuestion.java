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

    public int getQuestion_marks() {
        return question_marks;
    }

    public void setQuestion_marks(int question_marks) {
        this.question_marks = question_marks;
    }

    public String getQuestion_string() {
        return question_string;
    }

    public void setQuestion_string(String question_string) {
        this.question_string = question_string;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getAnswer_string() {
        return answer_string;
    }

    public void setAnswer_string(String answer_string) {
        this.answer_string = answer_string;
    }

    public Float getAnswer_number() {
        return answer_number;
    }

    public void setAnswer_number(Float answer_number) {
        this.answer_number = answer_number;
    }

    public Boolean getAnswer_tf() {
        return answer_tf;
    }

    public void setAnswer_tf(Boolean answer_tf) {
        this.answer_tf = answer_tf;
    }

    public int[] getAnswer_options() {
        return answer_options;
    }

    public void setAnswer_options(int[] answer_options) {
        this.answer_options = answer_options;
    }

    public String getCorrect_answer_string() {
        return correct_answer_string;
    }

    public void setCorrect_answer_string(String correct_answer_string) {
        this.correct_answer_string = correct_answer_string;
    }

    public Float getCorrect_answer_number() {
        return correct_answer_number;
    }

    public void setCorrect_answer_number(Float correct_answer_number) {
        this.correct_answer_number = correct_answer_number;
    }

    public Boolean getCorrect_tf() {
        return correct_tf;
    }

    public void setCorrect_tf(Boolean correct_tf) {
        this.correct_tf = correct_tf;
    }

    public int[] getCorrect_answer_options() {
        return correct_answer_options;
    }

    public void setCorrect_answer_options(int[] correct_answer_options) {
        this.correct_answer_options = correct_answer_options;
    }


}
