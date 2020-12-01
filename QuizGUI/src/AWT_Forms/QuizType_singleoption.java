package AWT_Forms;

import Class.QuizQuestion;
import Class.Quiz;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;


//single_mcq
public class QuizType_singleoption extends Frame
{

    /*

        The Constructor for the Form accepts the obkect of Quiz and Quiz_question, each resposible for holding global and local question specific variables respectvely
        call the constuctor for the form to generate the question of a particular type as follows:
        QuizType_single = new QuizType_single(object Quiz, object QuizQuestion)
        Or refer to the example given in the main class, on how to intantiate this form

    */

    //Save_question is boolean that states whether to save the answer, after saving the answer it changes to "false"
      static boolean save_question = true;
    //Holds currently selected value
      static Boolean selected_answer = null; 

    public QuizType_singleoption(QuizQuestion q2)
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 500 / 2;
        int dy = centerPoint.y - 400 / 2;
        setLocation(dx, dy);


        //footer, displays the score and the Time left for the quiz
        Label score_label = new Label("Score: " + Quiz.score + " Marks");
        Label time_left = new Label("Time left: " + Quiz.time_left);
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
        Label Question_count = new Label("Question " + (q2.question_count+1) + " - Single Option - MCQ");
        Question_count.setBounds(160, 50, 200, 20);
        add(Question_count);
        Font font_question = new Font("sans-serif", Font.PLAIN, 14);
        TextArea Question = new TextArea(q2.question_string, 10, 100, TextArea.SCROLLBARS_NONE);
        Question.setFont(font_question);
        
        Question.setBackground(Color.WHITE);
        Question.setForeground(Color.RED);
        Question.setBounds(30, 70, 440, 100);
        Question.setEditable(false);

        add(Question);


        //Options
        CheckboxGroup cbg = new CheckboxGroup();
            Checkbox checkBox1 = new Checkbox(q2.options[0] , cbg, false);
            checkBox1.setBounds(125,180, 300,40);   
            
            Checkbox checkBox2 = new Checkbox(q2.options[1], cbg, false);    
            checkBox2.setBounds(125,210, 300,40);  
            
            Checkbox checkBox3 = new Checkbox(q2.options[2], cbg, false);
            checkBox3.setBounds(125,240, 300,40);   
            
            Checkbox checkBox4 = new Checkbox(q2.options[3], cbg, false);    
            checkBox4.setBounds(125,270, 300,40); 
            
            add(checkBox1);
            add(checkBox2);
            add(checkBox3);
            add(checkBox4);

            //Load previous answered value
            if(q2.answer_options[0] != -1 || q2.answer_options[1] != -1 || q2.answer_options[2] != -1 || q2.answer_options[3] != -1)
            {
                if(q2.answer_options[0] == 1)
                {
                    checkBox1.setState(true);
                    checkBox2.setState(false);
                    checkBox3.setState(false);
                    checkBox4.setState(false);
                }
                
                else if (q2.answer_options[1] == 1)
                {
                    checkBox1.setState(false);
                    checkBox2.setState(true);
                    checkBox3.setState(false);
                    checkBox4.setState(false);
                }
                
                else if (q2.answer_options[2] == 1)
                {
                    checkBox1.setState(false);
                    checkBox2.setState(false);
                    checkBox3.setState(true);
                    checkBox4.setState(false);
                }
                
                else if (q2.answer_options[3] == 1)
                {
                    checkBox1.setState(false);
                    checkBox2.setState(false);
                    checkBox3.setState(false);
                    checkBox4.setState(true);
                }
            }


            
            
            
        //Listen to changes in the answer, if the answer is modified sets save_question to true
            checkBox1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) 
            {               
                q2.answer_options[0] = 1; 
                q2.answer_options[1] = 0;
                q2.answer_options[2] = 0;
                q2.answer_options[3] = 0;
            }  
         });  
            
            checkBox2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) 
            {               
                q2.answer_options[0] = 0; 
                q2.answer_options[1] = 1;
                q2.answer_options[2] = 0;
                q2.answer_options[3] = 0;
            }  
         });
            
             checkBox3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) 
            {               
                q2.answer_options[0] = 0; 
                q2.answer_options[1] = 0;
                q2.answer_options[2] = 1;
                q2.answer_options[3] = 0;
            }  
         });
            checkBox4.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) 
            {               
                q2.answer_options[0] = 0; 
                q2.answer_options[1] = 0;
                q2.answer_options[2] = 0;
                q2.answer_options[3] = 1;
            }  
         });  
        
        //Back and Next Buttons 
        Button next = new Button(">");
        Button back = new Button("<");

        back.setBounds(20, 200, 60, 50);
        next.setBounds(430, 200, 60, 50);

        //Reset Buttons if disabled, usefull when recheck the question
        back.enable(true);
        next.enable(true);

            //Back Button Function TODO: Goto pevious Question Form
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
                  
                      //previous question, decrease count
                      Quiz.current_count = Quiz.current_count - 1;
                      dispose();
              }
            
            //Next Button Functions TODO: goto next Question Form
            @Override
            public void mouseExited(MouseEvent me) {
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
                  
                  
                      //increase question count
                      Quiz.current_count = Quiz.current_count + 1;
                      dispose();
                      
              }

            @Override
            public void mouseExited(MouseEvent me) {
            }
              };
              

        back.addMouseListener(ml);
        next.addMouseListener(m2);
        finish.addMouseListener(m2);
        add(back);
        add(next);
             
        
        /*
        Disable Back or Next Question Button if its the first or the last question respectively
        if its the last question show "Submit Quiz" Button
        */

        if(q2.question_count == 1)
        {
            back.enable(false);
        }

        if(q2.question_count == Quiz.last_count)
        {
            next.enable(false);
            add(finish);
        }

        //Defualt size for the quiz question is set to 500 x 400 px;
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
//    
//    //for testing purpose TODO: Remove main function
//    public static void main(String args[])
//    {
//        QuizQuestion q2 = new QuizQuestion();
//        Quiz q1 = new Quiz();
//        QuizType_singleoption form = new QuizType_singleoption(q1, q2);
//    }



}
