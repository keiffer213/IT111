import java.io.File;
import static java.lang.System.out;

public class myFiles2 {

    public static void main(String[] args) {

        File dir = new File("NewFolder");

        //start with an if else statement

        if(dir.exists()) {
            //we are happy!
            //we are going to call out the array

            String[] files = dir.list();
            //new keyword, named assert
            assert files != null;
            out.println(files.length + " Files found!");
            //we would like to see those files with a for loop
            for(int i = 0; i < files.length; i++) {
                out.println(files[i]);
            }

        } else {
            //sad!
            out.println("Directory does not exist!");

        }

    }
}
