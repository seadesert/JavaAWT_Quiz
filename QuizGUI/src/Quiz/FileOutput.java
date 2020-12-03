package Quiz;

/**
 *
 * @author Vinay M
 */ 

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileOutput
{
  public static void main(String[] args) 
  {
    
    try 
    {
        File myObj = new File("result.txt");

        if (myObj.createNewFile()) 
        {

          System.out.println("Name of the Quiz: " + Quiz.Quiz_Name);

          System.out.println("Total Number of Question: " + Quiz.last_count);

          System.out.println("Time Allocated: " + Quiz.total_time);

          System.out.println("Time Taken: " + Quiz.time_taken);

          System.out.println("Maximum Score: " + Quiz.score_max);

          System.out.println("Score Obtained: " + Quiz.score);

          System.out.println("Total Question Attempted: " + Quiz.current_count+1);

        } 

        else 
        {    
          System.out.println("File already exists.");
        }
    } 
      
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
  }
}
