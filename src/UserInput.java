import java.util.Scanner;

public class UserInput {

    // User input value
    public static double userValue() {

        Scanner scanner1 = new Scanner(System.in);

        // User's input validation via a loop

        //Set a boolean flag to false
        boolean userValueValidation = false;
        double value = 0;

        //The prompt statement to key in
        System.out.println("Please enter the value");

        // A While to iterate the validation with a While condition setting the boolean to true
        while (!userValueValidation) {

            // If logics to validate the scanner object
            if (scanner1.hasNextDouble()) {
                value = scanner1.nextDouble();
                userValueValidation = true;
            } else {
                System.out.println("Please input a valid integer");
                scanner1.next();
            }

        }

        // return statement
        return value;
    };

    // User input String
    public static String userUnit() {

        //The prompt statement to key in
        System.out.println("Please enter a valid unit: K, C, F");

        //Create a scanner object
        Scanner scanner2 = new Scanner(System.in);
        String userChosenUnit = "";

        // Set up Boolean validation flag
        boolean unitChosenValidation = false;

        // Iterate the condition

        while (!unitChosenValidation) {

            // Validate if there is another line of input
            if (scanner2.hasNextLine()) {

                userChosenUnit = scanner2.nextLine().toUpperCase();

                if (userChosenUnit.equals("K") || userChosenUnit.equals("C") || userChosenUnit.equals("F")) {
                    unitChosenValidation = true;
                }
                else {
                    System.out.println("Invalid input: Only accepts (K, C, F). Please input a valid option: K, C, F");
                }

            }


            else {
                System.out.println("Invalid input: Only accepts String. Please input a valid unit: K, C, F");
                scanner2.next();
            }

        }

        return userChosenUnit;

    };




    }


