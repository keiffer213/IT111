import javax.swing. *;
import java.awt. *;

public class showWindow2 extends JFrame{
    public static void main(String[] args) {



        final int WINDOW_WIDTH = 350;       //declare our variables
        final int WINDOW_HEIGHT = 450;      //make them CONSTANTS

        JFrame window = new JFrame();       // create a window

        window.setTitle("My Simple Window");      //set the title
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT); //setting the size of our window
        window.getContentPane().setBackground(Color.red); //set the color of window
        window.setLocation(500,400);        //set location of window when it pops up

        //
        //window.setbo
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window and exit the program

        //display the window - if we do not display the window, it will not display!
        //displaying the window is boolean
        window.setVisible(true);

    }
}
