public class variableScopeGlobal {

    final static String txt = "This is a GLOBAL variable of the variableScopeGlobal class";

    public static void main(String[] args) {
        String txt = "This is my local variable in the main method";
        System.out.println(txt);
        sub();

        //we are oging to print out the GLOBAL variable
        System.out.println(variableScopeGlobal.txt);

    }

    public static void sub() {
        String txt = "This is our local variable inside our sub method";
        System.out.println(txt);

    }

}
