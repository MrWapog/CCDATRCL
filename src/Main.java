public class Main {

    public static void main(String [] args){

        // THIS IS MY FIRST JAVA PROGRAM

        /*
           THIS
           IS
           A
           MULTI-LINE
           COMMENT
         */

        System.out.println("I like pizza!");
        System.out.println("And its hawaiian");
        System.out.println("With pineapples on it!");
        System.out.println("-------------------------------------------------");


        // VARIABLES
        // 2 Steps to creating a variable
        // DECLARATION AND ASSIGNMENT
        /*
        This is primitive data types
         */

        int age = 22;
        int year = 2025;
        int quantity = 1;

        System.out.println("This year is\t" + year);
        System.out.println(quantity);
        System.out.println("My age is "+ age + " and born year is " + year);
        System.out.println("-------------------------------------------------");

        double price = 19;
        double gpa = 4.0;
        double temperature = -12.5;

        System.out.println("$" + price);
        System.out.println("GRADE:" + gpa);
        System.out.println("Temp:" + temperature);
        System.out.println("-------------------------------------------------");

        char grade = 'A';

        System.out.println("result:" + grade);
        System.out.println("-------------------------------------------------");

        //boolean statement is only usable if its use in "true or false" statement

        boolean Student = false;

        if(Student){
            System.out.println("You are a Student!");
        }
        else{
            System.out.println("You are NOT a student!");
            System.out.println("-------------------------------------------------");
        }
        /*
        Next is reference data types
         */

        String name = "Bro code";
        String food = "pizza";

        System.out.println("Hello " + name);
        System.out.println("I love " + food);
        System.out.println("-------------------------------------------------");

        // CONSTANTSs

    }

}




