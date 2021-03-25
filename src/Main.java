import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wholeNumbers = 122;
        long largeDecimalNumber = -12;
        boolean isEqualTo = true;
        char singleLetter = 'a';
        byte smallNumbers  = 12;
        float intergralNumber = 12.02f;
        double largeIntergralNumber = 12.0423d;

//        Primitive Data Types
        System.out.println(wholeNumbers);
        System.out.println(largeDecimalNumber);
        System.out.println(isEqualTo);
        System.out.println(singleLetter);
        System.out.println(smallNumbers);
        System.out.println(intergralNumber);
        System.out.println(largeIntergralNumber);

        if(isEqualTo){
            System.out.println(isEqualTo);
        }else {
            System.out.println(isEqualTo);
        }

        switch(wholeNumbers){
            case 1:
                System.out.println("Hello World!"); break;
            case 2:
                System.out.println("Hi World"); break;
            default: ;
        }


//        Non Primitive Data Type

    }
}
