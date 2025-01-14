public class UnitC {


    public static void convertC(double valueOfUser, String unitOfUser) {

        switch(unitOfUser) {
            case "K":
                // Convert C -> K
                // K - 273.15
                double ConvertedKFromC = valueOfUser + 273.15;
                System.out.printf("%.2f%n", ConvertedKFromC);
                break;
            case "F":
                // Convert K -> F
                // K - 273.15
                double ConvertedFFromC = (valueOfUser * 1.8) + 32;
                System.out.printf("%.2f%n", ConvertedFFromC);
                break;
            default:
                System.out.println("The value is already in Celsius");
        }

    }





}
