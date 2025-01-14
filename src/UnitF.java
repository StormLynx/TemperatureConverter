public class UnitF {

    public static void convertF(double valueOfUser, String unitOfUser) {

        switch (unitOfUser) {

            case "K":
                // Convert F -> K
                double ConvertedKFromF = (valueOfUser - 32) * 0.56 + 273.15;
                System.out.printf("%.2f%n", ConvertedKFromF);
                break;
            case "C":
                // Convert F -> C
                double ConvertedFFromC = (valueOfUser - 32) * 0.56;
                System.out.printf("%.2f%n", ConvertedFFromC);
                break;
            default:
                System.out.println("The value is already in Fahrenheit");


        }

    }
}






