
package Class;
public class Evaluate {

    public void Evaluate_Quiz(Quiz q1, QuizQuestion q2)
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
            if(q2.answer_tf == q2.correct_tf)
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
            Boolean correct = true;
            for(int i =0; i<3; i++)
            {
                if(q2.answer_options[i] != q2.correct_answer_options[i])
                {
                    correct = false;
                }
            }
            
            if(correct == true)
            {
                q1.score += q2.question_marks;
            }
            
        }
        else if(q2.question_type.equals("multiple-option"))
        {
            Boolean correct = true;
            for(int i =0; i<3; i++)
            {
                if(q2.answer_options[i] != q2.correct_answer_options[i])
                {
                    correct = false;
                }
            }
            
            if(correct == true)
            {
                q1.score += q2.question_marks;
            }
            
            
        }
        
    }
    
}
