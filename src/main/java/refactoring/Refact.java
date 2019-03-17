package refactoring;

public class Refact {


        public static void main (String[]args) throws Exception {
            printer(new Addition().function(10,5));
            printer(new Addition().function("10","5"));
            printer(new Division().function(10,5));
            printer(new Multiplication().function(10,5));
            printer(new Subtraction().function(10,5));
        }

        public static void  printer (Integer i){
            System.out.println("Result is : " +i);
        }
        public static void printer (String s){
            System.out.println("Result is : " +s);
        }

}

