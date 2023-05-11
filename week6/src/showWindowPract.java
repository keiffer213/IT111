import javax.swing. *;
import java.awt. *;

public class showWindowPract extends JFrame{
    final int WINDOW_WIDTH = 350;       //declare our variables
    final int WINDOW_HEIGHT = 450;      //make them CONSTANTS
    JPanel panel;
    JLabel messageLabel1, messageLabel2;
    JTextField textField1, textField2;

    public showWindowPract () {             //create a constructor to be called in main
        setTitle("A Simple Window");    //set the title
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT); //setting the size of our window
        getContentPane().setBackground(Color.red);  //set color of window
        setLocation(500,400);       //set location when window pops up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window and exit the program

        //build the inside of the window
        buildWindow();
        add(panel);

        //display the window - if we do not display the window, it will not display!
        //displaying the window is boolean
        setVisible(true);
    }

    public void buildWindow() {
        messageLabel1 = new JLabel("My First Big Label!!!\n");
        messageLabel2 = new JLabel("My Second Big Label!\n");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        panel = new JPanel();

        panel.add(messageLabel1);
        panel.add(textField1) ;
        panel.add(messageLabel2);
        panel.add(textField2);
    }


    public static void main(String[] args) {
//        JFrame window = new JFrame();       // create a window
        new showWindowPract();

    }
}
