import java.io.File;

public class myFile {

    public static void main(String[] args) {
        //we are going to create a file object
        File dir = new File("./NewFolder");

        //create an if-else statement - if direction exists, yippy skippy
        //else, not a good thing

        if(dir.exists()){
            System.out.println("Yippy Skippy, have a directory!");
        } else {
            System.out.println("We are lost in space, don't know where that directory is?");
        }
    }
}
