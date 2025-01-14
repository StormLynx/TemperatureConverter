
public class Main {


    public static void main(String[] args) {

        // User Inputted Value & Validations
        double valueOfUser = UserInput.userValue();

        // User Inputted Unit & Validations
        String unitOfUser = UserInput.userUnit();

        // User Desired Unit & Validations
        String desiredUnitOfUser = UserConversion.userDesiredUnit();

        switch (unitOfUser) {
            case "K":
                if (desiredUnitOfUser.equals("K")) {
                    UnitK.convertK(valueOfUser, "K");
                } else if (desiredUnitOfUser.equals("C")) {
                    UnitK.convertK(valueOfUser, "C");
                } else if (desiredUnitOfUser.equals("F")) {
                    UnitK.convertK(valueOfUser, "F");
                }
                break;
            case "C":
                if (desiredUnitOfUser.equals("C")) {
                    UnitC.convertC(valueOfUser, "C");
                } else if (desiredUnitOfUser.equals("K")) {
                    UnitC.convertC(valueOfUser, "K");
                } else if (desiredUnitOfUser.equals("F")) {
                    UnitC.convertC(valueOfUser, "F");
                }
                break;
            case "F":
                if (desiredUnitOfUser.equals("F")) {
                    UnitF.convertF(valueOfUser, "F");
                } else if (desiredUnitOfUser.equals("K")) {
                    UnitF.convertF(valueOfUser, "K");
                } else if (desiredUnitOfUser.equals("C")) {
                    UnitF.convertF(valueOfUser, "C");
                }
                break;
            default:
                System.out.println("The value is already in Celsius");


//        }
//        // Conversion Calculation (if desiredUnitOfUser = K)
//        if (desiredUnitOfUser.equals("K")) {
//            UnitK.convertK(valueOfUser, "K");
//        } else if (desiredUnitOfUser.equals("C")) {
//            UnitK.convertK(valueOfUser, "C");
//        } else if (desiredUnitOfUser.equals("F")) {
//            UnitK.convertK(valueOfUser, "F");
//        }
//
////         Conversion Calculation (if desiredUnitOfUser = C)
//        if (desiredUnitOfUser.equals("C")) {
//            UnitC.convertC(valueOfUser, "C");
//        } else if (desiredUnitOfUser.equals("K")) {
//            UnitC.convertC(valueOfUser, "K");
//        } else if (desiredUnitOfUser.equals("F")) {
//            UnitC.convertC(valueOfUser, "F");
//        }


        }

    }
}