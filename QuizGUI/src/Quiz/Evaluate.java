
package Quiz;

import java.util.Objects;

public class Evaluate {

    public void Evaluate_Quiz(QuizQuestion question)
    {
     
        switch (question.question_type) {
            case "single-word":
                if(question.answer_string.equalsIgnoreCase(question.correct_answer_string))
                {
                    Quiz.score += question.question_marks;
                }   break;
            case "true-false":
                if(Objects.equals(question.answer_tf, question.correct_tf))
                {
                    Quiz.score += question.question_marks;
                }   break;
            case "number":
                if(Objects.equals(question.answer_number, question.correct_answer_number))
                {
                    Quiz.score += question.question_marks;
                }   break;
            case "single-option":
                {
                    Boolean correct = true;
                    for(int i =0; i<3; i++)
                    {
                        if(question.answer_options[i] != question.correct_answer_options[i])
                        {
                            correct = false;
                        }
                    }       if(correct == true)
                    {
                        Quiz.score += question.question_marks;
                    }       break;
                }
            case "multiple-option":
                {
                    Boolean correct = true;
                    for(int i =0; i<3; i++)
                    {
                        if(question.answer_options[i] != question.correct_answer_options[i])
                        {
                            correct = false;
                        }
                    }       if(correct == true)
                    {
                        Quiz.score += question.question_marks;
                    }       break;
                }
            default:
                
                break;
        }
        
    }
    
}
