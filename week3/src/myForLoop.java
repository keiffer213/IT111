public class myForLoop {

    public static void main(String[] args) {

//    for(int count = 0; count <= 30; count = count+2) {
//        System.out.println(count);
//    }
//    System.out.println("All Done");

    int newCount;

    for (newCount = 40; newCount > 0; newCount = newCount-1) {
//        System.out.println(newCount);
        if(newCount == 10) {
            System.out.println("We are almost at blastoff! Only "
             + newCount + " seconds away");
        }else {
            System.out.println(newCount);
        }


    }   //end forLoop
        System.out.println("Blast Off!");


    }
}
