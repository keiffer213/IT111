public class MyDataTypes {

   public static void   main(String[] args) {

       short number1 = 32_000;
       int number2 = 2_000_000;
       long num2 = 3_000_000_000L;
       float number3 = 30.57F;
       double number4 = 50.456734053123;

       System.out.println(number1);
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(number4);
       System.out.println(num2);

       boolean dry = false;

       if(dry) { //if(dry) is = to if(dry == true)
           System.out.println("Time to hang up the curtains!!");
       }
       else {
           System.out.println("We will have to wait for a bit");
       }

       char best = 'A';
       System.out.println(best);
       //if System.out.println(++best) it prints B b/c incrament

   }
}
