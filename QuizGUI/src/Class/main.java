
package Class;

import AWT_Forms.*;

public class main {


    public static void main(String[] args) throws InterruptedException 
    {

        Quiz q = new Quiz();
        
        AWT_Forms.Quiz_create quiz_form = new AWT_Forms.Quiz_create(q);
            while(quiz_form.isVisible())
            {
                Thread.sleep(100);
            }

        QuizQuestion[] question = new QuizQuestion[q.last_count+1];
        
        for(int  i=0; i<=q.last_count; i++)
        {
            question[i] = new QuizQuestion();
            question[i].setQuestion_count(i);
        }
        
        System.out.print("qc - " + q.current_count + "\n ql - " + q.last_count); 
        
        q.current_count = 0;
        while(q.current_count < q.last_count)
        {
            AWT_Forms.QuizQuestion_create question_createform = new AWT_Forms.QuizQuestion_create(question[q.current_count]);
            while(question_createform.isVisible())
            {
                Thread.sleep(100);
            }
            q.current_count++;
        }
        
        q.current_count = 0;
        while(q.current_count < q.last_count)
        {
            if(question[q.current_count].getQuestion_type().equals("single_option"))
            {
                AWT_Forms.QuizType_singleoption questionform = new AWT_Forms.QuizType_singleoption(question[q.current_count]);
                while(questionform.isVisible())
                {
                    Thread.sleep(100);
                }
            }
            
            if(question[q.current_count].getQuestion_type().equals("true-false"))
            {
                AWT_Forms.QuizType_truefalse questionform = new AWT_Forms.QuizType_truefalse(question[q.current_count]);
                while(questionform.isVisible())
                {
                    Thread.sleep(100);
                }
            }
                        
            if(question[q.current_count].getQuestion_type().equals("number"))
            {
                AWT_Forms.QuizType_number questionform = new AWT_Forms.QuizType_number(question[q.current_count]);
                while(questionform.isVisible())
                {
                    Thread.sleep(100);
                }
            }
                                    
            if(question[q.current_count].getQuestion_type().equals("single-word"))
            {
                AWT_Forms.QuizType_singleword questionform = new AWT_Forms.QuizType_singleword(question[q.current_count]);
                while(questionform.isVisible())
                {
                    Thread.sleep(100);
                }
            }
                                                
                                                
            if(question[q.current_count].getQuestion_type().equals("multiple-option"))
            {
                AWT_Forms.QuizType_multipleoption questionform = new AWT_Forms.QuizType_multipleoption(question[q.current_count]);
                while(questionform.isVisible())
                {
                    Thread.sleep(100);
                }
            }
            q.current_count++;
        }
        
        
    }
    
}
