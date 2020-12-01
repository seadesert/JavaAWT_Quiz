package AWT_Forms;

import Class.QuizQuestion;
import Class.Quiz;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;


//Single word answer Form
public class QuizQuestion_create extends Frame
{

    public QuizQuestion_create(QuizQuestion question)
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 800 / 2;
        int dy = centerPoint.y - 600 / 2;
        setLocation(dx, dy);


        Label title = new Label("Quiz Name - " + Quiz.Quiz_Name +" Question " + (question.question_count + 1));
        
        try
        {
        question.setQuestion_count(Quiz.current_count);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                
        Label title1 = new Label("Question Type:");
        Choice c=new Choice();
        c.add("Single Option Answer Type");
        c.add("Multiple Options Answer Type");
        c.add("Numerical Answer Type");
        c.add("True/False Answer Type");
        c.add("Single Word Answer Type");
        
        
        Label title2 = new Label("Question Description:");
        Label title3 = new Label("Score:");       
        Label title4 = new Label("Answers:");      
        Button save = new Button("Save");
        Button next = new Button(">");
        Button start = new Button("Start Quiz");
         
        TextField question_description = new TextField("");
        TextField score = new TextField("");

        title.setBounds(300, 50, 220, 20);
        title1.setBounds(40, 150, 150, 20);
        title2.setBounds(40, 210, 200, 20);
        title3.setBounds(40, 280, 100, 20);
        title4.setBounds(350, 350, 100, 20);
        next.setBounds(720, 300, 50, 30);
        save.setBounds(520, 147, 50, 25);
        start.setBounds(380, 550, 100, 40);
        
        c.setBounds(300, 150, 200, 30);
        question_description.setBounds(300, 200, 400, 50);
        score.setBounds(300, 280, 40, 30);

        add(title);
        add(title1);
        add(title2);
        add(title3);
        add(title4);
        add(next);
        add(c);
        add(save);
        add(question_description);
        add(score);
        next.disable();
        //Answers: Single Option MCQ
        
            CheckboxGroup cbg = new CheckboxGroup();
            Checkbox checkBox1 = new Checkbox("1" , cbg, false);
            checkBox1.setBounds(40, 395, 12,40);   
            TextField opt1 = new TextField("Option 1");
            opt1.setBounds(60, 400, 100,30);  
            
            Checkbox checkBox2 = new Checkbox("2", cbg, false);    
            checkBox2.setBounds(40, 440, 12,30);
            TextField opt2 = new TextField("Option 2");
            opt2.setBounds(60, 440, 100,30);
            
            Checkbox checkBox3 = new Checkbox("3", cbg, false);
            checkBox3.setBounds(40, 480, 12,40); 
            TextField opt3 = new TextField("Option 3");
            opt3.setBounds(60, 480, 100,30); 
            
            Checkbox checkBox4 = new Checkbox("4", cbg, false);    
            checkBox4.setBounds(40, 520, 12,30); 
            TextField opt4 = new TextField("Option 4");
            opt4.setBounds(60, 520, 100,30); 
            
            add(checkBox1);
            add(checkBox2);
            add(checkBox3);
            add(checkBox4);            
            add(opt1);
            add(opt2);
            add(opt3);
            add(opt4);
            
            checkBox1.disable();
            checkBox2.disable();
            checkBox3.disable();
            checkBox4.disable();
            opt1.disable();
            opt2.disable();
            opt3.disable();
            opt4.disable();
            
         //Answers: Multiple Options MCQ           
            Checkbox checkBox5 = new Checkbox("" , false);
            checkBox5.setBounds(240, 395, 20,40);  
            TextField opt5 = new TextField("Option 1");
            opt5.setBounds(260, 400, 100,30); 
            
            Checkbox checkBox6 = new Checkbox("", false);    
            checkBox6.setBounds(240, 440, 20,40);  
            TextField opt6 = new TextField("Option 2");
            opt6.setBounds(260, 440, 100,30); 
            
            Checkbox checkBox7 = new Checkbox("", false);
            checkBox7.setBounds(240, 482, 20,30);   
            TextField opt7 = new TextField("Option 3");
            opt7.setBounds(260, 480, 100,30);   
            
            Checkbox checkBox8 = new Checkbox("", false);    
            checkBox8.setBounds(240, 515, 20,40); 
            TextField opt8 = new TextField("Option 4");
            opt8.setBounds(260, 520, 100,30);
            
            add(checkBox5);
            add(checkBox6);
            add(checkBox7);
            add(checkBox8);            
            add(opt5);
            add(opt6);
            add(opt7);
            add(opt8);
            
            checkBox5.disable();
            checkBox6.disable();
            checkBox7.disable();
            checkBox8.disable();
            opt5.disable();
            opt6.disable();
            opt7.disable();
            opt8.disable();
            
        //Answers: True/False
        
            CheckboxGroup cbg1 = new CheckboxGroup();
            Checkbox checkBox9 = new Checkbox("true" , cbg1, false);
            checkBox9.setBounds(440, 400, 100,40);   
            
            Checkbox checkBox10 = new Checkbox("false", cbg1, false);    
            checkBox10.setBounds(440, 430, 100,40);  
            
            add(checkBox9);
            add(checkBox10);
            checkBox9.disable();
            checkBox10.disable();
            
            
         //Answers: Single Word/Number
         
            TextField answer_string = new TextField("0");
            answer_string.setBounds(640, 450, 100, 30);
            add(answer_string);
            answer_string.disable();
            
        
              
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });

        if(question.getQuestion_count()+1 == Quiz.last_count)
        {
            add(start);
            next.setVisible(false);
        }
        
        MouseListener m1 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                
                next.enable();
                String qt = c.getSelectedItem();
                checkBox1.disable();
                checkBox2.disable();
                checkBox3.disable();
                checkBox4.disable();
                opt1.disable();
                opt2.disable();
                opt3.disable();
                opt4.disable(); 
                checkBox5.disable();
                checkBox6.disable();
                checkBox7.disable();
                checkBox8.disable();
                opt5.disable();
                opt6.disable();
                opt7.disable();
                opt8.disable();   
                checkBox9.disable();
                checkBox10.disable();
                answer_string.disable();
                
                if(qt.equals("Single Option Answer Type"))
                {
                    checkBox1.enable();
                    checkBox2.enable();
                    checkBox3.enable();
                    checkBox4.enable();
                    opt1.enable();
                    opt2.enable();
                    opt3.enable();
                    opt4.enable();
                    question.question_type = "single-option";
                }
                else if(qt.equals("Multiple Options Answer Type"))
                {
                    checkBox5.enable();
                    checkBox6.enable();
                    checkBox7.enable();
                    checkBox8.enable();
                    opt5.enable();
                    opt6.enable();
                    opt7.enable();
                    opt8.enable();
                    question.question_type = "multiple-option";
                                  
                }
                else if(qt.equals("Numerical Answer Type"))
                {
                    answer_string.enable();
                    question.question_type = "number";
                }
                else if(qt.equals("True/False Answer Type"))
                {
                    checkBox9.enable();
                    checkBox10.enable();
                    question.question_type = "true-false";
                }
                else
                {
                    answer_string.enable();
                    question.question_type = "single-word";
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
           }

            @Override
            public void mouseEntered(MouseEvent me) 
            {
                
            }

            @Override
            public void mouseExited(MouseEvent me) 
            {
                
            }
            
        };
        save.addMouseListener(m1);
        
        
        
        MouseListener m2 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                
                question.question_count = Quiz.current_count;
                question.question_marks = Integer.parseInt(score.getText());
                question.question_string = question_description.getText();
                
                if(question.question_type == "single-option")
                {
                    question.options[0] = opt1.getText();
                    question.options[1] = opt2.getText();
                    question.options[2] = opt3.getText();
                    question.options[3] = opt4.getText();
                    
                    if (checkBox1.getState() == true)
                    {
                        question.correct_answer_options[0] = 1;
                    }
                    if (checkBox2.getState() == true)
                    {
                        question.correct_answer_options[1] = 1;
                    }
                    if (checkBox3.getState() == true)
                    {
                        question.correct_answer_options[2] = 1;
                    }                                        
                    if (checkBox4.getState() == true)
                    {
                        question.correct_answer_options[3] = 1;
                    }     
                    
                   
                }
                
                else if(question.question_type == "multiple-option")
                {
                    question.options[0] = opt5.getText();
                    question.options[1] = opt6.getText();
                    question.options[2] = opt7.getText();
                    question.options[3] = opt8.getText();  
                    
                    if (checkBox5.getState() == true)
                    {
                        question.correct_answer_options[0] = 1;
                    }
                    if (checkBox6.getState() == true)
                    {
                        question.correct_answer_options[1] = 1;
                    }
                    if (checkBox7.getState() == true)
                    {
                        question.correct_answer_options[2] = 1;
                    }                                        
                    if (checkBox8.getState() == true)
                    {
                        question.correct_answer_options[3] = 1;
                    }                         
                }
                
                else if(question.question_type == "true-false")
                {
                    question.correct_tf = Boolean.parseBoolean(cbg1.getSelectedCheckbox().getLabel());
                }
                else if(question.question_type == "number")
                {
                    question.correct_answer_number = Float.parseFloat(answer_string.getText());
                }
                else if(question.question_type == "single-word")
                {
                    question.correct_answer_string = answer_string.getText();
                }
                
  //              throw new UnsupportedOperationException("qc:" + q2.question_count + "\nqm: " + q2.question_marks + "\nqt:"+ q2.question_type + "\nqs:"+ q2.question_string + "\nqa:" + q2.correct_answer_option + "\nqt:" + q2.correct_answer + "\nqn: " + q2.correct_answer_number + "\nqm1:" + q2.correct_answer_option1+ "\nqm2:" + q2.correct_answer_option2+ "\nqm3:" + q2.correct_answer_option3+ "\nqm4:" + q2.correct_answer_option4 + "\nqw"+ q2.correct_answer_string); 
                Quiz.score_max += question.question_marks;
                dispose();            
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
           }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) 
            {
  
            }
            
        };
        
        next.addMouseListener(m2);  
        start.addMouseListener(m2);
        
        //Defualt size for the quiz question is set to 500 x 400 px;
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
//    //for testing purpose TODO: Remove main function
//    public static void main(String args[])
//    {
//        QuizQuestion q2 = new QuizQuestion();
//        Quiz q1 = new Quiz();
//        QuizQuestion_create form = new QuizQuestion_create(q1, q2);
//    }
//

}
