public class variableScope {

    public static void main(String[] args) {
        //we are inside the MAIN method
        String txt = "This is the local variable in the main method!";
        System.out.println(txt);
        //in order for the sub method to run, we need to call the method in main method
        sub(); //in order for this to work, the public method must be static

    }


    public static void sub() { //if you're referencing the method, it must be static
        String txt = "This is the local variable in the sub method!";
        System.out.println(txt);

    }

}
