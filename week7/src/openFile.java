import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class openFile {

    public static void main(String[] args) {

        File file;
        Scanner inputFile;
        String fileName;

        fileName = JOptionPane.showInputDialog("Enter " + "the name of the file");
        //attempt to open the file


        try {
            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found! " +
                    "Yippy Skippy!, displayerd in TRY");


        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The file was NOT FOUND - This in CATCH");

        }

        JOptionPane.showMessageDialog(null, "The program has finished running - done -" +
                " displayed after the catch");


    }
}
