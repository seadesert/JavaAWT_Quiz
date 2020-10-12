import java.awt.*;
import static java.awt.Font.*;
import java.awt.event.*;



public class QuizType_single extends Frame
{

    /*

        The Constructor for the Form accepts the current question no or "count"
        The current score "score" and the time left in the quiz "time" is seconds

        String "question_string" holds the question
        The object of the form is created for each question

        call the constuctor for the form to generate the question of a particular type as follows:
        QuizType_single = new QuizType_single(object QuizQuestion)
        all of these parameters used are to be provided by the class QuizQuestion 
    
        while creating the question, pass the object of the question
    
        Or refer to the example given in the main class, which is used for testing

    */

    //Save_question is boolean that states whether to save the answer whenever "next" or "previous", by defualt its true, after saving it changes to "false"
      static boolean save_question = true;


    QuizType_single(QuizQuestion q)
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 500 / 2;
        int dy = centerPoint.y - 400 / 2;
        setLocation(dx, dy);


        //footer, displays the score and the Time left for the quiz
        Label score_label = new Label("Score: " + q.score + " Marks");
        Label time_left = new Label("Time left: " + q.time_left);
        Button finish = new Button ("Submit Quiz");


        score_label.setBounds(20, 370, 120, 10);
        time_left.setBounds(420, 370, 120, 10);
        finish.setBounds(190, 360, 120, 25);

        add(score_label);
        add(time_left);



        /*
            Question Section, print the question from the String "question_string" from the class QuizQuestion
            Also Prints the type of question and the current Question Count
        */
        Label Question_count = new Label("Question " + q.question_count + " - Single Word");
        Question_count.setBounds(180, 50, 200, 20);
        add(Question_count);

        TextArea Question = new TextArea(q.question_string, 10, 100, TextArea.SCROLLBARS_NONE);
        Question.setBackground(Color.WHITE);
        Question.setForeground(Color.RED);
        Question.setBounds(30, 70, 440, 100);
        Question.setEditable(false);

        add(Question);


        //On Click Close Operation for testing, decision "to be removed later and change the form layout to hide close button while in quiz" or "display a warning message and allow to exit the quiz anytime"
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });





        //Options, this section changes depending on the type of the question

        TextField string_answer = new TextField("");
        string_answer.setBounds(150, 230, 200, 30);

        //Increased Font Size for the answer
        Font font_answer = new Font("sans-serif", Font.PLAIN, 16);
        string_answer.setFont(font_answer);


        //Listen to changes in the text, if there is a change in the text set the bool save_question state, if no changes is made to the option it skips saving the question
            TextListener tl = new TextListener() {
            @Override
            public void textValueChanged(TextEvent te)
            {
                save_question = true;
            }
        };
        string_answer.addTextListener(tl);
        add(string_answer);

        
        //Back and Next Buttons
        Button next = new Button(">");
        Button back = new Button("<");

        back.setBounds(20, 175, 60, 50);
        next.setBounds(420, 175, 60, 50);

        //Reset Buttons if disabled, usefull when recheck the question
        back.enable(true);
        next.enable(true);


              MouseListener ml = new MouseListener() {
              @Override
              public void mouseClicked(MouseEvent me) {}
              
              @Override
              public void mousePressed(MouseEvent me) {}
              
              @Override
              public void mouseReleased(MouseEvent me) {}
              
              @Override
              public void mouseEntered(MouseEvent me)
              {
                  if(save_question == true)
                  {
                      //saves the answer in the QuizQuesiton
                      q.answer_string = string_answer.getText();
                      //previous question, decrease count
                      q.current_count = q.current_count - 1;
                  }
              }

            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
              };
              
              MouseListener m2 = new MouseListener() {
              @Override
              public void mouseClicked(MouseEvent me) {}
              
              @Override
              public void mousePressed(MouseEvent me) {}
              
              @Override
              public void mouseReleased(MouseEvent me) {}
              
              @Override
              public void mouseEntered(MouseEvent me)
              {
                  if(save_question == true)
                  {
                      
                      //saves the answer in the QuizQuesiton
                      q.answer_string = string_answer.getText();
                      //next question, increase count
                      q.current_count = q.current_count + 1;
                  }
              }

            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
              };
              
              
              
          


        back.addMouseListener(ml);
        add(back);
        add(next);
        
                
        
        /*
        Disable Back or Next Question Button if its the first or the last question respectively
        if its the last question show "Submit Quiz" Button
        */

        if(q.question_count == 1)
        {
            back.enable(false);
        }

        if(q.question_count == q.last_count)
        {
            next.enable(false);
            add(finish);
        }

        //Defualt size for the quiz question is set to 500 * 400 px;
        setSize(500, 400);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String args[])
    {
        QuizQuestion q = new QuizQuestion();
        QuizType_single form = new QuizType_single(q);
    }



}
