package class3;

public class IfElse_8 {
    public static void main(String[] args) {
        int age= 17;
        if (age < 18) {
            System.out.println("Time to play");
        }

        /*
        If condition works on the basis of boolean true or false, if we have a true inside the if() it executes
        all the code inside {} if it is false it does not execute any code inside
        */
        boolean inSyntaxBootCamp= false; // If it is true it will execute if its false it will not execute
        if(inSyntaxBootCamp){ // if (true)
            System.out.println("Time to start practicing java");
        }
    }
}
