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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String fName = scanner.nextLine();
        System.out.println("This is your sample name: "+fName);

//        for loop
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

//        while loop
        int initial = 0;
        while(initial < 10){
            System.out.println(initial);
            initial++;
        }

//        do while loop
        int declare = 0;
        do{
            declare++;
        }while(declare < 10);

//      For each
        int[] marks = {1, 2, 3, 4}; //Array
        for (int marksGrade : marks){
            System.out.println(marksGrade);
        }

//        Non Primitive Data Type

    }
}
