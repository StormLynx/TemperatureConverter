public class UnitK {

    public static void convertK(double valueOfUser, String unitOfUser) {

        switch(unitOfUser) {
            case "C":
                // Convert K -> C
                // K - 273.15
                double ConvertedCfromK = valueOfUser - 273.15;
                System.out.printf("%.2f%n", ConvertedCfromK);
                break;
            case "F":
                // Convert K -> F
                // K - 273.15
                double ConvertedFFromK = (valueOfUser - 273.15) * 1.8 + 32;
                System.out.printf("%.2f%n", ConvertedFFromK);
                break;
            default:
                System.out.println("The value is already in Kelvin");
        }

    }


}
