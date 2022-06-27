package acedamy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteVar   = 25;
        short shortVar = 10;
        int intVar     = 5;

        /*Here we don't need casting with the long because the long will happily accept the integer. Because the maximum
         integer value will always fit within a long value. */
        long longVar   =  50000L + 10L* (byteVar + shortVar+ intVar);

        System.out.println(longVar);



    }
}
