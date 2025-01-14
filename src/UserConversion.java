import java.util.Scanner;

public class UserConversion {

    // User desired conversion unit

    public static String userDesiredUnit() {

        //The prompt statement to key in
        System.out.println("Please enter a desired valid unit to convert to: K, C, F");

        // Create scanner object
        Scanner scanner = new Scanner(System.in);
        String userDesiredUnitInput = "";

        // Set Boolean validation flag
        boolean userDesiredUnitValidation = false;


        while (!userDesiredUnitValidation) {

            if (scanner.hasNextLine()) {

                userDesiredUnitInput = scanner.nextLine().toUpperCase();

                if (userDesiredUnitInput.equals("K") || userDesiredUnitInput.equals("C") || userDesiredUnitInput.equals("F")) {
                    userDesiredUnitValidation = true;
                }
                else {
                    System.out.println("Invalid desired input: Only accepts: K, C, F. Please input a valid desired unit option: K, C, F");
                }


            }

            else {
                System.out.println("Invalid desired input: Only accepts String. Please input a valid desired unit: K, C, F");
                scanner.next();
            }



        }

        return userDesiredUnitInput;

    }




}
