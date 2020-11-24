
package Class;
public class Evaluate {

    void Evaluate_Quiz(Quiz q1, QuizQuestion q2)
    {
     
        if(q2.question_type.equals("single-word"))
        {
            if(q2.answer_string.equals(q2.correct_answer_string))
            {
                q1.score += q2.question_marks;
            }
        }
        else if(q2.question_type.equals("true-false"))
        {
            if(q2.answer_tf == q2.correct_answer)
            {
                q1.score += q2.question_marks;
            }
        }
        else if(q2.question_type.equals("number"))
        {
            if(q2.answer_number == q2.correct_answer_number)
            {
                q1.score += q2.question_marks;
            }
            
        }
        else if(q2.question_type.equals("single-option"))
        {
            if(q2.answer_option == q2.correct_answer_option)
            {
                q1.score += q2.question_marks;
            }
            
        }
        else if(q2.question_type.equals("multiple-option"))
        {
            if(q2.answer_option1 == q2.correct_answer_option1 && q2.answer_option2 == q2.correct_answer_option2 && q2.answer_option3 == q2.correct_answer_option3 && q2.answer_option4 == q2.correct_answer_option4)
            {
                q1.score += q2.question_marks;
            }
            
        }
        
    }
    
}
