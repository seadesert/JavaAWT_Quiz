
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
        
        System.out.print("qc - " + q.current_count + "\n ql - " + q.last_count);
        
        q.current_count = 0;
        while(q.current_count < q.last_count)
        {
            AWT_Forms.QuizQuestion_create question_createform = new AWT_Forms.QuizQuestion_create(q, question[q.current_count]);
            while(question_createform.isVisible())
            {
                Thread.sleep(100);
            }
        }
        
    }
    
}
