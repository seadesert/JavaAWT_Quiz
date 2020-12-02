package AWT_Forms;

import Quiz.QuizQuestion;
import Quiz.Quiz;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;


//Single word answer Form
public class Quiz_create extends Frame
{


    public Quiz_create(Quiz q1)
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 500 / 2;
        int dy = centerPoint.y - 400 / 2;
        setLocation(dx, dy);


        Label title = new Label("Create a New Quiz");
        Label title1 = new Label("Quiz Name:");
        Label title2 = new Label("Number of Questions:");
        Label title3 = new Label("Time Limit:");
        
        Button create = new Button("Create Quiz");
         
        TextField quiz_name = new TextField("");
        TextField number_of_question = new TextField("");
        
        Label hh_t = new Label("hh");
        Label mm_t = new Label("mm");
        Label ss_t = new Label("ss");
        TextField hh = new TextField("00");
        TextField mm = new TextField("00");
        TextField ss = new TextField("00");

        hh_t.setBounds(250, 290, 25, 20);
        mm_t.setBounds(350, 290, 25, 20);
        ss_t.setBounds(450, 290, 25, 20);
       
        title.setBounds(200, 50, 200, 20);
        title1.setBounds(40, 150, 100, 20);
        title2.setBounds(40, 220, 150, 20);
        title3.setBounds(40, 290, 100, 20);
        create.setBounds(200, 350, 100, 30);
        
        quiz_name.setBounds(250, 150, 150, 30);
        number_of_question.setBounds(250, 220, 40, 30);
        hh.setBounds(200, 290, 40, 30);
        mm.setBounds(300, 290, 40, 30);
        ss.setBounds(400, 290, 40, 30);
                         
        add(title);
        add(title1);
        add(title2);
        add(title3);
        add(create);
        add(quiz_name);
        add(number_of_question);
        add(hh);
        add(mm);
        add(ss);
        add(hh_t);
        add(mm_t);
        add(ss_t);
        
        MouseListener m1 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                q1.last_count = Integer.parseInt(number_of_question.getText());
                q1.Quiz_Name = quiz_name.getText();
                
                q1.total_time = (Integer.parseInt(hh.getText()) * 3600) + (Integer.parseInt(mm.getText()) *60) + (Integer.parseInt(ss.getText()));
                q1.score_max = 0;
                setVisible(false);
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
        create.addMouseListener(m1);
        
        //Defualt size for the quiz question is set to 500 x 400 px;
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
    
//    //for testing purpose TODO: Remove main function
//    public static void main(String args[])
//    {
//        QuizQuestion q2 = new QuizQuestion();
//        Quiz q1 = new Quiz();
//        Quiz_create form = new Quiz_create(q1, q2);
//    }



}
