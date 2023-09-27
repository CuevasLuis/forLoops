package forLoops;

// to use scanner obeject
import java.util.Scanner;
   
    
    // class name must be the same as the file name
    public class Main {
    
        public static void main(String[] args) {
            
            //A loop that will display a string 99 times. 
            for (int x = 0; x < 100; x++) {
                System.out.println("I am number "+ x);
            }



            //. A loop that will display every odd number from 0 to 99
            for (int x = 0; x < 100; x++) {
                if (x % 2 != 0) {
                    System.out.println("odd number: " + x);
                }
            }

            // A loop that will display every even number from 0 to 99
            for (int x = 0; x < 100; x++) {
                if (x % 2 == 0) {
                    System.out.println("even number: " + x);
                }
            }
            
            // Same loop as above, but in a different way
            //create an array to hold the values of the loops
            int numbers[] = new int[100];
            //loop from 0-99 add it to the array 
            for (int x = 0; x < 100; x++) {
                numbers[x] += x;
            }

            //a for each loop to go thorugh each value in the array
            for (int x : numbers) {
                if (x % 2 == 0) {
                    System.out.println("even numbeers again: " + x);
                }
            }

            //5. A loop that will sum up the odd numbers from 0 to 99 and print it at the end. 
            int oddSums = 0;

             for (int x = 0; x < 100; x++) {
                 if (x % 2 != 0) {
                     oddSums += x;
                   
                }
                
            }

            System.out.println("the sum of odd number 0-99 is : " + oddSums);

            
            //. A loop that will sum up the even numbers from 0 to 99 and print it at the end. 
            int evenSums = 0;
            for (int x = 0; x < 100; x++) {
                if (x % 2 == 0) {
                    evenSums += x;
                }
            }
            System.out.println("the sum of even numbers 0-99 is: " + evenSums);
           
            //7. A loop that finds a sum of the numbers between two numbers that are given by the user, inclusive.

            Scanner userInput = new Scanner(System.in);
            int userValueOne = 0;
            int useerValueTwo = 0;

            System.out.println("Enter a value: ");
            userValueOne = userInput.nextInt();
            System.out.println("Enter another value: ");
            useerValueTwo = userInput.nextInt();
            int sumValue = userValueOne + useerValueTwo;
            System.out.println("the sum of those two values are: " + sumValue);

    
            
        }//end of mainMethod
    
    }//end of MainClass


  