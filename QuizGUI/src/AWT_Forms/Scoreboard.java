package AWT_Forms;

import Quiz.QuizQuestion;
import Quiz.Quiz;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;


//Single word answer Form
public class Scoreboard extends Frame
{

    
    public Scoreboard()
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 500 / 2;
        int dy = centerPoint.y - 400 / 2;
        setLocation(dx, dy);


        Label title = new Label("Score Board - " + Quiz.Quiz_Name);
        Label title1 = new Label("Score: "+ Quiz.score + "/" + Quiz.score_max);
        Label title2 = new Label("Timetaken: "+ Quiz.time_taken  +"/"+ Quiz.total_time);

        
        Button create = new Button("Close");
         
        title.setBounds(200, 50, 200, 20);
        title1.setBounds(220, 200, 100, 20);
        title2.setBounds(220, 250, 200, 20);
        create.setBounds(200, 350, 100, 30);

        add(title);
        add(title1);
        add(title2);
        add(create);

        MouseListener m1 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
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
//        Scoreboard form = new Scoreboard(q1);
//    }



}
