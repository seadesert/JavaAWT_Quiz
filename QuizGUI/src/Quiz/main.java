
package Quiz;

import AWT_Forms.*;
import java.util.Timer;

public class main {


    public static int time_left = 30;  
    
    public static void main(String[] args) throws InterruptedException 
    {

        //create quiz object
        Quiz q = new Quiz();
        
        AWT_Forms.Quiz_create quiz_form = new AWT_Forms.Quiz_create(q);
            while(quiz_form.isVisible())
            {
                Thread.sleep(100);
            }

        //creates and initliazes questions 
        QuizQuestion[] question = new QuizQuestion[q.last_count+1];
        
        for(int  i=0; i<=q.last_count; i++)
        {
            question[i] = new QuizQuestion();
            question[i].setQuestion_count(i);
        }
        
        System.out.print("qc - " + q.current_count + "\n ql - " + q.last_count); 
        
        //Create the questions
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
        
        //Displays the questions
        q.current_count = 0;
        while(q.current_count < q.last_count && time_left > 1)
        {
            //add timer here and change the time_left for every second, also store the time left
            //Quiz.time_left = time_left
            
            
            if(question[q.current_count].getQuestion_type().equals("single-option"))
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
        }
        
         //Evaluate the questions        
        q.current_count = 0;
        while(q.current_count < q.last_count)
        {
            Evaluate e = new Evaluate();

            e.Evaluate_Quiz(question[q.current_count]);
            q.current_count++;
        }
        
        
        //Display scoreboard
        AWT_Forms.Scoreboard scoreboard = new AWT_Forms.Scoreboard();
        while(scoreboard.isVisible())
        {
            Thread.sleep(100);
        }
         
         
         
    }
    
}
