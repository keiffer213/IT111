import javax.swing. *;
import java.awt.*;

public class showWindow2 {
    public static void main(String[] args) {

        final int WINDOW_WIDTH = 400;//declare our variables & make them CONSTANTS
        final int WINDOW_HEIGHT = 500;

        JFrame window = new JFrame(); // create a window
        JLabel myLabel1, myLabel2;
        JTextField textField1, textField2;

        window.setTitle("My Simple Window"); //set the title
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT); //setting the size of our window
//        window.getContentPane().setBackground(Color.red);  //set color of window
        window.getContentPane().setBackground(new Color(236,51,27));
        window.setLayout(null); //need to set layout manage to NULL for labels to show up

        window.setLocation(200,200);       //set location when window pops up
        //window.setResizable(false); //makes it that it cannnot be resized
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //close the window and exit the program

        //initiating the myLabel and adding text inside
        myLabel1 = new JLabel("My First Big Label!!!!");
        myLabel2 = new JLabel("My Second Big Label!");
//        messageLabel1.setText("My First Big Label!!!!");//set text
//        messageLabel2.setText("My Second Big Label!!!!");
        //set font for each label
        myLabel1.setFont(new Font("Arial", Font.PLAIN, 20));
        myLabel2.setFont(new Font("Arial", Font.BOLD, 20));
//        myLabel1.setVerticalAlignment(JLabel.TOP);
//        myLabel2.setVerticalAlignment(JLabel.CENTER);
        //can use code above if you wanna set alignment for label
        //but in this code, it isn't needed if you setBound

        //using setBounds for each label, you can place the text where you want
        myLabel1.setBounds(10,20, 250, 30);
        myLabel2.setBounds(10,130, 250, 30);

        //assign how many characters wide is each text field
        textField1 = new JTextField(50);
        textField2 = new JTextField(50);
        //set where and how big the text field will be
        textField1.setBounds(10,55,250,30);
        textField2.setBounds(10,165,250,30);

        //Adding the labels and text field onto the window
        window.add(myLabel1);
        window.add(myLabel2);
        window.add(textField1);
        window.add(textField2);

        //display the window - if we do not display the window, it will not display!
        //displaying the window is boolean
        window.setVisible(true);

    }
}
