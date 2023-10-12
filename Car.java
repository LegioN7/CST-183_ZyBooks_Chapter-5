public class Car {
    private static int modelYear;
    private static int purchasePrice;
    private static int currentValue;


    public void setModelYear(int userYear){
        modelYear = userYear;
    }

    public static int getModelYear() {
        return modelYear;
    }

    public void setPurchasePrice(int userPrice){
        purchasePrice = userPrice;
    }

    public static int getPurchasePrice(){
        return purchasePrice;
    }


    public void calcCurrentValue(int currentYear) {
        double depreciationRate = 0.15;
        int carAge = currentYear - modelYear;

        // Car depreciation formula
        currentValue = (int)
                Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }

    public static void printInfo(){
        System.out.println("Car's information:");
        System.out.println("  Model year: " + getModelYear());
        System.out.println("  Purchase price: " + getPurchasePrice());
        System.out.println("  Current value: " + currentValue);

    }

}
